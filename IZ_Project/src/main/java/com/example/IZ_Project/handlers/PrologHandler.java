package com.example.IZ_Project.handlers;

import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Countermeasure;
import com.example.IZ_Project.model.Symptom;
import com.ugos.jiprolog.engine.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrologHandler {

    JIPEngine engine = new JIPEngine();
    JIPTermParser termParser = engine.getTermParser();

    //za listu simptoma nadje listu mogucih napada
    public ArrayList<Attack>  findAttacksBasedOnSympthoms(ArrayList<Symptom> symptoms) throws Exception {
        ArrayList<Attack> attacks = new ArrayList<>();
        try {
            engine.consultFile("src/main/java/com/example/IZ_Project/data/facts.pl");

            ArrayList<JIPTerm> terms = new ArrayList<>();
            for (Symptom s : symptoms) {
                JIPTerm simptom = termParser.parseTerm(s.getName());
                System.out.println("simptom: " + simptom);
                terms.add(simptom);
            }
            JIPList list = JIPList.create(terms);
            System.out.println("lista: " + terms);
            JIPQuery query = engine.openSynchronousQuery("possible_attacks_list(terms ,L)");
            //JIPQuery query = engine.openSynchronousQuery("possible_attacks_list(" + list + " ,L)");

            JIPTerm solution;
            Attack attack = new Attack();
            while ( (solution = query.nextSolution()) != null) {

                System.out.println("solution: " + solution);
                for (JIPVariable var : solution.getVariables()) {
                    System.out.println("value: " + var.getValue());
                    attack.setName(var.toString());
                    attacks.add(attack);
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            this.engine.closeAllQueries();
        }
        return attacks;
    }

    //za napad nadje listu protivmera
    public ArrayList<Countermeasure>  findCountermeasuresBasedOnAttack(Attack attack) throws Exception {
        ArrayList<Countermeasure> countermeasures = new ArrayList<>();
        try {
            engine.consultFile("src/main/java/com/example/IZ_Project/data/facts.pl");
            JIPQuery query = engine.openSynchronousQuery("countermeasures(" + attack.getName() + ",L)");
            JIPTerm solution;

            while ((solution = query.nextSolution()) != null) {
                //System.out.println("solution: " + solution);
                for (JIPVariable var : solution.getVariables()) {
                    String solution1 = var.toString();
                    String solution2 = solution1.replace("(", ")");
                    String solution3 = solution2.replace(")", " ");
                    String solution4 = solution3.replace("[]", "'.'");
                    String solution5 = solution4.replace("'.'", " ");
                    String[] parts = solution5.split(",");
                    for (int i = 0; i < parts.length; i++) {
                        //System.out.println(parts[i]);
                        Countermeasure countermeasure = new Countermeasure();
                        countermeasure.setName(parts[i]);
                        countermeasures.add(countermeasure);
                        attack.setCountermeasures(countermeasures);
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            this.engine.closeAllQueries();
        }
        for (Countermeasure c: countermeasures) {
            System.out.println(c.getName());
        }
        return attack.getCountermeasures();
    }
}
