package com.example.mymovie.controller;

import com.example.mymovie.model.Acteur;
import com.example.mymovie.model.Film;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class FilmController {
    @RequestMapping("/film")
    public List<Film> getFilm() {
        List<Film> filmsList = new ArrayList<Film>();
        filmsList.add(new Film("action", "dmmm", "contr", 1966-20-02));
        filmsList.add(new Film("anna", "derfg", "colll", 1620-02-02));

        return filmsList;
    }
}
