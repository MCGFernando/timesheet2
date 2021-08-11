/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.dao;

import com.cligest.timesheet.domain.LogCardAction;
import com.cligest.timesheet.persistence.PersistenceUnit;
import com.cligest.timesheet.repositories.LogCardActionRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author maro.fernando
 */
public class LogCardActionDAO implements LogCardActionRepository {

    @Override
    public Integer inserir(LogCardAction l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer update(LogCardAction l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogCardAction> findById(Integer id) {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("LogCardAction.findByIdEmployees");
        query.setParameter("idEmployee", id);
        List<LogCardAction> lista = query.getResultList();
        return lista;
    }

    @Override
    public List<LogCardAction> findByColumnField(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LogCardAction> findAll() {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("LogCardAction.findAll");
        List<LogCardAction> lista = query.getResultList();
        return lista;
    }
    
}
