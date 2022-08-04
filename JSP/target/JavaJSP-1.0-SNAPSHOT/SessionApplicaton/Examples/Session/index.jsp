<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <style>
        #loginDiv{
            border:2px solid black;
            width: 20%;
            padding:1%;
            margin:15% auto;
        }
        
    </style>

    <!--Bu sayfa acildigi zaman oturumu kapat.-->
    <%@page session="false" %>
    
    <body>
        <div id="loginDiv">
            <form action="session.jsp?">
                Username: <input type="text" name="username"/><br><br>
                Password: <input type="text" name="password"/><br><br>
                <input type="checkbox" name="beniHatirla"/>Beni Hatırla &nbsp;&nbsp;&nbsp;
                <input type="submit" style="width:120px;"/>
                <!--session.jsp sayfasina index.jsp sayfasindan login 
                olundugunu belirtmek icin parametre geciliyor.-->
                <input type="hidden" name="action" value="login"/>
            </form>
        </div>
    </body>
</html>
