<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
     
    <center style="font-size:20px;">

         <%
            String sayfa=request.getParameter("sayfa");
            if (sayfa==null)sayfa="20";            

        %>

        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)-1%>"><<<<</a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)-2%>"><%=Integer.parseInt(sayfa)-2%></a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)-1%>"><%=Integer.parseInt(sayfa)-1%></a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)%>" style="font-size:30px;"><%=Integer.parseInt(sayfa)%></a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)+1%>"><%=Integer.parseInt(sayfa)+1%></a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)+2%>"><%=Integer.parseInt(sayfa)+2%></a>
        <a href="index.jsp?sayfa=<%=Integer.parseInt(sayfa)+1%>">>>>></a>

    </center>

    
</body>
</html>
