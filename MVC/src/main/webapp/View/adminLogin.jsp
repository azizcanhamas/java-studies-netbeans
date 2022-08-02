<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<style>
    td{
        padding: 5px;
    }
</style>

<body>
    <form action="../Controller/adminController.jsp" method="get" style="margin-left: 40%; margin-top:15%;">
        <table border="2">
            <tr>
                <td style="font-weight: bold; text-align: center;" colspan="8">Yönetici Giriş Paneli</td>
            </tr>
            <tr>
                <td>Kullanıcı Adı</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>Parola</td>
                <td><input type="text" name="password"/></td>
            </tr>
            <tr>
                <td colspan="8"><input type="submit" style="width: 100%;" value="Giriş yap"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
