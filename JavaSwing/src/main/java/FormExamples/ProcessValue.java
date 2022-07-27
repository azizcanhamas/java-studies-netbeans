package FormExamples;



import java.util.ArrayList;
import javax.swing.ButtonGroup;

public class ProcessValue extends javax.swing.JFrame {
    ButtonGroup g;
    public ProcessValue() {
        initComponents();
        
        //RadioButton nesnelerini tek secim islemi icin grupla.
        g=new ButtonGroup();
        g.add(rakamlariToplaJRB);
        g.add(bolenleriListeleJRB);
        g.add(tersCevirJRB);
        g.add(aBulJRB);
        
        /*ButtonGroup icerisinde hangi elemanin secili oldugunu
        alabilmek icin yapilmasi gerekmektedir.*/
        rakamlariToplaJRB.setActionCommand(rakamlariToplaJRB.getText());
        bolenleriListeleJRB.setActionCommand(bolenleriListeleJRB.getText());
        tersCevirJRB.setActionCommand(tersCevirJRB.getText());
        aBulJRB.setActionCommand(aBulJRB.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        degerLabel = new javax.swing.JLabel();
        degerField = new javax.swing.JTextField();
        sonucLabel = new javax.swing.JLabel();
        processButton = new javax.swing.JToggleButton();
        rakamlariToplaJRB = new javax.swing.JRadioButton();
        bolenleriListeleJRB = new javax.swing.JRadioButton();
        tersCevirJRB = new javax.swing.JRadioButton();
        aBulJRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        degerLabel.setText("Değer: ");

        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });

        rakamlariToplaJRB.setText("Rakamları topla");

        bolenleriListeleJRB.setText("Bölenleri listele");

        tersCevirJRB.setText("Ters çevir");

        aBulJRB.setText("'a' karakter sayısını bul");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(processButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(degerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(degerField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rakamlariToplaJRB)
                            .addComponent(bolenleriListeleJRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aBulJRB)
                            .addComponent(tersCevirJRB)))
                    .addComponent(sonucLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tersCevirJRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aBulJRB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(degerLabel)
                            .addComponent(degerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rakamlariToplaJRB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bolenleriListeleJRB)
                            .addComponent(processButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sonucLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        String degerStr=degerField.getText();
        //Deger olarak verilen sayinin rakamlarinin toplamini bulur.
        String selection=g.getSelection().getActionCommand();
        if(selection.equals("Rakamları topla")){
            int sonuc=rakamlariTopla(degerStr);
            sonucLabel.setText("Sonuc: "+sonuc);
        }
        //Deger olarak verilen string veya sayinin tersini bulur.
        else if(selection.equals("Ters çevir")){
            String sonuc=tersCevir(degerStr);
            sonucLabel.setText("Sonuc: "+sonuc);
        }
        //Deger olarak verilen Integer sayinin bolenlerini bulur.
        else if(selection.equals("Bölenleri listele")){
            int degerInt=Integer.parseInt(degerStr);
            ArrayList<Integer> sonuc=bolenleriListele(degerInt);
            System.out.println(sonuc);
            sonucLabel.setText("Sonuc: "+sonuc);
        }
        //Deger olarak verilen stringin icinde kac adet 'a' karakterinin bulundugunu bulur.
        else if(selection.equals("'a' karakter sayısını bul")){
            int sonuc=aBul(degerStr);
            sonucLabel.setText("Sonuc: "+sonuc);
        }
    }//GEN-LAST:event_processButtonActionPerformed

    public static int rakamlariTopla(String deger){
        int toplam=0;
        for(int i=0;i<deger.length();i++){
            toplam+=Integer.parseInt(Character.toString(deger.charAt(i)));
        }
        return toplam;
    }
    public static String tersCevir(String degerStr){
        String reversed="";
        for(int i=degerStr.length()-1;i>=0;i--){
            reversed+=degerStr.charAt(i);
        }
        return reversed;
    }
    public static ArrayList<Integer> bolenleriListele(int a){
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            if(a%i==0)arr.add(i);
        }
        return arr;
    }
    public static int aBul(String degerStr){
        int aAdet=0;
        for (int i = 0; i < degerStr.length(); i++) {
            if(degerStr.charAt(i)=='a')aAdet+=1;
        }
        return aAdet;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProcessValue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton aBulJRB;
    private javax.swing.JRadioButton bolenleriListeleJRB;
    private javax.swing.JTextField degerField;
    private javax.swing.JLabel degerLabel;
    private javax.swing.JToggleButton processButton;
    private javax.swing.JRadioButton rakamlariToplaJRB;
    private javax.swing.JLabel sonucLabel;
    private javax.swing.JRadioButton tersCevirJRB;
    // End of variables declaration//GEN-END:variables
}
