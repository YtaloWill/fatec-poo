/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.lucro;

/**
 *
 * @author ytalo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.setCusto(10);
        prod.setDescricao("é um produto ai");
        prod.setVenda(12);       
        
        System.out.println(prod.getCusto());
        System.out.println(prod.getVenda());
        System.out.println(prod.calculaLucro());
        
    }
}
