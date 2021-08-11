<%-- 
    Document   : employeesInsertPage
    Created on : 2/jul/2021, 1:43:00
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <h1 class="text-center mt-4 mb-4">Cadastro de Funcionários</h1>
            <div class="row mt-5 mb-5" id="no-principal">
                <div class="col col-md-2">&nbsp;</div>
                <div class="col col-md-8">
                    <form action="">
                        <div class="form-group">
                            <label for="idUtente">Id</label>
                            <input type="text" name="idUtente" id="idUtente" class="form-control" value="${e.idEmployee}" placeholder="Digite o ID de Utente" >
                        </div>
                        <div class="form-group">
                            <label for="utente">Funcionário</label>
                            <input type="text" name="utente" id="utente" class="form-control" value="${e.employeeName}" placeholder="Digite o Nome do Funcionário" >
                        </div>
                        <div class="form-group">
                            <label for="sap">SAP</label>
                            <input type="text" name="sap" id="sap" class="form-control" value="" placeholder="Digite o SAP" >
                        </div>
                        <div class="form-group">
                            <label for="ws">WS</label>
                            <input type="text" name="ws" id="ws" class="form-control" value="${e.ws}" placeholder="Digite o WS" >
                        </div>
                        <div class="form-group">
                            <label for="card">Cartão</label>
                            <input type="text" name="card" id="card" class="form-control" value="" placeholder="Digite o Nº do Cartão" >
                        </div>
                        <div class="form-group">
                            <label for="card">Cartão</label>
                            <select name="idCardState" id="idCardState" class="form-control">
                                <option value="1" selected>Cartão Activo</option>
                                <option value="2">Cartão Desactivo</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="description">Estado do Cartão</label>
                            <textarea name="description" id="" class="form-control"></textarea>
                        </div>
                        <input type="submit" class="btn btn-primary" value="Gravar">
                        <input type="reset" class="btn btn-secondary" value="Limpar">
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
