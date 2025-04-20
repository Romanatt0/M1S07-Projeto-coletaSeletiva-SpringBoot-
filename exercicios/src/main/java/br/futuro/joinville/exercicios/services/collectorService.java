package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Collector;

import java.util.ArrayList;

public class collectorService {

    public Collector createCollector(Collector collector){

        return Collector.addCollector(collector);
    }

    public ArrayList<Collector> listCollector(){

        return Collector.getCollectors();
    }
}
