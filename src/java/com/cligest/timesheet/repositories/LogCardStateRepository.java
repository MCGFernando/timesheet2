package com.cligest.timesheet.repositories;

import com.cligest.timesheet.domain.LogCardState;
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
public interface LogCardStateRepository {
    public String inserir(LogCardState l);
    public String update(LogCardState l);
    public LogCardState findById(Integer id);
    public List<LogCardState> findByColumnField(String id);
    public List<LogCardState> findAll();
}
