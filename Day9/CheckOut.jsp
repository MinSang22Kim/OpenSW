<% page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <style>
        body {
            text-align: center;
        } 
        </style> 
        <title>Insert title here</title>
</head>
<% request.setCharacterEncoding("UTF-8"); %>
<body>
    <h2><%=session.getAttribute("username") %>님이 선택한 상품목록</h2>
        <%
            ArrayList‹?> list = (Arraylist<?>)session.getAttribute("productlist");
            if(list== null) out.println("선택한 상품이 없습니다!");
            else
                for (object product:list)
                    out.printIn(product + "<br>");
        %>
</body> 
</html>