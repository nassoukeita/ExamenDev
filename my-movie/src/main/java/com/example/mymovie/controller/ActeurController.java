package com.example.mymovie.controller;

import com.example.mymovie.model.Acteur;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ActeurController {
    @RequestMapping("/acteur")
    public List<Acteur> getActeur()
    {
        List<Acteur> acteursList = new ArrayList<Acteur>();
        acteursList.add(new Acteur("Nassou","Keita",1999-02-01,"demons"));
        acteursList.add(new Acteur("fabtata","conde",1969-02-02,"montre"));
return acteursList;
}
}


