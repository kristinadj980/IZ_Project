package com.example.IZ_Project.handlers;

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


    }
}
