package controllers;

import java.util.ArrayList;
import models.Orcamento;

public class ProcessaOrcamentos {
    
    public static ArrayList<Orcamento> orcamentos = new ArrayList<>();
    
    public static Orcamento getPrecosFinais(){
        Orcamento PrecoBarato = orcamentos.get(0);
        for (Orcamento orcam : orcamentos){
            if (orcam.getPreco() < PrecoBarato.getPreco()) {
                PrecoBarato = orcam;
            }
        }
        return PrecoBarato;   
    }
    
}
