package com.example.IZ_Project.controller;

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
import java.util.List;

public class BayesianController {

    public static void main(String[] args) throws IOException {
        ProbabilisticNetwork net = new ProbabilisticNetwork("bayesian");
        BaseIO io = new NetIO();
        try {
            net = (ProbabilisticNetwork)io.load(new File("C:\\Users\\david\\Desktop\\Fax\\cetvrta godina\\drugi semestar\\inzinjering znanja\\tempp\\IZ_Project\\IZ_Project\\src\\main\\java\\com\\example\\IZ_Project\\data\\bayesian.net"));
        } catch (LoadException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        IInferenceAlgorithm algorithm = new JunctionTreeAlgorithm();
        algorithm.setNetwork(net);
        algorithm.run();

        ProbabilisticNode factNode1 = (ProbabilisticNode)net.getNode("bribery");
        int stateIndex1 = 1;
        factNode1.addFinding(stateIndex1);


        ProbabilisticNode factNode2 = (ProbabilisticNode)net.getNode("suspicious_conversasion_email");
        int stateIndex2 = 1;
        factNode2.addFinding(stateIndex2);

        ProbabilisticNode factNode3 = (ProbabilisticNode)net.getNode("update");
        int stateIndex3 = 1;
        factNode3.addFinding(stateIndex3);

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
                System.out.println(node.getStateAt(i) + ": " + ((ProbabilisticNode)node).getMarginalAt(i));
            }
        }


    }

}
