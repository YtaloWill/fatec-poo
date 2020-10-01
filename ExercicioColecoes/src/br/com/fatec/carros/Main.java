/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.carros;

import java.util.ArrayList;

/**
 *
 * @author ytalo
 */
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("1234-ASD");
        veiculo1.setValor(1000.0f);
        
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setPlaca("4651-ASD");
        veiculo2.setValor(1000.0f);
        
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setPlaca("4368-ASD");
        veiculo3.setValor(1000.0f);
        
        Veiculo veiculo4 = new Veiculo();
        veiculo4.setPlaca("7894-ASD");
        veiculo4.setValor(1000.0f);
        
        Veiculo veiculo5 = new Veiculo();
        veiculo5.setPlaca("9632-ASD");
        veiculo5.setValor(1000.0f);
        
        Veiculo veiculo6 = new Veiculo();
        veiculo6.setPlaca("4568-ASD");
        veiculo6.setValor(1000.0f);
        
        Proprietario proprietario = new Proprietario();
        proprietario.addVeiculo(veiculo1);
        proprietario.addVeiculo(veiculo2);
        proprietario.addVeiculo(veiculo3);
        proprietario.addVeiculo(veiculo4);
        proprietario.addVeiculo(veiculo5);
        proprietario.addVeiculo(veiculo6);
        
        ArrayList<Veiculo> propVeiculos = proprietario.getVeiculos();
        for(Veiculo veiculo: propVeiculos){
            System.out.println("Veiculo: " + veiculo.getPlaca());
        }
        
        System.out.println(proprietario.valorBens());
    }
}
