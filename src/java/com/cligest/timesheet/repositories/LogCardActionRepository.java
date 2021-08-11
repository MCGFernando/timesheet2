package com.cligest.timesheet.repositories;

import com.cligest.timesheet.domain.LogCardAction;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author maro.fernando
 */
public interface LogCardActionRepository {
    public Integer inserir(LogCardAction l);
    public Integer update(LogCardAction l);
    public List<LogCardAction> findById(Integer id);
    public List<LogCardAction> findByColumnField(String id);
    public List<LogCardAction> findAll();
}
