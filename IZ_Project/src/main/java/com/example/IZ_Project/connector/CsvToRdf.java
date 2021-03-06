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
import org.apache.jena.shared.uuid.UUID_V4;
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
                Date date = format.parse(values[1]);
                Long dateLong = date.getTime();
                attack.setDate(date);
                attack.setDateLong(dateLong);
                attack.setName(values[2]);
                attack.setSkillsRequired(Enum.valueOf(Scale.class,values[7]));
                attack.setSeverity(Enum.valueOf(Scale.class,values[11]));
                attack.setLikelihood(Enum.valueOf(Scale.class,values[10]));

                //prerequisites 8
                attack.setPrerequisiteCBR(new Prerequisite(values[8]));

                //symptoms 3
                company.setCompanyName(values[0]);
                company.setCompanySector(Enum.valueOf(CompanySector.class,values[5]));
                company.setContinent(Enum.valueOf(Continent.class,values[6]));
                company.setNumberOfEmployees(Integer.parseInt(values[4]));

                attack.setCompany(company);

                extractSymptomsList(attack, values[3]);
                String id = values[12].trim();
                UUID uuid = UUID.fromString(id);
                attack.setId(uuid);
                RdfDTO rdfDTO = new RdfDTO();
                rdfDTO.GenerateRdfDTOFromAttack(attack);
                cases.add(rdfDTO);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        //ovde radis insert
        for (RdfDTO rdfDTO : cases) {
            if (!RemoteRDFHandler.caseExists(rdfDTO))
                RemoteRDFHandler.fillCsvCases(rdfDTO);
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