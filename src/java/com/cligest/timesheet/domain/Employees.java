/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author maro.fernando
 */
@Entity
@Table(name = "employees")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employees.findAll", query = "SELECT e FROM Employees e"),
    @NamedQuery(name = "Employees.findByIdEmployee", query = "SELECT e FROM Employees e WHERE e.idEmployee = :idEmployee"),
    @NamedQuery(name = "Employees.findByEmployeeName", query = "SELECT e FROM Employees e WHERE e.employeeName = :employeeName"),
    @NamedQuery(name = "Employees.findBySAPCCName", query = "SELECT e FROM Employees e WHERE e.sAPCCName = :sAPCCName"),
    @NamedQuery(name = "Employees.findByWs", query = "SELECT e FROM Employees e WHERE e.ws = :ws")})
public class Employees implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_employee")
    private Integer idEmployee;
    @Basic(optional = false)
    @Column(name = "employee_name")
    private String employeeName;
    @Basic(optional = false)
    @Column(name = "SAP_CC_Name")
    private String sAPCCName;
    @Basic(optional = false)
    @Column(name = "WS")
    private String ws;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployee")
    private Collection<LogCardState> logCardStateCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmployee")
    private Collection<LogCardAction> logCardActionCollection;

    public Employees() {
    }

    public Employees(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Employees(Integer idEmployee, String employeeName, String sAPCCName, String ws) {
        this.idEmployee = idEmployee;
        this.employeeName = employeeName;
        this.sAPCCName = sAPCCName;
        this.ws = ws;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getSAPCCName() {
        return sAPCCName;
    }

    public void setSAPCCName(String sAPCCName) {
        this.sAPCCName = sAPCCName;
    }

    public String getWs() {
        return ws;
    }

    public void setWs(String ws) {
        this.ws = ws;
    }

    @XmlTransient
    public Collection<LogCardState> getLogCardStateCollection() {
        return logCardStateCollection;
    }

    public void setLogCardStateCollection(Collection<LogCardState> logCardStateCollection) {
        this.logCardStateCollection = logCardStateCollection;
    }

    @XmlTransient
    public Collection<LogCardAction> getLogCardActionCollection() {
        return logCardActionCollection;
    }

    public void setLogCardActionCollection(Collection<LogCardAction> logCardActionCollection) {
        this.logCardActionCollection = logCardActionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmployee != null ? idEmployee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employees)) {
            return false;
        }
        Employees other = (Employees) object;
        if ((this.idEmployee == null && other.idEmployee != null) || (this.idEmployee != null && !this.idEmployee.equals(other.idEmployee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.Employees[ idEmployee=" + idEmployee + " ]";
    }
    
}
