package br.com.fatec.instituicaofinanceira;

/**
 *
 * @author ytalo
 */
abstract class Conta {
    private String numero;
    private double saldo;
    private Correntista correntista;
    
    public void Conta(Correntista correntista){
        this.correntista = correntista;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void retirar(double valor){
        try {
            if(saldo - valor < 0){
                throw new Exception("Sem saldo na conta");
            } else {
                saldo -= valor;
            } 
        } catch (Exception e) {
        }
    }

    // getters and setters
    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public Correntista getCorrentista(){
        return correntista;
    }
}
