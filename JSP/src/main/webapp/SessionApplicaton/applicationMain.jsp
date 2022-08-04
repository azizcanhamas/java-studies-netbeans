<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>

    <!--
    
    APPLICATION (UYGULAMA) NESNESİ:
        Application, sunucu taraflı bir veri saklama yöntemidir. Bu nesne bir 
        anlamda sitenize giren her ziyaretçi için yeni bir program açılıyor gibi
        düşünülebilir. Application nesnesi, özellikle hit saymak için başvurulan
        bir durum yönetimidir.
        
        Session nesnesi ziyaretçi sunucuya bağlı kaldığı sürece bütün sayfalar 
        için geçerli iken, Application nesnesi ise uygulama açık kaldığı sürece 
        bütün ziyaretçiler için geçerli değişkenleri tanımlayan nesnedir.
        Dolayısıyla her oturumda değişmeyen ve bütün ziyaretçiler için geçerli 
        evrensel tanımlara veya değerlere ihtiyaç duyulduğunda Application 
        nesnesi kullanılmalıdır. Application nesnesinde tanımlanan bir değişkeni 
        ve değerini tüm ziyaretçiler görür. Bu değişkenlerin ömrü web sunucunun 
        çalışma süresi kadardır.
    
        void setAttribute(String name, Object object): Her yerden erişilebilecek
        bir değişken oluşturmaya yarar. Değişken Object tipinde olduğundan her 
        türde veri saklayabilir.
        <% application.setAttribute("web","mku"); %>

        Object getAttribute(String name): setAttribute() ile oluşturulan 
        değişkene erişebilir.
        <% application.getAttribute("web"); %>

        void removeAttribute(String name): setAttribute() ile oluşturulan 
        değişkenin sahip olduğu değeri siler. Değeri silinen bir değişkene 
        ulaşmaya çalışırsanız null dönecektir.
        <% application.removeAttribute("Site"); %>

        Enumeration getAttributeNames(): Eğer birden fazla değişken tanımladıysak 
        ve bu değişkenlerin isimlerine toplu ularak ulaşmak istiyorsak bu metodu
        kullanırız.
        <% Enumeration attributeNames = application.getAttributeNames(); %>
        <% Enumeration parameternames = application.getInitParameterNames(); %>

        String getRealPath(String value): Parametre olarak verilen değerin dizin yolunu verir.
        <%
        String path = application.getRealPath("/ApplicationObject.jsp");
        out.print(path);
        %>

        void log(String message): Parametre olarak verilen değeri, 
        hangi JSP sunucusu kullanılıyorsa onun varsayılan log dosyasına yazar.
        <% application.log("File not found"); %>

        String getServerInfo(): Kullanılan sunucunun ismini ve sürüm numarasını döndürür.
        <%
        String serverInfo = application.getServerInfo();
        out.print(serverInfo);
        %>
    
    -->

</body>
</html>
