package com.example.IZ_Project.model;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Symptom implements CaseComponent {
    private String name;

    public Symptom() {
        super();
    }

    public Symptom(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Attribute getIdAttribute() {
        return null;
    }

}
