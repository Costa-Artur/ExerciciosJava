/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import com.mycompany.controlegastos.ControleGastosGUI;
import com.mycompany.controlegastos.Aplicacao;

/**
 *
 * @author 7828497
 */
public class Principal {
    
        public static void main(String[] args) {
              
           Aplicacao controle = new Aplicacao();
           ControleGastosGUI interfaceGastos = new ControleGastosGUI(controle);
           
           interfaceGastos.menu();
           
        }
}
