/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author gtren_000
 */
public class Usuario {
 
    private int idUsuario;
    private int idPessoa;
    private int idPermissao;
    private String usuario;
    private String senha;
    private String cargo;
    private boolean situacao;

    public Usuario(int idUsuario, int idPessoa, int idPermissao, String usuario, String senha, String cargo, boolean situacao) {
        this.idUsuario = idUsuario;
        this.idPessoa = idPessoa;
        this.idPermissao = idPermissao;
        this.usuario = usuario;
        this.senha = senha;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(int idPermissao) {
        this.idPermissao = idPermissao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
