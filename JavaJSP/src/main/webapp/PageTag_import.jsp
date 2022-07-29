<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

 <!--
        ORNEK-3: Random kutuphanesinin dahil edilmesi 
        ve kullaniciya random resimlerin gosterilmesi
    -->
    <%@page import="java.util.Random"%>
    <%
        Random random=new Random();
        String[]sozcukler={"Baris","Hosgoru","Sevgi","Saygi","Guleryuz"};
        int sozIndis=random.nextInt(5);
        
        String[]resimler={"resim/1.jpg","resim/2.jpg","resim/3.jpg","resim/4.jpg","resim/5.jpg"};
        int resimIndis=random.nextInt(5);
        
        String[]renkler={"blue","red","yellow","green","black"};
        int renklerIndis=random.nextInt(5);

    %>


    <body bgcolor="<%=renkler[renklerIndis]%>">
    <%
        // KRITIK: if blogu icerisinde HTML ile alakali islemlerin yapilmasi
        if(renklerIndis==0){
    %>
    <center>
        <font color="white">
            Günün sözü: <%=sozcukler[sozIndis]%>
        </font>
    </center>
    <%    
        }
    %>  
    <p>
    <img src="<%=resimler[resimIndis]%>" width="200" height="200">
        

    
    <!--
        ORNEK-1: Page Etiketi "import" Parametresi Kullanimi:
    -->
    <!--Java'nin Date kutuphanesini dahil ettik.-->
    <%@page import="java.util.Date"%>
    <%
        Date d=new Date();
        out.println("Tarih: "+d+"<html><br></html>");
        out.println("Gun  : "+d.getDay()+"<html><br></html>");
        out.println("Ay   : "+d.getMonth()+"<html><br></html>");
        out.println("Yil  : "+d.getYear()+"<html><br></html>");
    %>
    
    <br><br>
    
    <!-- 
        ORNEK-2: ArrayList kutuphanesinin dahil edilmesi
    -->
    <%@page import="java.util.ArrayList"%>
    <%
        ArrayList<String> list=new ArrayList<String>();
        list.add("Bilgisayar Müh.");
        list.add("Makine Müh.");
        list.add("İnşaat Müh.");
        
        for (String s : list) {
            out.println(s);
        }
    %>
    <br><br>
    
    
   

    
</body>
</html>
