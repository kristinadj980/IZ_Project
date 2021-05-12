package com.example.IZ_Project;

import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.Countermeasure;
import com.ugos.jiprolog.engine.JIPEngine;
import com.ugos.jiprolog.engine.JIPQuery;
import com.ugos.jiprolog.engine.JIPTerm;
import com.ugos.jiprolog.engine.JIPVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class IzProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IzProjectApplication.class, args);
		JIPEngine engine = new JIPEngine();
		//engine.consultFile("C:\\Users\\user\\Desktop\\inzenjering projekat\\IZ_Project\\IZ_Project\\src\\main\\java\\com\\example\\IZ_Project\\data\\facts.pl");
		engine.consultFile("src/main/java/com/example/IZ_Project/data/facts.pl");
		Attack attack = new Attack();
		attack.setName("spear-phishing");
		String attackName = attack.getName();
		JIPQuery query = engine.openSynchronousQuery("countermeasures(" + attackName +",L)");
		JIPTerm solution;
		Countermeasure countermeasure = new Countermeasure();

		ArrayList<Countermeasure> countermeasures = new ArrayList<>();
		while ( (solution = query.nextSolution()) != null) {
			//System.out.println("solution: " + solution);
			for (JIPVariable var: solution.getVariables()) {
				String solution1 = var.toString();
				String solution2 = solution1.replace("(", ")");
				String solution3 = solution2.replace(")"," ");
				String solution4 = solution3.replace("[]", "'.'");
				String solution5 = solution4.replace("'.'", " ");
				String[] parts = solution5.split(",");
				for(int i = 0; i < parts.length; i++){
					//System.out.println(parts[i]);
					countermeasure.setName(parts[i]);
					System.out.println(countermeasure.getName());
					countermeasures.add(countermeasure);
					attack.setCountermeasures(countermeasures);

				}
			}
		}
	}

}
