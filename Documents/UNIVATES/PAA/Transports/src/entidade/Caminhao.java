
package entidade;


public class Caminhao {
    
    private int idCaminhao;
    private String marca;
    private String modelo;
    private int ano;
    private int capacidade;
    private String placa;

    public Caminhao(int idCaminhao, String marca, String modelo, int ano, int capacidade, String placa) {
        this.idCaminhao = idCaminhao;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidade = capacidade;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(int idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
