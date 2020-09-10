package br.com.fatec.exemplo;

/**
 *
 * @author ytalo
 */
public class Produto {
    private String descricao;
    private float preco;
    //montando uma agregação
    private Fornecedor fornecedor;
    //montando uma composição
    //para se fazer uma composição é necessário que o objeto da composição
    //seja colocado em TODOS os métodos construtores
    private Componente componente;

    public Produto(Componente componente) {
        //fornecedor = new Fornecedor();
        setComponente(componente);
        //ou
        this.componente = componente;
    }

    public Produto(String descricao, Componente componente) {
        //chama o construtor
        this(componente);
        this.descricao = descricao;
    }
    
    /**
     * Exibe todos os dados do Produto e do Fornecedor
     * @return Todas as informações
     */
    public String exibeDados() {
        //poderia utilizar a classe StringBuilder() para concatenar varias vezes
        String aux = "Descricao: " + getDescricao();
        aux += "\nPreço: " + getPreco();
        aux += "\nRazão Social: " + fornecedor.getRazSocial();
        aux += "\neMail: " + getFornecedor().getEmail();

        return aux;
    }

    // getters and setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }

}
