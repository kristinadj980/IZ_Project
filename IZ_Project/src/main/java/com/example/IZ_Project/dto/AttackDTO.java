package com.example.IZ_Project.dto;

public class AttackDTO {
    private String attackName;

    public AttackDTO() {
        super();
    }

    public AttackDTO(String attackName) {
        super();
        this.attackName = attackName;
    }

    public String getAttackName() {
        return attackName;
    }

    public void setAttackName(String attackName) {
        this.attackName = attackName;
    }

}
