<%-- 
    Document   : logCardActionListPage
    Created on : 11/ago/2021, 23:10:30
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <title>TimeSheet - Employees</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-4 mb-4">Lista Batidas de Ponto</h1>
            <div class="row mt-5 mb-5" id="no-principal">
                <div class="col col-md-2">&nbsp;</div>
                <div class="col col-md-8">
                    <form action="">
                        <div class="form-group">
                            Inicio<input type="date" class="form-control">
                            Fim<input type="date" class="form-control">
                        </div>
                    </form>
                    <form action="RelatorioController">
                        <div class="form-group">
                            <input type="hidden" name="idEmployee" value="${lista.get(0).idEmployee.idEmployee}">
                            <input type="submit" class="btn btn-primary" value="Gerar Relatório">
                        </div>
                    </form>
                    <%@include file="tableLogCardActionWidget.jsp" %>
                </div>
            </div>
        </div>
    </body>
</html>
