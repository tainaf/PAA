
package entidade;

public class Cidade {
    
    private int idCidade;
    private int idEstado;
    private String nome;

    public Cidade(int idCidade, int idEstado, String nome) {
        this.idCidade = idCidade;
        this.idEstado = idEstado;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
    
    
}
