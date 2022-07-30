<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        //getParameterNames Enumeration tipinde veri doner.
        Enumeration<String> e=request.getParameterNames();
        while (e.hasMoreElements()) {             
                out.println(e.nextElement());
        }
    %>
</body>
</html>
