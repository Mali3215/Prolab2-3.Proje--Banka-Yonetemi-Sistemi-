/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proje3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erayk
 */
public class MusteriTemsilciEkran extends javax.swing.JFrame {
         DefaultTableModel model;
         DefaultTableModel model2;
         Database_Connect baglan=new Database_Connect();
    /**
     * Creates new form MusteriTemsilciEkran
     */
    public MusteriTemsilciEkran() {
        initComponents();
        model= (DefaultTableModel) MusteriTemsilciMusteri_Tablo.getModel();
        model2= (DefaultTableModel) MusteriTemsilci_Tablo.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        MusteriTemsilciMusteri_Tablo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Email = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MusteriTemsilciEkranMusteriVeriGuncelle_b = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MusteriTemsilciEkranMusteriSil_b = new javax.swing.JButton();
        MusteriTemsilciEkranMusteriEkle_b = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MusteriTemsilci_Tablo = new javax.swing.JTable();
        Musteri_Temsilci_Ekran_Guncelle_Email = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Guncelle_Tel = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Guncelle_Adres = new javax.swing.JTextField();
        Musteri_Temsilci_Ekran_Guncelle_Sifre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Musteri_Temsilci_Ekran_Guncelle_AdSoyad = new javax.swing.JTextField();
        MusteriTemsilciEkranVeriGuncelle_b = new javax.swing.JButton();
        MusteriTemsilciEkranHesapEkle_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MusteriTemsilciMusteri_Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CID", "PASSWORD", "NAMESURNAME", "TCNO", "EMAIL", "CREATEDDATE", "TELNR", "USERID", "ADRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MusteriTemsilciMusteri_Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MusteriTemsilciMusteri_TabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MusteriTemsilciMusteri_Tablo);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Telefon No :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Adres :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ad-Soyad :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Şifre :");

        MusteriTemsilciEkranMusteriVeriGuncelle_b.setBackground(new java.awt.Color(51, 0, 255));
        MusteriTemsilciEkranMusteriVeriGuncelle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusteriTemsilciEkranMusteriVeriGuncelle_b.setText("Müşterinin Verilerini Güncelle");
        MusteriTemsilciEkranMusteriVeriGuncelle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriTemsilciEkranMusteriVeriGuncelle_bActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("            MÜŞTERİNİN VERİLERİ");

