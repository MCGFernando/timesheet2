/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author maro.fernando
 */
@Entity
@Table(name = "log_card_action")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogCardAction.findAll", query = "SELECT l FROM LogCardAction l"),
    @NamedQuery(name = "LogCardAction.findByIdCard", query = "SELECT l FROM LogCardAction l WHERE l.logCardActionPK.idCard = :idCard"),
    @NamedQuery(name = "LogCardAction.findByIdEmployees", query = "SELECT l FROM LogCardAction l WHERE l.idEmployee.idEmployee = :idEmployee"),
    @NamedQuery(name = "LogCardAction.findByDatetime", query = "SELECT l FROM LogCardAction l WHERE l.logCardActionPK.datetime = :datetime"),
    @NamedQuery(name = "LogCardAction.findByImageFile", query = "SELECT l FROM LogCardAction l WHERE l.imageFile = :imageFile")})
public class LogCardAction implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LogCardActionPK logCardActionPK;
    @Basic(optional = false)
    @Column(name = "image_file")
    private String imageFile;
    @JoinColumn(name = "id_action", referencedColumnName = "id_action")
    @ManyToOne(optional = false)
    private Actions idAction;
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee")
    @ManyToOne(optional = false)
    private Employees idEmployee;
    @JoinColumn(name = "id_device", referencedColumnName = "id_device")
    @ManyToOne(optional = false)
    private TimesheetDevices idDevice;

    public LogCardAction() {
    }

    public LogCardAction(LogCardActionPK logCardActionPK) {
        this.logCardActionPK = logCardActionPK;
    }

    public LogCardAction(LogCardActionPK logCardActionPK, String imageFile) {
        this.logCardActionPK = logCardActionPK;
        this.imageFile = imageFile;
    }

    public LogCardAction(String idCard, Date datetime) {
        this.logCardActionPK = new LogCardActionPK(idCard, datetime);
    }

    public LogCardActionPK getLogCardActionPK() {
        return logCardActionPK;
    }

    public void setLogCardActionPK(LogCardActionPK logCardActionPK) {
        this.logCardActionPK = logCardActionPK;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public Actions getIdAction() {
        return idAction;
    }

    public void setIdAction(Actions idAction) {
        this.idAction = idAction;
    }

    public Employees getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Employees idEmployee) {
        this.idEmployee = idEmployee;
    }

    public TimesheetDevices getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(TimesheetDevices idDevice) {
        this.idDevice = idDevice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logCardActionPK != null ? logCardActionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogCardAction)) {
            return false;
        }
        LogCardAction other = (LogCardAction) object;
        if ((this.logCardActionPK == null && other.logCardActionPK != null) || (this.logCardActionPK != null && !this.logCardActionPK.equals(other.logCardActionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.LogCardAction[ logCardActionPK=" + logCardActionPK + " ]";
    }
    
}
