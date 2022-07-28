package ErisimBelirleyiciler_Ornek1_1;
import ErisimBelirleyiciler_Ornek2_2.Goster;

public class Test extends javax.swing.JFrame {

    public static String marka;
    private static String cpu;
    protected static String ram;
    static String hdd;
    
    public Test() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        markaLabel = new javax.swing.JLabel();
        cpuLabel = new javax.swing.JLabel();
        ramLabel = new javax.swing.JLabel();
        hddLabel = new javax.swing.JLabel();
        markaComboBox = new javax.swing.JComboBox<>();
        cpuComboBox = new javax.swing.JComboBox<>();
        ramComboBox = new javax.swing.JComboBox<>();
        hddComboBox = new javax.swing.JComboBox<>();
        gosterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        markaLabel.setText("Marka");

        cpuLabel.setText("CPU");

        ramLabel.setText("RAM");

        hddLabel.setText("HDD");

        markaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HP", "Lenovo", "Dell", "MSI", "Monster" }));

        cpuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "i3", "i5", "i7", "i9", "Ryzen 5", "Ryzen 7" }));

        ramComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 GB", "8 GB", "16 GB", "32 GB" }));

        hddComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "256 GB", "512 GB", "1024 GB" }));

        gosterButton.setText("Göster");
        gosterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(markaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(markaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cpuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ramLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ramComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hddLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hddComboBox, 0, 111, Short.MAX_VALUE))
                    .addComponent(gosterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(markaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markaLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpuLabel)
                    .addComponent(cpuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ramLabel)
                    .addComponent(ramComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hddLabel)
                    .addComponent(hddComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gosterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterButtonActionPerformed
        //Kullanicinin sectigi ozelliklerin String field'lara alinmasi.
        marka=(String)markaComboBox.getSelectedItem();
        cpu=(String)cpuComboBox.getSelectedItem();
        ram=(String)ramComboBox.getSelectedItem();
        hdd=(String)hddComboBox.getSelectedItem();
        
        //Cikti gosterme siniflarindan nesne turetilmesi
        //Siniflarin isimleri ayni oldugu icin paketler de belirtilmelidir.
        ErisimBelirleyiciler_Ornek1_1.Goster goster_1=new ErisimBelirleyiciler_Ornek1_1.Goster(); //Laptop_1
        ErisimBelirleyiciler_Ornek2_2.Goster goster_2=new ErisimBelirleyiciler_Ornek2_2.Goster(); //Laptop_2
        
        //Siniflari gorunur yap.
        goster_1.setVisible(true);
        goster_2.setVisible(true);
    }//GEN-LAST:event_gosterButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cpuComboBox;
    private javax.swing.JLabel cpuLabel;
    private javax.swing.JButton gosterButton;
    private javax.swing.JComboBox<String> hddComboBox;
    private javax.swing.JLabel hddLabel;
    private javax.swing.JComboBox<String> markaComboBox;
    private javax.swing.JLabel markaLabel;
    private javax.swing.JComboBox<String> ramComboBox;
    private javax.swing.JLabel ramLabel;
    // End of variables declaration//GEN-END:variables
}
