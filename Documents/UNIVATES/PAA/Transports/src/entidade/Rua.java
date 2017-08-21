
package entidade;

public class Rua {
    
    private int idRua;
    private int idCidade;
    private String nome;

    public Rua(int idRua, int idCidade, String nome) {
        this.idRua = idRua;
        this.idCidade = idCidade;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdRua() {
        return idRua;
    }

    public void setIdRua(int idRua) {
        this.idRua = idRua;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }
}
