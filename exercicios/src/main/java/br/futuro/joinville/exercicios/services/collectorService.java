package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Collector;
import br.futuro.joinville.exercicios.models.Contract;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class collectorService {

    public Collector createCollector(Collector collector){

        return Collector.addCollector(collector);
    }

    public ArrayList<Collector> listCollector(){

        return Collector.getCollectors();
    }

    public Collector findById(Long Id){
        for(Collector collector : Collector.getCollectors()){
            if(collector.getId().equals(Id)){
                return collector;
            }
        }

        return null;
    }
}
