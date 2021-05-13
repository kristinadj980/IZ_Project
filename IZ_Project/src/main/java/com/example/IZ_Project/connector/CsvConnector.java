package com.example.IZ_Project.connector;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;


import com.example.IZ_Project.model.*;
import ucm.gaia.jcolibri.cbrcore.CBRCase;
import ucm.gaia.jcolibri.cbrcore.CaseBaseFilter;
import ucm.gaia.jcolibri.cbrcore.Connector;
import ucm.gaia.jcolibri.exception.InitializingException;
import ucm.gaia.jcolibri.util.FileIO;

public class CsvConnector implements Connector {

    @Override
    public Collection<CBRCase> retrieveAllCases() {
        LinkedList<CBRCase> cases = new LinkedList<CBRCase>();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(FileIO.openFile("C:\\Users\\david\\Desktop\\Fax\\cetvrta godina\\drugi semestar\\inzinjering znanja\\tempp\\IZ_Project\\IZ_Project\\src\\main\\java\\com\\example\\IZ_Project\\data\\cbrdata.csv")));
            if (br == null)
                throw new Exception("Error opening file");

            String line = "";
            while ((line = br.readLine()) != null) {
                if (line.startsWith("#") || (line.length() == 0))
                    continue;
                String[] values = line.split(",");

                CBRCase cbrCase = new CBRCase();

                Company company = new Company();

                Attack attack = new Attack();
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
                Date date = format.parse(values[1]);
                attack.setDate(date);
                attack.setName(values[2]);
                attack.setSkillsRequired(Enum.valueOf(Scale.class,values[7]));
                attack.setSeverity(Enum.valueOf(Scale.class,values[11]));
                attack.setLikelihood(Enum.valueOf(Scale.class,values[10]));

                //prerequisites 8
                //consensquences 9
                //symptoms 3
                company.setCompanyName(values[0]);
                company.setCompanySector(Enum.valueOf(CompanySector.class,values[5]));
                company.setContinent(Enum.valueOf(Continent.class,values[6]));
                company.setNumberOfEmployees(Integer.parseInt(values[4]));

                attack.setCompany(company);




                cbrCase.setDescription(attack);
                cases.add(cbrCase);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cases;
    }

    @Override
    public Collection<CBRCase> retrieveSomeCases(CaseBaseFilter arg0) {
        return null;
    }

    @Override
    public void storeCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void close() {
    }

    @Override
    public void deleteCases(Collection<CBRCase> arg0) {
    }

    @Override
    public void initFromXMLfile(URL arg0) throws InitializingException {
    }

}