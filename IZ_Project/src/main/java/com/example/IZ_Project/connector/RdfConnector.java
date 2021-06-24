package com.example.IZ_Project.connector;

import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.handlers.RemoteRDFHandler;
import com.example.IZ_Project.model.*;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

//vraca iz rdf sve rdfDto i pretrava ih u Attacks
public class RdfConnector implements Connector {

    @Override
    public Collection<CBRCase> retrieveAllCases() {
        LinkedList<CBRCase> cases = new LinkedList<CBRCase>();

        for (RdfDTO rdfDTO : RemoteRDFHandler.getAttacks()) {
            Attack attack = new Attack(rdfDTO);
            CBRCase cbrCase = new CBRCase();
            cbrCase.setDescription(attack);
            cases.add(cbrCase);
        }

        return cases;
    }

    @Override
    public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter arg0) {
        return null;
    }

    @Override
    public void storeCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void close() {
    }

    @Override
    public void deleteCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void initFromXMLfile(URL arg0) throws InitializingException {
    }

}