/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controlegastos;

import java.util.Scanner;

/**
 *
 * @author 7828497
 */
public class ControleGastosGUI {
    
    private Aplicacao aplicacao;
    
    public ControleGastosGUI(Aplicacao aplicacao){
        this.aplicacao = aplicacao;
    }
    
    public String lerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    
    
    
    public void menu () {

    char opcao;
       do{
       System.out.println("Menu Controle de Gastos");
       System.out.println("1. Adicionar Forma Pagamento");
       System.out.println("2. Adicionar Tipo de Gasto");
       System.out.println("3. Listar Gastos");
       System.out.println("4. Novo Gasto");
       System.out.println("5. Sair");
       opcao = this.lerValor("Selecione uma opção").toUpperCase().charAt(0);
       switch (opcao) {
            case '1': 
                adicionarForma();
                break;
            case '2': adicionarTipoGasto();break;
            case '3': listarGasto();break;
            case '4': novoGasto();break;
            case '5': return;
            default: System.out.println("ERRO"); break;
        }
       } while (opcao != 'S');  
    }
    
   public void adicionarForma() {
       String forma = lerValor("Digite a forma de pagamento");
       this.aplicacao.adicionarFormaPagamento(forma);
   }
   
   public void listarFormas(Aplicacao aplicacao) {
       for(int i=0; i<this.aplicacao.formas.length; i++) {
       
           if(this.aplicacao.formas[i] == null) {
               break;
           }
           
           System.out.println(i+ ": "+this.aplicacao.formas[i].getDescricao());
       }
   }
   
   public void listarTipos (Aplicacao aplicacao) {
   
       for(int i=0; i<this.aplicacao.tipos.length; i++) {
       
           if(this.aplicacao.tipos[i] == null) {
               break;
           }
           
           System.out.println(i+ ": "+this.aplicacao.tipos[i].getDescricao());
       }
   }
   
   public void listarGasto() {
           this.aplicacao.listarGastos();
   }
   
   public String adicionarTipoGasto() {
       String tipo = lerValor("Digite o tipo de Gasto");
       this.aplicacao.adicionarTipoGasto(tipo);
       return tipo;
   }
   
   public void novoGasto() {
       
       listarFormas(this.aplicacao);
       int forma = Integer.parseInt( lerValor("Insira o numero da forma de pagamento: "));
       
       listarTipos(this.aplicacao);
       int tipo = Integer.parseInt(lerValor("Insira o numero do tipo de pagamento: "));
       
       String descricao = lerValor("Digite a descricao");
       double valor = Double.parseDouble(lerValor("Digite o valor"));
       
       this.aplicacao.novoGasto(descricao, valor, this.aplicacao.formas[forma], this.aplicacao.tipos[tipo]);

       
       
       
   }
}
