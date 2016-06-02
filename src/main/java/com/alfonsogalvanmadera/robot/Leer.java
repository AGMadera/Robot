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
import com.mysql.fabric.xmlrpc.Client;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author MBI
 */
public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        DAOCadena2 daoc=new DAOCadena2();
        DAOCliente2 daoc1=new DAOCliente2();
        DAOAccion2 daoa=new DAOAccion2();
        DAODato2 daod=new DAODato2();
        
        
        Cadena2 cadena = daoc.bucarCadena(3);
        Cliente2 c=daoc1.buscarCliente(3);
        Accion2 a=daoa.bucarAccion2(3);
        Dato2 d=daod.buscarDato2(3);
        //cad
         WebDriver driver=new FirefoxDriver();
         driver.get(cadena.getUrl());
         //driver.findElement(By.name(cadena.getUrl()));
         driver.findElement(By.id(d.getCampoLogin())).send­Keys(c.getUsuario());

            driver.findElement(By.id(d.getCampoPass())).send­Keys(c.getPass());
            driver.findElement(By.name(a.getAccion())).click();
        
    }
    
}
