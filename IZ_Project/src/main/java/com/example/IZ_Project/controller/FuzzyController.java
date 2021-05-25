package com.example.IZ_Project.controller;

import com.example.IZ_Project.dto.FuzzyAdapterDTO;
import com.example.IZ_Project.dto.RiskCalculatorDTO;
import com.example.IZ_Project.dto.SymptomsDTO;
import com.example.IZ_Project.model.Scale;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.JFuzzyLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.DecimalFormat;

@Controller
@RequestMapping("/api/fuzzy")
public class FuzzyController {

    private static final String fclFilename = "src/main/java/com/example/IZ_Project/data/riskcalculator.fcl";

    @PostMapping(consumes = "application/json", value = "/calculator")
    public ResponseEntity<Double> receiveData(@RequestBody RiskCalculatorDTO riskCalculatorDTO) {
        FuzzyAdapterDTO fuzzyAdapterDTO = new FuzzyAdapterDTO(riskCalculatorDTO);

        String[] fuzzyArguments = { "-noCharts", "-e", fclFilename,
                ""+fuzzyAdapterDTO.getSeverity(),
                ""+fuzzyAdapterDTO.getLikelihood(),
                ""+fuzzyAdapterDTO.getCompany_size(),
                ""+fuzzyAdapterDTO.getContinent(),
                ""+fuzzyAdapterDTO.getSkills_required(),
                ""+fuzzyAdapterDTO.getCompany_sector()
        };
        JFuzzyLogic jFuzzyLogic = new JFuzzyLogic(fuzzyArguments);
        jFuzzyLogic.run();
        FIS fis = jFuzzyLogic.getFis();  // Fuzzy Inference System

        // output rizik
        double risk = fis.getVariable("risk").getValue();
        DecimalFormat f = new DecimalFormat("##.00");

        return new ResponseEntity<>(Double.parseDouble(f.format(risk)), HttpStatus.OK);
    }
}
