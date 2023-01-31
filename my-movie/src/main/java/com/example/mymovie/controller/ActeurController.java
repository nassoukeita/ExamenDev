package com.example.mymovie.controller;

import com.example.mymovie.model.Acteur;
import com.example.mymovie.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController  @Api(value = "Swagger2DemoRestController", description = "REST Apis related to Student Entity!!!!")
public class ActeurController {
    List<Acteur> acteursList = new ArrayList<Acteur>();
    {
        acteursList.add(new Acteur("Nassou","Keita",1999-02-01,"demons"));
        acteursList.add(new Acteur("fabtata","conde",1969-02-02,"montre"))
}

    @ApiOperation(value = "Get list of acteur in the System ", response = Iterable.class, tags = "getActeurs")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })
    @RequestMapping(value = "/getActeurs")
    public List<Acteur> getActeurs() {
        return acteursList;
    }

    @ApiOperation(value = "Get specific film in the System ", response = Film.class, tags = "getActeur")
    @RequestMapping(value = "/getActeur/{nom}")
    public Film getStudent(@PathVariable(value = "nom") String nom ){
        return acteursList.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).collect(Collectors.toList()).get(0);
    }
}