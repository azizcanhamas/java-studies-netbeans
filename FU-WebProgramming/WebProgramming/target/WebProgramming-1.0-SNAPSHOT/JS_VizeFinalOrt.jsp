<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            table,tr,td,th{
                border:1px solid black;
                padding:10px;
            }
        </style>
        
        <script>
            function hesapla(){
                var isim=document.getElementById("isim").value;
                var vize=document.getElementById("vize").value;
                var final=document.getElementById("final").value;

                var isim_td=document.getElementById("isim_td");
                var vize_td=document.getElementById("vize_td");
                var final_td=document.getElementById("final_td");
                var ort_td=document.getElementById("ort_td");


                var ort=parseFloat(vize)*0.4+parseFloat(final)*0.6;

                isim_td.innerHTML=isim;
                vize_td.innerHTML=vize;
                final_td.innerHTML=final;
                ort_td.innerHTML=ort;
                
            }
            
        </script>
        
        
    </head>
    <body>

        <form>
            <label for="isim">İsim: </label>
            <input type="text" name="isim" id="isim"><br><br>
            <label for="vize">Vize: </label>
            <input type="text" name="vize" id="vize"><br><br>
            <label for="final">Final: </label>
            <input type="text" name="final" id="final"><br><br>
            <input type="button" value="Hesapla" onclick="hesapla()">
            <input type="reset" value="Temizle">
        </form>
        
        <p></p>
        
        <table>
            <tr>
                <th>İsim</th>
                <th>Vize</th>
                <th>Final</th>
                <th>Ortalama</th>
            </tr>
            <tr>
                <td id="isim_td">Hesaplanmadı</td>
                <td id="vize_td">Hesaplanmadı</td>
                <td id="final_td">Hesaplanmadı</td>
                <td id="ort_td">Hesaplanmadı</td>
            </tr>
        </table>

    </body>
</html>
