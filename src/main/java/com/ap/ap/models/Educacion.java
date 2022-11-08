package com.ap.ap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long idEdu;
    private String tituloEdu;
    private String tipoEdu;
    private String acercaEdu;
    private String imgEdu;

    public Educacion() {

    }

    public Educacion(long idEdu, String tituloEdu, String tipoEdu, String acercaEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.tipoEdu = tipoEdu;
        this.acercaEdu = acercaEdu;
        this.imgEdu = imgEdu;
    }

    public long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public String getTipoEdu() {
        return tipoEdu;
    }

    public void setTipoEdu(String tipoEdu) {
        this.tipoEdu = tipoEdu;
    }

    public String getAcercaEdu() {
        return acercaEdu;
    }

    public void setAcercaEdu(String acercaEdu) {
        this.acercaEdu = acercaEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

}
