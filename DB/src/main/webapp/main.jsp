<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
        VERİTABANI NEDİR?
            * Veritabanı birbiriyle ilişkisel verilerin bütünleşik olarak 
              tutulduğu alandır. Veritabanı aslında veri sorgulama sistemiyle
              donatılmış arşivden başka bir şey değildir.
    
    
        VERİTABANI KOMUTLARI: (TUM KOMUTLAR ORNEK DB UZERINDE CALISTIRILACAK!)
            * CREATE DATABASE dersler
                ===> dersler adında veritabanı oluşturur.
    
            * CREATE TABLE notlar(id INT PRIMARY KEY AUTO_INCREMENT,ad VARCHAR(50) NOT NULL,
                soyad VARCHAR(50) NOT NULL,dersad VARCHAR(50) NULL, vize INT NULL, final INT NULL)
                ===> notlar adında tablo oluşturur. Tablo sütunları sırasıyla
                    (id,ad,soyad,dersad,vize,final) dir. id sütunun PRIMARY KEY
                    (birincil anahtar) ozelligi vardir. id sütunu 1'den başlar.
                    id sutununun herhangi bir degerden baslamasi isteniyorsa
                    AUTO_INCREMENT=100 gibi bir deger verilebilir.
                    otomatik olarak veri eklendikçe birer birer artar.
                    ad sütununun NOT NULL ozelligi sutunun bos gecilememesini saglar.
                    vize sütuna verilen NULL degerinden dolayı sütun bos gecilebilir.
                    Otomatik olarak NULL degeri atanir.
    
            * INSERT INTO notlar (ad,soyad,dersad,vize,final) VALUES ('MURAT','TOKER','BBT',10,15)
                ===> ad,soyad,dersad,vize,final sutunlarina sirasiyla sagdaki degerleri ekler.
    
            * INSERT INTO notlar values ('ARZU','GULER','ALGO',25,85)
                ===> degerleri oldugu gibi sirasiyla tabloya ekler.
    
            * INSERT INTO notlar (ad,soyad,dersad) values ('Aziz','Can','MIKROISLEMCILER')
                ===> ad,soyad,dersad sutunlarina sagdaki verileri ekler.
                     vize,final null olarak kalir.
    
            * UPDATE notlar set final=60        
                ===> notlar tablosundaki final sütunundaki tum degerleri 60 yap.
    
            * UPDATE notlar SET final=60 WHERE final<50
                ===> notlar tablosunda final sütununda final degeri 50'den kucuk olan
                     60 yap.
    
            * DELETE FROM notlar
                ===> notlar tablosunun sadece icerigini siler,tabloyu silmez.
                     tablonun kendisini silmek "DROP TABLE" kullanılır.
    
            * DELETE FROM notlar WHERE dersad IS NULL
                ===> notlar tablosunda dersad degeri NULL olan kayitlari sil.
    
            * SELECT * FROM notlar
                ===> notlar tablosundaki tum kayitlari sec.
    
            * SELECT id,ad,soyad,dersad,vize,final FROM notlar
                ===> notlar tablosunda belirtilen sutunlari sec.
    
            * SELECT id as 'Ogrenci Numarasi', dersad as 'Dersin Adı', vize, final from NOTLAR
                ===> id,dersad,vize,final sutunlarini sec ancak id ve dersad sutunlarinin
                    gosterim adini belirtilen sekilde degistir.
    
            * SELECT id,ad,soyad FROM notlar WHERE dersad='JAVA'
                ===> dersad degeri "JAVA" olan kayitlarin id,ad,soyad sutunlarini sec.
    
            * SELECT * FROM notlar WHERE final=40 OR final=85
                ===> final degeri 40 ya da 85 olan kayitlarin tum sutunlarini sec.
    
            * SELECT * FROM notlar WHERE final IN(40,85)
                ===> notlar tablosunda final degeri 40 ve 85 olan tum kayitlari 
                     tum sutunlarla getir.
    
            * SELECT * FROM notlar WHERE dersad IN ('PHP', 'JAVA')
                ===> notlar tablosunda dersad degeri PHP ve JAVA olan tum kayitlari 
                     tum sutunlarla getir.
    
            * SELECT * FROM notlar WHERE vize>=60 AND vize<=80
                ===> notlar tablosunda vizesi 60'dan büyük eşit ve 80'den küçük eşit
                olan tüm kayıtları tüm sütunlarla getir.
    
            * SELECT * FROM notlar WHERE vize BETWEEN 60 AND 80
                 ===> notlar tablosunda vizesi 60 ve 80 arasında olan tum
                kayıtları tüm sütunlarla getir.
    
            * SELECT * FROM notlar WHERE vize IS NULL
                ===> notlar tablosunda vize degeri NULL olan tum kayitlari getir.
    
            * SELECT * FROM notlar WHERE dersad='JAVA' AND final IS NOT NULL
                ===> notlar tablosunda dersad degeri JAVA VE final not degeri
                    NULL olmayan kayiylari sec.
                    
            * SELECT id, ad as 'Adı', soyad as 'Soyadı', ISNULL(dersad,'') as 'Ders Adı',
                        ISNULL(vize,0) as 'Vize', ISNULL(final,0) as 'Final' FROM notlar
                ===> id sütununu sec, ad,soyad sütunlarını sec ancak 'Adı' ve 'Soyadı' olarak goster.
                    dersad sutunu sec ancak NULL deger varsa bu degeri'' ile degistir.
                    vize sutununu sec ancak NULL deger varsa bu degeri 0 ile degistir.
    
            * SELECT *FROM notlar WHERE ad LIKE 'A%'
                ===> ad degeri 'A' karakteri baslayan kayıtlari sec.
    
            * SELECT *FROM notlar WHERE ad LIKE '%A'
                ===> ad degeri 'A' karakteri ile biten kayıtlari sec.
    
            * SELECT *FROM notlar WHERE ad LIKE '%A%'
                ===> ad degerinin herhangi bir yerinde 'A' karakteri bulunan
                     kayıtlari sec.
    
            * SELECT * FROM notlar ORDER BY ad ASC
                ===> notlar tablosundaki tum kayıtlari sec ancak ad sutununu
                    baz alarak artan sirada sirala.
    
            * SELECT * FROM notlar ORDER BY ad, soyad DESC
                ===> ad sutununa gore sirali getirir ancak ayni ad degerine
                    sahip veri ile karsilasirsa bu sefer bu degerleri
                    soyad degerine gore siralar.
    
            * SELECT * FROM notlar WHERE dersad='JAVA' ORDER By id
                ===> dersad degeri JAVA olan kayıtlari sec id degerine gore sirala.
    
            * SELECT dersad as 'Verilen Dersler' FROM notlar
                ===> notlar tablosunda dersad sutununu sec Verilen Dersler
                    basligiyla goruntule.
    
            * SELECT DISTINCT dersad as 'Verilen Dersler' FROM notlar
                ===> notlar tablosunda dersad sutununu sec, 
                    'Verilen Dersler' adiyla yalnizca her dersad degerinden
                    bir tane olacak sekilde goruntule.
    
            * SELECT COUNT(id) as 'Toplam Öğrenci Sayısı' FROM notlar
                ===> id sutununda bulunan kayit sayisini verir. NULL degerler
                     sayilmaz.
    
            * SELECT COUNT(*) as 'Java Öğrenci Sayısı' FROM notlar Where dersad='JAVA'
                ===> notlar tablosunda dersad degeri "JAVA" olan kayitlarin sayisini verir.
    
            * SELECT COUNT(dersad) as 'Ders Sayısı' FROM notlar
                ===> notlar tablosunda dersad sutunundaki kayit sayisini verir.
                    Ders Sayısı olarak goruntuler.
    
            * SELECT COUNT(DISTINCT dersad) as 'Ders Sayısı' FROM notlar
                ===> notlar tablosunda dersad sutunundaki her degerden
                bir adet olacak sekilde kayit sayisini verir.
                Ders Sayısı olarak goruntuler.
    
            * SELECT MIN(vize) as 'En Düşük Vize Notu' FROM notlar
                ===> notlar tablosunda vize sutunundaki en dusuk degeri verir.
                    En Düşük Vize Notu olarak goruntuler.
    
            * SELECT MAX(final) as 'JAVA Final Notu' FROM notlar where dersad='JAVA'
                ===> notlar tablosunda dersad degeri JAVA olan kayitlardan
                    en yuksek final degerini bulur JAVA Final Notu olarak tanimlar.
    
            * SELECT SUM (final) as 'Java Final Toplamı' FROM notlar Where dersad='JAVA'
                ===> notlar tablsounda dersad degeri JAVA olan kayitlardan
                final degerlerini toplar, Java Final Toplamı olarak goruntuler.
    
            * SELECT AVG (final) as 'PYTHON Ortalama' FROM notlar Where dersad='PYTHON'
                 ===> notlar tablsounda dersad degeri PYTHON olan kayitlardan
                final degerlerinin ortalamasini alir, Python Ortalama olarak goruntuler.
    
            * Select id,ad,soyad,vize,final, vize*0.4+final*0.6 as 'Ortalama' from notlar
                ===> id,ad,soyad,vize,final sutunlarini secer,
                    gosterirken Ortalama isimli bir sutunda ortalamayi da gosterir.
    
            * SELECT dersad, count (*) as 'Öğrenci Sayısı' FROM notlar GROUP BY dersad
                ===> notlar tablosunda dersad sutunundaki ayni degere sahip degerleri
                    kumeler. Yan bir satirda her derse ait ogrenci sayisini belirtir.
    
            * SELECT dersad, AVG( vize ) as 'Vize Ortalaması' FROM notlar GROUP BY dersad
                ===> notlar tablosunda her dersi kendi icinde kumeler,
                     bu kumelerdeki vize notlarinin ortalamasini alir ve yan sutunda gosterir.
    
            * DROP DATABASE testdb
                ===> testdb veritabanını siler.
    
            * PRIMARY KEY olan id sutunun bastan numaralandirilmasi
                ===> SET @autoid:=1;
                ===> UPDATE notlar SET id=@autoid:=(@autoid+1);
                ===> ALTER TABLE notlar AUTO_INCREMENT=1;
    
            * INNER JOIN, LEFT JOIN, RIGHT JOIN
                ===>    personel tablosunu meslekler tablosu ile personsel tablosunun gorevKod ve meslekler
                        tablosunun meslekID tablolarini baz alarak birlestir.
                        ayni sekilde personel birimler tablosu personel tablosunun birimKod
                        ve birimler tablosunun birimID tablosunu baz alarak birlestir.
                        query="SELECT * FROM personel INNER JOIN meslekler ON personel.gorevKod=meslekler.meslekID "
                         + "INNER JOIN birimler ON personel.birimKod=birimler.birimID "
                        + "WHERE sicilNo="+sicilNo;

            * ALTER TABLE uyeler DROP COLUMN ilce
                ===> uyeler tablosu uzerinde degisiklik yap, ilce sutununu sil.
    -->
</body>
</html>
