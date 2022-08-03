<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <%@page import="Model.dbConnect"%>
    <%@page import="Model.uyeModel"%>
    <%@page import="java.util.ArrayList"%>
    
    <%!        
        uyeModel uyeModelObject=new uyeModel();
        public ArrayList<ArrayList<String>> getDatas(){
            return uyeModelObject.getUyeler();      
        }
    %>
    
    <%
        if(session.getAttribute("username")==null)response.sendRedirect("../View/adminLogin.jsp");
        else{
            dbConnect d=new dbConnect();
            uyeModel obj=new uyeModel();
            ArrayList<ArrayList<String>> list=obj.getUyeler();           
        }       
    %>

</body>
</html>
