/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot;

import com.alfonsogalvanmadera.robot.DAO.DAOAccion2;
import com.alfonsogalvanmadera.robot.DAO.DAOCadena2;
import com.alfonsogalvanmadera.robot.DAO.DAOCliente2;
import com.alfonsogalvanmadera.robot.DAO.DAODato2;
import com.alfonsogalvanmadera.robot.Modelo.Accion2;
import com.alfonsogalvanmadera.robot.Modelo.Cadena2;
import com.alfonsogalvanmadera.robot.Modelo.Cliente2;
import com.alfonsogalvanmadera.robot.Modelo.Dato2;

/**
 *
 * @author MBI
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Cadena2 cad=new Cadena2();
        Cliente2 cli2=new Cliente2();
        Accion2 ac2=new Accion2();
        Dato2 d2=new Dato2();
        
        DAOCadena2 daoc=new DAOCadena2();
        DAOCliente2 daoc1=new DAOCliente2();
        DAOAccion2 daoa=new DAOAccion2();
        DAODato2 daod=new DAODato2();
        
        cad.setIdCadena2(3);
        cad.setNombre("CASA LEY");
        cad.setUrl("http://servicios.casaley.com.mx/portal_proveedores/login.php");
        
        
        cli2.setIdCliente2(3);
        cli2.setCadena2(cad);
        cli2.setNombre("BACARDI");
        cli2.setUsuario("bacardiaba001");
        cli2.setPass("bacardi13");
        
        
        ac2.setIdAccion2(3);
        ac2.setCadena2(cad);
        ac2.setAccion("button");
        
        d2.setIdAccion2(3);
        d2.setIdDato2(3);
        d2.setCampoLogin("usuario");
        d2.setCampoPass("password");
        d2.setUrlDescarga("http://servicios.casaley.com.mx/portal_proveedores/vs_5_todas_excel.php");
        
        
        daoc.guardarCadena(cad);
        daoc1.guardarCliente2(cli2);
        daoa.guardarAccion(ac2);
        daod.guardarDato2(d2);
        
    }
    
}
