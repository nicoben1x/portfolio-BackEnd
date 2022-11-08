package com.ap.ap.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Usuariop implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String nombrePerfil;
    private String profesionesPerfil;
    private String acercaPerfil;
    private String imgPerfil;
    private String bannerPerfil;

    /**
     *
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProyect")
    private List<Proyectos> proyectosList;

    public Usuariop() {

    }

    public Usuariop(long id, String nombrePerfil, String profesionesPerfil, String acercaPerfil,
            String imgPerfil, String bannerPerfilString) {
        this.id = id;
        this.nombrePerfil = nombrePerfil;
        this.profesionesPerfil = profesionesPerfil;
        this.acercaPerfil = acercaPerfil;
        this.imgPerfil = imgPerfil;
        this.bannerPerfil = bannerPerfilString;
    }

    public Usuariop(String nombrePerfil, String profesionesPerfil, String acercaPerfil,
            String imgPerfil, String bannerPerfilString) {

        this.nombrePerfil = nombrePerfil;
        this.profesionesPerfil = profesionesPerfil;
        this.acercaPerfil = acercaPerfil;
        this.imgPerfil = imgPerfil;
        this.bannerPerfil = bannerPerfilString;
    }

    public long getIdUsuario() {
        return id;
    }

    public void setIdUsuario(long id) {
        this.id = id;
    }

    public String getNombrePerfil() {
        return nombrePerfil;
    }

    public void setNombrePerfil(String nombrePerfil) {
        this.nombrePerfil = nombrePerfil;
    }

    public String getProfesionesPerfil() {
        return profesionesPerfil;
    }

    public void setProfesionesPerfil(String profesionesPerfil) {
        this.profesionesPerfil = profesionesPerfil;
    }

    public String getAcercaPerfil() {
        return acercaPerfil;
    }

    public void setAcercaPerfil(String acercaPerfil) {
        this.acercaPerfil = acercaPerfil;
    }

    public String getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(String imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getBannerPerfil() {
        return bannerPerfil;
    }

    public void setBannerPerfil(String bannerPerfil) {
        this.bannerPerfil = bannerPerfil;
    }

}