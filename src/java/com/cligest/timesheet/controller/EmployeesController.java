/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cligest.timesheet.controller;

import com.cligest.timesheet.dao.EmployeesDAO;
import com.cligest.timesheet.domain.Employees;
import com.cligest.timesheet.service.EmployeesService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author maro.fernando
 */
@WebServlet(name = "EmployeesController", urlPatterns = {"/EmployeesController"})
public class EmployeesController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.print("Metodo process"
                    + "");
            EmployeesDAO eDAO = new EmployeesDAO();
            out.println("Size ");
            List<Employees> lista = eDAO.findAll();
            out.println("Size " + lista.size());
            /*for (Employees e : lista)
             out.println("Employee " + e.getEmployeeName());*/
            request.setAttribute("lista", lista);
            request.getRequestDispatcher("employeesListPage.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            out.println("Metodo Get ");
            EmployeesService service = new EmployeesService();
            if(id.isEmpty() || id==null){
                out.print("Metodo Get 1");
                processRequest(request, response);
                out.println("Metodo Get 2");
            }
            Integer idUtente = Integer.valueOf(id);
            Employees e = service.pesquisaPorID(idUtente);
            request.setAttribute("e", e);
            out.println("Metodo Get 3");
            request.getRequestDispatcher("employeesInsertPage.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        try (PrintWriter out = response.getWriter()) {
            String id = request.getParameter("id");
            out.print("Metodo Post ");
            if(id.isEmpty() || id==null){
                processRequest(request, response);
            }
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
