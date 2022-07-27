package Algorithm;

import java.util.ArrayList;

public class ArrayListStruct {
    public static void main(String[] args) {
        //ArrayLists
        
        //* ArrayList olusturmak
        ArrayList<String> isimler=new ArrayList<String>();
        
        //* ArrayList'e eleman eklemek
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatih");
        isimler.add("Yilmaz");
        
        //* ArrayList'ten eleman cekmek
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatih");
        isimler.add("Yilmaz");
        System.out.println(isimler.get(0));
        System.out.println(isimler.get(3));

        //* ArrayList'teki elemani guncellemek
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatih");
        isimler.add("Yilmaz");
        isimler.set(0, "Ayse");
        System.out.println(isimler.get(0));
        
        //* ArrayList'ten bir elemani kaldirmak
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatih");
        isimler.add("Yilmaz");
        isimler.remove(3);
        System.out.println(isimler.get(3));//Hata vermesi gerekir.
        
        //* ArrayList'i temizlemek
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Fatih");
        isimler.add("Yilmaz");
        isimler.clear();
        System.out.println(isimler.get(0));//Hata vermesi gerekir.
    }
}
