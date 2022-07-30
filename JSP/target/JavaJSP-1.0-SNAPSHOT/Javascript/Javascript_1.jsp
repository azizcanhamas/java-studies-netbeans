<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>

<style>
    
    /*uyelik_formu id'sine sahip elemani sec.*/
    #uyelik_formu{
        /*tum kenarlarindan 25px bosluk birak.*/
        padding:25px;
        /*kapladigi alanin genisligini 350px olarak sinirla.*/
        width: 350px;
        /*sola yasla*/
        float:left;
        /*siyah 1px kalinliginda duz kenarlik ekle*/
        border: 1px solid black;
    }
    /*label elemanlarini sec.*/
    label{
        /*sola yasla*/
        float: left;
        /*hepsinin kapladigi alanin genislik degerini 150px yap.*/
        width:150px;
    }
</style>


<body>

    <div align="center">
        <div id="uyelik_formu">
            <!--GET yontemiyle form bilgilerini Javascript_2.jsp sayfasina gonder.-->
            <form method="get" action="Javascript_2.jsp">
                <label for="ad">Ad</label>
                <!--Tusa basilirsa basma islemi bittikten sonra form_kontrol() scriptini cagir. -->
                <input type="text" id="ad" name="ad" onkeyup="form_kontrol()">              
                <br><br>            <!--İki adet bos satir ac-->
                <label for="soyad">Soyad</label>
                <!--Tusa basilirsa basma islemi bittikten sonra form_kontrol() scriptini cagir. -->
                <input type="text" id="soyad" name="soyad" onkeyup="form_kontrol()">          
                <br><br> 
                <!--Bir degisiklik olursa form_kontrol() scriptini cagir. -->
                <input type="checkbox" id="kosullar" name="kosullar" onchange="form_kontrol()">
                Kullanım koşullarını kabul ediyorum.
                <br><br>
                <!-- gonder adinda buton tanimla.-->
                <input type="submit" id="gonder" name="gonder" value="Gönder"></input>
            </form>
        </div>
    </div>    

</body>

<script>
    //Bu fonksiyon ad,soyad kutucuklarinin boş bir şekilde ve kullanım sözleşmesi
    //seçili değil haliyle bilgilerin gönderilmemesini sağlar.
    //Bu fonksiyon ad ve soyad kutucuklarında bir tuşa basma basma işlemi bittikten sonra
    //ve kullanıcı sözleşmesi checkbox'inda bir değişiklik olmasi halinde çalışır.
    //Checkbox'da bir değişiklik olursa ve bu değişiklik sonrası kutucuk seçili değilse
    //"Gönder" butonu pasif yapilir. Ad,soyad kutucuklarinda tuş basma işlemi bittiğinde
    //kutucuktaki karakter sayisi 0 ise "Gönder" butonu pasif yapilir.
    function form_kontrol()
    {
        if(document.getElementById("ad").value.length == 0)
            //gonder id'li butonu pasif yap.
            document.getElementById("gonder").disabled = true;
          
        //soyad id'li textbox icindeki degerin uzunlugu sifir ise gonder id'li butonu pasif yap.
        else if(document.getElementById("soyad").value.length == 0)
            document.getElementById("gonder").disabled = true;

        //checkbox secili degilse gonder id'li butonu pasif yap
        else if(document.getElementById("kosullar").checked == false)
            document.getElementById("gonder").disabled = true;

        else
            //gonder id'li butonu aktif yap.
            document.getElementById("gonder").disabled = false;     
    }
</script>

</html>