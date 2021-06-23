package com.example.IZ_Project.model;

import ucm.gaia.jcolibri.cbrcore.Attribute;
import ucm.gaia.jcolibri.cbrcore.CaseComponent;

public class Prerequisite implements CaseComponent {
    private String name;

    public Prerequisite(String name) {
        this.name = name;
    }

    public Prerequisite() {
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

    @Override
    public String toString() {
        return "Prerequisite{" +
                "name='" + name + '\'' +
                '}';
    }
}
