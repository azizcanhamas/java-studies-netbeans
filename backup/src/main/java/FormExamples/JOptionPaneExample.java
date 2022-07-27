package FormExamples;

import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        //Kullanicidan JOptionPane.showInputDialog penceresinde
        // kullanici adi ve parola alir. Aldigi parola ve kullanici adinin
        // dogru olup olmadigini kontrol eder. 
        // Dogru ise tekrar giris yapmak isteyip istemedigini sorar.
        int secim;
        String username,parola;
        while(true){
            username=JOptionPane.showInputDialog(null,"username","username");
            parola=JOptionPane.showInputDialog(null,"password","password");
            if(username.equals("azizcan")&&parola.equals("123456")){
                JOptionPane.showMessageDialog(null, "Giris basarili!");
                break;
            }
                
            else {
                JOptionPane.showMessageDialog(null, "Giris hatali!");
                secim=JOptionPane.showConfirmDialog(null,"Devam","X",JOptionPane.YES_NO_OPTION);
                if(secim==1)break;
            }
        }
    }
}
