/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.DAO;

import com.alfonsogalvanmadera.robot.Modelo.Cadena2;
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
public class DAOCadena2 {
     public SessionFactory sessionFactory;
     public Session session;
     public Transaction transaction;
     
     public DAOCadena2(){
         sessionFactory=HibernateUtilidades.getSessionFactory();
         session=sessionFactory.openSession();
         transaction=session.beginTransaction();
     }
     public void cerraTodo(){
         transaction.commit();
         session.close();
     }
     public void guardarCadena(Cadena2 cd){
         session.save(cd);
         cerraTodo();
     }
     
     public ArrayList<Cadena2> mostrarTodos()throws Exception{
         ArrayList<Cadena2> ce=(ArrayList<Cadena2>) session.createCriteria(Cadena2.class).list();
         return ce;
     }
     public Cadena2 bucarCadena(Integer id)throws Exception{
         Cadena2 c=(Cadena2)session.createCriteria(Cadena2.class).add(Restrictions.idEq(id)).uniqueResult();
         return c;
     }
}
