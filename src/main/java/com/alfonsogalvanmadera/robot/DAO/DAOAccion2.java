/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.DAO;

import com.alfonsogalvanmadera.robot.Modelo.Accion2;
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
public class DAOAccion2 {
    public SessionFactory sessionFactory;
    public Session session;
    public Transaction transaction;
    
    public DAOAccion2(){
        sessionFactory=HibernateUtilidades.getSessionFactory();
        session=sessionFactory.openSession();
        transaction=session.beginTransaction();
    }
    
    public void cerrarTodo(){
        transaction.commit();
        session.close();
    }
    
    public void guardarAccion(Accion2 a)throws Exception{
        session.save(a);
        cerrarTodo();
    }
    
    public ArrayList<Accion2> buscarTodos()throws Exception{
        ArrayList<Accion2> acciones=(ArrayList<Accion2>) session.createCriteria(Accion2.class).list();
        cerrarTodo();
        return acciones;
    }
    
    public Accion2 bucarAccion2(Integer id)throws Exception{
        Accion2 a=(Accion2) session.createCriteria(Accion2.class).add(Restrictions.idEq(id)).uniqueResult();
        cerrarTodo();
        return a;
    }
    
}
