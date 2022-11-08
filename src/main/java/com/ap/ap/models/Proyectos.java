package com.ap.ap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idProyect;
    private String tituloProyect;
    private String linkProyect;
    private String acercaProyect;
    private String imgProyect;
    private String fechaProyect;

    public Proyectos() {

    }

    public Proyectos(long idProyect, String tituloProyect, String linkProyect, String acercaProyect, String imgProyect,
            String fechaProyect) {
        this.idProyect = idProyect;
        this.tituloProyect = tituloProyect;
        this.linkProyect = linkProyect;
        this.acercaProyect = acercaProyect;
        this.imgProyect = imgProyect;
        this.fechaProyect = fechaProyect;
    }

    public long getIdProyect() {
        return idProyect;
    }

    public void setIdProyect(long idProyect) {
        this.idProyect = idProyect;
    }

    public String getTituloProyect() {
        return tituloProyect;
    }

    public void setTituloProyect(String tituloProyect) {
        this.tituloProyect = tituloProyect;
    }

    public String getLinkProyect() {
        return linkProyect;
    }

    public void setLinkProyect(String linkProyect) {
        this.linkProyect = linkProyect;
    }

    public String getAcercaProyect() {
        return acercaProyect;
    }

    public void setAcercaProyect(String acercaProyect) {
        this.acercaProyect = acercaProyect;
    }

    public String getImgProyect() {
        return imgProyect;
    }

    public void setImgProyect(String imgProyect) {
        this.imgProyect = imgProyect;
    }

    public String getFechaProyect() {
        return fechaProyect;
    }

    public void setFechaProyect(String fechaProyect) {
        this.fechaProyect = fechaProyect;
    }

}