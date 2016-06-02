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
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author MBI
 */
@Entity
@Table(name = "dato2")

public class Dato2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dato2")
    private Integer idDato2;
    @Column(name = "id_accion2")
    private Integer idAccion2;
    @Column(name = "urlDescarga")
    private String urlDescarga;
    @Column(name = "urlSalida")
    private String urlSalida;
    @Column(name = "campoLogin")
    private String campoLogin;
    @Column(name = "campoPass")
    private String campoPass;

    public Dato2() {
    }

    public Dato2(Integer idDato2) {
        this.idDato2 = idDato2;
    }

    public Integer getIdDato2() {
        return idDato2;
    }

    public void setIdDato2(Integer idDato2) {
        this.idDato2 = idDato2;
    }

    public Integer getIdAccion2() {
        return idAccion2;
    }

    public void setIdAccion2(Integer idAccion2) {
        this.idAccion2 = idAccion2;
    }

    public String getUrlDescarga() {
        return urlDescarga;
    }

    public void setUrlDescarga(String urlDescarga) {
        this.urlDescarga = urlDescarga;
    }

    public String getUrlSalida() {
        return urlSalida;
    }

    public void setUrlSalida(String urlSalida) {
        this.urlSalida = urlSalida;
    }

    public String getCampoLogin() {
        return campoLogin;
    }

    public void setCampoLogin(String campoLogin) {
        this.campoLogin = campoLogin;
    }

    public String getCampoPass() {
        return campoPass;
    }

    public void setCampoPass(String campoPass) {
        this.campoPass = campoPass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDato2 != null ? idDato2.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dato2)) {
            return false;
        }
        Dato2 other = (Dato2) object;
        if ((this.idDato2 == null && other.idDato2 != null) || (this.idDato2 != null && !this.idDato2.equals(other.idDato2))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alfonsogalvanmadera.robot.Modelo.Dato2[ idDato2=" + idDato2 + " ]";
    }
    
}
