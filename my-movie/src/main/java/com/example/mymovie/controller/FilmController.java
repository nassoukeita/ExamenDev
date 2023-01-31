package com.example.mymovie.controller;

import com.example.mymovie.model.Film;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@Api(value = "FilmController", description = "REST Apis related to film Entity!!!!")

public class FilmController {
    //@RequestMapping("/film")

    List<Film> filmsList = new ArrayList<Film>();
    {
        filmsList.add(new Film("action", "dmmm", "contr", 1966-20-02));
        filmsList.add(new Film("anna", "descate", "colll", 1620-02-02));

        //return filmsList;
    }

    @ApiOperation(value = "Get list of film in the System ", response = Iterable.class, tags = "getFilms")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!") })


    @RequestMapping(value = "/getFilms")
    public List<Film> getFilms() {
        return filmsList;
    }

    @ApiOperation(value = "Get specific film in the System ", response = Film.class, tags = "getFilm")
    @RequestMapping(value = "/getFilm/{titre}")
    public Film getStudent(@PathVariable(value = "titre") String titre) {

        return filmsList.stream().filter(x -> x.getTitre().equalsIgnoreCase(titre)).collect(Collectors.toList()).get(0);
    }
    @RequestMapping("/FilmsSearchByDate/{date}")
    public List<Film> getFilmsByDate(@PathVariable(value = "date") int date) {
        List<Film> result = new ArrayList<>();
        for (Film film : filmsList) {
            if (film.getDate()== date) {
                result.add(film);
            }
        }
        return result;
    }
    //@GetMapping
   // fun findAll(): List<Film> = repository.findAll()
    //@PutMapping
    //fun update(@RequestBody film:Film): Film = repository.update(film)

   // @DeleteMapping("/{titre}")
    //fun remove(@PathVariable titre: String): Boolean = repository.removeById(titre)

}
