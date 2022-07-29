<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!-- 
        Kullaniciya gosterilecek olan sayfa budur.
        ParamTag_1.jsp sayfasi asagidaki yapiyi kendi verdigi degerlerle
        set edecektir.
    -->
    ${param.firstname}<br>
    ${param.lastname}<br>
    ${param.placeofbirth}
        
</body>
</html>
