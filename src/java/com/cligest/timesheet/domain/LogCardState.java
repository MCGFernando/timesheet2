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
import javax.persistence.Lob;
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
@Table(name = "log_card_state")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LogCardState.findAll", query = "SELECT l FROM LogCardState l"),
    @NamedQuery(name = "LogCardState.findByIdCard", query = "SELECT l FROM LogCardState l WHERE l.logCardStatePK.idCard = :idCard"),
    @NamedQuery(name = "LogCardState.findByDatetime", query = "SELECT l FROM LogCardState l WHERE l.logCardStatePK.datetime = :datetime")})
public class LogCardState implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LogCardStatePK logCardStatePK;
    @Basic(optional = false)
    @Lob
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "card_state", referencedColumnName = "id_card_state")
    @ManyToOne(optional = false)
    private CardStates cardState;
    @JoinColumn(name = "id_employee", referencedColumnName = "id_employee")
    @ManyToOne(optional = false)
    private Employees idEmployee;

    public LogCardState() {
    }

    public LogCardState(LogCardStatePK logCardStatePK) {
        this.logCardStatePK = logCardStatePK;
    }

    public LogCardState(LogCardStatePK logCardStatePK, String description) {
        this.logCardStatePK = logCardStatePK;
        this.description = description;
    }

    public LogCardState(String idCard, Date datetime) {
        this.logCardStatePK = new LogCardStatePK(idCard, datetime);
    }

    public LogCardStatePK getLogCardStatePK() {
        return logCardStatePK;
    }

    public void setLogCardStatePK(LogCardStatePK logCardStatePK) {
        this.logCardStatePK = logCardStatePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CardStates getCardState() {
        return cardState;
    }

    public void setCardState(CardStates cardState) {
        this.cardState = cardState;
    }

    public Employees getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Employees idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logCardStatePK != null ? logCardStatePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogCardState)) {
            return false;
        }
        LogCardState other = (LogCardState) object;
        if ((this.logCardStatePK == null && other.logCardStatePK != null) || (this.logCardStatePK != null && !this.logCardStatePK.equals(other.logCardStatePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.LogCardState[ logCardStatePK=" + logCardStatePK + " ]";
    }
    
}
