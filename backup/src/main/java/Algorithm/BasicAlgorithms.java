package Algorithm;

import java.util.Scanner;

public class BasicAlgorithms {

    public static void main(String[] args) {
        //Klavyeden girilen iki sayının ortalamasını hesaplayan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi 1: ");
//        int s1=scan.nextInt();
//        System.out.print("Sayi 2: ");
//        int s2=scan.nextInt();
//        System.out.println("Toplam: "+(s1+s2));


        //Tabanı ve yüksekliği girilen üçgenin alanını hesaplayan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Taban: ");
//        int taban=scan.nextInt();
//        System.out.print("Yukseklik: ");
//        int yukseklik=scan.nextInt();
//        int alan=(taban*yukseklik)/2;
//        System.out.println("Alan: "+alan);


        //Birbirinden farklı olarak verilen iki adet sayıdan, 
        //büyük olanı bulup gösteren program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayı 1: ");
//        int s1=scan.nextInt();
//        System.out.print("Sayı 2: ");
//        int s2=scan.nextInt();
//        if(s1>s2){
//            System.out.println(s1);
//        }
//        else if(s2>s1){
//            System.out.println(s2);
//        }
        

        //Klavyeden girilen 2 sayıyı karşılaştırıp 
        //sonucu ekrana yazdıran programın
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayı 1: ");
//        int sayi1=scan.nextInt();
//        System.out.print("Sayı 2: ");
//        int sayi2=scan.nextInt();
//        if (sayi1>sayi2){
//            System.out.println("1. sayi büyük!");
//        }
//        else if (sayi2>sayi1){
//            System.out.println("2. sayi büyük!");
//        }
//        else{
//            System.out.println("Sayilar esit!");
//        }


        //Kenar uzunlukları girilen dikdörtgenin 
        //alanını hesaplayıp ekranda gösteren programı
//        Scanner scan=new Scanner(System.in);
//        int kisa_kenar=0;
//        while (!(kisa_kenar>0)){
//            System.out.print("Kısa kenar: ");
//            kisa_kenar=scan.nextInt();
//        }
//        int uzun_kenar=0;
//        while (!(uzun_kenar>0)){
//            System.out.print("Uzun kenar: ");
//            uzun_kenar=scan.nextInt();
//        }   
//        int alan=kisa_kenar*uzun_kenar;
//        System.out.println("Alan: "+alan);


        //Klavyeden girilen bir sayının işaretini kontrol ederek 
        //sonucu ekrana yazdıran programın
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi: ");
//        int s=scan.nextInt();
//        if (s>0){
//            System.out.println("Pozitif!");
//        }
//        else if(s<0){
//            System.out.println("Negatif!");
//        }
//        else{
//            System.out.println("Notr!");
//        }
        

        //Klavyeden girilen iki sayıdan birincisi büyükse çıkarma,
        //ikincisi büyükse toplama, eşitse çarpma işlemi yapan
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi 1:");
//        int s1=scan.nextInt();
//        System.out.print("Sayi 2:");
//        int s2=scan.nextInt();
//        if (s1>s2){
//            System.out.println("Sonuc: "+(s1-s2));
//        }
//        else if (s2>s1){
//            System.out.println("Sonuc: "+(s1+s2));
//        }
//        else{
//            System.out.println("Sonuc: "+(s1*s2));
//        }


        //Girilen vize ve final notlarına göre öğrencinin 
        //dersten geçip geçmediğini bulan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Vize: ");
//        int vize=scan.nextInt();
//        System.out.print("Final: ");
//        int final1=scan.nextInt();
//        double ort=vize*0.4+final1*0.6;
//        if(ort>50){
//            System.out.println("Gectiniz! Ort: "+ort);
//        }
//        else{
//            System.out.println("Kaldiniz! Ort: "+ort);
//        }

        
        //Ekrana 10 defa adınızı yazdırınız.
//        for(int i=0;i<10;i++){
//            System.out.println("Aziz");
//        }


        //0’dan 100 ‘e kadar olan çift sayıların toplamını veren programın
//        int toplam=0;
//        for(int i=0;i<100;i+=2){
//            toplam+=i;
//        }
//        System.out.println("Toplam: "+toplam);


        //1’ den 10 ‘a kadar olan sayıları ekran listeleyen
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }


        //Klavyeden girilen 5 adet sayının karesini hesaplayan
//        Scanner scan=new Scanner(System.in);
//        int s;
//        for(int i=0;i<5;i++){
//            System.out.print("Sayi "+(i+1)+": ");
//            s=scan.nextInt();
//            System.out.print("Karesi: "+s*s);
//        }


        //Klavyeden girilen sayının faktöriyelini hesaplayan
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sayi: ");
//        int s=scan.nextInt();
//        int sonuc=1;
//        for(int i=1;i<=s;i++){
//            sonuc*=i;
//        }
//        System.out.println("Sonuc: "+sonuc);


        //Klavyeden girilen 50 adet notun ortalamasını bulduran program
//        Scanner scan=new Scanner(System.in);
//        int toplam=0;
//        int s;
//        for(int i=0;i<50;i++){
//            System.out.print("Not "+(i+1)+": ");
//            s=scan.nextInt();
//            toplam+=s;
//        }
//        System.out.println("50 notun ortalamasi: "+(toplam/50));


        //Klavyeden girilen 15 adet sayıdan pozitif olanların adedini bulan
//        Scanner scan=new Scanner(System.in);
//        int adet=0;
//        int s;
//        for(int i=0;i<15;i++){
//            System.out.print("Sayi: ");
//            s=scan.nextInt();
//            if(s>0) adet++;
//        }
//        System.out.println("Adet: "+adet);


        //Klavyeden girilen 10 adet sayıdan en büyüğünü bulan
//        Scanner scan=new Scanner(System.in);
//        int enb;
//        System.out.print("Sayi: ");
//        enb=scan.nextInt();
//        int s;
//        for(int i=0;i<9;i++){
//            System.out.print("Sayi: ");
//            s=scan.nextInt();
//            if(s>enb)enb=s;
//        }
//        System.out.println("Enb: "+enb);


        //KDV dahil ürün fiyatını hesaplar.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Urun fiyati: ");
//        int urunFiyati=scan.nextInt();
//        double kdvDahil=urunFiyati*1.18;
//        System.out.println("KDV Dahil: "+kdvDahil);


        //Dairenin alanini hesaplar.
//        Scanner scan=new Scanner(System.in);
//        double pi=3.1416;
//        System.out.print("Yaricap: ");
//        double r=scan.nextDouble();
//        double alan=pi*r*r;
//        System.out.println("Alan: "+alan);

    }
}
