package com.example.IZ_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
@RequestMapping("/api/temp")
public class TempController {


    @GetMapping(value = "/hello")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("hi", HttpStatus.OK);
    }
}