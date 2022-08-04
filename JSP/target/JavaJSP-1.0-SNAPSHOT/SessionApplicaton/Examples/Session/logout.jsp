<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        session.invalidate();
        HttpSession oturum=request.getSession(false);
        out.print("Oturum bulunamadi!");
        out.print("<p><a href='index.jsp'>Tekrar oturum açmak için tıklayınız.</a>");
    %>
</body>
</html>
