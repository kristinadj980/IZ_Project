package com.example.IZ_Project.model;

import java.util.ArrayList;
import java.util.Date;

public class Attack {
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
}
