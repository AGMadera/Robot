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
@Table(name = "accion2")

public class Accion2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_accion2")
    private Integer idAccion2;
    @Column(name = "accion")
    private String accion;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "tiempo")
    private Integer tiempo;
    @JoinColumn(name = "id_cadena2", referencedColumnName = "id_cadena2")
    @ManyToOne
    private Cadena2 cadena2;

    public Accion2() {
    }

    public Accion2(Integer idAccion2) {
        this.idAccion2 = idAccion2;
    }

    public Integer getIdAccion2() {
        return idAccion2;
    }

    public void setIdAccion2(Integer idAccion2) {
        this.idAccion2 = idAccion2;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
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
        hash += (idAccion2 != null ? idAccion2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accion2)) {
            return false;
        }
        Accion2 other = (Accion2) object;
        if ((this.idAccion2 == null && other.idAccion2 != null) || (this.idAccion2 != null && !this.idAccion2.equals(other.idAccion2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot.Modelo.Accion2[ idAccion2=" + idAccion2 + " ]";
    }
    
}
