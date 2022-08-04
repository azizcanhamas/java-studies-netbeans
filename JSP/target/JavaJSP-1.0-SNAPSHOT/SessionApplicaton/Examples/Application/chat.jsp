<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<style>
    html{
        width:99%;
        height: 100%;
    }
    
     body{
        width:100%;
        height:100%;
        font-family: monospace,"Monaco";
        font-size: 20px;
    }
    
    table{
        width:500px;
        height:100px;
        margin: auto auto;
    }
    th{
        width:500px;
        height:50px;
    }
    
    #mesajGonder{
        width:500px;
        height: 20px;
    }
    
    #textbox{
        width:82%;
    }
    
    textarea{
        width: 99%;
        height: 99%;
    }
   
</style>

<%@page import="java.time.LocalDate"%>
<%
    request.setCharacterEncoding("utf-8");
    response.setDateHeader("Expires", -1);
    response.setHeader("Refresh", "10");
    String username=(String)session.getAttribute("username");
    if (username==null) username="misafir";
    String mesaj=request.getParameter("mesaj");
    String chatKayit=(String)application.getAttribute("chatKayit");
    if(mesaj!=null){
        LocalDate d=LocalDate.now();
        mesaj=username+"("+d.toString()+"):"+mesaj;
        if(chatKayit==null)chatKayit=mesaj;
        else chatKayit+=("<br>"+mesaj);
    }
    if(chatKayit!=null){
        application.setAttribute("chatKayit", chatKayit);
    }
%>

<body>
    <form action="chat.jsp" method="post">
        <table border="2">
            <tr><th>Chat Room</th></tr>
            <tr>
                <td>
                    <%if(application.getAttribute("chatKayit")!=null)out.print(application.getAttribute("chatKayit"));%>
                </td>
            </tr>

            <tr id="mesajGonder">
                <td>
                    <input id="textbox" name="mesaj" type="text"/>
                    <input type="submit" name="gonder"/>
                </td>
            </tr>

        </table>     
    </form>
        
</body>
</html>
