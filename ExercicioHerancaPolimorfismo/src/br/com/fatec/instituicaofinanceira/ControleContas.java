package br.com.fatec.instituicaofinanceira;

/**
 *
 * @author ytalo
 */
public class ControleContas {
    public void registro(ContaAplicacao conta, double saldo) {
        conta.depositar(saldo);
    }
    
    public void registro(ContaPoupanca conta, double saldo) {
        conta.depositar(saldo);
    }
    
    public void registro(CorrenteEspecial conta, double saldo) {
        conta.depositar(saldo);
    }
    
    public void registro(CorrenteNormal conta, double saldo) {
        conta.depositar(saldo);
    }
}
