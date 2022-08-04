JSP nedir?
* JSP, Web sayfalarında Java dilini kullanarak dinamik siteler yapilmasini sağlar.
JSP, HTML kodlarının arasına <% %> etiketleri içinde yazılır.

JSP nerede çalışır?
* Bir JSP Java uygulaması Web sunucusunda değil, uygulama sunucusunda çalışır.
Bu uygulama sunucusuna örnek olarak Apache Tomcat verilebilir.

JSP yaşam döngüsü nedir?
* JSP yaşam döngüsü üç kısımdan oluşur. Bunlar jspInit(), _jspService(), jspDestroy()'dur.
1.	jspInit(), başlangıçta çalıştırılması gereken komutları barındırır. Yalnızca bir kez çalışır.
2.	_jspService(), kullanıcıdan bir istek geldiğinde bu isteğin cevaplanması gereksinimi anında çalışır.İşlem tamamlanıncaya kadar buradan çıkılmaz.
3.	jspDestroy(), program kapanmadan önce yapılması gereken işlemlerin barındırıldığı kısımdır. Bir kez çalışır.

JSP yaşam döngüsünde server nasıl davranır?
* Bir JSP sayfasına istek geldiğinde sunucu bu JSP sayfasının derlenip derlenmediğine bakar.
Derlenmemiş dosyaları derleyerek .java ve .class uzantılı dosyaların oluşmasını sağlar.
* Eğer JSP sayfasının kodları değiştirilip tekrar çalıştırılırsa Server bu sayfanın
daha önce derlenmediğini düşünür ve tekrar derler.
* Server, jspDestroy() metodunu bellek sıkıntısı oldugunu düşündüğünde veya uzun süre request olmadığında 
çalıştırır.

JSP Kodlama (Scripting) Etiketleri
* JSP kodlaması taglar arasında olmaktadır. Her tag'in belirli bir işlevi bulunmaktadır.
* JSP'de yorum satırı <%-- --> etiketleri ile yapılır.

Netbeans üzerinde bir JSP projesi nasıl oluşturulur?
New Project -> Java with Maven -> Web Application -> Proje ismi verilir.” -> 
“Apache Tomcat internetten indirilir ve klasör yolu verilir.” -> “username=tomcat” “password=tomcat” olarak kurulum tamamlanır.
Bu şekilde Apache Tomcat, Netbeans’in içine kurulmuş olur. Tekrar klasör çağırmayı gerektirmez. Proje oluşturulduktan sonra “Web Pages” sağ tıklanır,
New -> JSP ile JSP dosyası eklenir.

