package com.example.IZ_Project.utils;

import com.example.IZ_Project.model.Attack;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.update.UpdateAction;

import java.io.FileInputStream;
import java.io.InputStream;

public class LocalRDFHandler {
    //Remote
    private Model model;
    private static final String QUERY_URL = "http://localhost:3030/inzenjeringznanja/sparql";
    private static final String UPDATE_URL = "http://localhost:3030/inzenjeringznanja/update";

    public LocalRDFHandler(String fileName) {
        this.model = loadInfo(fileName);
    }

    private Model loadInfo(String fileName)
    {
        Model model = ModelFactory.createDefaultModel();
        try {
            InputStream is = new FileInputStream("data/attackRDF.ttl");
            RDFDataMgr.read(model, is, Lang.TURTLE);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    private void attackRegistration(String fileName, Attack attack)
    {
        Model model = loadInfo(fileName);

        String insertAttack = ""
                + "PREFIX foaf: <http://xmlns.com/foaf/0.1/> "
                + "PREFIX xsd:   <http://w3.org/2001/XMLSchema#> "
                + "INSERT DATA {"
                + "    <http://www.ftn.uns.ac.rs/iz#A2> a foaf:Attack. "
                + "    foaf:name \"%ATTACKNAME%\"^^xsd:string; "
                + "    foaf:attackedCompany foaf:C2;"
                + "    foaf:severity \"%SEVERITY%\"^^xsd:string;"
                + "    foaf:skillsRequired \"%SKILLSREQUIRED%\"^^xsd:string;"
                + "    foaf:date \"%DATE%\"^^xsd:date;"
                + "    foaf:attackSymptoms foaf:S1;"
                + "    foaf:attackConsequence foaf:COAN1;"
                + "    foaf:attackPrerequisite foaf:P1;"
                + "    foaf:likelihood \"%LIKELIHOOD%\"^^xsd:string."
                + "}";
        insertAttack.replace("%ATTACKNAME%", "attackName");
        insertAttack.replace("%SEVERITY%", "attackName");
        insertAttack.replace("%SKILLSREQUIRED%", "attackName");
        insertAttack.replace("%DATE%", "attackName");
        insertAttack.replace("%LIKELIHOOD%", "attackName");

        UpdateAction.parseExecute(insertAttack, model);

    }
}
