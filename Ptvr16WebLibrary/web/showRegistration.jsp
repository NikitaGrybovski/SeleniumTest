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
        <h1>Зарегистрироваться</h1>
        <p id="info">${info}</p>
        <a href="index">Введите данные пользователя</a><br>
        <form action="registration" method="POST">
            Имя:<br>
            <input type="text" name="name"><br>
            Фамилия:<br>
            <input type="text" name="surname"><br>
            Email:<br>
            <input type="text" name="email"><br>
            <br>
            Логин:<br>
            <input type="text" name="login"><br>
            <br>
            Пароль:<br>
            <input type="text" name="password1"><br>
            <br>
            Повторите пароль:<br>
            <input type="text" name="password2"><br>
            <br>
            <input id="enter" type="submit" value="Зарегистрироваться">
        </form>
    </body>
</html>
