package br.com.fatec.exemplo;

/**
 *
 * @author ytalo
 */
public class MA4_10_09_Composicao_Agregacao {
    
    public static void main(String[] args) {
        //para criar um Produto é OBRIGATÓRIO que exista antes um objeto Componente
        Componente c1 = new Componente();

        Produto p1 = new Produto(c1);
        //colocando dados no componente 
        c1.setChip("PIC 8734-D");
        p1.getComponente().setQtdTransistores(1490);

        //outra maneira de criar um Produto com Componente
        //desta maneira você não terá acesso direto à Componente, somente
        //por meio do p2
        Produto p2 = new Produto(new Componente());
        //para atribuir algo ao componente acima
        p2.getComponente().setChip("intel 8086");


        //colocar dados
        p1.setDescricao("Régua 30cm");
        p1.setPreco(3.87f);

        //1-criar um objeto Fornecedor, 
        //2-atribuir os dados a esse objeto
        //3-atribuir o objeto Fornecedor para o objeto Produto

        //1-
        Fornecedor forn = new Fornecedor();

        //2-
        //forn.setRazSocial("TKPlast");
        //forn.setEmail("atendimento@tkp.com.br");

        //3-
        p1.setFornecedor(forn);

        p1.getFornecedor().setRazSocial("TKPlast");
        p1.getFornecedor().setEmail("atendimento@tkp.com.br");

        //exibir os dados
        System.out.println("P1: " + p1.exibeDados());
    }
}
