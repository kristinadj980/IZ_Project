package com.example.IZ_Project.model;

import com.example.IZ_Project.dto.SymptomsDTO;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

import java.util.ArrayList;
import java.util.Date;

public class Attack implements CaseComponent {
    private String name;
    private Scale likelihood;
    private Scale severity;
    private Scale skillsRequired;
    private Date date;
    private Company company;
    private ArrayList<Symptom> symptoms;
    private ArrayList<Consequence> consequences;
    private ArrayList<Prerequisite> prerequisites;

    public Attack() {
    }

    public Attack(String name, Scale likelihood, Scale severity, Scale skillsRequired, Date date, Company company, ArrayList<Symptom> symptoms, ArrayList<Consequence> consequences, ArrayList<Prerequisite> prerequisites) {
        this.name = name;
        this.likelihood = likelihood;
        this.severity = severity;
        this.skillsRequired = skillsRequired;
        this.date = date;
        this.company = company;
        this.symptoms = symptoms;
        this.consequences = consequences;
        this.prerequisites = prerequisites;
    }

    public Attack(SymptomsDTO symptomsDTO) {
        Company company = new Company();
        company.setCompanyName("google");
        company.setCompanySector(symptomsDTO.getCompanySector());
        company.setNumberOfEmployees(symptomsDTO.getNumberOfEmployees());
        company.setContinent(symptomsDTO.getContinent());

        this.setCompany(company);

        this.setName("spear-fishing");
        this.setSkillsRequired(symptomsDTO.getSkillsRequired());
        this.setLikelihood(symptomsDTO.getLikelihood());
        this.setDate(symptomsDTO.getDate());
        this.setSeverity(symptomsDTO.getSeverity());
    }

    @Override
    public Attribute getIdAttribute() {
        return null;
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

    @Override
    public String toString() {
        return "Attack{" +
                "name='" + name + '\'' +
                ", likelihood=" + likelihood +
                ", severity=" + severity +
                ", skillsRequired=" + skillsRequired +
                ", date=" + date +
                ", company=" + company +
                ", symptoms=" + symptoms +
                ", consequences=" + consequences +
                ", prerequisites=" + prerequisites +
                '}';
    }
}
