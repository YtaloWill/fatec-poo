package br.com.fatec.instituicaofinanceira;
    
/**
 *
 * @author ytalo
 */
public class CorrenteEspecial extends Conta {
    private double limiteCredito;
    private CartaoDeCredito cartao;

    public CorrenteEspecial(Correntista correntista) {
        super.Conta(correntista);
    }

    @Override
    public void retirar(double valor){
        try {
            if (getSaldo() - valor < 0) {
                valor -= getSaldo();
                super.retirar(getSaldo());
                if(limiteCredito - valor < 0){
                    throw new Exception("Crédito em conta suficiente");
                } else {
                    limiteCredito -= valor;
                }
            } else {
                super.retirar(valor);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDeCredito cartao) {
        this.cartao = cartao;
    }
}
