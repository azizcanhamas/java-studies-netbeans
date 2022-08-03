<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%@page import="Model.uyeModel"%>
    <%@page import="java.util.ArrayList"%>
    
    <%!              
        public ArrayList<ArrayList<String>> getDatas(){
            uyeModel uyeModelObject=new uyeModel();
            return uyeModelObject.getUyeler();      
        }
    %>
    
    <%
        if(session.getAttribute("username")==null)response.sendRedirect("../View/adminLogin.jsp");      
    %>

</body>
</html>
