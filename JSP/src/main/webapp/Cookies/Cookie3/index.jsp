<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%
        //Sayfaya gelindigi zaman aktif cerez varsa bu cerezdeki bilgilerle
        //formlarin doldurulmasi amaclanmistir. Eger hicbir cerez yoksa
        //bos forma sahip bir sayfa gosterilecektir.
        Cookie[]cerezler=request.getCookies();
        String username="",password="";
        if(cerezler!=null){
            for (Cookie cookie : cerezler) {
                if(cookie.getName().equals("username")) username=cookie.getValue();
                else if(cookie.getName().equals("password"))password=cookie.getValue();
            }
        }
    %>
    
    <%
        //Eger cerez yoksa bos bir form goster. Formda "beni hatirla" secenegi olsun.
        if(username.equals("")){
    %>
            <form action="hatirlaUnut.jsp" method="get">
            Username: <input type="text" id="username" name="username" onkeyup="kontrol()"/><br><br>
            Password : <input type="text" id="password" name="password" onkeyup="kontrol()"/><br><br>
            <input type="checkbox" name="hatirla"/> Beni Hatırla &nbsp;&nbsp;
            <input type="submit" id="button" style="width:125px;"/>
    </form>
    
    <%
        }
        //Eger cerez varsa formu bu cerezdeki bilgilerle doldur. Cereze ait username
        //bilgisinin "<input type=hidden/>" ile hatirlaUnut.jsp sayfasina gonder.
        else{
    %>
            <form action="hatirlaUnut.jsp" method="get">
            Username: <input type="text" id="username" name="username" onkeyup="kontrol()" value="<%=username%>"/><br><br>
            Password : <input type="text" id="password" name="password" onkeyup="kontrol()" value="<%=password%>"/><br><br>
            <input type="checkbox" name="unut"/> Beni Unut &nbsp;&nbsp;
            <input type="submit" id="button" style="width:125px;"/>
            <!-- parametre tasimak icin-->
            <input type="hidden" name="cerez" value="<%=username%>"/>
    <%
        }
    %>
   
</body>

<script>
    //username ve password kutucuklari bos oldugu zaman "Gonder" butonunu pasif yap.
    function kontrol(){
        if (document.getElementById("username").value.length==0)
            document.getElementById("button").disabled=true;
        else if (document.getElementById("password").value.length==0)
            document.getElementById("button").disabled=true;
        else
            document.getElementById("button").disabled=false;
    }
</script>
</html>
