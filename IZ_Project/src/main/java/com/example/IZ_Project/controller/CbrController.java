package com.example.IZ_Project.controller;

import com.example.IZ_Project.dto.AttackDTO;
import com.example.IZ_Project.dto.CountermeasuresDTO;
import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.handlers.PrologHandler;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Countermeasure;
import com.example.IZ_Project.cbr.CbrApplication;
import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Symptom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/temp")
public class CbrController {


    @GetMapping(value = "/hello")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("spear-phishing", HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/symptoms")
    public ResponseEntity<String> receiveSymptoms(@RequestBody SymptomsDTO symptomsDTO) {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    //da na osnovu liste simptoma koja se posalje sa fronta
    @PostMapping(consumes = "application/json", value = "/countermeasures")
    public ResponseEntity<List<CountermeasuresDTO>> findCountermeasures(@RequestBody AttackDTO attackDTO) throws Exception {
        PrologHandler prologHandler = new PrologHandler();
        Attack attack = new Attack(attackDTO.getAttackName());
        List<Countermeasure> countermeasures = prologHandler.findCountermeasuresBasedOnAttack(attack);
        List<CountermeasuresDTO> countermeasuresDTOS = new ArrayList<>();
        for (Countermeasure countermeasure : countermeasures) {
            countermeasuresDTOS.add(new CountermeasuresDTO(countermeasure.getName()));
        }

        return (ResponseEntity<List<CountermeasuresDTO>>) (countermeasuresDTOS == null ?
                new ResponseEntity<>(HttpStatus.NOT_FOUND) :
                ResponseEntity.ok(countermeasuresDTOS));
    }



    @PostMapping(consumes = "application/json", value = "/cbr")
    public ResponseEntity<String> cbrReasoning(@RequestBody SymptomsDTO symptomsDTO) {
        Attack attack = new Attack(symptomsDTO);
        CbrApplication.calculate(attack);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}