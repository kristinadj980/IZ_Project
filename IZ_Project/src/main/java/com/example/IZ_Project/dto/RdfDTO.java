package com.example.IZ_Project.dto;

import com.example.IZ_Project.model.Attack;
import com.example.IZ_Project.model.CompanySector;
import com.example.IZ_Project.model.Continent;
import com.example.IZ_Project.model.Scale;
import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

import java.util.Date;
import java.util.UUID;

public class RdfDTO {
    private UUID id;
    private String attackName;
    private String companyName;
    private String symptom1;
    private String symptom2;
    private String symptom3;
    private Continent continent;
    private String prerequisites;
    private Scale skillsRequired;
    private Scale likelihood;
    private Date date;
    private Long dateLong;
    private int numberOfEmployees;
    private CompanySector companySector;
    private Scale severity;

    public RdfDTO() {
    }

    public RdfDTO(Attack attack) {
        this.id = UUID.randomUUID();
        this.attackName = attack.getName();
        this.companyName = attack.getCompany().getCompanyName();
        this.symptom1 = attack.getSymptom1();
        this.symptom2 = attack.getSymptom2();
        this.symptom3 = attack.getSymptom3();
        this.continent = attack.getCompany().getContinent();
        this.setDateLong(attack.getDateLong());
        this.prerequisites = attack.getPrerequisiteCBR().getName();
        this.skillsRequired = attack.getSkillsRequired();
        this.likelihood = attack.getLikelihood();
        this.date = attack.getDate();
        this.numberOfEmployees = attack.getCompany().getNumberOfEmployees();
        this.companySector = attack.getCompany().getCompanySector();
        this.severity = attack.getSeverity();
    }


    public RdfDTO(UUID id, String attackName, String companyName, String symptom1, String symptom2, String symptom3,
                  Continent continent, String prerequisites, Scale skillsRequired, Scale likelihood, Date date,
                  int numberOfEmployees, CompanySector companySector, Scale severity) {
        this.id = id;
        this.attackName = attackName;
        this.companyName = companyName;
        this.symptom1 = symptom1;
        this.symptom2 = symptom2;
        this.symptom3 = symptom3;
        this.continent = continent;
        this.prerequisites = prerequisites;
        this.skillsRequired = skillsRequired;
        this.likelihood = likelihood;
        this.date = date;
        this.numberOfEmployees = numberOfEmployees;
        this.companySector = companySector;
        this.severity = severity;
    }

    public Long getDateLong() {
        return dateLong;
    }

    public void setDateLong(Long dateLong) {
        this.dateLong = dateLong;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

}
