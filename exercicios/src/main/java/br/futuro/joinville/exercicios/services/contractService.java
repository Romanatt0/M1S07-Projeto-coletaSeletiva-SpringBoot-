package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Collector;
import br.futuro.joinville.exercicios.models.Contract;
import br.futuro.joinville.exercicios.models.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class contractService {

    @Autowired
    collectorService collectorService;

    @Autowired
    routeService routeService;

    public Contract createContract(Contract contract){
        Collector collector = collectorService.findById(contract.getCollector().getId());
       if(collector == null){
           return null;
       } else {
            contract.setCollector(collector);
       }

       ArrayList<Route> routes = new ArrayList<>();
       for(Route route : Route.getRoutes()){
           Route routeFound = routeService.findById(route.getId());
           if (routeFound == null){
               return null;
           }
           routes.add(routeFound);
       }
       contract.setRoutes(routes);
       return contract;
    }

    public ArrayList<Contract> listContract(){

        return Contract.getContracts();
    }

    public Contract findById(Long Id){
        for(Contract contract : Contract.getContracts()){
            if(contract.getId().equals(Id)){
                return contract;
            }
        }

        return null;
    }
}
