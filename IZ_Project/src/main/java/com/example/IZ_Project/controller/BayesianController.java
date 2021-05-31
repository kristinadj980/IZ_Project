package com.example.IZ_Project.controller;

import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;
import org.springframework.stereotype.Controller;
import unbbayes.io.BaseIO;
import unbbayes.io.NetIO;
import unbbayes.io.exception.LoadException;
import unbbayes.prs.Node;
import unbbayes.prs.bn.JunctionTreeAlgorithm;
import unbbayes.prs.bn.ProbabilisticNetwork;
import unbbayes.prs.bn.ProbabilisticNode;
import unbbayes.util.extension.bn.inference.IInferenceAlgorithm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BayesianController {

    public void testBayesian(SymptomsDTO symptomsDTO) {
        ProbabilisticNetwork net = new ProbabilisticNetwork("example");
        List<String> tapjackingList = new ArrayList<String>();
        String poslednji4="";
        BaseIO io = new NetIO();
        try {
            net = (ProbabilisticNetwork) io.load(new File("C:\\Users\\Lenovo\\Desktop\\inz2\\IZ_Project\\IZ_Project\\src\\main\\java\\com\\example\\IZ_Project\\data\\bayesian.net"));
        } catch (LoadException e1) {
            System.out.println("OVDE PUCA1111");
            e1.printStackTrace();
        } catch (IOException e1) {
            System.out.println("OVDE PUCA");
            e1.printStackTrace();
        }

        IInferenceAlgorithm algorithm = new JunctionTreeAlgorithm();
        algorithm.setNetwork(net);
        algorithm.run();

        ProbabilisticNode symptomNode1 = (ProbabilisticNode) net.getNode("bribery");
        int stateIndex1 = 0;
        ProbabilisticNode symptomNode2 = (ProbabilisticNode) net.getNode("suspicious_code_modifications");
        int stateIndex2 = 0;
        ProbabilisticNode symptomNode3 = (ProbabilisticNode) net.getNode("services_fail");
        int stateIndex3 = 0;
        ProbabilisticNode symptomNode4 = (ProbabilisticNode) net.getNode("app_download");
        int stateIndex4 = 0;
        ProbabilisticNode symptomNode5 = (ProbabilisticNode) net.getNode("suspicious_conversation_visit");
        int stateIndex5 = 0;
        ProbabilisticNode symptomNode6 = (ProbabilisticNode) net.getNode("ad_click");
        int stateIndex6 = 0;
        ProbabilisticNode symptomNode7 = (ProbabilisticNode) net.getNode("pop_up_windows");
        int stateIndex7 = 0;
        ProbabilisticNode symptomNode8 = (ProbabilisticNode) net.getNode("credentials_re_entering");
        int stateIndex8 = 0;
        ProbabilisticNode symptomNode9 = (ProbabilisticNode) net.getNode("suspicious_conversasion_phone_call");
        int stateIndex9 = 0;
        ProbabilisticNode symptomNode10 = (ProbabilisticNode) net.getNode("suspicious_conversasion_phone_message");
        int stateIndex10 = 0;
        ProbabilisticNode symptomNode11 = (ProbabilisticNode) net.getNode("suspicious_conversasion_email");
        int stateIndex11 = 0;
        ProbabilisticNode symptomNode12 = (ProbabilisticNode) net.getNode("credentials_theft");
        int stateIndex12 = 0;
        ProbabilisticNode symptomNode13 = (ProbabilisticNode) net.getNode("frequent_spams");
        int stateIndex13 = 0;
        ProbabilisticNode symptomNode14 = (ProbabilisticNode) net.getNode("suspicious_link");
        int stateIndex14 = 0;
        ProbabilisticNode symptomNode15 = (ProbabilisticNode) net.getNode("virus_detection");
        int stateIndex15 = 0;
        ProbabilisticNode symptomNode16 = (ProbabilisticNode) net.getNode("suspicious_website");
        int stateIndex16 = 0;
        ProbabilisticNode symptomNode17 = (ProbabilisticNode) net.getNode("update");
        int stateIndex17 = 0;



        ProbabilisticNode likelihoodNode = (ProbabilisticNode) net.getNode("likelihood");
        int stateLikelihoodIndex;
        ProbabilisticNode continentNode = (ProbabilisticNode) net.getNode("continent");
        int stateContinentIndex;
        ProbabilisticNode companySizeNode = (ProbabilisticNode) net.getNode("company_size");
        int stateCompanySizeIndex;
        ProbabilisticNode skillsRequiredNode = (ProbabilisticNode) net.getNode("skills_required");
        int stateSkillsRequiredIndex;
        ProbabilisticNode severityNode = (ProbabilisticNode) net.getNode("severity");
        int stateSeverityIndex;

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("bribery")) {
                stateIndex1 = 0;
                break;
            } else {
                stateIndex1 = 1;
            }
        }symptomNode1.addFinding(stateIndex1);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_code_modifications")) {
                stateIndex2 = 0;
                break;
            } else {
                stateIndex2 = 1;
            }
        }symptomNode2.addFinding(stateIndex2);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("services_fail")) {
                stateIndex3 = 0;
                break;
            } else {
                stateIndex3 = 1;
            }
        }
        symptomNode3.addFinding(stateIndex3);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("app_download")) {
                stateIndex4 = 0;
                break;
            } else {
                stateIndex4 = 1;
            }
        }
        symptomNode4.addFinding(stateIndex4);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_conversation_visit")) {
                stateIndex5 = 0;
                break;
            } else {
                stateIndex5 = 1;
            }
        }
        symptomNode5.addFinding(stateIndex5);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("ad_click")) {
                stateIndex6 = 0;
                break;
            } else {
                stateIndex6 = 1;
            }
        }
        symptomNode6.addFinding(stateIndex6);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("pop_up_windows")) {
                stateIndex7 = 0;
                break;
            } else {
                stateIndex7 = 1;
            }
        }
        symptomNode7.addFinding(stateIndex7);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("credential_re_entering")) {
                stateIndex8 = 0;
                break;
            } else {
                stateIndex8 = 1;
            }
        }
        symptomNode8.addFinding(stateIndex8);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_conversasion_phone_call")) {
                stateIndex9 = 0;
                break;
            } else {
                stateIndex9 = 1;
            }

        }
        symptomNode9.addFinding(stateIndex9);

        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_conversasion_phone_message")) {
                stateIndex10 = 0;
                break;
            } else {
                stateIndex10 = 1;
            }
        }

        symptomNode10.addFinding(stateIndex10);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_conversasion_email")) {
                stateIndex11 = 0;
                break;
            } else {
                stateIndex11 = 1;
            }
        }
        symptomNode11.addFinding(stateIndex11);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("credentials_theft")) {
                stateIndex12 = 0;
                break;
            } else {
                stateIndex12 = 1;
            }
        }
        symptomNode12.addFinding(stateIndex12);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("frequents_spams")) {
                stateIndex13 = 0;
                break;
            } else {
                stateIndex13 = 1;
            }
        }
        symptomNode13.addFinding(stateIndex13);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_link")) {
                stateIndex14 = 0;
                break;
            } else {
                stateIndex14 = 1;
            }
        }
        symptomNode14.addFinding(stateIndex14);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("virus_detection")) {
                stateIndex15 = 0;
                break;
            } else {
                stateIndex15 = 1;
            }
        }
        symptomNode15.addFinding(stateIndex15);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("suspicious_website")) {
                stateIndex16 = 0;
                break;
            } else {
                stateIndex16 = 1;
            }
        }
        symptomNode16.addFinding(stateIndex16);
        for(String a:symptomsDTO.getSymptoms()) {
            if (a.equals("update")) {
                stateIndex17 = 0;
                break;
            } else {
                stateIndex17 = 1;
            }

        }
        symptomNode17.addFinding(stateIndex17);

        if (symptomsDTO.getLikelihood().equals(Scale.LOW)) {
            stateLikelihoodIndex = 0;
        } else if(symptomsDTO.getLikelihood().equals(Scale.MEDIUM)){
            stateLikelihoodIndex = 1;
        }else {
            stateLikelihoodIndex = 2;
        }
        likelihoodNode.addFinding(stateLikelihoodIndex);

        if (symptomsDTO.getContinent().equals(Continent.asia)) {
            stateContinentIndex = 0;
        } else if(symptomsDTO.getContinent().equals(Continent.europe)){
            stateContinentIndex = 1;
        } else if(symptomsDTO.getContinent().equals(Continent.north_america)){
            stateContinentIndex = 2;
        } else if(symptomsDTO.getContinent().equals(Continent.south_america)){
            stateContinentIndex = 3;
        }else if(symptomsDTO.getContinent().equals(Continent.africa)){
            stateContinentIndex = 4;
        } else{
            stateContinentIndex = 5;
        }
        continentNode.addFinding(stateContinentIndex);


        if (symptomsDTO.getNumberOfEmployees() <= 250) {
            stateCompanySizeIndex = 0;
        } else if(symptomsDTO.getNumberOfEmployees() > 250 && symptomsDTO.getNumberOfEmployees() <= 500){
            stateCompanySizeIndex = 1;
        } else if(symptomsDTO.getNumberOfEmployees() > 500 && symptomsDTO.getNumberOfEmployees() <= 1000){
            stateCompanySizeIndex = 2;
        } else{
            stateCompanySizeIndex = 3;
        }
        companySizeNode.addFinding(stateCompanySizeIndex);

        if (symptomsDTO.getSkillsRequired().equals(Scale.LOW)) {
            stateSkillsRequiredIndex = 0;
        } else if(symptomsDTO.getLikelihood().equals(Scale.MEDIUM)){
            stateSkillsRequiredIndex = 1;
        }else {
            stateSkillsRequiredIndex = 2;
        }
        skillsRequiredNode.addFinding(stateSkillsRequiredIndex);

        if (symptomsDTO.getSeverity().equals(Scale.LOW)) {
            stateSeverityIndex = 0;
        } else if(symptomsDTO.getLikelihood().equals(Scale.MEDIUM)){
            stateSeverityIndex = 1;
        }else {
            stateSeverityIndex = 2;
        }
        severityNode.addFinding(stateSeverityIndex);

        try {
            net.updateEvidences();
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

        List<Node> nodeList = net.getNodes();
        // states overview after propagation
        for (Node node : nodeList) {
            System.out.println(node.getName());
            for (int i = 0; i < node.getStatesSize(); i++) {
                System.out.println(node.getStateAt(i) + ": " + ((ProbabilisticNode) node).getMarginalAt(i));
            }
        }

        System.out.println("*************\n");
        List<Float> listOfProbabillity = new ArrayList<Float>();

        String temp="";
        Node pharming = net.getNode("pharming");
        System.out.println("Pharming: " + pharming.getName());
        temp+= "pharming: " + pharming.getName() + "\n";
        for(int i = 0; i < pharming.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)pharming).getMarginalAt(i));

        }
        Collections.sort(listOfProbabillity);
        Collections.reverse(listOfProbabillity);
        double max = 0.0;
        String maxId = "";
        temp="";
        for(int i = 0; i < pharming.getStatesSize(); i++) {
            temp += pharming.getStateAt(i) + ": " +  ((ProbabilisticNode)pharming).getMarginalAt(i) + "\n";
            System.out.println(pharming.getStateAt(i) + ": " +  ((ProbabilisticNode)pharming).getMarginalAt(i));
            tapjackingList.add(temp);
            temp="";
            if(((ProbabilisticNode)pharming).getMarginalAt(i) > max) {
                maxId = "";
                max = ((ProbabilisticNode)pharming).getMarginalAt(i);
                maxId += pharming.getStateAt(i);
            }
        }

        System.out.println("*****\n");

        System.out.println(maxId.toUpperCase() + ": " + max);

        poslednji4 += maxId.toUpperCase();

        System.out.println("*************\n" + temp);
        System.out.println("*************\n" + poslednji4);
    }

}
