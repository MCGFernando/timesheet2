<%-- 
    Document   : tableLogCardActionWidget
    Created on : 11/ago/2021, 23:20:50
    Author     : maro.fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table class="table table-bordered table-hover">
    <thead>
        <tr>
            <th>N CARTAO</th>
            <th>NOME</th>
            <th>DISPOSITIVO</th>
            <th>ACCAO</th>
            <th>DATA</th>
            <th>IMGAGEM</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="log" items="${lista}">
        <tr>
            <td><c:out value="${log.logCardActionPK.idCard}" /></td>
        <td><c:out value="${log.idEmployee.idEmployee}" /></td>
        <td><c:out value="${log.idDevice.description}" /></td>
        <td><c:out value="${log.idAction.description}" /></td>
        <td><c:out value="${log.logCardActionPK.datetime}" /></td>
        <td><c:out value="${log.imageFile}" /></td>
        </tr>
    </c:forEach>
</tbody>
</table>
