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
public class Corrida {
    
    private Date data;
    public Autodromo autodromo;

    public Corrida(Date data, Autodromo autodromo) {
        this.data = data;
        this.autodromo = autodromo;
    }
    
}
