package com.example.IZ_Project.model;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Company implements CaseComponent {
    private String companyName;
    private int numberOfEmployees;
    private CompanySector companySector;
    private Continent continent;

    public Company() {
    }

    public Company(String companyName, int numberOfEmployees, CompanySector companySector, Continent continent) {
        this.companyName = companyName;
        this.numberOfEmployees = numberOfEmployees;
        this.companySector = companySector;
        this.continent = continent;
    }

    @Override
    public Attribute getIdAttribute() {
        return null;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", companySector=" + companySector +
                ", continent=" + continent +
                '}';
    }
}
