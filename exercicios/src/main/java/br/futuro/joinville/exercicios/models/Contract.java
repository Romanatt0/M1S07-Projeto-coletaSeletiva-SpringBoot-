package br.futuro.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Contract {

    @Getter
    @Setter
    private static final ArrayList<Contract> contracts = new ArrayList<>();
    private Long sequence = 1L;

    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private Collector collector;
    private ArrayList<Route> Routes = new ArrayList<>();

    public Contract(){
        this.setId(sequence++);
    }

    public static Contract addContract (Contract contract){
         contracts.add(contract);
         return contract;
    }


}
