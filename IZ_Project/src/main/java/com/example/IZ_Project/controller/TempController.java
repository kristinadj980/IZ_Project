package com.example.IZ_Project.controller;

import com.example.IZ_Project.cbr.CbrApplication;
import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.model.Attack;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/temp")
public class TempController {


    @GetMapping(value = "/hello")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("hi", HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/symptoms")
    public ResponseEntity<String> receiveSymptoms(@RequestBody SymptomsDTO symptomsDTO) {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/cbr")
    public ResponseEntity<String> cbrReasoning(@RequestBody SymptomsDTO symptomsDTO) {
        Attack attack = new Attack(symptomsDTO);
        BayesianController b = new BayesianController();
        b.testBayesian(symptomsDTO);
        CbrApplication.calculate(attack);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}