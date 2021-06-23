package com.example.IZ_Project.utils;

import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.model.Attack;
import org.apache.jena.update.*;

import java.time.LocalDateTime;
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
                "	   attacks:numberOfEmployees \"" + attack.getNumberOfEmployees() +  "\"^^xsd:int;" +
                "	   attacks:companySector \"" + attack.getCompanySector() + "\"^^xsd:string;" +
                "	   attacks:severity \"" + attack.getSeverity() + "\"^^xsd:string;" +
                "}";

        UpdateRequest updateRequest = UpdateFactory.create(insertAttack);
        UpdateProcessor updateProcessor = UpdateExecutionFactory.createRemote(updateRequest, UPDATE_URL);
        updateProcessor.execute();

        return  attack;
    }

}
