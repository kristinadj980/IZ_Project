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

@Controller
@RequestMapping("/api/rdf")
public class RdfController {

    @PostMapping(consumes = "application/json", value = "/insert")
    public ResponseEntity<RdfDTO> receiveData(@RequestBody RdfDTO rdfDTO) {


        return new ResponseEntity<>(RemoteRDFHandler.attackRegistration(rdfDTO), HttpStatus.OK);
    }

    @GetMapping(value = "/getAttacks")
    public ResponseEntity<List<RdfDTO>> getAttacks() {

        return new ResponseEntity<>(RemoteRDFHandler.getAttacks(), HttpStatus.OK);
    }
}
