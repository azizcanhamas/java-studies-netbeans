<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!--
        PAGE Etiketi: Sayfaya özgü nitelikleri tanimlar. Belli parametreler alir.
        Bunlar;
            language   : JSP'de kullanilan programlama dilini belirler.
            Varsayilan degeri Java'dir.
    
            contentType: Sayfanin turunu belirler. 
    
            import     : Cesitli paketleri ve bu paketler altindaki
            java classlarini dahil etmemizi saglar.
    -->
    
    <!--Örnek kullanimlar:-->
    <%@page language="java" %>
    <%--<%@page contentType="text/html"%>--%>
    <%@page import="java.util.Date"%>
    
    
    <!-- contentType ILE KAPSAMLI ORNEK-->
    <%@ page contentType="text/html; charset=UTF-8" %>
    <%--<%@page contentType="application/msword"%>--%>
    <%--<%@page contentType="application/vnd.ms-excel"%>--%>
    
    <!--Table etiket bir tablo tanimlar. border kenarlik kalinligini belirtir.-->
    <table border="2">
        <!--tr etiketi satir tanimlar.-->
        <tr>
            <!-- td etiketi satir icerisine bir hucre tanimlar. Yani sütun. -->
            <!--b etiketi kalin yazar.-->
            <td><b>Bölüm</b></td>
            <td><b>Program</b></td>
            <td><b>Öğrenci Sayısı</b></td>
        </tr>
        
        <tr>
            <td>Bilgisayar Teknolojileri</td>
            <td>Bilgisayar Programcılığı</td>
            <td>300</td>
        </tr>
        
        <tr>
            <td>Yönetim ve Organizayon</td>
            <td>Lojistik</td>
            <td>200</td>
        </tr>
        
    </table>
    
</body>
</html>
