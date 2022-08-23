
package bimbellasttry;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainMenu extends javax.swing.JFrame {
    PanelMessage panel = new PanelMessage();
    /**
     * Creates new form MainMenu
     */
    
    public MainMenu() {
        initComponents();

    }
    public final class siswa{
        String nama,email,kelas,level,jamBelajar;

        public siswa() {
        }
        
        public siswa(String nama, String email, String kelas, String level, String jamBelajar) {
            this.nama = nama;
            this.email = email;
            this.kelas = kelas;
            this.level = level;
            this.jamBelajar = jamBelajar;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getKelas() {
            return kelas;
        }

        public void setKelas(String kelas) {
            this.kelas = kelas;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getJamBelajar() {
            return jamBelajar;
        }

        public void setJamBelajar(String jamBelajar) {
            this.jamBelajar = jamBelajar;
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        background1 = new bimbellasttry.background();
        jLabel5 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        mtk = new javax.swing.JRadioButton();
        btnHapus = new javax.swing.JButton();
        basing = new javax.swing.JRadioButton();
        koding = new javax.swing.JRadioButton();
        pemula = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        ahli = new javax.swing.JRadioButton();
        pagi = new javax.swing.JRadioButton();
        siang = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        namaSiswa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailSiswa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        malam = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background1.setRequestFocusEnabled(false);
        background1.setVerifyInputWhenFocusTarget(false);

        jLabel5.setBackground(new java.awt.Color(0, 102, 51));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jam Belajar     :");
        jLabel5.setOpaque(true);

        btnUbah.setText("Ubah Data");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        mtk.setOpaque(true);
        mtk.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(mtk);
        mtk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mtk.setForeground(new java.awt.Color(255, 255, 255));
        mtk.setText("Matematika");
        mtk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        mtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtkActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus Data");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        basing.setOpaque(true);
        basing.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(basing);
        basing.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        basing.setForeground(new java.awt.Color(255, 255, 255));
        basing.setText("Bahasa Inggris");

        koding.setOpaque(true);
        koding.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup1.add(koding);
        koding.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        koding.setForeground(new java.awt.Color(255, 255, 255));
        koding.setText("Pemrograman");

        buttonGroup2.add(pemula);
        pemula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pemula.setForeground(new java.awt.Color(255, 255, 255));
        pemula.setText("Pemula");

        buttonGroup2.add(normal);
        normal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        normal.setForeground(new java.awt.Color(255, 255, 255));
        normal.setText("Normal");

        buttonGroup2.add(ahli);
        ahli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ahli.setForeground(new java.awt.Color(255, 255, 255));
        ahli.setText("Ahli");

        pagi.setOpaque(true);
        pagi.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup3.add(pagi);
        pagi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pagi.setForeground(new java.awt.Color(255, 255, 255));
        pagi.setText("Pagi");

        siang.setOpaque(true);
        siang.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup3.add(siang);
        siang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siang.setForeground(new java.awt.Color(255, 255, 255));
        siang.setText("Siang");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "E-mail", "Kelas", "Level", "Jam Belajar"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        jLabel1.setBackground(new java.awt.Color(0, 102, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nama              :");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 102, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email               :");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kelas               :");
        jLabel3.setOpaque(true);

        malam.setOpaque(true);
        malam.setBackground(new java.awt.Color(0, 102, 51));
        buttonGroup3.add(malam);
        malam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        malam.setForeground(new java.awt.Color(255, 255, 255));
        malam.setText("Malam");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Level              :");

        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnKembali.setText("Kembali");
        btnKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKembaliMouseClicked(evt);
            }
        });
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addContainerGap(225, Short.MAX_VALUE)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mtk)
                                    .addGroup(background1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(koding)
                                            .addComponent(basing)
                                            .addComponent(pagi)
                                            .addComponent(malam)
                                            .addComponent(siang))))
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(normal)
                                    .addComponent(pemula)
                                    .addComponent(ahli)))
                            .addComponent(jLabel5)
                            .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(background1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(namaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(background1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background1Layout.createSequentialGroup()
                                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mtk)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pemula))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(normal))
                            .addComponent(basing, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ahli)
                            .addComponent(koding))
                        .addGap(9, 9, 9)
                        .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siang, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(malam))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtkActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        ArrayList<siswa> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        PanelMessage pan = new PanelMessage();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Tambah Data?","Tambah",dialogButton);
        if (dialogResult == 0){
            siswa sis = new siswa();
      
            String namaBaru,emailBaru,kelasBaru,levelBaru,jamBelajarBaru;
            sis.setNama(namaSiswa.getText());
            namaBaru = sis.getNama();

            sis.setEmail(emailSiswa.getText());
            emailBaru = sis.getEmail();
            if(mtk.isSelected()){
                sis.setKelas(mtk.getText());
                kelasBaru = sis.getKelas();
            }else if(basing.isSelected()){
                sis.setKelas(basing.getText());
                kelasBaru = sis.getKelas();
            }else{
                sis.setKelas(koding.getText());
                kelasBaru = sis.getKelas();
            }
            if(pemula.isSelected()){
                sis.setLevel(pemula.getText());
                levelBaru = sis.getLevel();
            }else if(normal.isSelected()){
                sis.setLevel(normal.getText());
                levelBaru = sis.getLevel();
            }else{
                sis.setLevel(ahli.getText());
                levelBaru = sis.getLevel();
            }
            if(pagi.isSelected()){
                sis.setJamBelajar(pagi.getText());
                jamBelajarBaru = sis.getJamBelajar();
            }else if(basing.isSelected()){
                sis.setJamBelajar(siang.getText());
                jamBelajarBaru = sis.getJamBelajar();
            }else{
                sis.setJamBelajar(malam.getText());
                jamBelajarBaru = sis.getJamBelajar();
            }
            
            if(cekData(namaBaru,emailBaru,kelasBaru,levelBaru,jamBelajarBaru)){
                pan.Error();
            }else{
                sis = new siswa(namaBaru,emailBaru,kelasBaru,levelBaru,jamBelajarBaru);
                list.add(sis);
                Object rowData[] = new Object[5];
                for(int i =0;i< list.size();i++){
                    rowData[0] = list.get(i).nama;
                    rowData[1] = list.get(i).email;
                    rowData[2] = list.get(i).kelas;
                    rowData[3] = list.get(i).level;
                    rowData[4] = list.get(i).jamBelajar;
                    model.addRow(rowData);
                    }
                panel.tambah();
                clearField();
            }
            
        }
    
    }//GEN-LAST:event_btnTambahActionPerformed
    public boolean cekData(String namaBaru,String emailBaru,String kelasBaru,String levelBaru,String jamBelajarBaru){
        ArrayList<siswa> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();

        boolean lanjut = false;
        for(int i = 0;i<model.getRowCount();i++){
                if(namaBaru.equalsIgnoreCase(model.getValueAt(i, 0).toString()) && emailBaru.equalsIgnoreCase(model.getValueAt(i, 1).toString())
                        && kelasBaru.equalsIgnoreCase(model.getValueAt(i, 2).toString()) && levelBaru.equalsIgnoreCase(model.getValueAt(i, 3).toString())
                        && jamBelajarBaru.equalsIgnoreCase(model.getValueAt(i, 4).toString())){
                    lanjut = true;
                }else{
                    lanjut = false;
                }
        }return lanjut;
    }
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ArrayList<siswa> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        int row = tabelData.getSelectedRow();
        int col = tabelData.getColumnCount();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Ubah Data?","Ubah",dialogButton);
        if (dialogResult == 0){
            String nama = model.getValueAt(row,0).toString();
            String email = model.getValueAt(row,1).toString();
            String kelas = model.getValueAt(row, 2).toString();
            String level = model.getValueAt(row, 3).toString();
            String jamBelajar = model.getValueAt(row, 4).toString();

            String namaBaru,emailBaru,kelasBaru,levelBaru,jamBelajarBaru;

            namaBaru = namaSiswa.getText();

            emailBaru = emailSiswa.getText();

            if(mtk.isSelected()){
                kelasBaru = mtk.getText();
            }else if(basing.isSelected()){
                kelasBaru = basing.getText();
            }else{
                kelasBaru = koding.getText();
            }
            if(pemula.isSelected()){
                levelBaru = pemula.getText();
            }else if(normal.isSelected()){
                levelBaru = normal.getText();
            }else{
                levelBaru = ahli.getText();
            }
            if(pagi.isSelected()){
                jamBelajarBaru = pagi.getText();
            }else if(basing.isSelected()){
                jamBelajarBaru = siang.getText();
            }else{
                jamBelajarBaru = malam.getText();
            }


            model.setValueAt(namaBaru, row, 0);
            model.setValueAt(emailBaru, row, 1);
            model.setValueAt(kelasBaru, row, 2);
            model.setValueAt(levelBaru, row, 3);
            model.setValueAt(jamBelajarBaru, row, 4);

            for(int i = 0;i< list.size();i++){
                Object rowData[] = {list.get(i).nama,list.get(i).email,list.get(i).kelas,list.get(i).level,list.get(i).jamBelajar};
                model.addRow(rowData);
            }

            clearField();
            }

        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        int row = tabelData.getSelectedRow();
        int col = tabelData.getColumnCount();

        namaSiswa.setText(model.getValueAt(row,0).toString());
        emailSiswa.setText(model.getValueAt(row,1).toString());
        String kelas = model.getValueAt(row, 2).toString();

        for (int i = 0;i<(buttonGroup1.getButtonCount());i++){
            if(kelas.equalsIgnoreCase(mtk.getText())){
                mtk.setSelected(rootPaneCheckingEnabled);
            }else if(kelas.equalsIgnoreCase(basing.getText())){
                basing.setSelected(rootPaneCheckingEnabled);
            }else{
                koding.setSelected(rootPaneCheckingEnabled);
            }
        }
        String level = model.getValueAt(row, 3).toString();
        for (int i = 0;i<(buttonGroup2.getButtonCount());i++){
            if(level.equalsIgnoreCase(pemula.getText())){
                pemula.setSelected(rootPaneCheckingEnabled);
            }else if(level.equalsIgnoreCase(normal.getText())){
                normal.setSelected(rootPaneCheckingEnabled);
            }else{
                ahli.setSelected(rootPaneCheckingEnabled);
            }
        }
        String jamBelajar = model.getValueAt(row, 4).toString();
        for (int i = 0;i<(buttonGroup3.getButtonCount());i++){
            if(jamBelajar.equalsIgnoreCase(pagi.getText())){
                pagi.setSelected(rootPaneCheckingEnabled);
            }else if(jamBelajar.equalsIgnoreCase(siang.getText())){
                siang.setSelected(rootPaneCheckingEnabled);
            }else{
                malam.setSelected(rootPaneCheckingEnabled);
            }
        }
        
        tabelData.setDefaultEditor(Object.class, null);
        
    }//GEN-LAST:event_tabelDataMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        ArrayList<siswa> list = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) tabelData.getModel();
        int row = tabelData.getSelectedRow();
        int col = tabelData.getColumnCount();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this,"Delete data?","Delete",dialogButton);
        if (dialogResult == 0){
            model.removeRow(row);
            Object rowData[] = new Object[5];
            for(int i =0;i< list.size();i++){
                rowData[0] = list.get(i).nama;
                rowData[1] = list.get(i).email;
                rowData[2] = list.get(i).kelas;
                rowData[3] = list.get(i).level;
                rowData[4] = list.get(i).jamBelajar;
                model.addRow(rowData);
            }
        }
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKembaliMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnKembaliMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed
    private void clearField(){
        namaSiswa.requestFocus();
        namaSiswa.setText("");
        emailSiswa.setText("");
        buttonGroup1.clearSelection();
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ahli;
    private bimbellasttry.background background1;
    private javax.swing.JRadioButton basing;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField emailSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton koding;
    private javax.swing.JRadioButton malam;
    private javax.swing.JRadioButton mtk;
    private javax.swing.JTextField namaSiswa;
    private javax.swing.JRadioButton normal;
    private javax.swing.JRadioButton pagi;
    private javax.swing.JRadioButton pemula;
    private javax.swing.JRadioButton siang;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}
