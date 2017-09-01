/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.HibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAO<T> {


    public DAO() {
    }

    public void salvar(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.save(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu erro");
        } finally {
            session.close();
        }
    }

    public void atualizar(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.update(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu erro");
        } finally {
            session.close();
        }
    }

    public void excluir(Object object) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacion = null;
        try {
            transacion = session.beginTransaction();
            session.delete(object);
            transacion.commit();
            System.out.println("Deu certo");
        } catch (HibernateException e) {
            transacion.rollback();
            e.printStackTrace();
            System.out.println("Deu certo");
        } finally {
            session.close();
        }
    }

    public T consultaId(String campo, Serializable valor, Class clazz) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(clazz);
        criteria.add(Restrictions.eq(campo, valor));
        return (T) criteria.uniqueResult();
    }

    public List<T> queryList(Class clazz) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(clazz);
        return (List<T>) criteria.list();
    }

    public List<T> query(String sql) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(sql);
        return (List<T>) query.list();
    }
}