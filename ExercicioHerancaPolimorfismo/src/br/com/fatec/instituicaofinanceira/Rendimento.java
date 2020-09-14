package br.com.fatec.instituicaofinanceira;

/**
 *
 * @author ytalo
 */
abstract class Rendimento extends Conta {
    private double rendimento;
    
    public void aplicarRendimento(){
        depositar(super.getSaldo() * rendimento);
    }

    public Rendimento(Correntista correntista) {
        super.Conta(correntista);
    }

    // getters and setters
    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
