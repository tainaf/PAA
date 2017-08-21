/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

public class UsuarioPedido {
    private int idUsuario;
    private int idPedido;

    public UsuarioPedido(int idUsuario, int idPedido) {
        this.idUsuario = idUsuario;
        this.idPedido = idPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
 
}
