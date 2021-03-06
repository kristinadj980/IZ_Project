package com.example.IZ_Project.handlers;

import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Countermeasure;
import com.example.IZ_Project.model.Symptom;
import com.ugos.jiprolog.engine.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrologHandler {

    JIPEngine engine = new JIPEngine();
    JIPTermParser termParser = engine.getTermParser();

    public ArrayList<Attack>  findAttacksBasedOnSympthoms(ArrayList<Symptom> symptoms) throws Exception {
        ArrayList<Attack> attacks = new ArrayList<>();
        try {
            engine.consultFile("src/main/java/com/example/IZ_Project/data/facts.pl");

            ArrayList<JIPTerm> terms = new ArrayList<>();
            for (Symptom s : symptoms) {
                JIPTerm simptom = termParser.parseTerm(s.getName());
                terms.add(simptom);
            }
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder symptomsList = stringBuilder.append(terms);
            JIPQuery query = engine.openSynchronousQuery("possible_attacks_list(" + symptomsList + " ,L).");

            JIPTerm solution;

            while ( (solution = query.nextSolution()) != null) {
                for (JIPVariable var : solution.getVariables()) {
                    String solution1 = var.toString();
                    String solution2 = solution1.replace("(", ")");
                    String solution3 = solution2.replace(")", " ");
                    String solution4 = solution3.replace("[]", "'.'");
                    String solution5 = solution4.replace("'.'", " ");
                    String[] parts = solution5.split(",");

                    for (int i = 0; i < parts.length - 1; i++) {
                        ArrayList<Attack> copy = new ArrayList<>(attacks);
                        Attack attack = new Attack();
                        attack.setName(parts[i]);
                        attacks.add(attack);
                    }

                }
            }
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            this.engine.closeAllQueries();
        }
        return attacks;
    }


    public ArrayList<Countermeasure>  findCountermeasuresBasedOnAttack(Attack attack) throws Exception {
        ArrayList<Countermeasure> countermeasures = new ArrayList<>();
        try {
            engine.consultFile("src/main/java/com/example/IZ_Project/data/facts.pl");
            JIPQuery query = engine.openSynchronousQuery("countermeasures(" + attack.getName() + ",L)");
            JIPTerm solution;

            while ((solution = query.nextSolution()) != null) {
                for (JIPVariable var : solution.getVariables()) {
                    String solution1 = var.toString();
                    String solution2 = solution1.replace("(", ")");
                    String solution3 = solution2.replace(")", " ");
                    String solution4 = solution3.replace("[]", "'.'");
                    String solution5 = solution4.replace("'.'", " ");
                    String[] parts = solution5.split(",");
                    for (int i = 0; i < parts.length - 1; i++) {
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

        return attack.getCountermeasures();
    }
}
