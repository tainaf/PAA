package entidade;
// Generated 24/08/2017 20:31:33 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Permissoes generated by hbm2java
 */
@Entity
@Table(name="permissoes"
    ,schema="public"
)
public class Permissoes  implements java.io.Serializable {


     private int idpermissoes;
     private String tipo;
     private String descricao;
     private boolean ativo;
     private Set usuarios = new HashSet(0);

    public Permissoes() {
    }

	
    public Permissoes(int idpermissoes, String tipo, String descricao, boolean ativo) {
        this.idpermissoes = idpermissoes;
        this.tipo = tipo;
        this.descricao = descricao;
        this.ativo = ativo;
    }
    public Permissoes(int idpermissoes, String tipo, String descricao, boolean ativo, Set usuarios) {
       this.idpermissoes = idpermissoes;
       this.tipo = tipo;
       this.descricao = descricao;
       this.ativo = ativo;
       this.usuarios = usuarios;
    }
   
     @Id 

    
    @Column(name="idpermissoes", unique=true, nullable=false)
    public int getIdpermissoes() {
        return this.idpermissoes;
    }
    
    public void setIdpermissoes(int idpermissoes) {
        this.idpermissoes = idpermissoes;
    }

    
    @Column(name="tipo", nullable=false, length=45)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="descricao", nullable=false, length=45)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="ativo", nullable=false)
    public boolean isAtivo() {
        return this.ativo;
    }
    
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="permissoes")
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

