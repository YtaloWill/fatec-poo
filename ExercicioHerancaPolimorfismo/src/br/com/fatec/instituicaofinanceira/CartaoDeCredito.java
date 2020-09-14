package br.com.fatec.instituicaofinanceira;

/**
 *
 * @author ytalo
 */
public class CartaoDeCredito {
    private String numCartao;
    private double limiteCompras;
    private int melhorDiaCompra;

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }

    public void setLimiteCompras(double limiteCompras) {
        this.limiteCompras = limiteCompras;
    }

    public int getMelhorDiaCompra() {
        return melhorDiaCompra;
    }

    public void setMelhorDiaCompra(int melhorDiaCompra) {
        this.melhorDiaCompra = melhorDiaCompra;
    }
    
}
