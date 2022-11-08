package com.ap.ap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idExp;
    private String tituloExp;
    private String tipoExp;
    private String acercaExp;
    private String imgExp;
    private String fechaExp;

    public Experiencia() {

    }

    public Experiencia(long idExp, String tituloExp, String tipoExp, String acercaExp, String imgExp, String fechaExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.tipoExp = tipoExp;
        this.acercaExp = acercaExp;
        this.imgExp = imgExp;
        this.fechaExp = fechaExp;
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public String getTipoExp() {
        return tipoExp;
    }

    public void setTipoExp(String tipoExp) {
        this.tipoExp = tipoExp;
    }

    public String getAcercaExp() {
        return acercaExp;
    }

    public void setAcercaExp(String acercaExp) {
        this.acercaExp = acercaExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

}
