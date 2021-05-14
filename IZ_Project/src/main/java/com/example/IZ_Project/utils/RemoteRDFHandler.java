package com.example.IZ_Project.utils;

import com.example.IZ_Project.model.Attack;
import org.apache.jena.update.*;


public class RemoteRDFHandler {
    private static final String QUERY_URL = "http://localhost:3030/inzenjeringznanja/sparql";
    private static final String UPDATE_URL = "http://localhost:3030/inzenjeringznanja/update";

    private void attackRegistration(String fileName, Attack attack)
    {
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

        UpdateRequest updateRequest = UpdateFactory.create(insertAttack);
        UpdateProcessor updateProcessor = UpdateExecutionFactory.createRemote(updateRequest, UPDATE_URL);
        updateProcessor.execute();

    }
}
