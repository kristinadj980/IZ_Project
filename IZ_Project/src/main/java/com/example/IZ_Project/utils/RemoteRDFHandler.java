package com.example.IZ_Project.utils;

import com.example.IZ_Project.model.Attack;
import org.apache.jena.update.*;


public class RemoteRDFHandler {
    private static final String QUERY_URL = "http://localhost:3030/inzenjeringznanja/sparql";
    private static final String UPDATE_URL = "http://localhost:3030/inzenjeringznanja/update";

    public static void attackRegistration(Attack attack)
    {
        String insertAttack = ""
                + "PREFIX iz: <http://www.ftn.uns.ac.rs/iz#> "
                + "PREFIX xsd:   <http://w3.org/2001/XMLSchema#> "
                + "INSERT DATA {"
                + "    <http://www.ftn.uns.ac.rs/iz#A2> a iz:Attack; "
                + "    iz:name \"%ATTACKNAME%\"^^xsd:string; "
                + "    iz:attackedCompany iz:C2;"
                + "    iz:severity \"%SEVERITY%\"^^xsd:string;"
                + "    iz:skillsRequired \"%SKILLSREQUIRED%\"^^xsd:string;"
                + "    iz:date \"%DATE%\"^^xsd:date;"
                + "    iz:attackSymptoms iz:S1;"
                + "    iz:attackConsequence iz:COAN1;"
                + "    iz:attackPrerequisite iz:P1;"
                + "    iz:likelihood \"%LIKELIHOOD%\"^^xsd:string."
                + "}";

        insertAttack = insertAttack.replace("%ATTACKNAME%", attack.getName());
        insertAttack = insertAttack.replace("%SEVERITY%", attack.getSeverity().toString());
        insertAttack = insertAttack.replace("%SKILLSREQUIRED%", attack.getSkillsRequired().toString());
        insertAttack = insertAttack.replace("%DATE%", attack.getDate().toString());
        insertAttack = insertAttack.replace("%LIKELIHOOD%", attack.getLikelihood().toString());


        UpdateRequest updateRequest = UpdateFactory.create(insertAttack);
        UpdateProcessor updateProcessor = UpdateExecutionFactory.createRemote(updateRequest, UPDATE_URL);
        updateProcessor.execute();

    }
}
