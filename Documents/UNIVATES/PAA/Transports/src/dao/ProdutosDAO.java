/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import apoio.ConexaoBD;
import entidade.Produtos;
import hibernate.HibernateUtil;
import interfaces.IDAO;
import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProdutosDAO implements IDAO {

    @Override
    public String salvar(Object o, char op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
public String salvarReturnID(Object o) {
        //inicializa variaveis necessarias
        String retorno = null;
        Session sessao = null;
        Produtos produtos = (Produtos) o;
        //Executa a inserção
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        Transaction t = sessao.beginTransaction();
        try {
            //retorno = String.valueOf(produtos.getIdProduto());
            return retorno;
            //deu erro retorna false
        } catch (Exception he) {
            //LogErroDAO.salvarLog(he, us);
            he.printStackTrace();
            return retorno;
        } finally {
            sessao.close();
        }
    }
public String consultar() {
List resultado = null;

        try {
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            sessao.beginTransaction();

            // busca por código
//            int id = 3;
//            org.hibernate.Query q = sessao.createQuery("from Classe where id = " + id);

            // busca todos os registros
            // observar: a classe Classe no from -> C maiúsculo
            org.hibernate.Query q = sessao.createQuery("from Classe");
            resultado = q.list();

            for (Object o : resultado) {
                Produtos prod = (Produtos) o;
                System.out.print("id: " + prod.getIdprodutos() + " ");
                System.out.println("nome: " + prod.getNome());
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        }return "";
}
    @Override
    public String atualizar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void popularTabela(JTable tabela, String criterio) {
        // dados da tabela
        Object[][] dadosTabela = null;

        // cabecalho da tabela
        Object[] cabecalho = new Object[4];
        cabecalho[0] = "Código";
        cabecalho[1] = "Nome";
        cabecalho[2] = "Peso";
        cabecalho[3] = "Descrição";

        // cria matriz de acordo com nº de registros da tabela
        try {
            ResultSet resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT count(*) FROM produtos WHERE DESCRICAO ILIKE '%" + criterio + "%'");

            resultadoQ.next();

            dadosTabela = new Object[resultadoQ.getInt(1)][4];

        } catch (Exception e) {
            System.out.println("Erro ao consultar XXX: " + e);
        }

        int lin = 0;

        // efetua consulta na tabela
        try {
            ResultSet resultadoQ = ConexaoBD.getInstance().getConnection().createStatement().executeQuery(""
                    + "SELECT * FROM produtos WHERE DESCRICAO ILIKE '%" + criterio + "%'");

            while (resultadoQ.next()) {

                dadosTabela[lin][0] = resultadoQ.getObject("idprodutos");
                dadosTabela[lin][1] = resultadoQ.getObject("nome");
                dadosTabela[lin][2] = resultadoQ.getObject("peso");
                dadosTabela[lin][3] = resultadoQ.getObject("descricao");

                // caso a coluna precise exibir uma imagem
//                if (resultadoQ.getBoolean("Situacao")) {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_ativo.png"));
//                } else {
//                    dadosTabela[lin][2] = new ImageIcon(getClass().getClassLoader().getResource("Interface/imagens/status_inativo.png"));
//                }
                lin++;
            }
        } catch (Exception e) {
            System.out.println("problemas para popular tabela...");
            System.out.println(e);
        }

        // configuracoes adicionais no componente tabela
        tabela.setModel(new DefaultTableModel(dadosTabela, cabecalho) {
            @Override
            // quando retorno for FALSE, a tabela nao é editavel
            public boolean isCellEditable(int row, int column) {
                return false;
                /*  
                 if (column == 3) {  // apenas a coluna 3 sera editavel
                 return true;
                 } else {
                 return false;
                 }
                 */
            }

            // alteracao no metodo que determina a coluna em que o objeto ImageIcon devera aparecer
            @Override
            public Class getColumnClass(int column) {

                if (column == 2) {
//                    return ImageIcon.class;
                }
                return Object.class;
            }
        });}

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registroUnico(Object o) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> consultar(String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object consultarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean consultar(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
