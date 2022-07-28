package Paket_Ornek1_2;

import java.util.ArrayList;

public class Basamaklar {
    int sayi;
    //Constructor ile fieldlara atama yapilmasi
    public Basamaklar(int sayi){
        this.sayi=sayi;
    }
    
    public ArrayList<String> hesapla(){
    //* Field'da saklanan sayinin basamaklarinin hesaplanmasi
        int binlerBasamagi=(sayi/1000)*1000;
        sayi=sayi-binlerBasamagi;
        int yuzlerBasamagi=(sayi/100)*100;
        sayi=sayi-yuzlerBasamagi;
        int onlarBasamagi=(sayi/10)*10;
        sayi=sayi-onlarBasamagi;
        int birlerBasamagi=(sayi/1)*1;
    //* Hesaplanan basamaklarin bir ArrayList<String> listesi olarak diger pakete gonderilmesi    
        ArrayList<String> list=new ArrayList<String>();
        if(binlerBasamagi>0) list.add("Binler: "+String.valueOf(binlerBasamagi)+"\n");
        if(yuzlerBasamagi>0) list.add("Yuzler: "+String.valueOf(yuzlerBasamagi)+"\n");
        if(onlarBasamagi>0)  list.add("Onlar : "+String.valueOf(onlarBasamagi)+"\n");
        if(birlerBasamagi>0) list.add("Birler: "+String.valueOf(birlerBasamagi)+"\n");     
        return list;
    }
    
    
}
