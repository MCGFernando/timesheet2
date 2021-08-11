package com.cligest.timesheet.dao;

import com.cligest.timesheet.domain.LogCardState;
import com.cligest.timesheet.persistence.PersistenceUnit;
import com.cligest.timesheet.repositories.LogCardStateRepository;
import java.util.List;
import javax.persistence.EntityManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maro.fernando
 */
public class LogCardStateDAO implements LogCardStateRepository{

    @Override
    public String inserir(LogCardState l) {
        EntityManager em = PersistenceUnit.getEntityManager();
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
        return l.getLogCardStatePK().getIdCard();
    }

    @Override
    public String update(LogCardState l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LogCardState findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogCardState> findByColumnField(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogCardState> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