        MusteriTemsilciEkranMusteriSil_b.setBackground(new java.awt.Color(51, 0, 255));
        MusteriTemsilciEkranMusteriSil_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusteriTemsilciEkranMusteriSil_b.setText("Müşteri Sil");
        MusteriTemsilciEkranMusteriSil_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriTemsilciEkranMusteriSil_bActionPerformed(evt);
            }
        });

        MusteriTemsilciEkranMusteriEkle_b.setBackground(new java.awt.Color(51, 0, 255));
        MusteriTemsilciEkranMusteriEkle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusteriTemsilciEkranMusteriEkle_b.setText("Müşteri Ekle");
        MusteriTemsilciEkranMusteriEkle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriTemsilciEkranMusteriEkle_bActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("   TEMSİLCİNİN      VERİLERİ");

        MusteriTemsilci_Tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "PASSWORD", "NAMESURNAME", "TCNO", "EMAIL", "TELNR", "ADRESS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MusteriTemsilci_Tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MusteriTemsilci_TabloMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(MusteriTemsilci_Tablo);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ad-Soyad :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Şifre :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Email :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Telefon No :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Adres :");

        MusteriTemsilciEkranVeriGuncelle_b.setBackground(new java.awt.Color(51, 0, 255));
        MusteriTemsilciEkranVeriGuncelle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusteriTemsilciEkranVeriGuncelle_b.setText("Temsilcinin Verilerini Güncelle");
        MusteriTemsilciEkranVeriGuncelle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriTemsilciEkranVeriGuncelle_bActionPerformed(evt);
            }
        });

        MusteriTemsilciEkranHesapEkle_b.setBackground(new java.awt.Color(51, 0, 255));
        MusteriTemsilciEkranHesapEkle_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MusteriTemsilciEkranHesapEkle_b.setText("Hesap Ekle");
        MusteriTemsilciEkranHesapEkle_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusteriTemsilciEkranHesapEkle_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(76, 76, 76)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MusteriTemsilciEkranMusteriSil_b, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(MusteriTemsilciEkranMusteriVeriGuncelle_b, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(MusteriTemsilciEkranMusteriEkle_b, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(MusteriTemsilciEkranHesapEkle_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Musteri_Temsilci_Ekran_Guncelle_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(MusteriTemsilciEkranVeriGuncelle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1613, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MusteriTemsilciEkranMusteriSil_b, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(MusteriTemsilciEkranHesapEkle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(MusteriTemsilciEkranVeriGuncelle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Musteri_Temsilci_Ekran_Guncelle_AdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(MusteriTemsilciEkranMusteriVeriGuncelle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MusteriTemsilciEkranMusteriEkle_b, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Musteri_Temsilci_Ekran_Guncelle_Adres, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MusteriTemsilciEkranMusteriVeriGuncelle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriTemsilciEkranMusteriVeriGuncelle_bActionPerformed
        // TODO add your handling code here:

        String yedeksifre=Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre.getText();
        String yedekadsoyad=Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad.getText();
        String yedekemail=Musteri_Temsilci_Ekran_Musteri_Guncelle_Email.getText();
        String yedektel=Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel.getText();
        String yedekadres=Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres.getText();

        if(MusteriTemsilciMusteri_Tablo.getSelectedRow()==-1){

            if(model.getRowCount()!=0){ // Güncellenecek satır seçili değil

                JOptionPane.showMessageDialog(null,"Lütfen güncellenecek satırı seçiniz");
            }

        }
        else{

            int yedekcid=(int) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),0);// 0.sütundaki customerid yi çeker

            baglan.Musteri_Veri_Guncelle(yedekcid,yedeksifre,yedekadsoyad,yedekemail,yedektel,yedekadres);// güncellencek veriler gönderildi

            String x = String.valueOf(model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),7)); // Obje String dönüştürme
            
            Musteri_Veri_Gor(x); // userid gönderildi, temsilciye bağlı olan müşterinin verisi çekildi

            JOptionPane.showMessageDialog(null,"Güncelleme yapıldı");

        }

    }//GEN-LAST:event_MusteriTemsilciEkranMusteriVeriGuncelle_bActionPerformed

    private void MusteriTemsilciEkranMusteriSil_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriTemsilciEkranMusteriSil_bActionPerformed
        // TODO add your handling code here:
       if(MusteriTemsilciMusteri_Tablo.getSelectedRow()==-1){

            if(model.getRowCount()!=0){ // Silinecek satır seçili değil

        JOptionPane.showMessageDialog(null,"Lütfen silinecek müşteriyi seçiniz");
            } 
       }  
       else{ // silinecek satır seçili
           
           int yedekcid=(int) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),0);// 0.sütundaki cid'yi çeker
           baglan.Musteri_Sil(yedekcid); //silinecek satırın cid' si gönderildi
           
            String x = String.valueOf(model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),7)); // Obje String dönüştürme
            Musteri_Veri_Gor(x); // userid gönderildi, temsilciye bağlı olan müşterinin verisi çekildi
            
           JOptionPane.showMessageDialog(null,"Müsteri silindi");
       }
    }//GEN-LAST:event_MusteriTemsilciEkranMusteriSil_bActionPerformed

    private void MusteriTemsilciMusteri_TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MusteriTemsilciMusteri_TabloMouseClicked
        // TODO add your handling code here:

        Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre.setText((String) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),1));// 2.sütun
        Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad.setText((String) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),2));// 3.sütun
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Email.setText((String) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),4)); //5.sütun
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel.setText((String) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),6)); // 7.sütun
        Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres.setText((String) model.getValueAt(MusteriTemsilciMusteri_Tablo.getSelectedRow(),8)); //9.sütun
    }//GEN-LAST:event_MusteriTemsilciMusteri_TabloMouseClicked

    private void MusteriTemsilciEkranMusteriEkle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriTemsilciEkranMusteriEkle_bActionPerformed
        // TODO add your handling code here:
        
    MusteriTemsilciMusteriEkle mtme=new MusteriTemsilciMusteriEkle();
    mtme.setVisible(true);
    
    setVisible(false);
        
    }//GEN-LAST:event_MusteriTemsilciEkranMusteriEkle_bActionPerformed

    private void MusteriTemsilci_TabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MusteriTemsilci_TabloMouseClicked
        // TODO add your handling code here:

       Musteri_Temsilci_Ekran_Guncelle_Sifre.setText((String) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),1));// 2.sütun
        Musteri_Temsilci_Ekran_Guncelle_AdSoyad.setText((String) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),2));// 3.sütun
        Musteri_Temsilci_Ekran_Guncelle_Email.setText((String) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),4)); //5.sütun
        Musteri_Temsilci_Ekran_Guncelle_Tel.setText((String) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),5)); // 7.sütun
        Musteri_Temsilci_Ekran_Guncelle_Adres.setText((String) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),6)); //9.sütun
    }//GEN-LAST:event_MusteriTemsilci_TabloMouseClicked

    private void MusteriTemsilciEkranVeriGuncelle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriTemsilciEkranVeriGuncelle_bActionPerformed
        // TODO add your handling code here:
        String yedeksifre=Musteri_Temsilci_Ekran_Guncelle_Sifre.getText();
        String yedekadsoyad=Musteri_Temsilci_Ekran_Guncelle_AdSoyad.getText();
        String yedekemail=Musteri_Temsilci_Ekran_Guncelle_Email.getText();
        String yedektel=Musteri_Temsilci_Ekran_Guncelle_Tel.getText();
        String yedekadres=Musteri_Temsilci_Ekran_Guncelle_Adres.getText();

        if(MusteriTemsilci_Tablo.getSelectedRow()==-1){

            if(model2.getRowCount()!=0){ // Güncellenecek satır seçili değil

                JOptionPane.showMessageDialog(null,"Lütfen güncellenecek satırı seçiniz");
            }

        }
        else{

            int yedekeid=(int) model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),0);// 0.sütundaki employeeid yi çeker

            baglan.Personel_Veri_Guncelle(yedekeid,yedeksifre,yedekadsoyad,yedekemail,yedektel,yedekadres);// güncellencek veriler gönderildi

            String x = String.valueOf(model2.getValueAt(MusteriTemsilci_Tablo.getSelectedRow(),0)); // Obje String dönüştürme
            
            Personel_Veri_Gor(x); // eid gönderildi, temsilcinin verisi çekildi

            JOptionPane.showMessageDialog(null,"Güncelleme yapıldı");

        }
        
    }//GEN-LAST:event_MusteriTemsilciEkranVeriGuncelle_bActionPerformed

    private void MusteriTemsilciEkranHesapEkle_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusteriTemsilciEkranHesapEkle_bActionPerformed
        // TODO add your handling code here:
    MusteriTemsilciHesapEkle mthe=new MusteriTemsilciHesapEkle();
    mthe.setVisible(true);
    
    setVisible(false);
              
    }//GEN-LAST:event_MusteriTemsilciEkranHesapEkle_bActionPerformed
