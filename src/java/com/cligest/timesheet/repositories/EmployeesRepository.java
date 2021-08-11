/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.repositories;


import com.cligest.timesheet.domain.Employees;
import java.util.List;

/**
 *
 * @author maro.fernando
 */
public interface EmployeesRepository {
    public Integer inserir(Employees e);
    public Integer update(Employees e);
    public Employees findById(Integer id);
    public List<Employees> findByColumnField(String id);
    public List<Employees> findAll();
}
