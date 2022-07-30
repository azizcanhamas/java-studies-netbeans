<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!-- 
    PARAM Etiketi : Bu etiketle <.jsp:include>,<.jsp:forward> etiketlerine
    parametre verilebilir. Bu şekilde yonlendirilen ya da dahil edilen
    JSP sayfalari bu parametrelere ulasabilir.
    -->
    
    <!-- 
    ParamTag_2.jsp sayfasini dahil ediyoruz. Kendi parametre degerlerimizi
    atiyoruz.
    -->
    <jsp:include page="ParamTag_2.jsp">
        <jsp:param name="firstname" value="Aziz Can"/>
        <jsp:param name="lastname" value="Hamasoglu"/>
        <jsp:param name="placeofbirth" value="Turkey"/>
    </jsp:include>
    
</body>
</html>
