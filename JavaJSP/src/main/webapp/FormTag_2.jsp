<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <%--
        FormTag1.jsp sayfasinda kullanicidan alinan bilgileri bu sayfada
        alip, Java JSP araciligiyla isleyecegiz.
    --%>
    
    <%
        // Input text kisminda alinan degerin degisken adini 
        // yani name degerini "ay" olarak tanimlamistik.
        // Bu yuzden paramtre cagirirken "ay" degeriyle cagiriyoruz.
        String gelenBilgi=request.getParameter("ay");
        String ayAd="";
        switch (gelenBilgi) {
                case "1":ayAd="Ocak";break;
                case "2":ayAd="Subat";break;
                case "3":ayAd="Mart";break;
                case "4":ayAd="Nisan";break;
                case "5":ayAd="Mayis";break;
                case "6":ayAd="Haziran";break;
                case "7":ayAd="Temmuz";break;
                case "8":ayAd="Agustos";break;
                case "9":ayAd="Eylul";break;
                case "10":ayAd="Ekim";break;
                case "11":ayAd="Kasim";break;
                case "12":ayAd="Aralik";break;
                default:ayAd="Gecersiz";
            }
        out.println(gelenBilgi+". Ay : "+ayAd);
    %>
    
    <hr>
    
    <%
        //Kullaniciya gosterme acisinda kisa yol
        String[]aylar={"Ocak","Subat","Mart","Nisan","Mayis","Haziran",
                        "Temmuz","Agustos","Eylul","Ekim","Kasim","Aralik"};
        out.println(gelenBilgi+". Ay_2 : "+aylar[Integer.parseInt(gelenBilgi)-1]);
    %>
    
</body>
</html>
