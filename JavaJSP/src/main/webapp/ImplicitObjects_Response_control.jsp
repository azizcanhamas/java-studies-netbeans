<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%
        //Rutin username-password kontrolu. Dogru veya yanlis ise ilgili sayfaya yonlendir.
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if (username.equals("aziz_can")&&password.equals("123456")) {
            response.sendRedirect("ImplicitObjects_Response_display.jsp");
        }
        else{
            response.sendRedirect("ImplicitObjects_Response_error.jsp");
        }
    %>

</body>
</html>
