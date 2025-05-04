package br.futuro.joinville.exercicios.controllers;

import br.futuro.joinville.exercicios.models.Collector;
import br.futuro.joinville.exercicios.services.collectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("collectors")
public class collectorController {

    @Autowired
    private collectorService collectorService;

    @GetMapping
    public List<Collector> get () {
        return collectorService.listCollector();
    }

    @PostMapping
    public Collector post (@RequestBody Collector collectorPost){

        return collectorService.createCollector(collectorPost);
    }
}
