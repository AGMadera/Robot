/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alfonsogalvanmadera.robot.Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "cadena2")

public class Cadena2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_cadena2")
    private Integer idCadena2;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "url")
    private String url;
    @Column(name = "hora")
    private String hora;
    @OneToMany(mappedBy = "cadena2")
    private Collection<Accion2> accion2Collection;
    @OneToMany(mappedBy = "cadena2")
    private Collection<Cliente2> cliente2Collection;

    public Cadena2() {
    }

    public Cadena2(Integer idCadena2) {
        this.idCadena2 = idCadena2;
    }

    public Integer getIdCadena2() {
        return idCadena2;
    }

    public void setIdCadena2(Integer idCadena2) {
        this.idCadena2 = idCadena2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Collection<Accion2> getAccion2Collection() {
        return accion2Collection;
    }

    public void setAccion2Collection(Collection<Accion2> accion2Collection) {
        this.accion2Collection = accion2Collection;
    }

    public Collection<Cliente2> getCliente2Collection() {
        return cliente2Collection;
    }

    public void setCliente2Collection(Collection<Cliente2> cliente2Collection) {
        this.cliente2Collection = cliente2Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadena2 != null ? idCadena2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadena2)) {
            return false;
        }
        Cadena2 other = (Cadena2) object;
        if ((this.idCadena2 == null && other.idCadena2 != null) || (this.idCadena2 != null && !this.idCadena2.equals(other.idCadena2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot.Modelo.Cadena2[ idCadena2=" + idCadena2 + " ]";
    }
    
}
