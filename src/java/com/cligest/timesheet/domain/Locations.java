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
@Table(name = "locations")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locations.findAll", query = "SELECT l FROM Locations l"),
    @NamedQuery(name = "Locations.findByIdLocation", query = "SELECT l FROM Locations l WHERE l.idLocation = :idLocation"),
    @NamedQuery(name = "Locations.findByAddress", query = "SELECT l FROM Locations l WHERE l.address = :address"),
    @NamedQuery(name = "Locations.findByPlace", query = "SELECT l FROM Locations l WHERE l.place = :place")})
public class Locations implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_location")
    private Integer idLocation;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "place")
    private String place;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idLocation")
    private Collection<TimesheetDevices> timesheetDevicesCollection;

    public Locations() {
    }

    public Locations(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public Locations(Integer idLocation, String address, String place) {
        this.idLocation = idLocation;
        this.address = address;
        this.place = place;
    }

    public Integer getIdLocation() {
        return idLocation;
    }

    public void setIdLocation(Integer idLocation) {
        this.idLocation = idLocation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @XmlTransient
    public Collection<TimesheetDevices> getTimesheetDevicesCollection() {
        return timesheetDevicesCollection;
    }

    public void setTimesheetDevicesCollection(Collection<TimesheetDevices> timesheetDevicesCollection) {
        this.timesheetDevicesCollection = timesheetDevicesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLocation != null ? idLocation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locations)) {
            return false;
        }
        Locations other = (Locations) object;
        if ((this.idLocation == null && other.idLocation != null) || (this.idLocation != null && !this.idLocation.equals(other.idLocation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.Locations[ idLocation=" + idLocation + " ]";
    }
    
}
