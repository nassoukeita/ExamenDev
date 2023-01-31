package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;

public class Acteur {
    @ApiModelProperty(notes = "Class of the nom",name="nom",required=true,value="test nom")
    private String nom;
    @ApiModelProperty(notes = "Class of the prenom",name="prenom",required=true,value="test prenom")
    private String prenom;
    @ApiModelProperty(notes = "Class of the dateNaissance",name="dateNaissance",required=true,value="test dateNaissance")
    private int dateNaissance;
    @ApiModelProperty(notes = "Class of the filmographie",name="filmographie",required=true,value="test filmographie")
    private String filmographie;

    public Acteur(String nom, String prenom, int dateNaissance, String filmographie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filmographie = filmographie;
    }

    public String getNom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getdateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(int dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getfilmographie() {
        return filmographie;
    }

    public void setFilmographie(String filmographie) {
        this.filmographie = filmographie;
    }
    @Override
    public String toString() {
        return "Employee [nom=" + nom + ", prenom=" + prenom + ",dateNaissance=" + dateNaissance + ", filmographie=" + filmographie+"]";
    }
}