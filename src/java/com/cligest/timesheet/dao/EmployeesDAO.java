/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.dao;



import com.cligest.timesheet.domain.Employees;
import com.cligest.timesheet.persistence.PersistenceUnit;
import com.cligest.timesheet.repositories.EmployeesRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author maro.fernando
 */
public class EmployeesDAO implements EmployeesRepository{
    
    @Override
    public Integer inserir(Employees e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer update(Employees e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employees findById(Integer id) {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("Employees.findByIdEmployee");
        query.setParameter("idEmployee", id);
        Employees employee = (Employees) query.getSingleResult();
        //PersistenceUnit.close();
        return employee;
    }

    @Override
    public List<Employees> findByColumnField(String field) {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("Employees.findByEmployeeName");
        query.setParameter("employeeName", field);
        List<Employees> lista = query.getResultList();
        //PersistenceUnit.close();
        return lista;
    }

    @Override
    public List<Employees> findAll() {
        EntityManager em = PersistenceUnit.getEntityManager();
        Query query = em.createNamedQuery("Employees.findAll");
        List<Employees> lista = query.getResultList();
        //PersistenceUnit.close();
        return lista;
    }
    
    public static void main(String[] args) {
        EmployeesDAO dao = new EmployeesDAO();
        for (Employees e : dao.findAll())
            System.out.println(e.getEmployeeName());
    }
    
}
