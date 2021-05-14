package com.example.IZ_Project;

import com.example.IZ_Project.handlers.PrologHandler;
import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Countermeasure;
import com.example.IZ_Project.model.Symptom;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class IzProjectApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(IzProjectApplication.class, args);

		ArrayList<Symptom> symptoms = new ArrayList<>();
		symptoms.add(new Symptom("suspicious_website"));
		symptoms.add(new Symptom("suspicious_conversation_email"));
		Attack attack = new Attack();
		attack.setName("spear-phishing");
		PrologHandler prologHandler = new PrologHandler();
		ArrayList<Attack> attacks = prologHandler.findAttacksBasedOnSympthoms(symptoms);
		//ArrayList<Countermeasure> countermeasures = prologHandler.findCountermeasuresBasedOnAttack(attack);
		System.out.println(attacks.isEmpty());

	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("*")
						.allowedHeaders("*")
						.allowedOrigins("*");
			}
		};
	}

}
