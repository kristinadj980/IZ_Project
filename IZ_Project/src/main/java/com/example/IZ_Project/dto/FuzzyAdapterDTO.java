package com.example.IZ_Project.dto;

import com.example.IZ_Project.model.CompanySector;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;

public class FuzzyAdapterDTO {
    int severity;
    int likelihood;
    int company_size;
    int continent;
    int skills_required;
    int company_sector;

    public FuzzyAdapterDTO(int severity, int likelihood, int company_size, int continent, int skills_required, int company_sector) {
        this.severity = severity;
        this.likelihood = likelihood;
        this.company_size = company_size;
        this.continent = continent;
        this.skills_required = skills_required;
        this.company_sector = company_sector;
    }

    public FuzzyAdapterDTO() {
    }

    public FuzzyAdapterDTO(RiskCalculatorDTO riskCalculatorDTO) {
        if (riskCalculatorDTO.getSeverity().equals(Scale.LOW))
            this.severity = 33;
        else if (riskCalculatorDTO.getSeverity().equals(Scale.MEDIUM))
            this.severity = 66;
        else
            this.severity = 90;

        if (riskCalculatorDTO.getLikelihood().equals(Scale.LOW))
            this.likelihood = 33;
        else if (riskCalculatorDTO.getLikelihood().equals(Scale.MEDIUM))
            this.likelihood = 66;
        else
            this.likelihood = 90;

        if (riskCalculatorDTO.getSkillsRequired().equals(Scale.LOW))
            this.skills_required = 33;
        else if (riskCalculatorDTO.getSkillsRequired().equals(Scale.MEDIUM))
            this.skills_required = 66;
        else
            this.skills_required = 90;

        this.company_size = riskCalculatorDTO.getNumberOfEmployees();

        if (riskCalculatorDTO.getContinent().equals(Continent.asia))
            this.continent = 20;
        else if (riskCalculatorDTO.getContinent().equals(Continent.europe))
            this.continent = 10;
        else if (riskCalculatorDTO.getContinent().equals(Continent.north_america))
            this.continent = 40;
        else if (riskCalculatorDTO.getContinent().equals(Continent.south_america))
            this.continent = 50;
        else if (riskCalculatorDTO.getContinent().equals(Continent.australia))
            this.continent = 60;
        else if (riskCalculatorDTO.getContinent().equals(Continent.africa))
            this.continent = 30;

        if (riskCalculatorDTO.getCompanySector().equals(CompanySector.finance))
            this.company_sector = 20;
        else if (riskCalculatorDTO.getCompanySector().equals(CompanySector.business_and_professional_service))
            this.company_sector = 40;
        else if (riskCalculatorDTO.getCompanySector().equals(CompanySector.retail_and_manufacturing))
            this.company_sector = 50;
        else if (riskCalculatorDTO.getCompanySector().equals(CompanySector.logistics_and_transportation))
            this.company_sector = 60;
        else if (riskCalculatorDTO.getCompanySector().equals(CompanySector.technology))
            this.company_sector = 30;
        else if (riskCalculatorDTO.getCompanySector().equals(CompanySector.hospital))
            this.company_sector = 10;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(int likelihood) {
        this.likelihood = likelihood;
    }

    public int getCompany_size() {
        return company_size;
    }

    public void setCompany_size(int company_size) {
        this.company_size = company_size;
    }

    public int getContinent() {
        return continent;
    }

    public void setContinent(int continent) {
        this.continent = continent;
    }

    public int getSkills_required() {
        return skills_required;
    }

    public void setSkills_required(int skills_required) {
        this.skills_required = skills_required;
    }

    public int getCompany_sector() {
        return company_sector;
    }

    public void setCompany_sector(int company_sector) {
        this.company_sector = company_sector;
    }
}
