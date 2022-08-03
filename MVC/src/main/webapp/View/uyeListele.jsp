<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<%@include file="../Controller/uyeListeleController.jsp" %>

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
            font-size: 90%;
        }

        #container{
            height: 100%;
            width: 70%;
            margin:0 auto; 
        }

        #form_div{
            background-color: white;
            width: 100%;
            height: 80%;
            margin:auto;
            position:relative;
            top:10%;
            border-radius:  20px/20px;
            border:10px solid black;
            overflow-y: scroll; /*scroll ozelligi*/
        }

        table{
            margin:auto auto;      
            width: 100%;
            height:100%;
            overflow-y: scroll;
            border-radius:  10px/10px;
            background-color: #00000;
        }
        
        th{
            position: sticky;
            top:0px;
            height:50px;
            background-color:#7587a1;
            border-radius:  10px/10px;
        }
        
        tr{
            width:100%;
            height: 80%;
        }  

        td{
            height: 40px;
            font-weight: bold;
            text-align: center;
            border-radius:  10px/10px;
        }

        input,button{
            width: 100%;
            height:100%;
            border-radius:  10px/10px;
            border:3px solid black;
        }

        input[type="text"]{
            text-align: center;
        }        
</style>

<body>
    
    <div id="container">
        <div id="form_div">
            <form>
                <table border="2">
                    <tr>
                        <th>Kullanıcı Adı</th>                       
                        <th>Adı</th>
                        <th>Soyadı</th>
                        <th>İl</th>
                        <th>Adresi</th>
                        <th colspan="8">İşlemler</th>
                        <%               
                            ArrayList<ArrayList<String>> list=getDatas();
                            String username="";
                            for (ArrayList elem : list) {
                                username=elem.get(0).toString();
                        %>      
                                <tr>
                        <%
                                for (Object s : elem) {
                        %>
                                    <td><%=s%></td>
                        <%
                                    }
                        %>
                                    <td><button name="guncelle" value="<%=username%>" formaction="uyeGuncelleController.jsp?">Güncelle</button></td>
                                    <td><button name="sil" value="<%=username%>" formaction="../Controller/uyeSilController.jsp?">Sil</button></td>
                                </tr>
                        <%
                            }
                        %>
                </table>                              
            </form>
        </div>                      
    </div>
    
</body>
</html>
