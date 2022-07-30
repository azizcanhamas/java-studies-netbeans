package FormExamples;



import java.time.Year;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class OgrenciBilgiEkrani extends javax.swing.JFrame {
    
    ArrayList<Object> programTurleri=new ArrayList<Object>();
    //Program turlerinin birbirinden karismamasi icin ArrayList ile matris tanimlamasi
    ArrayList<ArrayList>programlar=new ArrayList<ArrayList>();
    ArrayList<ArrayList>programKodlari=new ArrayList<ArrayList>();
    ArrayList<ArrayList>programOgrenciSayilari=new ArrayList<ArrayList>();
    
    public OgrenciBilgiEkrani() {
        initComponents();
        ogrenciNoField.setEnabled(false);
        
        //Program turlerinin ve ilgili programlarin okunmasi
        //Kok node'u verir.
        Object root=programTree.getModel().getRoot();
        int i=0;
        int j=0;
        //Ilk while dongusunde program turu okunur.
        //Ikinci while dongusunde program turu altindaki programlar okunur.
        while (i<programTree.getModel().getChildCount(root)) {
            programTurleri.add(programTree.getModel().getChild(root, i));
            j=0;
            programlar.add(new ArrayList<Object>());
            programKodlari.add(new ArrayList<String>());
            programOgrenciSayilari.add(new ArrayList<Integer>());
            String tmpKod="";
            while (j<programTree.getModel().getChildCount(programTurleri.get(i))) {
                //Matrisin en alt tabanina programin yerlestirilmesi
                programlar.get(i).add(programTree.getModel().getChild(programTurleri.get(i), j));
                //Program kodunun olusturulmasi
                tmpKod=String.valueOf(i+1)+1+String.valueOf(j);
                programKodlari.get(i).add(tmpKod);
                programOgrenciSayilari.get(i).add(0);
                j++;
                tmpKod="";
            }
            i++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ogrenciNoLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        ogrenciNoField = new javax.swing.JTextField();
        adField = new javax.swing.JTextField();
        soyadField = new javax.swing.JTextField();
        sehirCB = new javax.swing.JComboBox<>();
        yeniButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        hepsiniSilButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        programTree = new javax.swing.JTree();
        bolumField = new javax.swing.JTextField();
        bolumEkleButton = new javax.swing.JToggleButton();
        bolumGuncelleButton = new javax.swing.JToggleButton();
        bolumSilButton = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogrenciTable = new javax.swing.JTable();
        infoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Öğrenci Bilgi Ekranı");
        setResizable(false);

        ogrenciNoLabel.setText("Öğrenci No:");

        adLabel.setText("Adı:");

        soyadLabel.setText("Soyadı:");

        adresLabel.setText("Adresi:");

        sehirCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "Kırıkkale", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Şanlıurfa", "Siirt", "Sinop", "Sivas", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" }));

        yeniButton.setText("Yeni");
        yeniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniButtonActionPerformed(evt);
            }
        });

        guncelleButton.setText("Güncelle");
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        silButton.setText("Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        hepsiniSilButton.setText("Hepsini Sil");
        hepsiniSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hepsiniSilButtonActionPerformed(evt);
            }
        });

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Programlar");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Teknik");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bilgisayar");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Elektrik");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Elektronik");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("İnşaat");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sosyal");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Muhasebe");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pazarlama");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Lojistik");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Harita");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mühendislik");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bilgisayar Müh.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Elektrik-Elektronik Müh.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mekatronik Müh.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Jeoloji Müh.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Kimya Müh.");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("İnşaat Müh.");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Görsel-İşitsel");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Müzik");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Resim");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Heykeltraşlık");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tiyatro");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bale");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Dans");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        programTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(programTree);

        bolumEkleButton.setText("Bölüm Ekle");
        bolumEkleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolumEkleButtonActionPerformed(evt);
            }
        });

        bolumGuncelleButton.setText("Bölüm Güncelle");
        bolumGuncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolumGuncelleButtonActionPerformed(evt);
            }
        });

        bolumSilButton.setText("Bölüm Sil");
        bolumSilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolumSilButtonActionPerformed(evt);
            }
        });

        ogrenciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğrenci No", "Ad", "Soyad", "Program Türü", "Program", "Adres"
            }
        ));
        ogrenciTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenciTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ogrenciTable);

        infoLabel.setText("Info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adresLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ogrenciNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(soyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adField)
                                    .addComponent(ogrenciNoField)
                                    .addComponent(soyadField)
                                    .addComponent(sehirCB, 0, 246, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yeniButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(guncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hepsiniSilButton, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(silButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bolumField)
                            .addComponent(bolumEkleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bolumGuncelleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(bolumSilButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                            .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bolumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bolumEkleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolumGuncelleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bolumSilButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ogrenciNoLabel)
                                .addComponent(ogrenciNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(adLabel)
                                .addComponent(adField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(soyadLabel)
                                .addComponent(soyadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(adresLabel)
                                .addComponent(sehirCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(yeniButton)
                                .addComponent(silButton))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hepsiniSilButton)
                                .addComponent(guncelleButton)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(infoLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void yeniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniButtonActionPerformed
//        Agacta secili olan program turu ve programin ayiklanmasi
        String[]arr;
        try{        
            arr = programTree.getSelectionModel().getSelectionPath().toString().split(",");
        }catch(Exception e){
            infoLabel.setText("Lütfen sağ taraftan program seçiniz!");
            return;
        }
        //Ogrenci ile alakali bilgilerin degiskenlere alinmasi
        String ad=adField.getText();
        String soyad=soyadField.getText();
        String adres=sehirCB.getSelectedItem().toString();
        String programTuru=arr[1].replace(" ", "");
        String program=arr[2].substring(1,arr[2].length()-1);
        
        //Ogrenci numarasinin olusturulmasi
        Object[] ogrNoIJ=ogrenciNoOlustur(programTuru, program);
        ogrenciNoField.setText((String)ogrNoIJ[0]);
        
        //Her ogrenci eklendiginde ilgili programdaki ogrenci mevcudunun bir arttirilmasi
        programOgrenciSayilari.get((Integer)ogrNoIJ[1]).set((Integer)ogrNoIJ[2],(Integer)programOgrenciSayilari.get((Integer)ogrNoIJ[1]).get((Integer)ogrNoIJ[2])+1);        

        //Bilgileri olusturulan ogrencinin veritabanina eklenmesi
        DefaultTableModel s=(DefaultTableModel)ogrenciTable.getModel();
        s.addRow(new Object[]{ogrNoIJ[0],ad,soyad,programTuru,program,adres});       
    }//GEN-LAST:event_yeniButtonActionPerformed
    
    private Object[] ogrenciNoOlustur(String programTuru,String program){
        //Ogrenci numarasinin olusturulmasi
        String ogrenciNo="";
        ogrenciNo+=Year.now().toString(); //Guncel yil bilgisi
        int i;
        for (i = 0; i < programTurleri.size(); i++) {
            if(programTurleri.get(i).toString().equals(programTuru))break;
        }
        int j;
        for (j = 0; j < programlar.get(i).size(); j++) {
            if(programlar.get(i).get(j).toString().equals(program))break;
        }
        ogrenciNo+=programKodlari.get(i).get(j);
        //ArrayList'ten Object geldigi icin once stringe ardindan Integer'a cevrildi ve 1 eklendi.
        ogrenciNo+=Integer.valueOf(String.valueOf(programOgrenciSayilari.get(i).get(j)))+1;
        Object[]arr={ogrenciNo,i,j};
        return arr;
    }
    
    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        //Eger tabloda hicbir ogrenci satiri secili degilse isleme devam etme.
        if(ogrenciTable.getSelectedRow()==-1){
            infoLabel.setText("Lütfen silmek istediğiniz öğrenci için ilgili satırı seçiniz!");
            return;
        }
        //Tabloda secili olan satiri sil.
        else{
            DefaultTableModel dfm=(DefaultTableModel)ogrenciTable.getModel();
            dfm.removeRow(ogrenciTable.getSelectedRow());
        }
        
    }//GEN-LAST:event_silButtonActionPerformed

    private void hepsiniSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hepsiniSilButtonActionPerformed
        //Tum ogrencileri silmek istedigini teyit et.
        int bool=JOptionPane.showConfirmDialog(null, "Tüm öğrenci kayıtlarını silmek istediğinizden emin misiniz?",
                "Hepsini Sil",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        //Evet butonuna tikladiysa tabloyu sifirla.
        /*  0= Yes  1= No  2= Cancel*/
        if(bool==0){
            DefaultTableModel dtm=(DefaultTableModel)ogrenciTable.getModel();
            dtm.setRowCount(0);
        }
    }//GEN-LAST:event_hepsiniSilButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        //Eger tabloda hicbir ogrenci satiri secili degilse isleme devam etme.
        if(ogrenciTable.getSelectedRow()==-1){
            infoLabel.setText("Lütfen güncellemek istediğiniz öğrenci için ilgili satırı seçiniz!");
            return;
        }
        else{
            DefaultTableModel dtm=(DefaultTableModel)ogrenciTable.getModel();
            int row=ogrenciTable.getSelectedRow();
            //Ogrenci bilgilerinin form elemanlarindaki verilere gore guncellenmesi
            String[]arr;
            try{        
                arr = programTree.getSelectionModel().getSelectionPath().toString().split(",");
            }catch(Exception e){
                infoLabel.setText("Lütfen sağ taraftan program seçiniz!");
                return;
            }
            String programTuru=arr[1].replace(" ", "");
            String program=arr[2].substring(1,arr[2].length()-1);
            //Eger guncelleme sirasinda farkli bir program secildiyse yeni bir ogrenci no olustur.
            if(!program.equals(dtm.getValueAt(row, 4)))
                dtm.setValueAt(ogrenciNoOlustur(programTuru, program)[0], row, 0);
            dtm.setValueAt(adField.getText(), row, 1);
            dtm.setValueAt(soyadField.getText(), row, 2);
            dtm.setValueAt(programTuru, row, 3);
            dtm.setValueAt(program, row, 4);
            dtm.setValueAt(sehirCB.getSelectedItem(), row, 5);
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void ogrenciTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciTableMouseClicked
        //Tabloda secilen ogrencinin ogrenci numarasi "Ogrenci No"
        //kutucuguna otomatik yerlestirilir.
        int selectedRow=ogrenciTable.getSelectedRow();
        DefaultTableModel dtm=(DefaultTableModel)ogrenciTable.getModel();
        ogrenciNoField.setText((String)dtm.getValueAt(selectedRow, 0));
    }//GEN-LAST:event_ogrenciTableMouseClicked

    private void bolumEkleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolumEkleButtonActionPerformed
        //Klavyeden girilen yeni bolum adi bilgisi alinir ve 
        //agacta secili olan program turu tespit edilir.
        String bolumStr=bolumField.getText();
        String seciliProgramTuru=programTree.getSelectionModel().getSelectionPath().toString().split(",")[1];
        seciliProgramTuru=seciliProgramTuru.substring(1,seciliProgramTuru.length()-1);
        
        //Tespit edilen program turunun altinda klavyeden girilen isim ile
        //yeni node olusturulur. Yeni program icin uygun formatta kod atamasi yapilir.
        for (int i = 0; i < programTurleri.size(); i++) {
            if (programTurleri.get(i).toString().equals(seciliProgramTuru)) {
                DefaultTreeModel model = (DefaultTreeModel) programTree.getModel();
                DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getChild(model.getRoot(), i);
                DefaultMutableTreeNode child = new DefaultMutableTreeNode(bolumStr);
                model.insertNodeInto(child, root, root.getChildCount());
                programlar.get(i).add(bolumStr);
                programKodlari.get(i).add(Integer.parseInt((String)programKodlari.get(i).get(programKodlari.get(i).size()-1))+1);    
            }
        }   
    }//GEN-LAST:event_bolumEkleButtonActionPerformed

    private void bolumGuncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolumGuncelleButtonActionPerformed
        //Klavyeden girilen yeni bolum adi bilgisi alinir ve 
        //Agacta secili olan node'un kendisi ve atasi tespit edilip String'e cevrilir.
        String bolumStr=bolumField.getText();
        String seciliProgram=programTree.getSelectionModel().getSelectionPath().toString().split(",")[2];
        String seciliProgramTuru=programTree.getSelectionModel().getSelectionPath().toString().split(",")[1];
        seciliProgram=seciliProgram.substring(1,seciliProgram.length()-1);
        seciliProgramTuru=seciliProgramTuru.substring(1,seciliProgramTuru.length());
        //Kendisi ve atasi tespit edilen node'un object bilgisi ArrayList'lerden alinir.
        //Ve node kaldirilir ardindan klavyeden girilen yeni bilgi ile yeni node olusturulur.
        for (int i = 0; i < programTurleri.size(); i++) {
            if (programTurleri.get(i).toString().equals(seciliProgramTuru)) {
                for (int j = 0; j < programlar.get(i).size(); j++) {                    
                    if (programlar.get(i).get(j).toString().equals(seciliProgram)) {
                        DefaultTreeModel model = (DefaultTreeModel) programTree.getModel();
                        DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getChild(model.getRoot(), i);
                        DefaultMutableTreeNode child=(DefaultMutableTreeNode)programlar.get(i).get(j);
                        model.removeNodeFromParent(child);
                        model.insertNodeInto(new DefaultMutableTreeNode(bolumStr), root, j);
                    }
                }
            }
        }
    }//GEN-LAST:event_bolumGuncelleButtonActionPerformed

    private void bolumSilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolumSilButtonActionPerformed
        //Agacta secili olan node'un kendisi ve atasi tespit edilip String'e cevrilir.
        String seciliProgram=programTree.getSelectionModel().getSelectionPath().toString().split(",")[2];
        String seciliProgramTuru=programTree.getSelectionModel().getSelectionPath().toString().split(",")[1];
        seciliProgram=seciliProgram.substring(1,seciliProgram.length()-1);
        seciliProgramTuru=seciliProgramTuru.substring(1,seciliProgramTuru.length());
        //Kendisi ve atasi tespit edilen node'un object bilgisi ArrayList'lerden alinir.
        //Ve kaldirma islemi gerceklestirilir.
        for (int i = 0; i < programTurleri.size(); i++) {
            if (programTurleri.get(i).toString().equals(seciliProgramTuru)) {
                for (int j = 0; j < programlar.get(i).size(); j++) {                  
                    if (programlar.get(i).get(j).toString().equals(seciliProgram)) {
                        DefaultTreeModel model = (DefaultTreeModel) programTree.getModel();
                        DefaultMutableTreeNode child=(DefaultMutableTreeNode)programlar.get(i).get(j);
                        model.removeNodeFromParent(child);
                    }
                }
            }
        }
    }//GEN-LAST:event_bolumSilButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OgrenciBilgiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adField;
    private javax.swing.JLabel adLabel;
    private javax.swing.JLabel adresLabel;
    private javax.swing.JToggleButton bolumEkleButton;
    private javax.swing.JTextField bolumField;
    private javax.swing.JToggleButton bolumGuncelleButton;
    private javax.swing.JToggleButton bolumSilButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JButton hepsiniSilButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField ogrenciNoField;
    private javax.swing.JLabel ogrenciNoLabel;
    private javax.swing.JTable ogrenciTable;
    private javax.swing.JTree programTree;
    private javax.swing.JComboBox<String> sehirCB;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadField;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JButton yeniButton;
    // End of variables declaration//GEN-END:variables
}
