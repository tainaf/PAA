
package entidade;

import java.util.Date;

public class Carga {
 
    private int idCarga;
    private int idPedido;
    private int idEndereco;
    private int idCaminhao;
    private Date data;
    private int nf;

    public Carga(int idCarga, int idPedido, int idEndereco, int idCaminhao, Date data, int nf) {
        this.idCarga = idCarga;
        this.idPedido = idPedido;
        this.idEndereco = idEndereco;
        this.idCaminhao = idCaminhao;
        this.data = data;
        this.nf = nf;
    }

    public int getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(int idCarga) {
        this.idCarga = idCarga;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(int idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNf() {
        return nf;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }
    
    
}
