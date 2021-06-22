package com.example.IZ_Project.cbr;

import java.util.ArrayList;
import java.util.Collection;


import com.example.IZ_Project.connector.CsvConnector;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Company;
import com.example.IZ_Project.model.Prerequisite;
import ucm.gaia.jcolibri.casebase.LinealCaseBase;
import ucm.gaia.jcolibri.cbraplications.StandardCBRApplication;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CBRCaseBase;
import ucm.gaia.jcolibri.cbrcore.CBRQuery;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.ExecutionException;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Equal;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.EqualsStringIgnoreCase;
import ucm.gaia.jcolibri.method.retrieve.RetrievalResult;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNConfig;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.NNScoringMethod;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.global.Average;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Interval;
import ucm.gaia.jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold;
import ucm.gaia.jcolibri.method.retrieve.selection.SelectCases;

public class CbrApplication implements StandardCBRApplication {

    Connector _connector;  /** Connector object */
    CBRCaseBase _caseBase;  /** CaseBase object */

    NNConfig simConfig;  /** KNN configuration */
    private static ArrayList<String> attacks = new ArrayList<String>();

    public void configure() throws ExecutionException {
        _connector =  new CsvConnector();

        _caseBase = new LinealCaseBase();  // Create a Lineal case base for in-memory organization

        simConfig = new NNConfig(); // KNN configuration
        simConfig.setDescriptionSimFunction(new Average());  // global similarity function = average

        simConfig.addMapping(new Attribute("name", Attack.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("name", Prerequisite.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("likelihood", Attack.class), new Equal());
        simConfig.addMapping(new Attribute("severity", Attack.class), new Equal());
        simConfig.addMapping(new Attribute("skillsRequired", Attack.class), new Equal());
        simConfig.addMapping(new Attribute("dateLong", Attack.class), new Interval(100000000000.00));
        simConfig.addMapping(new Attribute("companyName", Company.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("numberOfEmployees", Company.class), new Interval(2));
        simConfig.addMapping(new Attribute("companySector", Company.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("continent", Company.class), new EqualsStringIgnoreCase());

        //ideja je da sortiramo listu simptoma po alfabetu i onda uzmemo prva tri i uporedimo za cbr sa EqualsIgnoreCase
        simConfig.addMapping(new Attribute("symptom1", Attack.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("symptom2", Attack.class), new EqualsStringIgnoreCase());
        simConfig.addMapping(new Attribute("symptom3", Attack.class), new EqualsStringIgnoreCase());


        // Equal - returns 1 if both individuals are equal, otherwise returns 0
        // Interval - returns the similarity of two number inside an interval: sim(x,y) = 1-(|x-y|/interval)
        // Threshold - returns 1 if the difference between two numbers is less than a threshold, 0 in the other case
        // EqualsStringIgnoreCase - returns 1 if both String are the same despite case letters, 0 in the other case
        // MaxString - returns a similarity value depending of the biggest substring that belong to both strings
        // EnumDistance - returns the similarity of two enum values as the their distance: sim(x,y) = |ord(x) - ord(y)|
        // EnumCyclicDistance - computes the similarity between two enum values as their cyclic distance
        // Table - uses a table to obtain the similarity between two values. Allowed values are Strings or Enums. The table is read from a text file.
        // TableSimilarity(List<String> values).setSimilarity(value1,value2,similarity)
    }

    public void cycle(CBRQuery query) throws ExecutionException {
        Collection<RetrievalResult> eval = NNScoringMethod.evaluateSimilarity(_caseBase.getCases(), query, simConfig);
        eval = SelectCases.selectTopKRR(eval, 5);
        System.out.println("Retrieved cases:");
        for (RetrievalResult nse : eval) {
            String temp = nse.get_case().getDescription().toString();
            Attack attack = (Attack) nse.get_case().getDescription();
            System.out.println(nse.get_case().getDescription() + " -> " + nse.getEval());
            attacks.add(attack.toString() + "--->" + nse.getEval());
        }
    }

    public void postCycle() throws ExecutionException {

    }

    public CBRCaseBase preCycle() throws ExecutionException {
        _caseBase.init(_connector);
        java.util.Collection<CBRCase> cases = _caseBase.getCases();
        for (CBRCase c: cases)
            System.out.println(c.getDescription());
        return _caseBase;
    }

    public static ArrayList<String> calculate(Attack attack) {
        attacks.removeAll(attacks);
        StandardCBRApplication recommender = new CbrApplication();
        try {
            recommender.configure();

            recommender.preCycle();

            CBRQuery query = new CBRQuery();


            query.setDescription( attack );
            recommender.cycle(query);

            recommender.postCycle();


        } catch (Exception e) {
            e.printStackTrace();
        }
        return attacks;
    }

}