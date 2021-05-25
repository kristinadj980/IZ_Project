package com.example.IZ_Project.dto;

import com.example.IZ_Project.model.CompanySector;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;

import java.util.ArrayList;
import java.util.Date;

public class RiskCalculatorDTO {
    private Continent continent;
    private Scale skillsRequired;
    private Scale likelihood;
    private int numberOfEmployees;
    private CompanySector companySector;
    private Scale severity;

    public RiskCalculatorDTO() {
    }

    public RiskCalculatorDTO(Continent continent, Scale skillsRequired, Scale likelihood, int numberOfEmployees, CompanySector companySector, Scale severity) {
        this.continent = continent;
        this.skillsRequired = skillsRequired;
        this.likelihood = likelihood;
        this.numberOfEmployees = numberOfEmployees;
        this.companySector = companySector;
        this.severity = severity;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
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
}
