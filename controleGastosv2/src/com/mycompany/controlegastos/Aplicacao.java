/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlegastos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Aplicacao {
    
    private Gasto[] gastos = new Gasto[999];
    public FormaPagamento[] formas = new FormaPagamento[999];
    public TipoGasto[] tipos = new TipoGasto[999];
    
   
    
    public void adicionarFormaPagamento (String forma) {
        for(int x =0; x<formas.length; x++) {
            if(formas[x] == null){
                formas[x] = new FormaPagamento(forma);
                break;
            }
        }
    }
    
    public void adicionarTipoGasto (String descricao) {
        for(int x =0; x<tipos.length; x++) {
            if(tipos[x] == null){
                tipos[x] = new TipoGasto(descricao);
                break;
            }
        }
    }
    
    public void listarGastos () {
        for (Gasto gasto : gastos) {
            if (gasto == null) {
                break;
            }
            System.out.println(gasto.getDescricao());
            System.out.println("\n\n");
        }
    }
    
    public void novoGasto(String descricao, double valor, FormaPagamento forma, TipoGasto tipo ){
        Date data = new Date();
        for(int x =0; x<gastos.length; x++) {
            if(gastos[x]==null){
                gastos[x] = new Gasto(data, descricao, valor, forma, tipo );
                break;
            }
        }
    }
    
}
