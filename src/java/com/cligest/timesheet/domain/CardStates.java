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
@Table(name = "card_states")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CardStates.findAll", query = "SELECT c FROM CardStates c"),
    @NamedQuery(name = "CardStates.findByIdCardState", query = "SELECT c FROM CardStates c WHERE c.idCardState = :idCardState"),
    @NamedQuery(name = "CardStates.findByDescription", query = "SELECT c FROM CardStates c WHERE c.description = :description")})
public class CardStates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_card_state")
    private Integer idCardState;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cardState")
    private Collection<LogCardState> logCardStateCollection;

    public CardStates() {
    }

    public CardStates(Integer idCardState) {
        this.idCardState = idCardState;
    }

    public CardStates(Integer idCardState, String description) {
        this.idCardState = idCardState;
        this.description = description;
    }

    public Integer getIdCardState() {
        return idCardState;
    }

    public void setIdCardState(Integer idCardState) {
        this.idCardState = idCardState;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public Collection<LogCardState> getLogCardStateCollection() {
        return logCardStateCollection;
    }

    public void setLogCardStateCollection(Collection<LogCardState> logCardStateCollection) {
        this.logCardStateCollection = logCardStateCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCardState != null ? idCardState.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardStates)) {
            return false;
        }
        CardStates other = (CardStates) object;
        if ((this.idCardState == null && other.idCardState != null) || (this.idCardState != null && !this.idCardState.equals(other.idCardState))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cligest.timesheet.domain.CardStates[ idCardState=" + idCardState + " ]";
    }
    
}
