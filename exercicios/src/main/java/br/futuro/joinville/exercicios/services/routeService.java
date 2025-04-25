package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Contract;
import br.futuro.joinville.exercicios.models.Route;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class routeService {

    public Route create(Route route){

        return Route.addRoute(route);
    }

    public ArrayList<Route> listRoute (){

        return Route.getRoutes();
    }

    public Route findById(Long Id){
        for(Route route : Route.getRoutes()){
            if(route.getId().equals(Id)){
                return route;
            }
        }

        return null;
    }
}
