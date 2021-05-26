package com.example.IZ_Project.dto;

import com.example.IZ_Project.model.CompanySector;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;

import java.util.ArrayList;
import java.util.Date;

public class SymptomsDTO {
    private String companyName;
    private ArrayList<String> symptoms;
    private Continent continent;
    private String prerequisites;
    private Scale skillsRequired;
    private Scale likelihood;
    private Date date;
    private int numberOfEmployees;
    private CompanySector companySector;
    private Scale severity;

    public SymptomsDTO() {
    }

    public SymptomsDTO(String companyName, ArrayList<String> symptoms, Continent continent, String prerequisites, Scale skillsRequired, Scale likelihood, Date date, int numberOfEmployees, CompanySector companySector, Scale severity) {
        this.companyName = companyName;
        this.symptoms = symptoms;
        this.continent = continent;
        this.prerequisites = prerequisites;
        this.skillsRequired = skillsRequired;
        this.likelihood = likelihood;
        this.date = date;
        this.numberOfEmployees = numberOfEmployees;
        this.companySector = companySector;
        this.severity = severity;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Scale getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(Scale skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    public Scale getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(Scale likelihood) {
        this.likelihood = likelihood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public CompanySector getCompanySector() {
        return companySector;
    }

    public void setCompanySector(CompanySector companySector) {
        this.companySector = companySector;
    }

    public Scale getSeverity() {
        return severity;
    }

    public void setSeverity(Scale severity) {
        this.severity = severity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
