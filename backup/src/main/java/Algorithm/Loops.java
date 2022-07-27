package Algorithm;

public class Loops {
    public static void main(String[] args) {
        //while dongusu ile 1'den 10'a kadar olan sayilari listeler.
//        int i=1;
//        while(i<10){
//            System.out.println(i);
//            i++;
//        }


        //do-while dongusu ile 1'den 10'a kadar olan sayilari listeler.
//        int i=0;
//        do {            
//            i++;
//            System.out.println(i);
//        } while (i<9);


        //for ile sonsuz dongu yapisi ile 1'den 10'a kadar olan sayilari listeler.
//        int i=0;
//        for(;;){
//            System.out.println(i);
//            i++;
//            if(i==10)break;
//        }


        //1 ile 10 arasindaki tek sayilari yazdiran program
//        for(int i=1;i<10;i++){
//            if(i%2==0)continue;
//            System.out.println(i);
//            
//        }


        //Klavyeden girilen n adet sayinin toplamini bulur.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("n: ");
//        int n=scan.nextInt();
//        int s,toplam=0;
//        for(int i=0;i<n;i++){
//            System.out.print((i+1)+". sayi: ");
//            s=scan.nextInt();
//            toplam+=s;
//        }
//        System.out.println("Toplam: "+toplam);


        // n sayisina kadar olan Fibonacci sayilarini 
        //gosteren program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("n: ");
//        int n=scan.nextInt();       
//        int tempTop=0;
//        int x=1,y=1;
//        System.out.println(x);
//        System.out.println(y);
//        for(;tempTop<=n;){
//            tempTop=x+y;
//            System.out.println(tempTop);
//            x=y;
//            y=tempTop;
//        }


        // 10x10 boyutunda dik üçgen görünümlü ekran çıktısı verir.
//        for(int i=1;i<=10;i++){
//            for(int x=0;x<i;x++){
//                System.out.print("* ");
//            }
//            for(int x=0;x<10-i;x++){
//                System.out.print("  ");
//            }
//            System.out.println("");
//        }
        

        // 10x10 boyutunda ters dik üçgen görünümlü ekran çıktısı verir.
//        for(int i=1;i<=10;i++){
//            for(int x=0;x<10-i;x++){
//                System.out.print("* ");
//            }
//            for(int x=0;x<i;x++){
//                System.out.print("  ");
//            }
//            System.out.println("");
//        }


        //Program random urettigi sayilarda 10'u bulana kadar devam eder.
//        Random r=new Random();
//        int uret=0,tekrar=0;
//        while(uret!=10){
//            tekrar++;
//            uret=r.nextInt(20);
//            System.out.println(uret);
//        }
//        System.out.println(tekrar+". tekrarda 10 sayısı bulundu!");
        
        
        //Girilen rakama karsilik gelen gun ismini verir.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi gir: ");
//        int sayi=scan.nextInt();
//        switch (sayi) {
//            case 1:
//                System.out.println("Pazartesi");
//                break;
//            case 2:
//                System.out.println("Sali");
//                break;
//            case 3:
//                System.out.println("Carsamba");
//                break;
//            case 4:
//                System.out.println("Persembe");
//                break;
//            case 5:
//                System.out.println("Cuma");
//                break;
//            case 6:
//                System.out.println("Cumartesi");
//                break;
//            case 7:
//                System.out.println("Pazar");
//                break;
//            default:
//                throw new AssertionError();
//        }

        
        
        // 1..99 arası rakamların okunuş karşılığını bulur
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi: ");
//        int sayi=scan.nextInt();
//        String birler="";
//        String onlar=""; 
//        switch ((int)sayi/10) {
//            case 1 -> onlar="On";
//            case 2 -> onlar="Yirmi";
//            case 3 -> onlar="Otuz";
//            case 4 -> onlar="Kırk";
//            case 5 -> onlar="Elli";
//            case 6 -> onlar="Altmis";
//            case 7 -> onlar="Yetmis";
//            case 8 -> onlar="Seksen";
//            case 9 -> onlar="Doksan";
//            default -> {
//                System.out.println("Hata!");
//                throw new AssertionError();
//            }
//        }        
//        switch (sayi%10) {
//            case 1 -> birler="bir";
//            case 2 -> birler="iki";
//            case 3 -> birler="uc";
//            case 4 -> birler="dort";
//            case 5 -> birler="bes";
//            case 6 -> birler="alti";
//            case 7 -> birler="yedi";
//            case 8 -> birler="sekiz";
//            case 9 -> birler="dokuz";
//            default -> {
//                System.out.println("Hata!");
//                throw new AssertionError();
//            }
//        }
//        System.out.println(onlar+" "+birler);



        //Klavyeden girilen sayinin palindrom olma durumunu kontrol eden program
        //Tersten kendisine eşit olan sayılara palindrom sayı denir.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi: ");
//        int s=scan.nextInt();
//        
//        String s_str=String.valueOf(s);
//        
//        boolean b=true;
//        
//        for(int i=0;i<s_str.length();i++){
//            if(s_str.charAt(i)!=s_str.charAt(s_str.length()-(i+1))){
//                b=false;
//                break;
//            }
//        }
//        if(b)System.out.println("Palindrom!");
//        else System.out.println("Palindrom degil!");
        

        //Klavyeden girilen sayinin armstrong olma durumunu kontrol eden program
        // Armstrong, sayı değerlerinin küpleri toplamı,kendisine eşit
//            Scanner scan=new Scanner(System.in);
//            System.out.print("Sayi: ");
//            int s=scan.nextInt();
//            String s_str=String.valueOf(s);
//            int toplam=0,kup,basamak;
//            for(int i=0;i<s_str.length();i++){
//                basamak=Integer.parseInt(String.valueOf(s_str.charAt(i)));
//                kup=basamak*basamak*basamak;
//                toplam+=kup;
//            }
//            if(toplam==s)System.out.println("Armstrong!");
//            else System.out.println("Armstrong degil!");


        //Klavyeden girilen stringin içinde kaç sesli-sessiz harf ve kelime
        //oldugunu bulur.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("String: ");
//        String str=scan.nextLine();
//        int kelimeAdedi=1, sesliAdet=0, sessizAdet=0;
//        for(int i=0;i<str.length();i++){
//            String tmp=String.valueOf(str.charAt(i));
//            if(" ".equals(tmp)){
//                kelimeAdedi++;
//            }
//            else if("a".equals(tmp) ||
//                    "e".equals(tmp) ||
//                    "ı".equals(tmp) ||
//                    "i".equals(tmp) ||
//                    "o".equals(tmp) ||
//                    "ö".equals(tmp) ||
//                    "u".equals(tmp) ||
//                    "ü".equals(tmp)) 
//                    {
//                sesliAdet++;
//            }
//            else sessizAdet++;
//        }
//        System.out.println("Kelime adedi     : "+kelimeAdedi);
//        System.out.println("Sesli harf adedi : "+sesliAdet);
//        System.out.println("Sessiz harf adedi: "+sessizAdet);
    }
}
