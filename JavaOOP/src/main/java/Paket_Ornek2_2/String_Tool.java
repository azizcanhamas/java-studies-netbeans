package Paket_Ornek2_2;

public class String_Tool {
    String input="";
    
    public String_Tool(String input){
        this.input=input;
    }
    
    public String kelimeSayisi(){
        return "Kelime Sayisi: "+String.valueOf(input.split(" ").length);
    }
    
    public String boslukSayisi(){
        int adet=0;
        for (int i = 0; i < input.length(); i++) {
            if (" ".equals(String.valueOf(input.charAt(i)))) {
                adet++;
            }
        }
        return "Bosluk Sayisi: "+String.valueOf(adet);
    }
    
    public String sesliHarfSayisi(){
        int adet=0;
        String inputTmp=input.toLowerCase();
        for (int i = 0; i < inputTmp.length(); i++) {
            if (String.valueOf(inputTmp.charAt(i)).equals("a")||
                String.valueOf(inputTmp.charAt(i)).equals("e")||
                String.valueOf(inputTmp.charAt(i)).equals("ı")||
                String.valueOf(inputTmp.charAt(i)).equals("i")||
                String.valueOf(inputTmp.charAt(i)).equals("o")||
                String.valueOf(inputTmp.charAt(i)).equals("ö")||
                String.valueOf(inputTmp.charAt(i)).equals("u")||
                String.valueOf(inputTmp.charAt(i)).equals("ü")) {
                adet++;
            }
        }
        return "Sesli Harf Sayisi: "+String.valueOf(adet);
    }
    
    public String tersCevir(){
        String tmp="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tmp+=input.charAt(i);
        }
        return "Ters Hali: "+tmp;
    }
}
