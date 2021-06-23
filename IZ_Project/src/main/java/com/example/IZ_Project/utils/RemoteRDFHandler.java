package com.example.IZ_Project.utils;

import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.CompanySector;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;
import org.apache.jena.query.*;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.update.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class RemoteRDFHandler {
    private static final String QUERY_URL = "http://localhost:3030/iz_rdf/sparql";
    private static final String UPDATE_URL = "http://localhost:3030/iz_rdf/update";


    public static RdfDTO attackRegistration(RdfDTO attack) {
        attack.setId(UUID.randomUUID());
        String insertAttack = ""
                + "PREFIX attacks: <http://www.ftn.uns.ac.rs/attacks#> "
                + "PREFIX xsd:   <http://w3.org/2001/XMLSchema#> "
                + "INSERT DATA {"
                + "    attacks:" + attack.getId() + " a attacks:Attack;" +
                "	   attacks:attackName \"" + attack.getAttackName() + "\"^^xsd:string;" +
                "	   attacks:companyName \"" + attack.getCompanyName() + "\"^^xsd:string;" +
                "	   attacks:symptom1 \"" + attack.getSymptom1() + "\"^^xsd:string;" +
                "	   attacks:symptom2 \"" + attack.getSymptom2() + "\"^^xsd:string;" +
                "	   attacks:symptom3 \"" + attack.getSymptom3() +  "\"^^xsd:string;" +
                "	   attacks:continent \"" + attack.getContinent() +  "\"^^xsd:string;" +
                "	   attacks:prerequisites \"" + attack.getPrerequisites() + "\"^^xsd:string;" +
                "	   attacks:skillsRequired \"" + attack.getSkillsRequired() + "\"^^xsd:string;" +
                "	   attacks:likelihood \"" + attack.getLikelihood() + "\"^^xsd:string;" +
                "	   attacks:date\"" + attack.getDate() +  "\"^^xsd:date;" +
                "	   attacks:numberOfEmployees \"" + attack.getNumberOfEmployees() +  "\"^^xsd:string;" +
                "	   attacks:companySector \"" + attack.getCompanySector() + "\"^^xsd:string;" +
                "	   attacks:severity \"" + attack.getSeverity() + "\"^^xsd:string;" +
                "}";

        UpdateRequest updateRequest = UpdateFactory.create(insertAttack);
        System.setProperty("http.maxConnections", "1000");

        UpdateProcessor updateProcessor = UpdateExecutionFactory.createRemote(updateRequest, UPDATE_URL);

        updateProcessor.execute();

        return  attack;
    }

    public static List<RdfDTO> getAttacks() {
        List<RdfDTO> attacks = new ArrayList<>();
        String getAttacks = "PREFIX attacks: <http://www.ftn.uns.ac.rs/attacks#> \n" +
                "\n" +
                "SELECT  ?attacks ?attackName ?companyName ?symptom1 ?symptom2 ?symptom3 ?continent\n" +
                "?prerequisites ?skillsRequired ?likelihood ?date ?numberOfEmployees ?companySector ?severity\n" +
                "WHERE\n" +
                "  { ?attacks a attacks:Attack;\n" +
                "   \tattacks:attackName ?attackName;\n" +
                "   \tattacks:companyName ?companyName;\n" +
                "   \tattacks:symptom1 ?symptom1;\n" +
                "   \tattacks:symptom2 ?symptom2;\n" +
                "   \tattacks:symptom3 ?symptom3;\n" +
                "   \tattacks:continent ?continent;\n" +
                "   \tattacks:prerequisites ?prerequisites;\n" +
                "   \tattacks:skillsRequired ?skillsRequired;\n" +
                "   \tattacks:likelihood ?likelihood;\n" +
                "   \tattacks:date ?date;\n" +
                "   \tattacks:numberOfEmployees ?numberOfEmployees;\n" +
                "   \tattacks:companySector ?companySector;\n" +
                "   \tattacks:severity ?severity.}";

        Query query = QueryFactory.create(getAttacks);

        try {
            QueryExecution queryEx;
            System.setProperty("http.maxConnections", "1000");

            queryEx = QueryExecutionFactory.sparqlService(QUERY_URL, query);
            Continent c;
            ResultSet results = queryEx.execSelect() ;
            while (results.hasNext()) {
                QuerySolution solution = results.nextSolution() ;
                Resource attack = solution.getResource("attacks");
                Literal attackName = solution.getLiteral("attackName");
                Literal companyName = solution.getLiteral("companyName");
                Literal symptom1 = solution.getLiteral("symptom1");
                Literal symptom2 = solution.getLiteral("symptom2");
                Literal symptom3 = solution.getLiteral("symptom3");
                Literal continent = solution.getLiteral("continent");
                Literal prerequisites = solution.getLiteral("prerequisites");
                Literal skillsRequired = solution.getLiteral("skillsRequired");
                Literal likelihood = solution.getLiteral("likelihood");
                Literal date = solution.getLiteral("date");
                Literal numberOfEmployees = solution.getLiteral("numberOfEmployees");
                Literal companySector = solution.getLiteral("companySector");
                Literal severity = solution.getLiteral("severity");
                Date attackDate = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").parse(date.getString());
                attacks.add(new RdfDTO(UUID.fromString(attack.getURI().substring(33,69)), attackName.getString(),
                        companyName.getString(), symptom1.getString(), symptom2.getString(), symptom3.getString(),
                        Continent.valueOf(continent.getString()), prerequisites.getString(),
                        Scale.valueOf(skillsRequired.getString()), Scale.valueOf(likelihood.getString()),
                        attackDate, Integer.parseInt(numberOfEmployees.getString()), CompanySector.valueOf(companySector.getString()),
                        Scale.valueOf(severity.getString())));
            }
            return  attacks;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  attacks;
    }

    public static List<RdfDTO> deleteAttack(RdfDTO rdfDTO) {
        String deleteString =  "PREFIX attacks: <http://www.ftn.uns.ac.rs/attacks#> "
                + "DELETE "
                + "WHERE {"
                + "    attacks:" + rdfDTO.getId() + " ?x ?y ."
                + "}";
        UpdateRequest updateRequest2 = UpdateFactory.create(deleteString);
        System.setProperty("http.maxConnections", "10000");
        UpdateProcessor updateProcessor2 = UpdateExecutionFactory.createRemote(updateRequest2, UPDATE_URL);
        updateProcessor2.execute();

        return getAttacks();
    }

    public static RdfDTO updateAttack(RdfDTO attack) {
        String attackData = ""
                + "PREFIX attacks: <http://www.ftn.uns.ac.rs/attacks#> "
                + "PREFIX xsd:   <http://w3.org/2001/XMLSchema#> "
                + "DELETE { attacks:" + attack.getId() + " ?x ?y .} "
                + "INSERT {"
                + "    attacks:" + attack.getId() + " a attacks:Attack;" +
                "	   attacks:attackName \"" + attack.getAttackName() + "\"^^xsd:string;" +
                "	   attacks:companyName \"" + attack.getCompanyName() + "\"^^xsd:string;" +
                "	   attacks:symptom1 \"" + attack.getSymptom1() + "\"^^xsd:string;" +
                "	   attacks:symptom2 \"" + attack.getSymptom2() + "\"^^xsd:string;" +
                "	   attacks:symptom3 \"" + attack.getSymptom3() +  "\"^^xsd:string;" +
                "	   attacks:continent \"" + attack.getContinent() +  "\"^^xsd:string;" +
                "	   attacks:prerequisites \"" + attack.getPrerequisites() + "\"^^xsd:string;" +
                "	   attacks:skillsRequired \"" + attack.getSkillsRequired() + "\"^^xsd:string;" +
                "	   attacks:likelihood \"" + attack.getLikelihood() + "\"^^xsd:string;" +
                "	   attacks:date\"" + attack.getDate() +  "\"^^xsd:date;" +
                "	   attacks:numberOfEmployees \"" + attack.getNumberOfEmployees() +  "\"^^xsd:string;" +
                "	   attacks:companySector \"" + attack.getCompanySector() + "\"^^xsd:string;" +
                "	   attacks:severity \"" + attack.getSeverity() + "\"^^xsd:string;" +
                "}"
                + "WHERE {"
                + "    attacks:" + attack.getId() + " ?x ?y ."
                + "}";
        UpdateRequest updateRequest = UpdateFactory.create(attackData);
        UpdateProcessor updateProcessor = UpdateExecutionFactory.createRemote(updateRequest, UPDATE_URL);
        updateProcessor.execute();

        return  attack;
    }
}
