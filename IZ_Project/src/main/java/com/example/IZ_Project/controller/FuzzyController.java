package com.example.IZ_Project;

import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.JFuzzyLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class FuzzyController {

    private static final String fclFilename = "src/main/java/com/example/IZ_Project/data/riskcalculator.fcl";

    public static void main(String[] args) {

        String fuzzyArguments[] = { "-noCharts", "-e", fclFilename,
                ""+33,
                ""+66,
                ""+345,
                ""+10,
                ""+70,
                ""+50
        };
        JFuzzyLogic jFuzzyLogic = new JFuzzyLogic(fuzzyArguments);
        jFuzzyLogic.run();
        FIS fis = jFuzzyLogic.getFis();  // Fuzzy Inference System

        // output rizik
        double risk = fis.getVariable("risk").getValue();

    }
}