public void Musteri_Veri_Gor(String ad){
        
        model.setRowCount(0); // Musterileri gosteren tablo her seferınde sıfırlanır
        ArrayList<Musteri> musteri_veri=new ArrayList<Musteri>();
        
        musteri_veri=baglan.Musteri_Temsilci_Musteri_Veri_Getir(ad);
        
        if(musteri_veri != null){
            
         for(Musteri musteri: musteri_veri){
             
         Object[] add_data={musteri.getCID(),musteri.getPASSWORD(),musteri.getNAMESURNAME(),musteri.getTCNO(),
             
                    musteri.getEMAIL(),musteri.getCREATEDDATE(),musteri.getTELNR(),
                    musteri.getUSERID(),musteri.getADRESS()};    
             
            model.addRow(add_data); // tabloya veriler eklendi
             System.out.println("temsilci update musteri");
         }   
            
        }
    }
public void Personel_Veri_Gor(String ad){
    
 model2.setRowCount(0); // Musteri temsilcileri gosteren tablo her seferınde sıfırlanır
 
 ArrayList<Personel> personel_veri=new ArrayList<Personel>();
        
        personel_veri=baglan.Personel_Veri_Getir(ad);   
     if(personel_veri != null){
            
         for(Personel personel: personel_veri){
             
         Object[] add_data={personel.getEID(),personel.getPASSWORD(),personel.getNAMESURNAME(),personel.getTCNO(),
             
                    personel.getEMAIL(),personel.getTELNR(),
                    personel.getADRESS()};    
             
            model2.addRow(add_data); // tabloya veriler eklendi
         }   
            
        }
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
            java.util.logging.Logger.getLogger(MusteriTemsilciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriTemsilciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriTemsilciEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MusteriTemsilciEkranHesapEkle_b;
    private javax.swing.JButton MusteriTemsilciEkranMusteriEkle_b;
    private javax.swing.JButton MusteriTemsilciEkranMusteriSil_b;
    private javax.swing.JButton MusteriTemsilciEkranMusteriVeriGuncelle_b;
    private javax.swing.JButton MusteriTemsilciEkranVeriGuncelle_b;
    private javax.swing.JTable MusteriTemsilciMusteri_Tablo;
    private javax.swing.JTable MusteriTemsilci_Tablo;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Guncelle_AdSoyad;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Guncelle_Adres;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Guncelle_Email;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Guncelle_Sifre;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Guncelle_Tel;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Musteri_Guncelle_AdSoyad;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Musteri_Guncelle_Adres;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Musteri_Guncelle_Email;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Musteri_Guncelle_Sifre;
    private javax.swing.JTextField Musteri_Temsilci_Ekran_Musteri_Guncelle_Tel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}