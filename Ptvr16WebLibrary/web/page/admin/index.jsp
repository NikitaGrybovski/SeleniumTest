<%-- 
    Document   : index
    Created on : Mar 13, 2019, 2:55:40 PM
    Author     : Melnikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <H1>Добро пожаловать в нашу библиотеку</H1>
       <p id="info">${info}</p>
       <a id="showLogin" href="showLogin">Войти</a><br>
       <a id="logout" href="logout">Выйти</a><br>
        <a href="showRegistration">Зарегистрироваться</a><br>
        <a href="showListBooks">Список книг</a><br>
        <a href="showChangePassword">Изменить пароль</a><br>
        <a href="showListReaders">Список читателей</a><br>
        <a href="showPageForGiveBook">Выдать книгу</a><br>
        <a href="showPageForReturnBook">Вернуть книгу</a><br>
        <a id="showAddNewBook" href="showAddNewBook">Добавить книгу</a><br>
        <a href="showChangeRole">Изменить роль</a>
    </body>
</html>
