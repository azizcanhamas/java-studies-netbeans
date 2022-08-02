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
        width: 75%;
        height: 80%;
        margin:auto;
        position:relative;
        top:10%;
        border-radius:  80px/80px;
        border:10px solid black;
    }
    
    table{
        margin:auto auto;      
        width: 100%;
        height:100%;
        padding-top:5%;
        padding-bottom:0%;
    }
     
    tr{
        width:100%;
        height: 100%;
    }  
    
    td{
        padding-left: 10%;
        padding-right:10%;
        height: 60px;
        font-weight: bold;
        text-align: center;
    }

    input{
        width: 97%;
        height:75%;
        border-radius:  10px/10px;
        border:3px solid black;
    }
    
    input[type="text"]{
        text-align: center;
    }
    
    select{
        width:99%;
        height:60%;
        border-radius:  10px/10px;
        text-align:center;
        border: 3px solid black;
    }
    
    textarea{
        width: 95%;
        height: 100%;
        text-align: center;
        border: 3px solid black;
        border-radius:  10px/10px;
        resize:none;
    }
</style>

<body>
   
    
    <div id="container">
        <div id="form_div">
            <form>
                <table>
                    <tr>
                        <td colspan="8"><h3>Üye Takip Ekranı</h3></td>
                    </tr>

                    <tr>
                        <td><input type="text" placeholder="Kullanıcı Adı"/></td>
                    </tr>

                    <tr>
                        <td><input type="text" placeholder="Adı"/></td>
                    </tr>

                    <tr>
                        <td><input type="text" placeholder="Soyadı"/></td>
                    </tr>

                    <tr>
                        <td><select></select></td>
                    </tr>

                    <tr>
                        <td><select placeholder="ilce"></select></td>
                    </tr>

                    <tr>
                        <td><textarea placeholder="İletişim Adresi" maxlength="255"></textarea></td>
                    </tr>

                    <tr>
                        <td colspan="8"><input type="submit" value="Ekle"/></td>           
                    </tr>
                </table>
            </form>
        </div>   
    </div>
    
    
</body>
</html>
