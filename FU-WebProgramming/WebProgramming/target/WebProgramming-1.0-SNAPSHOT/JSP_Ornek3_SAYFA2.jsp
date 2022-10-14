<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        AD: <%=session.getAttribute("ad")%><br>
        SOYAD: <%=session.getAttribute("soyad")%><br>
        YAS: <%=session.getAttribute("yas")%><br>
    </body>
</html>
