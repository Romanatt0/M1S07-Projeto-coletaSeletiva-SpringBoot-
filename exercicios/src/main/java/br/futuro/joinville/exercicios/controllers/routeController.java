package br.futuro.joinville.exercicios.controllers;

import br.futuro.joinville.exercicios.models.Route;
import br.futuro.joinville.exercicios.services.routeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class routeController {

    @Autowired
    private routeService route;

    @GetMapping
    public List<Route> get () {
        return route.listRoute();
    }

    @PostMapping
    public Route post (@RequestBody Route routePost){

        return route.create(routePost);
    }
}
