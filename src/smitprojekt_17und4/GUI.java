package smitprojekt_17und4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {

    private Partie partie = new Partie();
    private int spielerCounter = 0;

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnzahlSpielerJFrame = new javax.swing.JFrame();
        AnzahlSpielerJPanel = new javax.swing.JPanel();
        AnzahlSpielerText = new javax.swing.JLabel();
        AnzahlSpielerButton = new javax.swing.JButton();
        AnzahlSpielerTextField = new javax.swing.JTextField();
        SpielerNameJFrame = new javax.swing.JFrame();
        SpielerNameJPanel = new javax.swing.JPanel();
        SpielernameText = new javax.swing.JLabel();
        SpielernameButton = new javax.swing.JButton();
        SpielernameTextField = new javax.swing.JTextField();
        jPanelBrett = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHighscore = new javax.swing.JTable();
        deck = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonStart = new javax.swing.JButton();
        jButtonKarteZiehen = new javax.swing.JButton();
        jButtonStopp = new javax.swing.JButton();
        jLabelEinsatz = new javax.swing.JLabel();
        jTextFieldEinsatz = new javax.swing.JTextField();
        jPanelStats = new javax.swing.JPanel();
        jLabelPunktestand = new javax.swing.JLabel();
        jLabelKontostand = new javax.swing.JLabel();
        jLabelPunktestandValue = new javax.swing.JLabel();
        jLabelKontostandValue = new javax.swing.JLabel();
        Karten_Baenker = new javax.swing.JPanel();
        karte1_Baenker = new javax.swing.JLabel();
        karte2_Baenker = new javax.swing.JLabel();
        karte3_Baenker = new javax.swing.JLabel();
        Karten_Spieler1 = new javax.swing.JPanel();
        karte1_Spieler1 = new javax.swing.JLabel();
        karte2_Spieler1 = new javax.swing.JLabel();
        karte3_Spieler1 = new javax.swing.JLabel();
        Karten_Spieler2 = new javax.swing.JPanel();
        karte1_Spieler2 = new javax.swing.JLabel();
        karte2_Spieler2 = new javax.swing.JLabel();
        karte3_Spieler2 = new javax.swing.JLabel();
        Karten_Spieler3 = new javax.swing.JPanel();
        karte1_Spieler3 = new javax.swing.JLabel();
        karte2_Spieler3 = new javax.swing.JLabel();
        karte3_Spieler3 = new javax.swing.JLabel();
        Karten_Spieler4 = new javax.swing.JPanel();
        karte1_Spieler4 = new javax.swing.JLabel();
        karte2_Spieler4 = new javax.swing.JLabel();
        karte3_Spieler4 = new javax.swing.JLabel();
        Karten_Spieler5 = new javax.swing.JPanel();
        karte1_Spieler5 = new javax.swing.JLabel();
        karte2_Spieler5 = new javax.swing.JLabel();
        karte3_Spieler5 = new javax.swing.JLabel();
        picBrett = new javax.swing.JLabel();

        AnzahlSpielerText.setText("Geben Sie die Anzahl der Spieler ein.");

        AnzahlSpielerButton.setText("Ok");
        AnzahlSpielerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnzahlSpielerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AnzahlSpielerJPanelLayout = new javax.swing.GroupLayout(AnzahlSpielerJPanel);
        AnzahlSpielerJPanel.setLayout(AnzahlSpielerJPanelLayout);
        AnzahlSpielerJPanelLayout.setHorizontalGroup(
            AnzahlSpielerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnzahlSpielerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnzahlSpielerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnzahlSpielerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnzahlSpielerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AnzahlSpielerJPanelLayout.setVerticalGroup(
            AnzahlSpielerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnzahlSpielerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnzahlSpielerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnzahlSpielerText)
                    .addComponent(AnzahlSpielerButton)
                    .addComponent(AnzahlSpielerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AnzahlSpielerJFrameLayout = new javax.swing.GroupLayout(AnzahlSpielerJFrame.getContentPane());
        AnzahlSpielerJFrame.getContentPane().setLayout(AnzahlSpielerJFrameLayout);
        AnzahlSpielerJFrameLayout.setHorizontalGroup(
            AnzahlSpielerJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
            .addGroup(AnzahlSpielerJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnzahlSpielerJFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AnzahlSpielerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AnzahlSpielerJFrameLayout.setVerticalGroup(
            AnzahlSpielerJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(AnzahlSpielerJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnzahlSpielerJFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AnzahlSpielerJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        SpielernameText.setText("Wie heisst Spieler 1?");

        SpielernameButton.setText("Ok");
        SpielernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpielernameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SpielerNameJPanelLayout = new javax.swing.GroupLayout(SpielerNameJPanel);
        SpielerNameJPanel.setLayout(SpielerNameJPanelLayout);
        SpielerNameJPanelLayout.setHorizontalGroup(
            SpielerNameJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpielerNameJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpielernameText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpielernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpielernameButton)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        SpielerNameJPanelLayout.setVerticalGroup(
            SpielerNameJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpielerNameJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpielerNameJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpielernameText)
                    .addComponent(SpielernameButton)
                    .addComponent(SpielernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SpielerNameJFrameLayout = new javax.swing.GroupLayout(SpielerNameJFrame.getContentPane());
        SpielerNameJFrame.getContentPane().setLayout(SpielerNameJFrameLayout);
        SpielerNameJFrameLayout.setHorizontalGroup(
            SpielerNameJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
            .addGroup(SpielerNameJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SpielerNameJFrameLayout.createSequentialGroup()
                    .addGap(0, 4, Short.MAX_VALUE)
                    .addComponent(SpielerNameJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        SpielerNameJFrameLayout.setVerticalGroup(
            SpielerNameJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(SpielerNameJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SpielerNameJFrameLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SpielerNameJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBrett.setBackground(new java.awt.Color(204, 255, 204));
        jPanelBrett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableHighscore.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableHighscore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Punkte"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHighscore);
        if (jTableHighscore.getColumnModel().getColumnCount() > 0) {
            jTableHighscore.getColumnModel().getColumn(0).setResizable(false);
            jTableHighscore.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanelBrett.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 220, 170));

        deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/quer_Unbenannt.png"))); // NOI18N
        deck.setAlignmentY(0.0F);
        jPanelBrett.add(deck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        jPanelMenu.setBackground(new java.awt.Color(51, 102, 0));

        jButtonStart.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        jButtonKarteZiehen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonKarteZiehen.setText("Karte ziehen");
        jButtonKarteZiehen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKarteZiehenActionPerformed(evt);
            }
        });

        jButtonStopp.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonStopp.setText("Stop");
        jButtonStopp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoppActionPerformed(evt);
            }
        });

        jLabelEinsatz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelEinsatz.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEinsatz.setText("Einsatz");

        jTextFieldEinsatz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEinsatzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jButtonStart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonKarteZiehen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStopp))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelEinsatz)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonKarteZiehen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStopp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEinsatz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEinsatz))
                .addGap(10, 10, 10))
        );

        jPanelBrett.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 240, 80));

        jPanelStats.setBackground(new java.awt.Color(51, 102, 0));

        jLabelPunktestand.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPunktestand.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPunktestand.setText("Punktestand");

        jLabelKontostand.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelKontostand.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKontostand.setText("Kontostand");

        jLabelPunktestandValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPunktestandValue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPunktestandValue.setText("0");

        jLabelKontostandValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelKontostandValue.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKontostandValue.setText("10");

        javax.swing.GroupLayout jPanelStatsLayout = new javax.swing.GroupLayout(jPanelStats);
        jPanelStats.setLayout(jPanelStatsLayout);
        jPanelStatsLayout.setHorizontalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPunktestand)
                    .addComponent(jLabelKontostand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelKontostandValue)
                    .addComponent(jLabelPunktestandValue))
                .addContainerGap())
        );
        jPanelStatsLayout.setVerticalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPunktestandValue)
                    .addComponent(jLabelPunktestand))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKontostand)
                    .addComponent(jLabelKontostandValue))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelBrett.add(jPanelStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 240, 80));

        karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Baenker.setAlignmentY(0.0F);

        karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Baenker.setAlignmentY(0.0F);

        karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Baenker.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_BaenkerLayout = new javax.swing.GroupLayout(Karten_Baenker);
        Karten_Baenker.setLayout(Karten_BaenkerLayout);
        Karten_BaenkerLayout.setHorizontalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_BaenkerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Baenker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Baenker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Baenker)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_BaenkerLayout.setVerticalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_BaenkerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, 90));

        karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Spieler1.setAlignmentY(0.0F);

        karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Spieler1.setAlignmentY(0.0F);

        karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Spieler1.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_Spieler1Layout = new javax.swing.GroupLayout(Karten_Spieler1);
        Karten_Spieler1.setLayout(Karten_Spieler1Layout);
        Karten_Spieler1Layout.setHorizontalGroup(
            Karten_Spieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Spieler1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Spieler1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Spieler1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_Spieler1Layout.setVerticalGroup(
            Karten_Spieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_Spieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, 90));

        karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Spieler2.setAlignmentY(0.0F);

        karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Spieler2.setAlignmentY(0.0F);

        karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Spieler2.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_Spieler2Layout = new javax.swing.GroupLayout(Karten_Spieler2);
        Karten_Spieler2.setLayout(Karten_Spieler2Layout);
        Karten_Spieler2Layout.setHorizontalGroup(
            Karten_Spieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Spieler2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Spieler2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Spieler2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_Spieler2Layout.setVerticalGroup(
            Karten_Spieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_Spieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, 90));

        karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Spieler3.setAlignmentY(0.0F);

        karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Spieler3.setAlignmentY(0.0F);

        karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Spieler3.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_Spieler3Layout = new javax.swing.GroupLayout(Karten_Spieler3);
        Karten_Spieler3.setLayout(Karten_Spieler3Layout);
        Karten_Spieler3Layout.setHorizontalGroup(
            Karten_Spieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Spieler3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Spieler3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Spieler3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_Spieler3Layout.setVerticalGroup(
            Karten_Spieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_Spieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, -1, 90));

        karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Spieler4.setAlignmentY(0.0F);

        karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Spieler4.setAlignmentY(0.0F);

        karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Spieler4.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_Spieler4Layout = new javax.swing.GroupLayout(Karten_Spieler4);
        Karten_Spieler4.setLayout(Karten_Spieler4Layout);
        Karten_Spieler4Layout.setHorizontalGroup(
            Karten_Spieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Spieler4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Spieler4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Spieler4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_Spieler4Layout.setVerticalGroup(
            Karten_Spieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_Spieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, 90));

        karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte1_Spieler5.setAlignmentY(0.0F);

        karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte2_Spieler5.setAlignmentY(0.0F);

        karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten (png)/klein/rückseite.png"))); // NOI18N
        karte3_Spieler5.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_Spieler5Layout = new javax.swing.GroupLayout(Karten_Spieler5);
        Karten_Spieler5.setLayout(Karten_Spieler5Layout);
        Karten_Spieler5Layout.setHorizontalGroup(
            Karten_Spieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte3_Spieler5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Spieler5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte1_Spieler5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_Spieler5Layout.setVerticalGroup(
            Karten_Spieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_Spieler5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_Spieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 90));

        picBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dokumente/brett.png"))); // NOI18N
        jPanelBrett.add(picBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKarteZiehenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarteZiehenActionPerformed
        /* Hier zieht der Spieler eine Karte */
        partie.getSpieler().get(1).karteZiehen(partie.getDeck());
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        /* Durch das Drücken des Stopp-Buttons wird das Spiel gestoppt.*/
    }//GEN-LAST:event_jButtonStoppActionPerformed

    private void jTextFieldEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEinsatzActionPerformed
        /* Durch das Umbennen des Einsatzes wird direkt der Einsatz des 
        Spielers in der Variable live-umgeändert*/
    }//GEN-LAST:event_jTextFieldEinsatzActionPerformed

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        AnzahlSpielerJFrame.setVisible(true);
    }//GEN-LAST:event_jButtonStartActionPerformed

    private void AnzahlSpielerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnzahlSpielerButtonActionPerformed
        // In dieser Abfrage wird die Anzahl der Spieler, im Textfeld angegeben.
        partie.setAnzahlSpieler(Integer.parseInt(AnzahlSpielerTextField.getText()));
        // Das Fenster verschwindet, wenn die Eingabe durch den Button bestätigt wurde.
        AnzahlSpielerJFrame.setVisible(false);
        // Jetzt öffnet sich das Fenster zur Eingabe der Spielernamen.
        SpielerNameJFrame.setVisible(true);
    }//GEN-LAST:event_AnzahlSpielerButtonActionPerformed

    private void SpielernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpielernameButtonActionPerformed
        /* Die Namen der Spieler werden nacheinander eingelesen. Wird der Button
        bestätigt, aktualisiert sich das Fenster und der nächste Spieler wird abgefragt.*/ 
        if (spielerCounter <= partie.getAnzahlSpieler()) {
            partie.getSpieler().add(new Spieler(SpielernameTextField.getText()));
            spielerCounter++;
            SpielernameTextField.setText("");
            SpielernameText.setText("Wie heisst Spieler " + (this.spielerCounter + 1) + "?");
        } else {
            // Sind alle Spielernamen eingegeben, wird das Fenster geschlossen.
            SpielerNameJFrame.setVisible(false);
            partie.highscoreAktuallisieren(jTableHighscore);
        }        
    }//GEN-LAST:event_SpielernameButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnzahlSpielerButton;
    private javax.swing.JFrame AnzahlSpielerJFrame;
    private javax.swing.JPanel AnzahlSpielerJPanel;
    private javax.swing.JLabel AnzahlSpielerText;
    private javax.swing.JTextField AnzahlSpielerTextField;
    private javax.swing.JPanel Karten_Baenker;
    private javax.swing.JPanel Karten_Spieler1;
    private javax.swing.JPanel Karten_Spieler2;
    private javax.swing.JPanel Karten_Spieler3;
    private javax.swing.JPanel Karten_Spieler4;
    private javax.swing.JPanel Karten_Spieler5;
    private javax.swing.JFrame SpielerNameJFrame;
    private javax.swing.JPanel SpielerNameJPanel;
    private javax.swing.JButton SpielernameButton;
    private javax.swing.JLabel SpielernameText;
    private javax.swing.JTextField SpielernameTextField;
    private javax.swing.JLabel deck;
    private javax.swing.JButton jButtonKarteZiehen;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStopp;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
    private javax.swing.JLabel jLabelPunktestand;
    private javax.swing.JLabel jLabelPunktestandValue;
    private javax.swing.JPanel jPanelBrett;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHighscore;
    private javax.swing.JTextField jTextFieldEinsatz;
    private javax.swing.JLabel karte1_Baenker;
    private javax.swing.JLabel karte1_Spieler1;
    private javax.swing.JLabel karte1_Spieler2;
    private javax.swing.JLabel karte1_Spieler3;
    private javax.swing.JLabel karte1_Spieler4;
    private javax.swing.JLabel karte1_Spieler5;
    private javax.swing.JLabel karte2_Baenker;
    private javax.swing.JLabel karte2_Spieler1;
    private javax.swing.JLabel karte2_Spieler2;
    private javax.swing.JLabel karte2_Spieler3;
    private javax.swing.JLabel karte2_Spieler4;
    private javax.swing.JLabel karte2_Spieler5;
    private javax.swing.JLabel karte3_Baenker;
    private javax.swing.JLabel karte3_Spieler1;
    private javax.swing.JLabel karte3_Spieler2;
    private javax.swing.JLabel karte3_Spieler3;
    private javax.swing.JLabel karte3_Spieler4;
    private javax.swing.JLabel karte3_Spieler5;
    private javax.swing.JLabel picBrett;
    // End of variables declaration//GEN-END:variables
}
