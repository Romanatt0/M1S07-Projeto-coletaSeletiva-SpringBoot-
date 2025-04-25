package br.futuro.joinville.exercicios.controllers;

import br.futuro.joinville.exercicios.models.Contract;
import br.futuro.joinville.exercicios.models.Route;
import br.futuro.joinville.exercicios.services.contractService;
import br.futuro.joinville.exercicios.services.routeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Contract")
public class contractController {

    @Autowired
    private contractService service;

    @GetMapping
    public List<Contract> get () {
        return service.listContract();
    }

    @PostMapping
    public Contract post (@RequestBody Contract contractPost){

        return Contract.addContract(contractPost);
    }
}

