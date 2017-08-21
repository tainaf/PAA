
package entidade;


public class Produtos {
    
    private int idProduto;
    private String nome;
    private int peso;
    private String descricao;

    public Produtos(int idProduto, String nome, int peso, String descricao) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
