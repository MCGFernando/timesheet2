/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.service;

import com.cligest.timesheet.dao.EmployeesDAO;
import com.cligest.timesheet.domain.Employees;
import java.util.List;


/**
 *
 * @author maro.fernando
 */
public class EmployeesService {

    public Employees pesquisaPorID(Integer id) {
        EmployeesDAO dao = new EmployeesDAO();
        return dao.findById(id);
    }

    public List<Employees> pesquisaTudo() {
        EmployeesDAO dao = new EmployeesDAO();
        return dao.findAll();
    }

    
}
