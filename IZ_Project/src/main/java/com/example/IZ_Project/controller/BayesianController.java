package com.example.IZ_Project.controller;

import com.example.IZ_Project.cbr.CbrApplication;
import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
import java.util.*;

@Controller
@RequestMapping("/api/bayesian")
public class BayesianController {

    @PostMapping(consumes = "application/json", value = "/reasoning")
    public ResponseEntity<List<String>> bayesianReasoning(@RequestBody SymptomsDTO symptomsDTO) {
        List<String> response = testBayesian(symptomsDTO);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public List<String> testBayesian(SymptomsDTO symptomsDTO) {
        ProbabilisticNetwork net = new ProbabilisticNetwork("example");
        BaseIO io = new NetIO();
        try {
            net = (ProbabilisticNetwork) io.load(new File("src/main/java/com/example/IZ_Project/data/bayesian.net"));
        } catch (LoadException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
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

        for (Node node : nodeList) {
            System.out.println(node.getName());
            for (int i = 0; i < node.getStatesSize(); i++) {
                System.out.println(node.getStateAt(i) + ": " + ((ProbabilisticNode) node).getMarginalAt(i));
            }
        }

        HashMap<String,Float> hashMap = new HashMap<>();

        Node pharming = net.getNode("pharming");
        System.out.println("Pharming: " + pharming.getName());
        for(int i = 0; i < pharming.getStatesSize()-1; i++)
            hashMap.put(pharming.getName(),((ProbabilisticNode)pharming).getMarginalAt(i));

        Node counterfeitWebsites = net.getNode("counterfeit_websites");
        System.out.println("Counterfeit_websites: " + counterfeitWebsites.getName());
        for(int i = 0; i < counterfeitWebsites.getStatesSize()-1; i++)
            hashMap.put(counterfeitWebsites.getName(),((ProbabilisticNode)counterfeitWebsites).getMarginalAt(i));


        Node spearPhishing = net.getNode("spear_phishing");
        System.out.println("spearPhishing: " + spearPhishing.getName());
        for(int i = 0; i < spearPhishing.getStatesSize()-1; i++)
            hashMap.put(spearPhishing.getName(),((ProbabilisticNode)spearPhishing).getMarginalAt(i));

        Node mobilePhishing = net.getNode("mobile_phishing");
        System.out.println("mobilePhishing: " + mobilePhishing.getName());
        for(int i = 0; i < mobilePhishing.getStatesSize()-1; i++)
            hashMap.put(mobilePhishing.getName(),((ProbabilisticNode)mobilePhishing).getMarginalAt(i));

        Node voicePhishing = net.getNode("voice_phishing");
        System.out.println("voicePhishing: " + voicePhishing.getName());
        for(int i = 0; i < voicePhishing.getStatesSize()-1; i++)
            hashMap.put(voicePhishing.getName(),((ProbabilisticNode)voicePhishing).getMarginalAt(i));

        Node typoSquatting = net.getNode("typo_squatting");
        System.out.println("typoSquatting: " + typoSquatting.getName());
        for(int i = 0; i < typoSquatting.getStatesSize()-1; i++)
            hashMap.put(typoSquatting.getName(),((ProbabilisticNode)typoSquatting).getMarginalAt(i));

        Node soundSquatting = net.getNode("sound_squatting");
        System.out.println("soundSquatting: " + soundSquatting.getName());
        for(int i = 0; i < soundSquatting.getStatesSize()-1; i++)
            hashMap.put(soundSquatting.getName(),((ProbabilisticNode)soundSquatting).getMarginalAt(i));

        Node homographAttackViaHomoglyphs = net.getNode("homograph_attack_via_homoglyphs");
        System.out.println("homographAttackViaHomoglyphs: " + homographAttackViaHomoglyphs.getName());
        for(int i = 0; i < homographAttackViaHomoglyphs.getStatesSize()-1; i++)
            hashMap.put(homographAttackViaHomoglyphs.getName(),((ProbabilisticNode)homographAttackViaHomoglyphs).getMarginalAt(i));

        Node bitSquatting = net.getNode("bit_squatting");
        System.out.println("bitSquatting: " + bitSquatting.getName());
        for(int i = 0; i < bitSquatting.getStatesSize()-1; i++)
            hashMap.put(bitSquatting.getName(),((ProbabilisticNode)bitSquatting).getMarginalAt(i));

        Node pretextingViaCustomerService = net.getNode("pretexting_via_customer_service");
        System.out.println("pretextingViaCustomerService: " + pretextingViaCustomerService.getName());
        for(int i = 0; i < pretextingViaCustomerService.getStatesSize()-1; i++)
            hashMap.put(pretextingViaCustomerService.getName(),((ProbabilisticNode)pretextingViaCustomerService).getMarginalAt(i));

        Node dnsDomainSeizure = net.getNode("dns_domain_seizure");
        System.out.println("dnsDomainSeizure: " + dnsDomainSeizure.getName());
        for(int i = 0; i < dnsDomainSeizure.getStatesSize()-1; i++)
            hashMap.put(dnsDomainSeizure.getName(),((ProbabilisticNode)dnsDomainSeizure).getMarginalAt(i));

        Node influenceViaIncentives = net.getNode("influence_via_incentives");
        System.out.println("influenceViaIncentives: " + influenceViaIncentives.getName());
        for(int i = 0; i < influenceViaIncentives.getStatesSize()-1; i++)
            hashMap.put(influenceViaIncentives.getName(),((ProbabilisticNode)influenceViaIncentives).getMarginalAt(i));


        Node harvestingInformationViaApiEventMonitoring = net.getNode("harvesting_information_via_api_event_monitoring");
        System.out.println("harvestingInformationViaApiEventMonitoring: " + harvestingInformationViaApiEventMonitoring.getName());
        for(int i = 0; i < harvestingInformationViaApiEventMonitoring.getStatesSize()-1; i++)
            hashMap.put(harvestingInformationViaApiEventMonitoring.getName(),((ProbabilisticNode)harvestingInformationViaApiEventMonitoring).getMarginalAt(i));

        Node flashFileOverlay = net.getNode("flash_file_overlay");
        System.out.println("flashFileOverlay: " + flashFileOverlay.getName());
        for(int i = 0; i < flashFileOverlay.getStatesSize()-1; i++)
            hashMap.put(flashFileOverlay.getName(),((ProbabilisticNode)flashFileOverlay).getMarginalAt(i));

        Node iframeOverlay = net.getNode("ifame_overlay");
        System.out.println("iframeOverlay: " + iframeOverlay.getName());
        for(int i = 0; i < iframeOverlay.getStatesSize()-1; i++)
            hashMap.put(iframeOverlay.getName(),((ProbabilisticNode)iframeOverlay).getMarginalAt(i));

        Node credentialPromptImpersonation = net.getNode("credential_prompt_impersonation");
        System.out.println("credentialPromptImpersonation: " + credentialPromptImpersonation.getName());
        for(int i = 0; i < credentialPromptImpersonation.getStatesSize()-1; i++)
            hashMap.put(credentialPromptImpersonation.getName(),((ProbabilisticNode)credentialPromptImpersonation).getMarginalAt(i));

        Node androidActivityHijack = net.getNode("android_activity_hijack");
        System.out.println("androidActivityHijack: " + androidActivityHijack.getName());
        for(int i = 0; i < androidActivityHijack.getStatesSize()-1; i++)
            hashMap.put(androidActivityHijack.getName(),((ProbabilisticNode)androidActivityHijack).getMarginalAt(i));

        Node tapjacking = net.getNode("tapjacking");
        System.out.println("tapjacking: " + tapjacking.getName());
        for(int i = 0; i < tapjacking.getStatesSize()-1; i++)
            hashMap.put(tapjacking.getName(),((ProbabilisticNode)tapjacking).getMarginalAt(i));

        Node maliciousManualSoftwareUpdate = net.getNode("malicious_manual_software_update");
        System.out.println("maliciousManualSoftwareUpdate: " + maliciousManualSoftwareUpdate.getName());
        for(int i = 0; i < maliciousManualSoftwareUpdate.getStatesSize()-1; i++)
            hashMap.put(maliciousManualSoftwareUpdate.getName(),((ProbabilisticNode)maliciousManualSoftwareUpdate).getMarginalAt(i));

        Node rootingSimCards = net.getNode("rooting_sim_cards");
        System.out.println("rootingSimCards: " + rootingSimCards.getName());
        for(int i = 0; i < rootingSimCards.getStatesSize()-1; i++)
            hashMap.put(rootingSimCards.getName(),((ProbabilisticNode)rootingSimCards).getMarginalAt(i));


        Node pretextingViaTechSupport = net.getNode("pretexting_via_tech_support");
        System.out.println("pretextingViaTechSupport: " + pretextingViaTechSupport.getName());
        for(int i = 0; i < pretextingViaTechSupport.getStatesSize()-1; i++)
            hashMap.put(pretextingViaTechSupport.getName(),((ProbabilisticNode)pretextingViaTechSupport).getMarginalAt(i));

        Node pretextingViaDeliveryPerson = net.getNode("pretexting_via_delivery_person");
        System.out.println("pretextingViaDeliveryPerson: " + pretextingViaDeliveryPerson.getName());
        for(int i = 0; i < pretextingViaDeliveryPerson.getStatesSize()-1; i++)
            hashMap.put(pretextingViaDeliveryPerson.getName(),((ProbabilisticNode)pretextingViaDeliveryPerson).getMarginalAt(i));

        Node pretextingViaPhone = net.getNode("pretexting_via_phone");
        System.out.println("pretextingViaPhone: " + pretextingViaPhone.getName());
        for(int i = 0; i < pretextingViaPhone.getStatesSize()-1; i++)
            hashMap.put(pretextingViaPhone.getName(),((ProbabilisticNode)pretextingViaPhone).getMarginalAt(i));


        Node influencePerceptionOfReciprocation = net.getNode("influence_perception_of_reciprocation");
        System.out.println("influencePerceptionOfReciprocation: " + influencePerceptionOfReciprocation.getName());
        for(int i = 0; i < influencePerceptionOfReciprocation.getStatesSize()-1; i++)
            hashMap.put(influencePerceptionOfReciprocation.getName(),((ProbabilisticNode)influencePerceptionOfReciprocation).getMarginalAt(i));


        Node influencePerceptionOfScarcity = net.getNode("influence_perception_of_scarcity");
        System.out.println("influencePerceptionOfScarcity :" + influencePerceptionOfScarcity.getName());
        for(int i = 0; i < influencePerceptionOfScarcity.getStatesSize()-1; i++)
            hashMap.put(influencePerceptionOfScarcity.getName(),((ProbabilisticNode)influencePerceptionOfScarcity).getMarginalAt(i));

        Node influencePerceptionOfAuthority = net.getNode("influence_perception_of_authority");
        System.out.println("influencePerceptionOfAuthority :" + influencePerceptionOfAuthority.getName());
        for(int i = 0; i < influencePerceptionOfAuthority.getStatesSize()-1; i++)
            hashMap.put(influencePerceptionOfAuthority.getName(),((ProbabilisticNode)influencePerceptionOfAuthority).getMarginalAt(i));

        Node influencePerceptionOfLiking = net.getNode("influence_perception_of_liking");
        System.out.println("influencePerceptionOfLiking  :" + influencePerceptionOfLiking.getName());
        for(int i = 0; i < influencePerceptionOfLiking.getStatesSize()-1; i++)
            hashMap.put(influencePerceptionOfLiking.getName(),((ProbabilisticNode)influencePerceptionOfLiking).getMarginalAt(i));

        Node influencePerceptionOfConsensusOrSocialProof = net.getNode("influence_perception_of_concensus_or_social_proof");
        System.out.println("influencePerceptionOfConsensusOrSocialProof :" + influencePerceptionOfConsensusOrSocialProof.getName());
        for(int i = 0; i < influencePerceptionOfConsensusOrSocialProof.getStatesSize()-1; i++)
            hashMap.put(influencePerceptionOfConsensusOrSocialProof.getName(),((ProbabilisticNode)influencePerceptionOfConsensusOrSocialProof).getMarginalAt(i));

        Node targetInfluenceViaFraming = net.getNode("target_influence_via_framing");
        System.out.println("targetInfluenceViaFraming :" + targetInfluenceViaFraming.getName());
        for(int i = 0; i < targetInfluenceViaFraming.getStatesSize()-1; i++)
            hashMap.put(targetInfluenceViaFraming.getName(),((ProbabilisticNode)targetInfluenceViaFraming).getMarginalAt(i));


        Node influenceViaModesOfThinking = net.getNode("influence_via_modes_of_thinking");
        System.out.println("influenceViaModesOfThinking :" + influenceViaModesOfThinking.getName());
        for(int i = 0; i < influenceViaModesOfThinking.getStatesSize()-1; i++)
            hashMap.put(influenceViaModesOfThinking.getName(),((ProbabilisticNode)influenceViaModesOfThinking).getMarginalAt(i));

        Node targetInfluenceViaInterviewAndInterrogation = net.getNode("target_influence_via_interview_and_interrogation");
        System.out.println("targetInfluenceViaInterviewAndInterrogation : " + targetInfluenceViaInterviewAndInterrogation.getName());
        for(int i = 0; i < targetInfluenceViaInterviewAndInterrogation.getStatesSize()-1; i++)
            hashMap.put(targetInfluenceViaInterviewAndInterrogation.getName(),((ProbabilisticNode)targetInfluenceViaInterviewAndInterrogation).getMarginalAt(i));


        double maxValue = 0.0;
        List<String> attacks = new ArrayList<>();
        for (Map.Entry<String, Float> h : hashMap.entrySet()) {
            System.out.println(h.getKey());
            System.out.println(h.getValue());
            if(h.getValue()>maxValue){
                maxValue = h.getValue();
            }
        }

        for (Map.Entry<String, Float> h : hashMap.entrySet())
            if(h.getValue() == maxValue)
                attacks.add(h.getKey());

        return attacks;
    }

}
