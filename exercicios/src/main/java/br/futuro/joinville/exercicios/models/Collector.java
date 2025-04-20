package br.futuro.joinville.exercicios.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Collector {

    private static Long sequence = 1L;
    @Setter
    @Getter
    private static ArrayList<Collector> Collectors = new ArrayList<>();

    @Setter(AccessLevel.PRIVATE)
    private Long id;
    private String name;
    private String Description;

    public Collector(){

        this.setId(sequence++);

    }

    public static Collector addCollector(Collector collector){

        Collectors.add(collector);
        return collector;
    }

}
