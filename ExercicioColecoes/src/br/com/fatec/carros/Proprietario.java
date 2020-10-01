/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.carros;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ytalo
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void addVeiculo(Veiculo veiculo){
        int qtdVeiculos = veiculos.size();
        if(qtdVeiculos >= 5){
            int resp = JOptionPane.showConfirmDialog(new JFrame("AVISO"), "Você esta adicionando seu " + (qtdVeiculos+1) + " veiculo. Tem certeza?");
            if(resp == JOptionPane.NO_OPTION)
                return;
        }
        veiculos.add(veiculo);
    }
    
    public float valorBens(){
        float valorFinal = 0;
        for(Veiculo veiculo: veiculos)
            valorFinal += veiculo.getValor();
        return valorFinal;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
    
}
