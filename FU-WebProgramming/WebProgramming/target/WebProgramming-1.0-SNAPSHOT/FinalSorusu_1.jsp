<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form>
            <label for="isim">İsim: </label>
            <input type="text" name="isim"><br><br>


            <label>Cinsiyet:  </label>       
            <input type="checkbox" name="cinsiyet">
            <label>Erkek</label>
            <input type="checkbox" name="kadin">
            <label>Kadın </label><br><br>

            <label for="anlam">Anlamı: </label>
            <input type="text" name="anlam"><br><br>

            <label for="koken">Kökeni: </label>
            <select>
                <option>Türkçe</option>
                <option>Arapça</option>
            </select><br><br>

            <input type="checkbox" name="kabul">
            <label for="kabul">Anlamın doğru olduğunu kabul ediyorum.</label><br><br>

            <input type="submit" value="Gonder">
        </form>
        
    </body>
</html>
