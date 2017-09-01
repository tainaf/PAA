/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import entidades.Produtos;
import hibernate.HibernateUtil;
import dao.DAO;

public class ProdutosDAO {

    
   
    public List<Object> consultarTodos() {
        //List resultado = null;
        Produtos prod = new Produtos();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try {
            // busca por código
            Criteria cr = sessao.createCriteria(Produtos.class);
            cr.add(Restrictions.eq("produtoAtivo", true));
            List resultado = cr.list();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar todos");
            //he.printStackTrace();
        }
        return null;
    }
    public int contarTodos() {
        int resultado = 0;
        Produtos us = new Produtos();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();
        try {

            org.hibernate.Query q = sessao.createQuery("from produtos");
            resultado = q.list().size();
            sessao.close();
            return resultado;
        } catch (Exception he) {
            System.out.println("erro ao consultar");
            //he.printStackTrace();
        }
        return resultado;
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

}