/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.persistence;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author maro.fernando
 */
public class PersistenceUnit {
    private static EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("TimeSheetPU");
   }
    
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
    public static void close(){
        factory.close();
    }
}
