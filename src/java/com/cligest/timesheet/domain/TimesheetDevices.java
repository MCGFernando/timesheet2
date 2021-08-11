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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "timesheet_devices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimesheetDevices.findAll", query = "SELECT t FROM TimesheetDevices t"),
    @NamedQuery(name = "TimesheetDevices.findByIdDevice", query = "SELECT t FROM TimesheetDevices t WHERE t.idDevice = :idDevice")})
public class TimesheetDevices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_device")
    private Integer idDevice;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDevice")
    private Collection<LogCardAction> logCardActionCollection;
    @JoinColumn(name = "id_location", referencedColumnName = "id_location")
    @ManyToOne(optional = false)
    private Locations idLocation;

    public TimesheetDevices() {
    }

    public TimesheetDevices(Integer idDevice) {
        this.idDevice = idDevice;
    }

    public TimesheetDevices(Integer idDevice, String description) {
        this.idDevice = idDevice;
        this.description = description;
    }

    public Integer getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(Integer idDevice) {
        this.idDevice = idDevice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<LogCardAction> getLogCardActionCollection() {
        return logCardActionCollection;
    }

    public void setLogCardActionCollection(Collection<LogCardAction> logCardActionCollection) {
        this.logCardActionCollection = logCardActionCollection;
    }

    public Locations getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Locations idLocation) {
        this.idLocation = idLocation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDevice != null ? idDevice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimesheetDevices)) {
            return false;
        }
        TimesheetDevices other = (TimesheetDevices) object;
        if ((this.idDevice == null && other.idDevice != null) || (this.idDevice != null && !this.idDevice.equals(other.idDevice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.TimesheetDevices[ idDevice=" + idDevice + " ]";
    }
    
}
