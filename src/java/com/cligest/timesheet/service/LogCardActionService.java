/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.service;

import com.cligest.timesheet.dao.LogCardActionDAO;
import com.cligest.timesheet.domain.LogCardAction;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author maro.fernando
 */
public class LogCardActionService {

    public List<LogCardAction> pesquisaPorIDEmployees(Integer id) {
        LogCardActionDAO dao = new LogCardActionDAO();
        return dao.findById(id);
    }

    /*public void relatorioEmployeesLogCardAction(Integer id) {
        FileOutputStream out = null;
        try {
            LogCardActionDAO lDAO = new LogCardActionDAO();
            List<LogCardAction> lista = lDAO.findById(id);
            if (lista.size() == 0) {
                return;
            }  
            
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Relatorio");
            XSSFRow row = sheet.createRow(1);
            XSSFCell cell;
            cell = row.createCell(0);
            cell.setCellValue("N CARTAO");
            cell = row.createCell(1);
            cell.setCellValue("ID EMPLOYEE");
            cell = row.createCell(2);
            cell.setCellValue("NOME");
            cell = row.createCell(3);
            cell.setCellValue("DISPOSITIVO");
            cell = row.createCell(4);
            cell.setCellValue("ACCAO");
            cell = row.createCell(5);
            cell.setCellValue("DATA");
            for (int i = 1; i < lista.size(); i++) {
                row = sheet.createRow(i);
                cell = row.createCell(0);
                cell.setCellValue(lista.get(0).getLogCardActionPK().getIdCard());
                cell = row.createCell(1);
                cell.setCellValue(lista.get(1).getIdEmployee().getIdEmployee());
                cell = row.createCell(2);
                cell.setCellValue(lista.get(2).getIdEmployee().getEmployeeName());
                cell = row.createCell(3);
                cell.setCellValue(lista.get(3).getIdAction().getDescription());
                cell = row.createCell(4);
                cell.setCellValue(lista.get(4).getLogCardActionPK().getDatetime());
                
            }   
            out = new FileOutputStream(new File("C:\\Relatorio.xlsx"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogCardActionService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LogCardActionService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(LogCardActionService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }*/
}
