
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="JSP_Ornek6_VIEW.jsp">
            <label for="ad">Ad: </label>
            <input type="text" name="ad">
            <label for="soyad">Soyad: </label>
            <input type="text" name="soyad"><br>
            <label for="bilmuh">Bil. Müh.: </label>
            <input type="checkbox" name="bilmuh"><br>
            <label for="intprog">İnt. Prog.: </label>
            <input type="checkbox" name="intprog"><br>
            <label for="bilmuhtasarim">Bil. Müh. Tasarim.: </label>
            <input type="checkbox" name="bilmuhtasarim"><br>
            <input type="submit">
            <input type="reset">
        </form>
        
    </body>
</html>
