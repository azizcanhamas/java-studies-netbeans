<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <!-- ====== YONTEM-1 : REQUEST YONTEMI ================-->
        <%
            String sayi1=request.getParameter("sayi1");
            String sayi2=request.getParameter("sayi2");
            String sayi3=request.getParameter("sayi3");
        %>
        <table>
            <tr>
                <td>1. Sayı: </td>
                <td><%=sayi1%></td>
            </tr>   
            <tr>
                <td>2. Sayı: </td>
                <td><%=sayi2%></td>
            </tr>
            <tr>
                <td>3. Sayı: </td>
                <td><%=sayi3%></td>
            </tr>
        </table>
            
<hr>
            
        <!-- ===== YONTEM-2 : BEAN YONTEMI =================-->
    <jsp:useBean id="sayiOrnek" class="sayiOrnek.sayi" scope="session"/>        
    <jsp:setProperty name="sayiOrnek" property="*"/>
    <table>
            <tr>
                <td>1. Sayı: </td>
                <td><%=sayiOrnek.getSayi1()%></td>
            </tr>   
            <tr>
                <td>2. Sayı: </td>
                <td><%=sayiOrnek.getSayi2()%></td>
            </tr>
            <tr>
                <td>3. Sayı: </td>
                <td><%=sayiOrnek.getSayi3()%></td>
            </tr>
        </table>
    
    
    </body>
</html>
