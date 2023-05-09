/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.campeonatoformula1.principal;

import com.mycompany.campeonatoformula1.Organizador;
import com.mycompany.campeonatoformula1.organizadorUI;
/**
 *
 * @author 7828497
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Organizador organizador = new Organizador();
        organizadorUI interfaceOrganizador = new organizadorUI(organizador);
        
        interfaceOrganizador.menu();
        
    }
}
