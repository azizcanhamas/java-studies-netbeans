package Algorithm;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) throws IOException {
        //Bir dosyasinin mevcut olup olmama durumunu kontrol etme
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test");
//        if(f.exists())
//            System.out.println(f.getName()+" isimli klasor var!");
//        else
//            System.out.println(f.getName()+" isimli klasor yok!");


        //Bir dosya nesnesinin dosya mi klasör mu oldugunu kontrol eder.
        // Mevcut degilse false doner.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test");
//        if(f.isDirectory())
//            System.out.println("Bu bir klasor!");
//        else if(f.isFile())
//            System.out.println("Bu bir dosya!");


        //Dosyanin tam adresini, ayirici karakterini ve klasor uzunlugunu doner.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\1.txt");
//        System.out.println(f.getAbsolutePath());
//        System.out.println(f.separator);


        //Belirtilen dosya veya klasore son erisim tarihini doner.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test");
//        Date date=new Date(f.lastModified());
//        System.out.println(date);


        //Bir klasorde bulunan dosyalari listeler.
//        File klasor=new File("C:\\Users\\azuwin_user\\Desktop\\test");
//        File[]list=klasor.listFiles();
//        for (File file : list) {
//            System.out.println(file);
//        }
        

        //Belirtilen dosyanin var olup olmadigini kontrol eder.
        //Mevcut degilse olusturur, olusturamazsa bildirir.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\1.txt");
//        if (f.exists()) System.out.println("Dosya mevcut!");
//        else if(f.createNewFile())System.out.println("Dosya olusturuldu!");
//        else System.out.println("Dosya olusturulamadi!");


        //Dosyayi salt okunur yapar.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\1.txt");
//        System.out.println(f.setReadOnly());
        

        //Dosyayi yazilabilir yapar.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\1.txt");
//        System.out.println(f.setWritable(true));
    

        //Dosyanin gizli,okunabilir,yazilabilir olma durumlarini kontrol eder.
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\1.txt");
//        System.out.println("\nDosya Gizlimi : " + f.isHidden());
//        System.out.println("Dosya Okunabilirmi : " + f.canRead());
//        System.out.println("Dosya Yazilabilirmi : " + f.canWrite());

        //Klavyeden alinan ogrenci isim ve not bilgilerini bir dosyaya yazar.
//        Scanner scan=new Scanner(System.in);
//        File f=new File("C:\\Users\\azuwin_user\\Desktop\\test\\x.txt");
//        FileWriter fw=new FileWriter(f);
//        String ad;
//        int not;
//        for (int i = 0; i < 5; i++) {
//            System.out.print(i+1+". ogrenci adi: ");
//            ad=scan.next();
//            System.out.print(i+1+". ogrenci not: ");
//            not=scan.nextInt();
//            fw.write(ad+"  -->  "+not);
//            fw.write("\n");
//        }
//        fw.close();
    }
}
