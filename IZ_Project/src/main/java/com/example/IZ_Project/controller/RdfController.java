package com.example.IZ_Project.controller;

import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.handlers.RemoteRDFHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @PostMapping(consumes = "application/json", value = "/update")
    public ResponseEntity<RdfDTO> updateAttack(@RequestBody RdfDTO rdfDTO) {
        return new ResponseEntity<>(RemoteRDFHandler.updateAttack(rdfDTO), HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", value = "/delete")
    public ResponseEntity<List<RdfDTO>> deleteAttack(@RequestBody RdfDTO rdfDTO) {
        return new ResponseEntity<>(RemoteRDFHandler.deleteAttack(rdfDTO), HttpStatus.OK);
    }
}
