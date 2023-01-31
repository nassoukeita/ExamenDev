package com.example.mymovie.model;

public class Acteur {
    private String nom;
    private String prenom;
    private int dateNaissance;
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