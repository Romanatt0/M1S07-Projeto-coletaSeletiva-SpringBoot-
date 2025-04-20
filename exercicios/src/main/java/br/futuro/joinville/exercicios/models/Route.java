package br.futuro.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;

@Getter
@Setter
public class Route {

    private static Long sequence = 1L;
    @Getter
    @Setter
    private static final  ArrayList<Route> routes = new ArrayList<>();

    @Setter(AccessLevel.PRIVATE)
    private Long id;

    private String descripton;
    private String coverageArea;
    private BigDecimal efficiencyPencentege;

    public Route(){
        this.setId(sequence++);
    }

    public static Route addRoute (Route route){
        routes.add(route);
        return route;
    }

}
