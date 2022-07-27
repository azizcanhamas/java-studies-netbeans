package Algorithm;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Klavyeden girilen sinif mevcuduna gore ve vize notlarina
        // gore sinif vize ortalamasini bulur.
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Sinif mevcudu: ");
//        int sinifMevcudu=scan.nextInt(); 
//        int[]vizeler=new int[sinifMevcudu];
//        int toplam=0;
//        for(int i=0;i<sinifMevcudu;i++){
//            System.out.print(i+1+". ogrencinin vize notu: ");
//            int not=scan.nextInt();
//            vizeler[i]=not;
//            toplam+=not;
//        }
//        System.out.println("Sinif ortalamasi: "+(toplam/sinifMevcudu));
//        for (int i : vizeler) {
//            System.out.println(i);
//        }


        //Klavyeden girilen mevcut sayisina gore kullanicidan
        //ogrenciden isim ve not bilgilerini alan ve en yuksek notu
        //alan ogrenciyi bulan program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Mevcut: ");
//        int mevcut=scan.nextInt();
//        String[]adlar=new String[mevcut];
//        int[]notlar=new int[mevcut];
//        for(int i=0;i<mevcut;i++){
//            System.out.print((i+1)+". ogrenci adi       : ");
//            adlar[i]=scan.next();
//            System.out.print((i+1)+". ogrenci vize notu : ");
//            notlar[i]=scan.nextInt();
//        }
//        int enb=0;
//        for(int i=1;i<mevcut;i++) if(notlar[i]>notlar[enb])enb=i;
//        System.out.println(adlar[enb]+" isimli ogrenci "+notlar[enb]+" ile en yuksek notu almistir!");
        
        
        //Klavyeden girilen para miktarini uygun banknot adetlerine
        //ayiran program
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Para: ");
//        int para=scan.nextInt();
//        int[]banknotlar=new int[]{200,100,50,20,10,5,1};
//        double calc;
//        for(int i=0;i<banknotlar.length;i++){
//            calc=para/banknotlar[i];
//            if(calc>0){
//                System.out.println(banknotlar[i]+": "+(int)calc);
//                para-=calc*banknotlar[i];
//            }
//        }
    }         
}
