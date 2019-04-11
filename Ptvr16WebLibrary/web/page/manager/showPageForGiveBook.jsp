<%-- 
    Document   : page3
    Created on : Dec 10, 2018, 11:03:45 AM
    Author     : Melnikov
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Библиотека</title>
    </head>
    <body>
        <h1>Выдать книгу читателю</h1>
        ${info}<br>
        <a href="index">Главная страница</a><br>
        <form action="giveBook" method="POST">
            <select name="bookId" >
                <option disabled selected>Выберите книгу</option>
                <c:forEach var="bookItem" items="${listBooks}">
                    <option value="${bookItem.id}">${bookItem.name}</option>
                </c:forEach>
            </select>
            
            <select name="readerId">
                <option disabled selected>Выберите читателя</option>
                <c:forEach var="readerItem" items="${listReaders}">
                    <option value="${readerItem.id}">${readerItem.name} ${readerItem.surname}</option>
                </c:forEach>
            </select>
            <input type="submit" value="Выдать книгу">
        </form>
        
    </body>
</html>
