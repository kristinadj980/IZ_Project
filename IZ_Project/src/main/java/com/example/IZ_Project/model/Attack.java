package com.example.IZ_Project.model;

import com.example.IZ_Project.dto.SymptomsDTO;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Attack implements CaseComponent {
    private String name;
    private Scale likelihood;
    private Scale severity;
    private Scale skillsRequired;
    private Date date;
    private Long dateLong;
    private Company company;
    private ArrayList<Symptom> symptoms;
    private ArrayList<Consequence> consequences;
    private ArrayList<Prerequisite> prerequisites;
    private ArrayList<Countermeasure> countermeasures;   //vidi sa njima jel treba ovo!
    private Prerequisite prerequisiteCBR;
    private String symptom1;
    private String symptom2;
    private String symptom3;

    public Attack() {
    }

    public Attack(String name) {
        this.name = name;
    }

    public Attack(String name, Scale likelihood, Scale severity, Scale skillsRequired, Date date, Long dateLong, Company company, ArrayList<Symptom> symptoms, ArrayList<Consequence> consequences, ArrayList<Prerequisite> prerequisites, ArrayList<Countermeasure> countermeasures, Prerequisite prerequisiteCBR) {
        this.name = name;
        this.likelihood = likelihood;
        this.severity = severity;
        this.skillsRequired = skillsRequired;
        this.date = date;
        this.dateLong = dateLong;
        this.company = company;
        this.symptoms = symptoms;
        this.consequences = consequences;
        this.prerequisites = prerequisites;
        this.countermeasures = countermeasures;
        this.prerequisiteCBR = prerequisiteCBR;
    }

    public Attack(SymptomsDTO symptomsDTO) {
        Company company = new Company();
        company.setCompanyName(symptomsDTO.getCompanyName());
        company.setCompanySector(symptomsDTO.getCompanySector());
        company.setNumberOfEmployees(symptomsDTO.getNumberOfEmployees());
        company.setContinent(symptomsDTO.getContinent());

        this.setCompany(company);

        //this.setName("spear-fishing");
        this.setSkillsRequired(symptomsDTO.getSkillsRequired());
        this.setLikelihood(symptomsDTO.getLikelihood());
        this.setDate(symptomsDTO.getDate());
        this.setSeverity(symptomsDTO.getSeverity());
        this.setDateLong(symptomsDTO.getDate().getTime());
        this.setPrerequisiteCBR(new Prerequisite(symptomsDTO.getPrerequisites()));
        ArrayList<Symptom> temp = new ArrayList<>();
        for (String s : symptomsDTO.getSymptoms()) {
            Symptom symptom = new Symptom(s);
            temp.add(symptom);
        }
        this.setSymptoms(temp);

        //ideja je da sortiramo listu simptoma po alfabetu i onda uzmemo prva tri i uporedimo za cbr sa EqualsIgnoreCase
        Collections.sort(symptomsDTO.getSymptoms());

        for (int i = 0; i < symptomsDTO.getSymptoms().size(); i++) {
            if (i== 0)
                this.setSymptom1(symptomsDTO.getSymptoms().get(i));
            else if (i==1)
                this.setSymptom2(symptomsDTO.getSymptoms().get(i));
            else if (i==2)
                this.setSymptom3(symptomsDTO.getSymptoms().get(i));
        }

    }

    public String getSymptom1() {
        return symptom1;
    }

    public void setSymptom1(String symptom1) {
        this.symptom1 = symptom1;
    }

    public String getSymptom2() {
        return symptom2;
    }

    public void setSymptom2(String symptom2) {
        this.symptom2 = symptom2;
    }

    public String getSymptom3() {
        return symptom3;
    }

    public void setSymptom3(String symptom3) {
        this.symptom3 = symptom3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scale getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(Scale likelihood) {
        this.likelihood = likelihood;
    }

    public Scale getSeverity() {
        return severity;
    }

    public void setSeverity(Scale severity) {
        this.severity = severity;
    }

    public Scale getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(Scale skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getDateLong() {
        return dateLong;
    }

    public void setDateLong(Long dateLong) {
        this.dateLong = dateLong;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public ArrayList<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<Consequence> getConsequences() {
        return consequences;
    }

    public void setConsequences(ArrayList<Consequence> consequences) {
        this.consequences = consequences;
    }

    public ArrayList<Prerequisite> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<Prerequisite> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<Countermeasure> getCountermeasures() {
        return countermeasures;
    }

    public void setCountermeasures(ArrayList<Countermeasure> countermeasures) {
        this.countermeasures = countermeasures;
    }

    public Prerequisite getPrerequisiteCBR() {
        return prerequisiteCBR;
    }

    public void setPrerequisiteCBR(Prerequisite prerequisiteCBR) {
        this.prerequisiteCBR = prerequisiteCBR;
    }

    @Override
    public Attribute getIdAttribute() {
        return null;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "name='" + name + '\'' +
                ", likelihood=" + likelihood +
                ", severity=" + severity +
                ", skillsRequired=" + skillsRequired +
                ", date=" + date +
                ", dateLong=" + dateLong +
                ", company=" + company +
                ", symptoms=" + symptoms +
                ", prerequisiteCBR=" + prerequisiteCBR +
                ", symptom1='" + symptom1 + '\'' +
                ", symptom2='" + symptom2 + '\'' +
                ", symptom3='" + symptom3 + '\'' +
                '}';
    }
}
