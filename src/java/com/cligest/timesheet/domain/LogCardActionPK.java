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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author maro.fernando
 */
@Embeddable
public class LogCardActionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_card")
    private String idCard;
    @Basic(optional = false)
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;

    public LogCardActionPK() {
    }

    public LogCardActionPK(String idCard, Date datetime) {
        this.idCard = idCard;
        this.datetime = datetime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCard != null ? idCard.hashCode() : 0);
        hash += (datetime != null ? datetime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogCardActionPK)) {
            return false;
        }
        LogCardActionPK other = (LogCardActionPK) object;
        if ((this.idCard == null && other.idCard != null) || (this.idCard != null && !this.idCard.equals(other.idCard))) {
            return false;
        }
        if ((this.datetime == null && other.datetime != null) || (this.datetime != null && !this.datetime.equals(other.datetime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.LogCardActionPK[ idCard=" + idCard + ", datetime=" + datetime + " ]";
    }
    
}
