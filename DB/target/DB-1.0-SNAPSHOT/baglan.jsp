<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    
    <!--
        JDBC(Java Database Connectivity): JDBC ile herhangi bir veritabanina
        baglanarak SQL komutlari ile verilere erisebildigimiz bir yapidir.
        JDBC programdan bagimsiz bir sekilde yazilarak farkli programlarda
        kullanilabilir. Veritabanina baglanmak icin asagidaki adimlar takip edilir;
    
        * Veritabani kutuphanesi eklenir.
            ==> import java.sql.*;
        * Baglanti icin gerekli JDBC suruculeri WEB-INF/lib klasorune eklenir.
            ==> Class.forName("com.mysql.jdbc.Driver");
        * Veritabani yolu olarak MYSQL'in kullandigi port numarasi 3306
        varsayilan olarak gelir.
            ==> String url="jdbc:mysql://localhost:3306/veritabani_adi";
        * Veritabanina baglanilir.
            ===> Connection con=DriverManager.getConnection(url,"username","password");
        * Statement/PreparedStatement sorgulari olusturulur.
        * ResultSet nesnesi ile veritabanindan gelen veriler saklanir.
        * Son olarak olusturulan baglanti/statement/resultset nesneleri kapatilir.
    -->
    
    <!--
        JDBC Driver'in projeye dahil edilmesi:
            * Web Pages -> WEB-INF -> lib klasorunun altina mysql-connector-java.jar
            dosyası eklenmelidir. Eger WEB-INF ve lib klasorleri yoksa manuel olarak
            olusturulabilir. .jar dosyasi google(mysql connector jar) -> dev.mysql
            sitesinden "Platform Independent" ozelligi ile indirilebilir. 
            Belirtilen dosya yoluna sadece .jar dosyasının atılması yeterlidir.           
    -->
    
    <!-- ORNEK : MYSQL Veritabanina baglanmak -->   
    <%@page import="java.sql.Connection"%>
    <%@page import="java.sql.DriverManager"%>
    <%@page import="java.sql.ResultSet" %>
    <%@page import="java.sql.SQLException"%>
    <%@page import="java.sql.Statement"%>    
    <% 
        Connection con=null;
        Statement s=null;
        try{
            //Driver'i cagir.
            Class.forName("com.mysql.jdbc.Driver");
            //localhost sunucunda okul isimli veritabanina baglan.
            //MYSQL default username=root password= .
            con=DriverManager.getConnection("jdbc:mysql://localhost/okul"+"?user=root&password=");
            //Eger baglanti null degilse
            if (con!=null) out.println("Connection successful!");
            //Eger baglanti null ise baglanilamamistir.
            else out.println("Error: Connection unsuccessfull!");
        }catch(SQLException e){
            out.println(e);
        }
    %>
    
    <!--       
        Statement Nesnesi: Temel SQL ifadelerini calistirir. Bu temel ifadelerden
        en onemlileri SELECT,INSERT,UPDATE,DELETE gibi ifadelerdir. Statement
        nesnesi sayesinde SQL ifadelerinin bizlere değer döndürme özelliği bulunur.
        Statement nesnemizin içine SQL ifadesi yazdiktan sonra bu ifadeyi
        executeUpdate() metodu ile gonderecegiz.   
    -->   
    <% //Statement Kullanimi
        Statement state;
        String sorgu="INSERT INTO ogrenci(id,ad,soyad) VALUES (1,'Emine','Kahraman')";
        state=con.createStatement();
        state.executeUpdate(sorgu);
        state.close();
        con.close();
        
    %>
    
    <!--  
        PraperedStatement Nesnesi: Statement nesnesinde programımız üzerinde
        ifade derlenip veritabanımız sadece sorgulama işlemini gerçekleştirmektedir.
        PreparedStatement ise verileri onceden derlenmis olan preparedstatement
        verilerimizi tekrar tekrar gondererek islemleri daha rahat yapmamiz mumkun
        olmaktadir. PreparedStatement nesnesine ifadeler parametre ile yollanirken
        tablomuzdaki veri tipi ile uyum saglamasi acisindan setInt,setString veya
        setDouble gibi veri tipleri kullanılmalıdır. Onceden derlenmis bu verilere
        bu yontemle erismek hız ve dusuk kaynak bakımından daha avatanjlıdır.
    -->   
    <% //PreparedStatement Kullanimi
        sorgu="INSERT INTO ogrenci(id,ad,soyad) VALUES (?,?,?)";
        PreparedStatement ps=con.prepareStatement(sorgu);
        //sorgudaki soru isaretlerinin yerlerine sirasiyla yerlestirecektri.
        ps.setInt(1,1);
        ps.setString(2,"Ali");
        ps.setString(3,"Can");
        ps.executeUpdate();
        ps.close();
        con.close();
    %>
  
    <!--
        ResultSet: Statements nesnelerini kullanarak SQL sorgusunu calistirdiktan
        sonra veritabanindan alinan verileri tutmak icin bu nesneler kullanilir.
    -->
    <% //ResultSet Kullanimi
        state=con.createStatement(); //State
        ResultSet res=state.executeQuery("SELECT * FROM ogrenci");
        //tum verileri yazdir.
        while(res.next()){
            out.print(res.getInt("id"));
            out.print(res.getString("ad"));
            out.print(res.getString("soyad"));
        }
        state.close();
        res.close();
        con.close();
    %>
    
    <!--
        Transaction Kavrami: Transaction, en küçük işlem yığınıdır. 
        Transaction, bütünlük, tutarlılık, bağımsızlık ve dayanıklılık özelliği sağlar.
        Bir grup işlemin arka arkaya yapılırken işlemlerden bir tanesi bile 
        başarısız olsa bu grupta yapılan tüm işlemler geri alınır(rollback),  
        bu grupta yer alan tüm işlemler başarı ile gerçekleşmesi (commit) gerekmektedir.
        Tüm işlemler başarılı ise transaction içindeki tüm veri değişiklikleri sisteme yansır.
        Ya hep, ya hiç mantığı vardır. Transaction özellikle bankacılık işlemlerinde sıkça kullanılır.
        Örneğin bir öğrenci ev sahibinin hesabına 600 TL kira ödeyecektir. 
        Öğrenci para yatırma işlemini onayladığında önce 600 TL bakiyesinden düşürülür 
        daha sonra ev sahibinin hesabına yatırılır. Eğer bu işlemler gerçekleşirken 
        herhangi bir nedenden dolayı kira yatırılmasaydı ev sahibinin hesabına
        para yatmaz ve öğrencinin hesabından bakiye düşmez. İşte bu gibi kritik 
        işlemlerde yani bir bütünlük olması gereken işlemlerde Transaction kullanılır.
    
        setAutoCommit():
            * JDBC'nin veritabani baglantisini otomatik olarak ya da bizim
            istedigimiz durumlarda baglanmasini saglamak icin kullaniriz.
                conn.setAutoCommit(false); //Otomatik baglanti kapatilir.
                conn.setAutoCommit(true);  //Otomatik baglanti acilir.
    
        commit(): İslemlerin toplu sekilde veritabanina yansitilmasini saglar.
            conn.commit();
    
        rollBack(): commit sirasinda herhangi bir hata meydana gelirse
        tum islemleri sirasi ile geri alarak, islemin yarisinda olusan
        sorunlardan etkilenmemeyi saglar.
            conn.rollBack();
    -->    
    <% //Ornek bir transaction yapisi
    try{
        con.setAutoCommit(false);
        con.commit();
    }catch(SQLException e){
        try{
            //hata meydana geldi. islemleri geri al.
            con.rollback();
            System.out.println("Rollback!");
        }catch(SQLException e1){
            System.out.println(e);
        }
    }   
    %>
    
    
</body>
</html>
