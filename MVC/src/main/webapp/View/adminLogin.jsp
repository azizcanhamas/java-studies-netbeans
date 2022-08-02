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
        background-color: #0f2c54;
        width:100%;
        height:100%;
        font-family: monospace,"Monaco";
        font-size: 20px;
    }
    
    #container{
        height: 100%;
        width: 50%;
        margin:0 auto; 
    }
    
    #form_div{
        background-color: white;
        width: 60%;
        height: 50%;
        margin:auto;
        position:relative;
        top:20%;
        border-radius:  80px/80px;
        border:10px solid black;
    }
    
    table{
        margin:0 auto;      
        width: 100%;
        height:100%;
        padding-top:10%;
        padding-bottom:0%;
    }
     
    tr{
        width:100%;
        height: 100%;
    }  
    
    td{
        padding-left: 3%;
        padding-right:6%;
        height: 60px;
        font-weight: bold;
        text-align: center;
    }

    input{
        width: 97%;
        height:75%;
        border-radius:  40px/40px;
        border:3px solid black;
        text-align: center;
    }
    
    input[type="text"]{
        text-align: center;
    }
</style>

<body>   
    <div id="container">
        <div id="form_div">
               <form action="../Controller/adminController.jsp" method="get">
                    <table>
                        <tr>
                            <td style="font-weight: bold; text-align: center;" colspan="8">Yönetici Giriş Paneli</td>
                        </tr>
                        <tr>
                            <td>Kullanıcı Adı</td>
                            <td><input type="text" name="username"/></td>
                        </tr>
                        <tr>
                            <td>Parola</td>
                            <td><input type="password" name="password"/></td>
                        </tr>
                        <tr>
                            <td colspan="8"><input type="submit" style="width: 100%;" value="Giriş yap"/></td>
                        </tr>
                    </table>
                </form>
        </div>   
    </div>
</body>
</html>
