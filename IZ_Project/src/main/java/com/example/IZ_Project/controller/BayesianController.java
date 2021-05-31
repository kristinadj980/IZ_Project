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
import java.util.HashMap;
import java.util.List;

public class BayesianController {

    public void testBayesian(SymptomsDTO symptomsDTO) {
        ProbabilisticNetwork net = new ProbabilisticNetwork("example");
        List<String> tapjackingList = new ArrayList<String>();
        String poslednji4="";
        BaseIO io = new NetIO();
        try {
            net = (ProbabilisticNetwork) io.load(new File("C:\\Users\\user\\Desktop\\inzenjering projekat\\IZ_Project\\IZ_Project\\src\\main\\java\\com\\example\\IZ_Project\\data\\bayesian.net"));
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
        //************************************
        String temp2="";
        Node counterfeitWebsites = net.getNode("counterfeit_websites");
        System.out.println("Counterfeit_websites: " + counterfeitWebsites.getName());
        temp2+= "counterfeit_websites: " + counterfeitWebsites.getName() + "\n";
        for(int i = 0; i < counterfeitWebsites.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)counterfeitWebsites).getMarginalAt(i));
        }

        String temp3="";
        Node spearPhishing = net.getNode("spear_phishing");
        System.out.println("spearPhishing: " + spearPhishing.getName());
        temp3+= "spearPhishing: " + spearPhishing.getName() + "\n";
        for(int i = 0; i < spearPhishing.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)spearPhishing).getMarginalAt(i));
        }

        String temp4="";
        Node mobilePhishing = net.getNode("mobile_phishing");
        System.out.println("mobilePhishing: " + mobilePhishing.getName());
        temp4+= "mobilePhishing: " + mobilePhishing.getName() + "\n";
        for(int i = 0; i < mobilePhishing.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)mobilePhishing).getMarginalAt(i));
        }

        String temp5="";
        Node voicePhishing = net.getNode("voice_phishing");
        System.out.println("voicePhishing: " + voicePhishing.getName());
        temp5+= "voicePhishing: " + voicePhishing.getName() + "\n";
        for(int i = 0; i < voicePhishing.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)voicePhishing).getMarginalAt(i));

        }

        String temp6="";
        Node typoSquatting = net.getNode("typo_squatting");
        System.out.println("typoSquatting: " + typoSquatting.getName());
        temp6+= "typoSquatting: " + typoSquatting.getName() + "\n";
        for(int i = 0; i < typoSquatting.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)typoSquatting).getMarginalAt(i));
        }

        String temp7="";
        Node soundSquatting = net.getNode("sound_squatting");
        System.out.println("soundSquatting: " + soundSquatting.getName());
        temp7+= "soundSquatting: " + soundSquatting.getName() + "\n";
        for(int i = 0; i < soundSquatting.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)soundSquatting).getMarginalAt(i));
        }

        String temp8="";
        Node homographAttackViaHomoglyphs = net.getNode("homograph_attack_via_homoglyphs");
        System.out.println("homographAttackViaHomoglyphs: " + homographAttackViaHomoglyphs.getName());
        temp8+= "homographAttackViaHomoglyphs: " + homographAttackViaHomoglyphs.getName() + "\n";
        for(int i = 0; i < homographAttackViaHomoglyphs.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)homographAttackViaHomoglyphs).getMarginalAt(i));
        }

        String temp9="";
        Node bitSquatting = net.getNode("bit_squatting");
        System.out.println("bitSquatting: " + bitSquatting.getName());
        temp9+= "bitSquatting: " + bitSquatting.getName() + "\n";
        for(int i = 0; i < bitSquatting.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)bitSquatting).getMarginalAt(i));
        }

        String temp10="";
        Node pretextingViaCustomerService = net.getNode("pretexting_via_customer_service");
        System.out.println("pretextingViaCustomerService: " + pretextingViaCustomerService.getName());
        temp10+= "pretextingViaCustomerService: " + pretextingViaCustomerService.getName() + "\n";
        for(int i = 0; i < pretextingViaCustomerService.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)pretextingViaCustomerService).getMarginalAt(i));
        }

        String temp11="";
        Node dnsDomainSeizure = net.getNode("dns_domain_seizure");
        System.out.println("dnsDomainSeizure: " + dnsDomainSeizure.getName());
        temp11+= "dnsDomainSeizure: " + dnsDomainSeizure.getName() + "\n";
        for(int i = 0; i < dnsDomainSeizure.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)dnsDomainSeizure).getMarginalAt(i));
        }

        String temp12="";
        Node influenceViaIncentives = net.getNode("influence_via_incentives");
        System.out.println("influenceViaIncentives: " + influenceViaIncentives.getName());
        temp12+= "influenceViaIncentives: " + influenceViaIncentives.getName() + "\n";
        for(int i = 0; i < influenceViaIncentives.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)influenceViaIncentives).getMarginalAt(i));
        }

        String temp13="";
        Node harvestingInformationViaApiEventMonitoring = net.getNode("harvesting_information_via_api_event_monitoring");
        System.out.println("harvestingInformationViaApiEventMonitoring: " + harvestingInformationViaApiEventMonitoring.getName());
        temp13+= "harvestingInformationViaApiEventMonitoring: " + harvestingInformationViaApiEventMonitoring.getName() + "\n";
        for(int i = 0; i < harvestingInformationViaApiEventMonitoring.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)harvestingInformationViaApiEventMonitoring).getMarginalAt(i));
        }

        String temp14="";
        Node flashFileOverlay = net.getNode("flash_file_overlay");
        System.out.println("flashFileOverlay: " + flashFileOverlay.getName());
        temp14+= "flashFileOverlay: " + flashFileOverlay.getName() + "\n";
        for(int i = 0; i < flashFileOverlay.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)flashFileOverlay).getMarginalAt(i));
        }

        String temp15="";
        Node iframeOverlay = net.getNode("ifame_overlay");
        System.out.println("iframeOverlay: " + iframeOverlay.getName());
        temp15+= "iframeOverlay: " + iframeOverlay.getName() + "\n";
        for(int i = 0; i < iframeOverlay.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)iframeOverlay).getMarginalAt(i));
        }

        String temp16="";
        Node credentialPromptImpersonation = net.getNode("credential_prompt_impersonation");
        System.out.println("credentialPromptImpersonation: " + credentialPromptImpersonation.getName());
        temp16+= "credentialPromptImpersonation: " + credentialPromptImpersonation.getName() + "\n";
        for(int i = 0; i < credentialPromptImpersonation.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)credentialPromptImpersonation).getMarginalAt(i));
        }

        String temp17="";
        Node androidActivityHijack = net.getNode("android_activity_hijack");
        System.out.println("androidActivityHijack: " + androidActivityHijack.getName());
        temp17+= "androidActivityHijack: " + androidActivityHijack.getName() + "\n";
        for(int i = 0; i < androidActivityHijack.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)androidActivityHijack).getMarginalAt(i));
        }

        String temp18="";
        Node tapjacking = net.getNode("tapjacking");
        System.out.println("tapjacking: " + tapjacking.getName());
        temp18+= "tapjacking: " + tapjacking.getName() + "\n";
        for(int i = 0; i < tapjacking.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)tapjacking).getMarginalAt(i));
        }

        String temp19="";
        Node maliciousManualSoftwareUpdate = net.getNode("malicious_manual_software_update");
        System.out.println("maliciousManualSoftwareUpdate: " + maliciousManualSoftwareUpdate.getName());
        temp19+= "maliciousManualSoftwareUpdate: " + maliciousManualSoftwareUpdate.getName() + "\n";
        for(int i = 0; i < maliciousManualSoftwareUpdate.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)maliciousManualSoftwareUpdate).getMarginalAt(i));
        }

        String temp20="";
        Node rootingSimCards = net.getNode("rooting_sim_cards");
        System.out.println("rootingSimCards: " + rootingSimCards.getName());
        temp20+= "rootingSimCards: " + rootingSimCards.getName() + "\n";
        for(int i = 0; i < rootingSimCards.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)rootingSimCards).getMarginalAt(i));

        }

        String temp21="";
        Node pretextingViaTechSupport = net.getNode("pretexting_via_tech_support");
        System.out.println("pretextingViaTechSupport: " + pretextingViaTechSupport.getName());
        temp21+= "pretextingViaTechSupport: " + pretextingViaTechSupport.getName() + "\n";
        for(int i = 0; i < pretextingViaTechSupport.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)pretextingViaTechSupport).getMarginalAt(i));
        }

        String temp22="";
        Node pretextingViaDeliveryPerson = net.getNode("pretexting_via_delivery_person");
        System.out.println("pretextingViaDeliveryPerson: " + pretextingViaDeliveryPerson.getName());
        temp22+= "pretextingViaDeliveryPerson: " + pretextingViaDeliveryPerson.getName() + "\n";
        for(int i = 0; i < pretextingViaDeliveryPerson.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)pretextingViaDeliveryPerson).getMarginalAt(i));
        }

        String temp23="";
        Node pretextingViaPhone = net.getNode("pretexting_via_phone");
        System.out.println("pretextingViaPhone: " + pretextingViaPhone.getName());
        temp23+= "pretextingViaPhone: " + pretextingViaPhone.getName() + "\n";
        for(int i = 0; i < pretextingViaPhone.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)pretextingViaPhone).getMarginalAt(i));
        }

        String temp24="";
        Node influencePerceptionOfReciprocation = net.getNode("influence_perception_of_reciprocation");
        System.out.println("influencePerceptionOfReciprocation: " + influencePerceptionOfReciprocation.getName());
        temp24+= "influencePerceptionOfReciprocation: " + influencePerceptionOfReciprocation.getName() + "\n";
        for(int i = 0; i < influencePerceptionOfReciprocation.getStatesSize(); i++) {
            listOfProbabillity.add(((ProbabilisticNode)influencePerceptionOfReciprocation).getMarginalAt(i));
        }


        String temp25="";
        Node influencePerceptionOfScarcity = net.getNode("influence_perception_of_scarcity");
        System.out.println("influencePerceptionOfScarcity :" + influencePerceptionOfScarcity.getName());
        temp+= "influencePerceptionOfScarcity : " + influencePerceptionOfScarcity.getName() + "\n";
        for(int i = 0; i < influencePerceptionOfScarcity.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)influencePerceptionOfScarcity).getMarginalAt(i));

        }


        String temp26="";
        Node influencePerceptionOfAuthority = net.getNode("influence_perception_of_authority");
        System.out.println("influencePerceptionOfAuthority :" + influencePerceptionOfAuthority.getName());
        temp+= "influencePerceptionOfAuthority : " + influencePerceptionOfAuthority.getName() + "\n";
        for(int i = 0; i < influencePerceptionOfAuthority.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)influencePerceptionOfAuthority).getMarginalAt(i));

        }

        String temp27="";
        Node influencePerceptionOfLiking = net.getNode("influence_perception_of_liking");
        System.out.println("influencePerceptionOfLiking  :" + influencePerceptionOfLiking.getName());
        temp+= "influencePerceptionOfLiking  : " + influencePerceptionOfLiking.getName() + "\n";
        for(int i = 0; i < influencePerceptionOfLiking.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)influencePerceptionOfLiking).getMarginalAt(i));

        }

        String temp28="";
        Node influencePerceptionOfConsensusOrSocialProof = net.getNode("influence_perception_of_concensus_or_social_proof");
        System.out.println("influencePerceptionOfConsensusOrSocialProof :" + influencePerceptionOfConsensusOrSocialProof.getName());
        temp+= "influencePerceptionOfConsensusOrSocialProof : " + influencePerceptionOfConsensusOrSocialProof.getName() + "\n";
        for(int i = 0; i < influencePerceptionOfConsensusOrSocialProof.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)influencePerceptionOfConsensusOrSocialProof).getMarginalAt(i));

        }

        String temp29="";
        Node targetInfluenceViaFraming = net.getNode("target_influence_via_framing");
        System.out.println("targetInfluenceViaFraming :" + targetInfluenceViaFraming.getName());
        temp+= "targetInfluenceViaFraming : " + targetInfluenceViaFraming.getName() + "\n";
        for(int i = 0; i < targetInfluenceViaFraming.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)targetInfluenceViaFraming).getMarginalAt(i));

        }


        String temp30="";
        Node influenceViaModesOfThinking = net.getNode("influence_via_modes_of_thinking");
        System.out.println("influenceViaModesOfThinking :" + influenceViaModesOfThinking.getName());
        temp+= "influenceViaModesOfThinking : " + influenceViaModesOfThinking.getName() + "\n";
        for(int i = 0; i < influenceViaModesOfThinking.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)influenceViaModesOfThinking).getMarginalAt(i));

        }

        String temp31="";
        Node targetInfluenceViaInterviewAndInterrogation = net.getNode("target_influence_via_interview_and_interrogation");
        System.out.println("targetInfluenceViaInterviewAndInterrogation : " + targetInfluenceViaInterviewAndInterrogation.getName());
        temp+= "targetInfluenceViaInterviewAndInterrogation : " + targetInfluenceViaInterviewAndInterrogation.getName() + "\n";
        for(int i = 0; i < targetInfluenceViaInterviewAndInterrogation.getStatesSize(); i++) {

            listOfProbabillity.add(((ProbabilisticNode)targetInfluenceViaInterviewAndInterrogation).getMarginalAt(i));

        }

        //********************************
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
        //********************************************
        for(int i = 0; i < rootingSimCards.getStatesSize(); i++) {
            temp += rootingSimCards.getStateAt(i) + ": " +  ((ProbabilisticNode)rootingSimCards).getMarginalAt(i) + "\n";
             System.out.println(pharming.getStateAt(i) + ": " +  ((ProbabilisticNode)pharming).getMarginalAt(i));
            tapjackingList.add(temp);
            temp="";
            if(((ProbabilisticNode)rootingSimCards).getMarginalAt(i) > max) {
                maxId = "";
                max = ((ProbabilisticNode)rootingSimCards).getMarginalAt(i);
                maxId += rootingSimCards.getStateAt(i);
            }
        }
        //********************************

        System.out.println("*****\n");

        System.out.println(maxId.toUpperCase() + ": " + max);


        poslednji4 += maxId.toUpperCase();

        System.out.println("*************\n" + temp);
        System.out.println("*************\n" + poslednji4);
    }

}
