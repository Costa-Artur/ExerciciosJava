/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatoformula1;

/**
 *
 * @author artur
 */
public class Equipe {
    
    public String nome;
    public Mecanico[] mecanicos = new Mecanico[999];
    public Carro[] carros = new Carro[2];
    
    public boolean adicionarMecanico (Mecanico mecanico) {
        for(int i=0; i< mecanicos.length;i++) {
            if(mecanicos[i]==null){
                mecanicos[i] = mecanico;
                return true;
            }
        }
        return false;
    }
    
    public boolean adicionarCarro (Carro carro) {
        for(int i=0; i< carros.length;i++) {
            if(carros[i]==null){
                carros[i] = carro;
                return true;
            }
        }
        return false;
    }

    public Equipe(String nome) {
        this.nome = nome;
    }
    
}
