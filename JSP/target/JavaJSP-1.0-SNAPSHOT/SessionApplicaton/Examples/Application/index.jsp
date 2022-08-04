<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<%
    // Uygulama bu sayfadan basliyor. Kullanici ilk bu sayfaya girdigi zaman hic 
    // cerez olmayacaktir. ("","") degerlerine sahip hic cerez olmayacagindan 
    // dongu altindaki kontroller calismayacaktir.
    // Uygulamada "Beni hatirla" ile oturum acildiktan sonra bu sayfaya donuldugunde
    // cerezdeki bilgiler forma doldurulacaktir.
    Cookie[]cerezler=request.getCookies();
    String username="";
    String password="";
    if(cerezler!=null){
        for (Cookie cerez : cerezler) {
            if(cerez.getValue().equals(username))cerez.getValue();
            else if(cerez.getValue().equals(password))cerez.getValue();
        }
    }
%>


<body>
    <div>
        <form action="cookie.jsp" method="get">
            <table border="2">
                <tr><th colspan="8">Login</th></tr>
                <tr>
                    <td colspan="1">Username</td>
                    <td colspan="7"><input type="text" name="username" value="<%=username%>"/></td>
                </tr>
                <tr>
                    <td colspan="1">Password</td>
                    <td colspan="7"><input type="text" name="password" value="<%=password%>"/></td>
                </tr>
                <tr>
                    <td><input type="checkbox" name="hatirla" value="true"/>Beni Hatırla</td>
                    <td><input type="checkbox" name="unut" value="true"/>Beni Unut</td>
                </tr>
                <tr><td colspan="8"><input type="submit"style="width:100%;"/></td></tr>
            </table>
        </form>
    </div>
</body>
</html>
