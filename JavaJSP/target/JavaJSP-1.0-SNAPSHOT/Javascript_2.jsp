<%-- 
    Document   : Javascript_2
    Created on : 29.Tem.2022, 10:55:31
    Author     : azuwin_user
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>

    <body onload="yeni()">
        <div id="form_id">  
            
            <%
                //Javascript_1.jsp sayfasindan GET yontemiyle gelen bilgilerden
                //ad ve soyad bilgilerini ayikla, String degiskenlere al.
                String ad=request.getParameter("ad");
                String soyad=request.getParameter("soyad");
            %>
            
            <script>
                //JSP ile service icinde sakli olan ad,soyad degiskenlerini kullanarak bir string olustur.
                //Bu string degerini Javascript'in alert metoduyla istenilen formatta kullaniciya goster.
                alert("Merhaba "+"<%out.print(ad+" "+soyad);%>"+"!");
            </script>
            
            <input type="text" id="sayi"/>
            <button id="tahmin" onclick="tahmin()">Tahmin</button>
            <button id="yeniOyun" onclick="yeni()">Yeni Oyun</button>
            <p id="sonuc"></p>
        </div>
    
    </body>
    
    <script>
            var hakSayisi=0;
            //0..100 arasinda random bir sayi uretilip burada saklanacak.
            var rastgeleSayi=0;
            //HTML'de bulunan nesneleri oku.
            var tahminButton=document.getElementById("tahmin");
            var yeniOyunButton=document.getElementById("yeniOyun");
            var sonucP=document.getElementById("sonuc");
            //Kullanicinin textbox'a girdigi sayiyi al.
            var tahminSayi=document.getElementById("sayi");

            function yeni(){     
                //Oyun baslangicinda yeniOyun butonunu pasif, tahmin butonunu aktif yap.
                yeniOyunButton.disabled=true;
                tahminButton.disabled=false;
                //10 hakki olsun.
                hakSayisi=10;
                //Oyun basladi. Ilk random sayiyi tanimla.
                rastgeleSayi=Math.floor(Math.random()*101);
                //Kullaniciya oyunun basladigini ve kac hakki oldugunu soyle.
                document.getElementById("sonuc").innerHTML="Sayı tuttum! Tahmin et... Kalan hakkın: "+hakSayisi;
            }

            //tahmin butonuna her basildiginda tetiklenecek olay.
            function tahmin(){
                if(hakSayisi==0){
                    document.getElementById("sonuc").innerHTML="Hakkiniz kalmadi! "+rastgeleSayi+" sayisini bilemediniz!";
                    tahminButton.disabled=true;
                    yeniOyunButton.disabled=false;
                    return;
                }
                else{               
                    if (parseInt(document.getElementById("sayi").value)==rastgeleSayi) {
                        document.getElementById("sonuc").innerHTML=rastgeleSayi+" sayisini "+hakSayisi+" hak kala bildin!";
                        tahminButton.disabled=true;
                        yeniOyunButton.disabled=false;
                    }
                    else if (parseInt(document.getElementById("sayi").value)>rastgeleSayi) {
                        document.getElementById("sonuc").innerHTML="Tahmininizi küçültün! Kalan hak: "+hakSayisi;
                    }
                    else{
                        document.getElementById("sonuc").innerHTML="Tahmininizi büyültün! Kalan hak: "+hakSayisi;
                    }
                }
                hakSayisi-=1;
            }
    </script>

</html>