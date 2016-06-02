/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.DAO;

import com.alfonsogalvanmadera.robot.Modelo.Cliente2;
import com.alfonsogalvanmadera.robot.Modelo.HibernateUtilidades;
import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author MBI
 */
public class DAOCliente2 {
    public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;
    
    public DAOCliente2 (){
        sessionFactory=HibernateUtilidades.getSessionFactory();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
    }    
    
    public void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardarCliente2 (Cliente2 cli2){
        session.save(cli2);
        cerrarTodo();
    }
    
    public ArrayList<Cliente2> mostrarTodosClientes2(){
        ArrayList<Cliente2> clie=(ArrayList<Cliente2>)session.createCriteria(Cliente2.class).list();
        return clie;
    }
    
    public Cliente2 buscarCliente(Integer id){
        Cliente2 c=(Cliente2)session.createCriteria(Cliente2.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return c;
    }
}
