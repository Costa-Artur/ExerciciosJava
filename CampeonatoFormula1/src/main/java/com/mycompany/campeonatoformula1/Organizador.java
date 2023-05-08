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
   public Campeonato campeonato;
    
   public void criarCampeonato(int ano, String nome){
       campeonato = new Campeonato(ano, nome);
   }
   
   public boolean inscrever(Equipe equipe){
       for(Carro carro : equipe.carros){
           if(carro == null){
               return false;
           }
       }
       for (Piloto piloto : equipe.pilotos){
           if(piloto == null) {
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

    public static void main(String[] args) {
        
    }
    
}
