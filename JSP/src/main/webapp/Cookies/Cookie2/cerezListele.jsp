<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%
        //Tum cerezleri listele.
        Cookie[] cerezler=request.getCookies();
        for (Cookie cerez : cerezler) {
            out.print(cerez.getName()+"  :  "+cerez.getValue()+"<br>");
        }
    %>

</body>
</html>
