<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
    
    SESSION(Oturum) Nesnesi:
        Sessin(oturum) web tarayicisinin acildigi andan kapatildigi ana
        kadar gecen suredir. Sunucu, her ziyaretçi için otomatikman oturum 
        başlatmaktadır. Oturum başlatılan her ziyaretçi için sunucu tarafından 
        oturum boyunca geçerli olacak SessionID üretilir. Session nesnesi JSP
        ile yazılım geliştirirken en çok kullanılan nesnelerden birisidir.
    
        Bir web sayfasından diğerine değişken aktarmak neredeyse imkânsızdır.
        Çünkü değişkenlerin ömrü sadece tanımlandıkları sayfayla sınırlı 
        olduğu unutulmamalıdır. Bu sorunu çözmenin en kolay yolu değişkenleri 
        session olarak saklamaktır. Session nesnesinin en önemli işlevi, 
        kullanıcı bilgilerine oturum aktif olduğu süre boyunca uygulama 
        içerisinde her yerden erişim sağlamaktır.
    
        Session değişkenlerini web tarayıcısıyla ilişkilendirmekle ziyaretçiyle
        ilişkilendirmek aynı şey değildir. Çünkü sunucu açısından bakıldığında,
        IP adresleri aynı olsa bile, her web tarayıcısı ayrı bir oturum olarak
        kabul edilmektedir. 
    
    En çok kullanılan metodları şunlardır;
    ============================================================================   
        getMaxInactiveInterval() : Her ziyaretçi için sunucu üzerinde açılan 
        ideal pasif kalma süresi 1800 saniye (30 dk) ‘dır. Ancak ziyaretçi 
        sitede 1 dk kalsa bile geri kalan 29 dk boyunca bu oturumun sunucuda 
        yer işgal etmeye devam edeceği unutulmamalıdır.
        
        invalidate() : Oturumu sonlandırmaya yarar. Bu metot çağrıldıktan sonra 
        tekrar session nesnesine erişilmeye çalışılırsa hata alınır.
        
        setAttribute(String, object) : Bu metot session nesnesinde veri 
        saklamamızı sağlar. Veri Object tipinde olduğundan her tipte veri 
        saklayabilir.

        getAttribute(String name) : Parametre olarak aldığı değere bağlı bir 
        veri saklanıyorsa onu getirir. Eğer saklanan bir veri yoksa null döndürür.

        removeAttribute(String name) : Session nesnesinde saklanan bir veriyi 
        silmeyi sağlar. Parametre olarak veriye atanmış String tipindeki değer 
        verilmelidir.

        isNew() : Oturumun yeni olup olmadığını kontrol eder. True ya da false 
        döndürür. Aynı zamanda tarayıcının cookie(çerez) özelliğinin açık olup 
        olmadığını kontrol etmek için de kullanılır. Eğer cookie özelliği 
        kapalıysa isNew() metodu her zaman true dönecektir.

        getCreationTime() : Session nesnesinin ilk oluşturulduğu tarihi verir.

        getLastAccessedTime() : Oturumun açık olduğu süre boyunca uygulamaya 
        en son erişilen tarihi verir.
    
        Session oturumunu Kapatmak:
        <%@page language="java" session="false"%>
    
    -->

</body>
</html>
