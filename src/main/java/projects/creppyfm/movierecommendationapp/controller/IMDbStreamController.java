package projects.creppyfm.movierecommendationapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.creppyfm.movierecommendationapp.model.IMDbStreamProperties;

import java.util.List;

@RestController
@RequestMapping("/imdb")
public class IMDbStreamController {

    // GET http://localhost:8080/imdb
    @GetMapping
    public List<IMDbStreamProperties> findAll() {
        return null;
    }
}
