package br.com.fatec.instituicaofinanceira;

/**
 *
 * @author ytalo
 */
public class Main {
    public static void main(String[] args) {
        
        Correntista pessoa1 = new Correntista();
        pessoa1.setNome("Mickey");
        pessoa1.setCpf("123.465.789-0");
        Correntista pessoa2 = new Correntista();
        pessoa2.setNome("Minnie");
        pessoa2.setCpf("123.465.789-1");
        Correntista pessoa3 = new Correntista();
        pessoa3.setNome("Pluto");
        pessoa3.setCpf("123.465.789-2");
        
        CorrenteEspecial corEsp = new CorrenteEspecial(pessoa1);
        CorrenteNormal corNor = new CorrenteNormal(pessoa2);
        ContaPoupanca conPou = new ContaPoupanca(pessoa3);
        
        ControleContas controle = new ControleContas();
        controle.registro(corEsp, 2000);
        controle.registro(corNor, 3000);
        controle.registro(conPou, 4000);
        
        // corrente especial
        corEsp.depositar(10.0);
        corEsp.retirar(5.0);
        corEsp.setNumero("123-1");
        corEsp.setLimiteCredito(200);
        
        // cartao
        CartaoDeCredito cartao = new CartaoDeCredito();
        cartao.setLimiteCompras(1000);
        cartao.setMelhorDiaCompra(12);
        cartao.setNumCartao("1234 4567 7890 1234");
        corEsp.setCartao(cartao);

        System.out.println("---------------------------------------------------------------");
        System.out.println("CONTA CORRENTE ESPECIAL");
        System.out.println("nome: " + corEsp.getCorrentista().getNome());
        System.out.println("cpf: " + corEsp.getCorrentista().getCpf());
        System.out.println("numero: " + corEsp.getNumero());
        System.out.println("limite de credito: " + corEsp.getLimiteCredito());
        System.out.println("saldo: " + corEsp.getSaldo());
        System.out.println("===============================================");
        System.out.println("dados do cartao");
        System.out.println("numero: " + corEsp.getCartao().getNumCartao());
        System.out.println("limite de compras: " + corEsp.getCartao().getLimiteCompras());
        System.out.println("melhor dia de compras: " + corEsp.getCartao().getMelhorDiaCompra());
        System.out.println("===============================================");
        
        // corrente normal
        corNor.depositar(10.0);
        corNor.retirar(5.0);
        corNor.setNumero("123-2");
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("CONTA CORRENTE NORMAL");
        System.out.println("nome: " + corNor.getCorrentista().getNome());
        System.out.println("cpf: " + corNor.getCorrentista().getCpf());
        System.out.println("numero: " + corNor.getNumero());
        System.out.println("saldo: " + corNor.getSaldo());
        
        // poupanca      
        conPou.depositar(10.0);
        conPou.retirar(5.0);
        conPou.setNumero("123-3");
        conPou.setRendimento(0.02);
        conPou.aplicarRendimento();
        
        System.out.println("---------------------------------------------------------------");
        System.out.println("CONTA POUPANCA");
        System.out.println("nome: " + conPou.getCorrentista().getNome());
        System.out.println("cpf: " + conPou.getCorrentista().getCpf());
        System.out.println("numero: " + conPou.getNumero());
        System.out.println("saldo: " + conPou.getSaldo());
        System.out.println("rendimento: " + conPou.getRendimento());
        System.out.println("===============================================");
    }
}
