package com.example.IZ_Project.connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import com.example.IZ_Project.dto.RdfDTO;
import com.example.IZ_Project.handlers.RemoteRDFHandler;
import com.example.IZ_Project.model.*;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;

//uzima sve iz csv-a i insertuje u rdf
public class CsvToRdf {

    public static void insertCsvCasesToRdfDatabase() {
        LinkedList<RdfDTO> cases = new LinkedList<RdfDTO>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("src\\main\\java\\com\\example\\IZ_Project\\data\\cbrdata.csv")));
            if (br == null)
                throw new Exception("Error opening file");

            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || (line.length() == 0))
                    continue;
                String[] values = line.split(",");

                Company company = new Company();

                Attack attack = new Attack();
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                Date date = format.parse(values[2]);
                Long dateLong = date.getTime();
                attack.setDate(date);
                attack.setDateLong(dateLong);
                attack.setName(values[3]);
                attack.setSkillsRequired(Enum.valueOf(Scale.class,values[8]));
                attack.setSeverity(Enum.valueOf(Scale.class,values[12]));
                attack.setLikelihood(Enum.valueOf(Scale.class,values[11]));

                //prerequisites 8
                attack.setPrerequisiteCBR(new Prerequisite(values[9]));

                //symptoms 3
                company.setCompanyName(values[1]);
                company.setCompanySector(Enum.valueOf(CompanySector.class,values[6]));
                company.setContinent(Enum.valueOf(Continent.class,values[7]));
                company.setNumberOfEmployees(Integer.parseInt(values[5]));

                attack.setCompany(company);

                extractSymptomsList(attack, values[4]);
                String lowercase = values[0].toLowerCase();
                //System.out.println(lowercase.length());
                System.out.println("5d72f5d2-0e77-48d1-b257-59acb1e89d5c");
                UUID uuid = UUID.nameUUIDFromBytes(lowercase.getBytes());
//364c8816-fa4e-3184-99ea-9d6fd1e9cf9c
                attack.setId(uuid);
                //2ec8a288-07ff-4bb1-ae0f-3f62b0a932f3
                //5d72f5d2-0e77-48d1-b257-59acb1e89d5c
                RdfDTO rdfDTO = new RdfDTO(attack);
                cases.add(rdfDTO);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ovde radis insert
        for (RdfDTO rdfDTO : cases) {
            RemoteRDFHandler.attackRegistration(rdfDTO);
        }
    }

    private static void extractSymptomsList(Attack attack, String symptomsList) {
        //[symptom1;symptom2;symptom3]
        symptomsList = symptomsList.substring(1, symptomsList.length() - 1);
        String[] symptoms = symptomsList.split(";");
        Arrays.sort(symptoms);
        for (int i = 0; i < symptoms.length; i++) {
            if (i== 0)
                attack.setSymptom1(symptoms[i]);
            else if (i==1)
                attack.setSymptom2(symptoms[i]);
            else if (i==2)
                attack.setSymptom3(symptoms[i]);
        }
    }

}