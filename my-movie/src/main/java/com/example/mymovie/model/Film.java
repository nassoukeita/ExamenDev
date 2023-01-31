package com.example.mymovie.model;

import io.swagger.annotations.ApiModelProperty;
public class Film {
    @ApiModelProperty(notes = "Class of the film",name="name",required=true,value="test titre")
    private String titre;
    @ApiModelProperty(notes = "Class of the realisateur",name="realisateur",required=true,value="test realisateur")
    private String realisateur;
    @ApiModelProperty(notes = "Class of the acteur",name="acteur",required=true,value="test acteur")
    private String acteur;
    @ApiModelProperty(notes = "Class of the date",name="date",required=true,value="test date")
    private int date;






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


