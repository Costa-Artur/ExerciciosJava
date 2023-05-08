/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatoformula1;
import java.util.Date;

/**
 *
 * @author artur
 */
public class Campeonato {
    
    private int ano;
    private String nome;
    public Equipe[] equipes = new Equipe[12];
    public Corrida[] corridas = new Corrida[20];
    
    public boolean definirCorrida(Autodromo autodromo, Date data){
        for(Equipe equipe : equipes){
            if(equipe == null){
                return false;
            }
        }
        
        for(int i=0; i<corridas.length;i++){
            if(corridas[i]==null){
                corridas[i]= new Corrida(data, autodromo);
                return true;
            }
        }
        return false;
    }

    public Campeonato(int ano, String nome) {
        this.ano = ano;
        this.nome = nome;
    }
    
}
