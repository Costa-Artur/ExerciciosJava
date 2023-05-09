/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatoformula1;

/**
 *
 * @author artur
 */
public class Piloto {
    
    private int licenca;
    private String nome;
    private Carro carro;

    public Piloto(int licenca, String nome) {
        this.licenca = licenca;
        this.nome = nome;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
}
