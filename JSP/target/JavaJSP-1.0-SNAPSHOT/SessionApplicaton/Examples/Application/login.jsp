<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <%
        if(!session.isNew()){
            String username=(String)session.getAttribute("username");
            String password=(String)session.getAttribute("password");
            
            if (username.equals("")||password.equals("")) response.sendRedirect("index.jsp");
            else{
                out.print("Hosgeldin "+username+"<br><br>");
                out.print("<a href='chat.jsp'>Chat odasına gir.</a>");      
            }
        }
    %>
</body>
</html>
