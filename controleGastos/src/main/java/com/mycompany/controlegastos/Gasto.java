/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlegastos;
import java.util.Date;
/**
 *
 * @author artur
 */
public class Gasto {
    
    private Date data;
    private String descricao;
    private double valor;
    private TipoGasto tipo;
    private FormaPagamento forma;
    

    public Gasto(Date data, String descricao, double valor, FormaPagamento forma, TipoGasto tipo) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.forma = forma;
        this.tipo = tipo;
    }

    public String getDescricao() {
        descricao += "\nData: ";
        descricao += data;
        descricao += "\nValor: ";
        descricao += valor;
        descricao += "\nTipo: ";
        descricao += tipo;
        descricao += "\nForma de Pagamento: ";
        descricao += forma;
        return descricao;
    }
    
}
