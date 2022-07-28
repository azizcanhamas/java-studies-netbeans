package Constructor_Ornek1;

import javax.swing.JOptionPane;

public class Laptop {
    String tmp="";
    public Laptop(){
        JOptionPane.showMessageDialog(null, "Hicbir sey!");
    }
    public Laptop(String marka){
        tmp="";
        tmp+="Marka: "+marka+"\n";
        JOptionPane.showMessageDialog(null, tmp);
    }
    public Laptop(String marka,String cpu){
        tmp="";
        tmp+="Marka: "+marka+"\n";
        tmp+="CPU: "+cpu+"\n";
        JOptionPane.showMessageDialog(null, tmp);
    }
    public Laptop(String marka,String cpu,String ram){
        tmp="";
        tmp+="Marka: "+marka+"\n";
        tmp+="CPU: "+cpu+"\n";
        tmp+="RAM: "+ram+"\n";
        JOptionPane.showMessageDialog(null, tmp);
    }
    public Laptop(String marka,String cpu,String ram,String hdd){
        tmp="";
        tmp+="Marka: "+marka+"\n";
        tmp+="CPU: "+cpu+"\n";
        tmp+="RAM: "+ram+"\n";
        tmp+="HDD: "+hdd+"\n";
        JOptionPane.showMessageDialog(null, tmp);
    }
}
