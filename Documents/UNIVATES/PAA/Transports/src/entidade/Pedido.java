
package entidade;

import java.util.Date;


public class Pedido {
    
    private int idPedido;
    private int idPessoa;
    private Date data;
    private boolean situacao;

    public Pedido(int idPedido, int idPessoa, Date data, boolean situacao) {
        this.idPedido = idPedido;
        this.idPessoa = idPessoa;
        this.data = data;
        this.situacao = situacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
