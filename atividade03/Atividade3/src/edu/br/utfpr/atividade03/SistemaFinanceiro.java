package edu.br.utfpr.atividade03;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class SistemaFinanceiro {

    public ArrayList<Proposta> gerarPropostas(double d, double d0) {
        ArrayList<Proposta> p = new ArrayList<>();
        Proposta p1 = new Proposta();
        p1.setValorTotal(2*1000.0);
        p1.setParcelas(2);
        p1.setValorParcela(2*1000.0/2);
        p.add(p1);
        
        Proposta p2 = new Proposta();
        p2.setValorTotal(2*1000.0);
        p2.setParcelas(3);
        p2.setValorParcela(2*1000.0/3);
        p.add(p2);
        
        return p;
    }
    
}
