/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.DAO;

import com.alfonsogalvanmadera.robot.Modelo.Dato2;
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
public class DAODato2 {
    public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;
    
    public DAODato2(){
        sessionFactory=HibernateUtilidades.getSessionFactory();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
    }
    
    public void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardarDato2(Dato2 d){
        session.save(d);
        cerrarTodo();
    }
    
    public ArrayList<Dato2> mostrarTodoDatos(){
        ArrayList<Dato2> d2=(ArrayList<Dato2>)session.createCriteria(Dato2.class).list();
        return d2;
    }
    
    public Dato2 buscarDato2(Integer id){
        Dato2 d=(Dato2)session.createCriteria(Dato2.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return d;
    }
}

