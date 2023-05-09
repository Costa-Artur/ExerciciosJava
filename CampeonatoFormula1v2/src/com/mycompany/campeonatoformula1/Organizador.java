/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campeonatoformula1;

/**
 *
 * @author artur
 */

public class Organizador {
    
   private String nome;
   public Campeonato[] campeonatos = new Campeonato[999];
    
   public int criarCampeonato(int ano, String nome){
       
       int numeroCampeonato=0;
       for(int i=0; i<campeonatos.length;i++){
           if(campeonatos[i]==null){
               campeonatos[i] = new Campeonato(ano, nome);
               numeroCampeonato = i;
               return numeroCampeonato;
           }
       }
       return numeroCampeonato;
   }
   
   public boolean inscrever(Equipe equipe, Campeonato campeonato){
       for(Carro carro : equipe.carros){
           if(carro == null){
               return false;
           }
       }
        for(int i=0; i<campeonato.equipes.length; i++){
            if(campeonato.equipes[i] == null){
                campeonato.equipes[i] = equipe;
                return true;
            }
        }
        return false;
   }
    
}
