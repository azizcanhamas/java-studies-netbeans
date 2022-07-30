<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <!-- Kullanicidan username ve password bilgilerini al form ile gonder.-->
    <form action="ImplicitObjects_Response_control.jsp">
        <input type='text' placeholder="Kullanıcı adı" name="username"/>
        <input type='text' placeholder="Parola" name="password"/>
        <input type="submit" value="Giriş" id="giris"/>
    </form>
</body>
</html>
