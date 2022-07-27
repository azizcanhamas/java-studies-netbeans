package FormExamples;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;

public class HakemAtama extends javax.swing.JFrame {
    String[]hakemListesi;
    public HakemAtama() {
        initComponents();
        DefaultListModel<String> model=new DefaultListModel<String>();
        model.addElement("Fenerbahçe-Galatasaray");
        model.addElement("Galatasaray-Beşiktaş");
        model.addElement("Trabzonspor-Bursaspor");
        model.addElement("Hatayspor-Amedspor");
        model.addElement("Adanaspor-Alanyaspor");
        model.addElement("Rizespor-Beşiktaş");
        model.addElement("Malatyaspor-Kayserispor");
        model.addElement("Göztepe-Giresunspor");
        model.addElement("Boluspor-Bandırmaspor");
        model.addElement("Gençlerbirliği-İstanbulspor");
        model.addElement("Afyonspor-Pazarspor");
        model.addElement("Uşakspor-Şanlıurfaspor");
        takimList.setModel(model); 
        hakemListesi=new String[]{"Yaşar Kemal Uğurlu", 
            "Halil Umut Meler",
            "Atilla Karaoğlan",
            "Arda Kardeşler",
            "Erkan Özdamar",
            "Ümit Öztürk",
            "Mete Kalkavan",
            "Ali Şansalan",
            "Sarper Barış Saka",
            "Zorbay Küçük",
            "Yasin Kol",
            "Volkan Bayarslan"
        };
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baslikLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        takimList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        hakemList = new javax.swing.JList<>();
        ataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        baslikLabel.setText("Süper Lig Hakem Atama Ekranı");

        takimList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(takimList);

        hakemList.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jScrollPane2.setViewportView(hakemList);

        ataButton.setText("Rastgele Hakem Ata");
        ataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(baslikLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ataButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(baslikLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ataButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ataButtonActionPerformed
        hakemList.removeAll();
        ArrayList<Integer>randomValues=new ArrayList<Integer>();
        
        while(randomValues.size()<12){
            Random r=new Random();
            int random=r.nextInt(12);
            int searchResult=randomValues.indexOf(random);
            if(searchResult==-1){
                randomValues.add(random);
            }
        }
        
        DefaultListModel<String> hakemListModel=new DefaultListModel<>();
        for (int i = 0; i < randomValues.size(); i++) {
            hakemListModel.addElement(hakemListesi[randomValues.get(i)]);
        }
        hakemList.setModel(hakemListModel);

    }//GEN-LAST:event_ataButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HakemAtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ataButton;
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JList<String> hakemList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> takimList;
    // End of variables declaration//GEN-END:variables
}