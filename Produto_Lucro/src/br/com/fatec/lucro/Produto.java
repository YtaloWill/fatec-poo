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
public class Produto {
    private float custo;
    private float venda;
    private String descricao;

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        if (verificaLucro(custo, venda)) {
            System.out.println("Seu lucro não pode ser maior que 30%");
        } else {
            this.custo = custo;
        }
    }

    public float getVenda() {
        return venda;
    }

    public void setVenda(float venda) {
        if (verificaLucro(custo, venda)) {
            System.out.println("Seu lucro não pode ser maior que 30%");
        } else {
            this.venda = venda;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public float calculaLucro(){
        return venda - custo;
    }
    
    private boolean verificaLucro(float custo, float venda){
        return custo * 1.30f < venda;
    }
}
