<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--center etiketi ile her seyi ortala, kalin ve 40px yap.-->
    <center style="font-weight:bold; font-size:40px;">
        
            <%
                int sayfaInt=0;
                //"sayfa" isimli parametreyi String degiskene al.
                String sayfaStr=request.getParameter("sayfa");
                //Eger oyle bir parametre yoksa.
                if (sayfaStr==null) {
                    //20. sayfada oldugunu kabul et.
                    sayfaInt=20;%>
                    <%=sayfaInt%><br>
                    <!--Sola basinca 19. sayfaya saga basinca 21. sayfaya git.-->
                    <a href="index.jsp?sayfa=<%=sayfaInt-1%>"><<<<</a>
                    ----|----
                    <a href="index.jsp?sayfa=<%=sayfaInt+1%>">>>>></a>
               <% }
                //Eger 1. sayfaya ulastiysan daha da geriye gitme.
                else if(sayfaStr.equals("1")){
                    sayfaInt=Integer.parseInt(sayfaStr);
                %>
                    <%=sayfaInt%><br>
                    <a href="index.jsp?sayfa=<%=sayfaInt%>"><<<<</a>
                    ----|----
                    <a href="index.jsp?sayfa=<%=sayfaInt+1%>">>>>></a>
                <%
                }
                //Null veya 1 degilsen problem yok, iki yone de gidilebilir.
                else{
                    sayfaInt=Integer.parseInt(sayfaStr);
                %>  <%=sayfaInt%><br>
                    <a href="index.jsp?sayfa=<%=sayfaInt-1%>"><<<<</a>
                    ----|----
                    <a href="index.jsp?sayfa=<%=sayfaInt+1%>">>>>></a>
            <%    }    
            
            %>
  
    </center>
    
</body>
</html>
