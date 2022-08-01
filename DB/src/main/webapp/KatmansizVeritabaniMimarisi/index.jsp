<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%@include file="database.jsp" %>
    <form action="index.jsp?action=login" method="post" style="margin-left:560px; margin-top:220px;">
        <table border="1" width="300" height="150">
            <tr>
                <td colspan="2"><center>Yönetici Giriş Ekranı</center></td>
            </tr>
            <tr>
                <td>Kullanıcı adı: </td>
                <td><input type="text" name="username"/> </td>
            </tr>
            <tr>
                <td>Parola:</td>
                <td><input type="text" name="password"/> </td>
            </tr>
            <tr>
                <th colspan="2"><input type="submit" name="girisYapButton"/></th>
            </tr>
            <tr>
                <th colspan="2"><p id="info" style="font-size: 11px;">Giriş yapmak için kullanıcı adı ve şifrenizi giriniz.</p></th>
            </tr>
        </table>
    </form>
    
    <%
        if(request.getParameter("action")!=null){
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            //username ve parola degerlerinin esit oldugu kayitlari getir.
            query="SELECT * FROM admin WHERE username='"+username+"' AND "+"password='"+password+"'";
            
            try{
                state=con.createStatement();
                set=state.executeQuery(query);
                //Veritabanindan herhangi bir kayit gelmediyse
                if (!set.next()) {
    %>
                    <script>document.getElementById("info").innerHTML="Hatalı kullanıcı adı veya şifre.";</script>
                    
    <%
                }
                else {
                    //session nesnesinde "kimlik" degiskeninde username'in degerini saklar.
                    session.setAttribute("kimlik", set.getString("username"));
                    //list.jsp sayfasina yonlendirir.
                    response.sendRedirect("list.jsp");
                }
            }catch(SQLException e){out.print("Hata meydana geldi! : "+e);}
            
        }
        
    %>
    
</body>
</html>
