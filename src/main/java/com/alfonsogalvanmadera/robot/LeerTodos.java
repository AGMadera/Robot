/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot;

import com.alfonsogalvanmadera.robot.DAO.DAOAccion2;
import com.alfonsogalvanmadera.robot.DAO.DAOCadena2;
import com.alfonsogalvanmadera.robot.Modelo.Accion2;
import com.alfonsogalvanmadera.robot.Modelo.Cadena2;
import java.util.ArrayList;

/**
 *
 * @author MBI
 */
public class LeerTodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        DAOCadena2 daoc=new DAOCadena2();
        DAOAccion2 daoa=new DAOAccion2();
        ArrayList<Cadena2> c=daoc.mostrarTodos();
        
        //System.out.println(c.size());
        
        for(Cadena2 cade:c){
            System.out.println(cade.getNombre()+cade.getUrl()+cade.getIdCadena2());
            //cade.getAccion2Collection();
            daoa.bucarAccion2(cade.getIdCadena2());
            
            //ArrayList<
            
        
        }
        
   
        
        
        //System.out.println();
        
        
    }
    
}
