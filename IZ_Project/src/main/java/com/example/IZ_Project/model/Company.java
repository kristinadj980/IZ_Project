package com.example.IZ_Project.model;

public class Company {
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
}
