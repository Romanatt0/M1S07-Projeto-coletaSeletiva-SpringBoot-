package br.futuro.joinville.exercicios.services;

import br.futuro.joinville.exercicios.models.Collector;
import br.futuro.joinville.exercicios.models.Contract;

import java.util.ArrayList;

public class contractService {

    public Contract createContract(Contract contract){

        return Contract.addContract(contract);
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
