<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
      
    <%@page import="Model.adminModel" %>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            adminModel adm=new adminModel();
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            if (adm.adminMi(username, password)) {
                session.setAttribute("username", username);
                response.sendRedirect("../View/adminPanel.jsp?status=true");
            }
            else{
                response.sendRedirect("../View/adminLogin.jsp?status=false");
            }
        %>
    
</body>
</html>
