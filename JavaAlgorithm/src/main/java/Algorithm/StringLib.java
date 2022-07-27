package Algorithm;

import java.util.Arrays;

public class StringLib {
    public static void main(String[] args) {
        //Stringin karakter uzunlugunu verir.
        System.out.println("aziz_can".length());
        //Stringin tum harflerini kucuk karaktere donusturur.
        System.out.println("AzIZCAN".toLowerCase());
        //Stringin tum karakterlerini buyuk karaktere donusturur.
        System.out.println("aziz".toUpperCase());
        //Stringin basindaki ve sonundaki tab ve bosluk karakterlerini siler.
        System.out.println("      aziz     ".trim());
        //String ifadeleri birlestirir.
        System.out.println("aziz ".concat("can"));
        //Stringin belirtilen indexdeki karakterini dondurur.
        System.out.println("aziz".charAt(1));
        //Stringin belirtilen index araligindaki kismini dondurur.
        System.out.println("aziz can".substring(1, 4));
        //Stringte bulunan belirtilen karakterleri yenisiyle degistirir.
        System.out.println("aziz".replace("z", "x"));
        //Stringin belirtilen karakterleri baz alarak parcalar.
        System.out.println(Arrays.toString("aziz can hamas".split(" ")));
        //Stringin belirtilen karakter betigi ile baslayip baslamadigini kontrol eder.
        System.out.println("aziz".startsWith("az"));
        //Stringin belirtilen karakter betigi ile bitip bitmedigini kontrol eder.
        System.out.println("aziz".endsWith("iz"));
        //String kiyaslamasi yapar. equalsIgnoreCase buyuk kucuk olma durumunu ihmal eder.
        System.out.println("aziz".equals("aziz"));
        //Belirtilen karakterin string icerisinde ilk nerede oldugunu soldan baslayarak bulur.
        System.out.println("aziz".indexOf("i"));
        //Belirtilen karakterin string icerisinde ilk nerede oldugunu sagdan baslayarak bulur.
        System.out.println("aziz".lastIndexOf("i"));
        //Ikı string ifadeyi alfabetik olarak karsilastirir.
//            Ilkı digerinden kucukse negatif sira farki doner.
//            Ilkı digerinden buyukse pozitif sira farki doner.
//            Esitse 0 sira farki doner.
        System.out.println("aziz".compareTo("can"));
        //Belirtilen ifadenin string icerisinde olup olmadigini kontrol eder.
        System.out.println("aziz".contains("zi"));
        //Stringin Null olma durumunu kontrol eder.
        System.out.println("".isEmpty());

    }
}
