/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.campeonatoformula1;
import java.text.SimpleDateFormat;  

import java.util.Scanner;
import java.util.Date;  
/**
 *
 * @author 7828497
 */
public class organizadorUI {
    
    private Organizador organizador;

    public organizadorUI(Organizador organizador) {
        this.organizador = organizador;
    }
    
    public String lerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    
    public void menu(){
    
        char opcao;
       do{
       System.out.println("Menu Campeonatos de Corrida");
       System.out.println("1. Criar Campeonato");
       System.out.println("2. Inscrever Equipe");
       System.out.println("3. Organizar Corrida");
       System.out.println("4. Sair");
       
       opcao = this.lerValor("Selecione uma opção").toUpperCase().charAt(0);
       switch (opcao) {
            case '1': 
                criarCampeonato();
                break;
            case '2': 
                inscreverEquipe();
                break;
            case '3': 
                organizarCorrida();
                break;
            case '4':
                return;
            default: 
                System.out.println("ERRO"); 
                break;
        }
       } while (opcao != '4');  
    }
    
    public void lerCampeonato() {
        for(int i=0; i<this.organizador.campeonatos.length;i++){
            if(this.organizador.campeonatos[i] == null){
                break;
            }
            System.out.println(i+ ": "+this.organizador.campeonatos[i].nome);
        }
    }
    
    public void criarCampeonato(){
        int ano = Integer.parseInt(lerValor("Insira o ano do campeonato: "));
        String nome = lerValor("Digite o nome do campeonato: ");
        
        this.organizador.criarCampeonato(ano, nome);
    }
    
    public void lerEquipe(int numeroCampeonato) {
        for(int i=0; i<this.organizador.campeonatos[numeroCampeonato].equipes.length;i++){
            if(this.organizador.campeonatos[numeroCampeonato].equipes[i] == null){
                break;
            }
            System.out.println(i+ ": "+this.organizador.campeonatos[numeroCampeonato].equipes[i]);
        }
    }
    
    public void inscreverEquipe(){
        
        lerCampeonato();
        int numeroCampeonato = Integer.parseInt(lerValor("Insira o numero do campeonato: "));
        
        String nome = lerValor("Digite o nome da equipe: ");
        Equipe equipe = new Equipe(nome);
        
        String nomePiloto1 = lerValor("Escreva o nome do piloto 1: ");
        int numeroPiloto1 = Integer.parseInt(lerValor("Insira o numero do piloto 1: "));
        Piloto piloto1 = new Piloto(numeroPiloto1, nomePiloto1);
        
        int numeroCarro1 = Integer.parseInt(lerValor("Insira o numero do carro 1: "));
        Carro carro1 = new Carro(numeroCarro1, piloto1);
        
        String nomePiloto2 = lerValor("Escreva o nome do piloto 2: ");
        int numeroPiloto2 = Integer.parseInt(lerValor("Insira o numero do piloto 2: "));
        Piloto piloto2 = new Piloto(numeroPiloto2, nomePiloto2);
        
        int numeroCarro2 = Integer.parseInt(lerValor("Insira o numero do carro 2: "));
        Carro carro2 = new Carro(numeroCarro2, piloto2);
        
        this.organizador.inscrever(equipe, this.organizador.campeonatos[numeroCampeonato]);
        
    }
    
    public void organizarCorrida() throws Exception{
        lerCampeonato();
        int numeroCampeonato = Integer.parseInt(lerValor("Insira o numero do campeonato: "));
        
        String data = lerValor("Escreva a data da corrida (dd/MM/yyyy): ");
        Date dataCorrida = new SimpleDateFormat("dd/MM/yyyy").parse(data);
        
        String local = lerValor("Escreva o local do autodromo: ");
        Autodromo autodromo = new Autodromo(local);
        
       this.organizador.campeonatos[numeroCampeonato].definirCorrida(autodromo, dataCorrida);
        
    }
}
