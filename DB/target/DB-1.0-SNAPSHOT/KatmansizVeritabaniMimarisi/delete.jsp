<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@include file="database.jsp" %>
    <%
        if((String)session.getAttribute("kimlik")==null)response.sendRedirect("index.jsp");
    %>
    
    
    <%
        if (request.getParameter("sicilNo")!=null) {
            int sicilNo=Integer.parseInt(request.getParameter("sicilNo"));
            query="DELETE FROM personel WHERE sicilNo="+sicilNo;
            try{
                state=con.createStatement();
                state.executeUpdate(query);
                response.sendRedirect("list.jsp");
            }catch(SQLException e){out.print("Kayıt silinemedi!");
            }           
        }        
    %>
</body>
</html>
