package com.example.IZ_Project.dto;

import com.example.IZ_Project.model.Attack;

public class CbrDTO {
    private Attack attack;
    private double evaluation;

    public CbrDTO() {
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(double evaluation) {
        this.evaluation = evaluation;
    }

    public CbrDTO(Attack attack, double evaluation) {
        this.attack = attack;
        this.evaluation = evaluation;
    }
}
