<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <!--
        Bu sayfa cagrildigi zaman kullanici ForwardTag_2.jsp sayfasina yonderilicektir.
        ForwardTag_2.jsp sayfasindaki ilgili parametreler asagidaki value degerleriyle
        set edilecektir.
    -->
    <jsp:forward page="ForwardTag_2.jsp">
        <jsp:param name="firstname" value="Aziz Can"/>
        <jsp:param name="lastname" value="Hamasoglu"/>
        <jsp:param name="placeofbirth" value="Turkey"/>
    </jsp:forward>
</body>
</html>
