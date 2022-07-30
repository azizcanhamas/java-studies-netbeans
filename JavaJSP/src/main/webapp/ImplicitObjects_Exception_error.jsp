<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!-- 
        isErrorPage degeri false yapilirsa 
        bu sayfa hata sayfasi olarak gosterilemez.
    -->
    <%@page isErrorPage="true" %> 
   <%
       // Bu sayfanin cagrilmasina neden olan 
       // Exception "exception" degeri ile alinabilir.
       out.println("Oops! Bir hata olustu :/ <br>"+exception);
   %>
    
</body>
</html>
