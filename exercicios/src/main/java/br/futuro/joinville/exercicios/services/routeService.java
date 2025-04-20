package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Route;

import java.util.ArrayList;

public class routeService {

    public Route create(Route route){

        return Route.addRoute(route);
    }

    public ArrayList<Route> listRoute (){

        return Route.getRoutes();
    }
}
