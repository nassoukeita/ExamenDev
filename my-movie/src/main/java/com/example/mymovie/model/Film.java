package com.example.mymovie.model;

public class Film {


        String titre;
        String realisateur;
        String acteur;
        int date;


    public Film (String titre, String realisateur, String acteur, int date) {
           this.titre=titre;
           this.realisateur=realisateur;
           this.acteur=acteur;
           this.date=date;
        }

        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getRealisateur() {
            return realisateur;
        }
    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeur() {
        return acteur;
    }
    public void setActeur(String acteur) {
        this.acteur = acteur;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
        @Override
        public String toString() {
            return "Employee [titre=" + titre + ", realisateur=" + realisateur + ",acteur=" + acteur + ", date=" + date+"]";
        }

    }


