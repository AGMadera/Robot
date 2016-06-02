/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "cliente2")

public class Cliente2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cliente2")
    private Integer idCliente2;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "pass")
    private String pass;
    @JoinColumn(name = "id_cadena2", referencedColumnName = "id_cadena2")
    @ManyToOne
    private Cadena2 cadena2;

    public Cliente2() {
    }

    public Cliente2(Integer idCliente2) {
        this.idCliente2 = idCliente2;
    }

    public Integer getIdCliente2() {
        return idCliente2;
    }

    public void setIdCliente2(Integer idCliente2) {
        this.idCliente2 = idCliente2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Cadena2 getCadena2() {
        return cadena2;
    }

    public void setCadena2(Cadena2 cadena2) {
        this.cadena2 = cadena2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente2 != null ? idCliente2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente2)) {
            return false;
        }
        Cliente2 other = (Cliente2) object;
        if ((this.idCliente2 == null && other.idCliente2 != null) || (this.idCliente2 != null && !this.idCliente2.equals(other.idCliente2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot.Modelo.Cliente2[ idCliente2=" + idCliente2 + " ]";
    }
    
}
