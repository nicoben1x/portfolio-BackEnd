package com.ap.ap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idSkills;
    private String tituloSkills;
    private String porcentageSkills;

    public Skills() {

    }

    public Skills(long idSkills, String tituloSkills, String porcentageSkills) {
        this.idSkills = idSkills;
        this.tituloSkills = tituloSkills;
        this.porcentageSkills = porcentageSkills;
    }

    public long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(long idSkills) {
        this.idSkills = idSkills;
    }

    public String getTituloSkills() {
        return tituloSkills;
    }

    public void setTituloSkills(String tituloSkills) {
        this.tituloSkills = tituloSkills;
    }

    public String getPorcentageSkills() {
        return porcentageSkills;
    }

    public void setPorcentageSkills(String porcentageSkills) {
        this.porcentageSkills = porcentageSkills;
    }

}