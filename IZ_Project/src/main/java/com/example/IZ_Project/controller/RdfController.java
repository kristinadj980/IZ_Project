package com.example.IZ_Project.controller;

import com.example.IZ_Project.dto.FuzzyAdapterDTO;
import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.dto.RiskCalculatorDTO;
import com.example.IZ_Project.utils.RemoteRDFHandler;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.JFuzzyLogic;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/rdf")
public class RdfController {

    @PostMapping(consumes = "application/json", value = "/insert")
    public ResponseEntity<RdfDTO> receiveData(@RequestBody RdfDTO rdfDTO) {
        return new ResponseEntity<>(RemoteRDFHandler.attackRegistration(rdfDTO, false), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/insert-cbr")
    public ResponseEntity<RdfDTO> receiveDataCbr(@RequestBody RdfDTO rdfDTO) {
        return new ResponseEntity<>(RemoteRDFHandler.attackRegistration(rdfDTO, true), HttpStatus.OK);
    }

    @GetMapping(value = "/getAttacks")
    public ResponseEntity<List<RdfDTO>> getAttacks() {
        return new ResponseEntity<>(RemoteRDFHandler.getAttacks(false), HttpStatus.OK);
    }

    @GetMapping(value = "/getAttacks-cbr")
    public ResponseEntity<List<RdfDTO>> getAttacksCbr() {
        return new ResponseEntity<>(RemoteRDFHandler.getAttacks(true), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/update")
    public ResponseEntity<RdfDTO> updateAttack(@RequestBody RdfDTO rdfDTO) {

        return new ResponseEntity<>(RemoteRDFHandler.updateAttack(rdfDTO), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/delete")
    public ResponseEntity<List<RdfDTO>> deleteAttack(@RequestBody RdfDTO rdfDTO) {

        return new ResponseEntity<>(RemoteRDFHandler.deleteAttack(rdfDTO), HttpStatus.OK);
    }
}
