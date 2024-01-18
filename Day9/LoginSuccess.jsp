<@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.localhost:8080/"

<jsp:useBean id="userinfo" class="OpenSW.Day09.useBean" scope="request" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            body{
                text-align:center;
            }
        </style>
        <title>
            Insert title here
        </title>
    </head>
    <body>
        <h2>Login Success!</h2>
        <hr>
        사용자 아이디: <jsp:getProperty name="userinfo" property="userid" />
        <br>
        사용자 패스워드: <jsp:getProperty name="userinfo" property="passwd" />
    </body>

</html>