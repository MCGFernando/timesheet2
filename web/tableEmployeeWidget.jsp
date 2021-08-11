<%-- 
    Document   : tableWidget
    Created on : 11/ago/2021, 19:54:57
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<table class="table table-bordered table-hover">
    <thead>
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>SAP</th>
            <th>WS</th>
            <th>ACÇÃO</th>
        </tr>  
    </thead>
    <tbody>
    <c:forEach var="e" items="${lista}">
        <tr>
            <td><c:out value="${e.idEmployee}" /></td>
            <td><c:out value="${e.employeeName}" /></td>
            <td><c:out value="" /></td>
            <td><c:out value="${e.ws}" /></td>
            <td>
                <div class="dropdown">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                        
                    </button>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a class="dropdown-item" href="EmployeesController?id=${e.idEmployee}">Editar</a>
                        <a class="dropdown-item" href="LogCardActionController?id=${e.idEmployee}">Histórico de ponto</a>
                        <a class="dropdown-item" href="#?id=${e.idEmployee}">Desativar</a>
                    </div>
                </div>
            </td>
        </tr>
    </c:forEach>
</tbody>
</table>

