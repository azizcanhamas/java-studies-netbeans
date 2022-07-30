<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!-- 
    OUT Nesnesi 
        Ekrana veri basmak icin kullanilir. Baslica metotlari sunlardir;
        
        1- out.print() & out.println(); 
            Parametre olarak gonderilen veriyi ekrana basar.
    
        NOT: Diger metotlara gecmeden once Buffer'in tanimini yapalim.
        Buffer'in kelime anlami tampon'dur. JSP sayfalarinda ekrana 
        basilan veriyi sinirlar. Varsayilan olarak 8 KB'dir.
        Yine varsayilan olarak 8KB yetmediginde otomatik olarak buffer temizlenir.
        Buna da flush denir.
    
        2- clear(); 
            Ekrana o ana kadar ne yazdirilmissa temizler. Yani buffer'i sifirlar.

        3- clearBuffer();
            clear() metoduyla ayni islevi gorur. Bu metodun farki eger onceden
            flush() metodu cagrildiysa exception firlatir.
    
        4- flush();
            Buffer'i tazeler. Sinirin asilmasini saglar. Eger flush() metodu
            cagrilmaz ve sinir asilirsa Buffer tasma hatasi firlatir.
    
        5- getBufferSize();
            Varsayilan buffer degerini doner.
    
        6- getRemaining();
            Buffer'da ne kadar bos alan kaldigini anlamamizi saglar.
    
        7- isAutoFlush();
            Buffer doldugunda otomatik olarak arttirilip arttirilmayacagini
            "true" ya da "false" olarak tutar. Varsayilan olarak "true"'dir.
    -->
    
    <%  //  ORNEK-1: out.print() & out.println() Kullanimi:
        out.print("Aziz");
        out.println("Can"); //Yazmadan once bir karakter bosluk yazar.
        out.print("Hamasoglu"+"<br>"); //<br> etiketi ile alt satira iner.
        out.print("Java JSP Out Nesnesi");
    %>
    
    <%  // ORNEK-2: clear() Metodunun Kullanimi:
        out.print("BILGISAYAR");
        out.print("MUHENDISLIGI");
        out.println("YAZILIM");
        out.clear(); //print() edilen metinler gozukmeyecektir.
    %>
    
    <%  // ORNEK-3: clearBuffer() Metodunun Kullanimi:
        out.print("ANKARA");
        out.print("ELAZIG");
        out.print("HATAY");
//        out.flush(); //Bu metot clearBuffer'dan once calisirsa clearBuffer
                       //exception firlatir.(gozlemlenemedi?)
        try{
            out.clearBuffer();//print() edilen metinler gozukmeyecektir.
    
        }catch(Exception e){
            out.print(e);
        }       
    %>
    
    <% //ORNEK-4: getBufferSize() Metodunun Kullanilmasi
        out.print(out.getBufferSize()); //Mevcut buffer genisligini ekrana yazdirir.
    %>
    
    <% //ORNEK-5: getRemaining() Metodunun Kullanilmasi
        out.print("<hr>");
        out.print(out.getRemaining()+"<br>");
        for (int i = 0; i < 10000; i++) {
                out.print("i: "+i+"   Guncel Buffer Boyutu: "+out.getRemaining()+"<br>");
                if (out.getRemaining()==1) {
                        out.print("================ Buffer doldu!<br>");
                }
            }
        out.print(out.getRemaining()); //Ekrana birseyler yazdirdikca buffer'in dustugu gozlemlenebilir.
    %>
    
    <%
    //ORNEK-6: flush() Metodunun Kullanilmasi
        out.print("<hr>");
        for (int i = 0; i < 10000; i++) {
                out.print("i: "+i+"   Guncel Buffer Boyutu: "+out.getRemaining()+"<br>");
                if (out.getRemaining()<4200) {
                        out.print("================ Buffer 4200 altinda! Bosaltiliyor!<br>");
                        out.flush(); //Bu cagri sonrasinda buffer boyutu sifirlanir.
                }
            }
        out.print(out.getRemaining()); //Ekrana birseyler yazdirdikca buffer'in dustugu gozlemlenebilir.
    %>

</body>
</html>
