<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@page import="Model.uyeModel" %>
    <%
        if(session.getAttribute("username")==null)response.sendRedirect("adminLogin.jsp");
        else{
            String username=request.getParameter("sil");
            if(username!=null){
                uyeModel m=new uyeModel();
                m.uyeSil(username);              
                response.sendRedirect("../View/uyeListele.jsp");
            }
            else{
                response.sendRedirect("../View/uyeListele.jsp");
            }
        }
    %>

</body>
</html>
