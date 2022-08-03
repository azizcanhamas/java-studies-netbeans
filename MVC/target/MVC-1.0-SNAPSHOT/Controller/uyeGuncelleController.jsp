<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    
    <%@page import="Model.uyeModel" %>
    <%@page import="java.util.ArrayList" %>
    
    <%!
        public ArrayList<String> getUye(String username){
            uyeModel m=new uyeModel();
            ArrayList<String> list=m.getUye(username);
            return list;
        }
    %>
    
    <%
        if(session.getAttribute("username")==null)response.sendRedirect("adminLogin.jsp");        
        else{
            String username=request.getParameter("guncelle");
            response.sendRedirect("../View/uyeGuncelle.jsp");
        }
        
    %>

</body>
</html>
