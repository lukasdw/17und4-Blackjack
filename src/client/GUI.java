package client;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI extends javax.swing.JFrame {

    private Partie partie = new Partie();

    /* Konstruktor */
    public GUI() {
        initComponents();

        //Setzt das JFrame in die Mitte des Bildschirms
        jFrameInDieMitteSetzen(AnfangJFrame);

        //Startet den LoadingScreen und danach startet das Hauptmenü.
        ladebildschirmStarten();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnfangJFrame = new javax.swing.JFrame();
        AnfangjPanel = new javax.swing.JPanel();
        picLogo = new javax.swing.JLabel();
        Anfang1jLabel = new javax.swing.JLabel();
        Anfang2jLabel = new javax.swing.JLabel();
        AnfangjProgressBar = new javax.swing.JProgressBar();
        jDialogFehlermeldung = new javax.swing.JDialog();
        jPanelFehlermeldung = new javax.swing.JPanel();
        picDreieck = new javax.swing.JLabel();
        jTextAreaFehlermeldung = new javax.swing.JTextArea();
        jButtonFehlermeldungOk = new javax.swing.JButton();
        jPanelBrett = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHighscore = new javax.swing.JTable();
        jPanelRunde = new javax.swing.JPanel();
        jLabelRunde = new javax.swing.JLabel();
        jPanelAktuellerSpieler = new javax.swing.JPanel();
        jLabelAktuellerSpieler = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelEinsatz = new javax.swing.JLabel();
        jTextFieldEinsatz = new javax.swing.JTextField();
        jButtonKarteZiehen = new javax.swing.JButton();
        jButtonEinsatz = new javax.swing.JButton();
        jButtonStopp = new javax.swing.JButton();
        jPanelStats = new javax.swing.JPanel();
        jLabelKontostand = new javax.swing.JLabel();
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
        picDeck = new javax.swing.JLabel();
        picBrett = new javax.swing.JLabel();
        piMenuBackround1 = new javax.swing.JLabel();
        jPanelOptionen = new javax.swing.JPanel();
        jPanelOptionen1 = new javax.swing.JPanel();
        jButtonZurueckOptionen = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxKarten = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        piMenuBackroundMP1PC2 = new javax.swing.JLabel();
        jPanelCredits = new javax.swing.JPanel();
        jPanelCredits1 = new javax.swing.JPanel();
        jButtonZurueckCredits = new javax.swing.JButton();
        jTextAreaInfoTextMP1PC2 = new javax.swing.JTextArea();
        piMenuBackroundMP1PC3 = new javax.swing.JLabel();
        jPanelMPInternet = new javax.swing.JPanel();
        jPanelMPInternet1 = new javax.swing.JPanel();
        ButtonLobbySuchen = new javax.swing.JButton();
        TextFieldGebenSieIhrenNamenEin = new javax.swing.JTextField();
        jTextAreaGebenSieIhrenNamenEin = new javax.swing.JTextArea();
        jTextAreaServerIP = new javax.swing.JTextArea();
        TextFieldServerIP = new javax.swing.JTextField();
        jTextAreaPort = new javax.swing.JTextArea();
        TextFieldPort = new javax.swing.JTextField();
        jButtonZurueck = new javax.swing.JButton();
        jScrollPaneSpieler = new javax.swing.JScrollPane();
        jTableSpieler = new javax.swing.JTable();
        jLabelServerstatus = new javax.swing.JLabel();
        piMenuBackround3 = new javax.swing.JLabel();
        jPanelMP1PC = new javax.swing.JPanel();
        jPanelMP1PC1 = new javax.swing.JPanel();
        AnzahlSpielerButton1 = new javax.swing.JButton();
        jButtonZurueckMP1PC1 = new javax.swing.JButton();
        jTextAreaInfoTextMP1PC1 = new javax.swing.JTextArea();
        JLabelBänkerMP1PC1 = new javax.swing.JLabel();
        JTextlBänkerMP1PC1 = new javax.swing.JTextField();
        JLabelSpieler1MP1PC1 = new javax.swing.JLabel();
        JTextSpieler1MP1PC1 = new javax.swing.JTextField();
        JLabelSpieler2MP1PC1 = new javax.swing.JLabel();
        JTextSpieler2MP1PC1 = new javax.swing.JTextField();
        JLabelSpieler3MP1PC1 = new javax.swing.JLabel();
        JTextSpieler3MP1PC1 = new javax.swing.JTextField();
        JLabelSpieler4MP1PC1 = new javax.swing.JLabel();
        JTextSpieler4MP1PC1 = new javax.swing.JTextField();
        JLabelSpieler5MP1PC1 = new javax.swing.JLabel();
        JTextSpieler5MP1PC1 = new javax.swing.JTextField();
        jComboBoxAnzahlSpielerMP1PC1 = new javax.swing.JComboBox<>();
        piMenuBackroundMP1PC1 = new javax.swing.JLabel();
        jPanelHauptmenue = new javax.swing.JPanel();
        jPanel1Hauptmenue = new javax.swing.JPanel();
        jButtonMP1PC = new javax.swing.JButton();
        jButtonMPInet = new javax.swing.JButton();
        jButtonOptionen = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jButtonBeenden = new javax.swing.JButton();
        picLogo1 = new javax.swing.JLabel();
        piMenuBackround = new javax.swing.JLabel();

        AnfangJFrame.setAlwaysOnTop(true);
        AnfangJFrame.setMinimumSize(new java.awt.Dimension(260, 365));
        AnfangJFrame.setResizable(false);
        AnfangJFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnfangjPanel.setMaximumSize(new java.awt.Dimension(240, 325));
        AnfangjPanel.setMinimumSize(new java.awt.Dimension(240, 325));

        picLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo klein.png"))); // NOI18N

        Anfang1jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Anfang1jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang1jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anfang1jLabel.setText("von Timo, Bianca und Lukas");

        Anfang2jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Anfang2jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang2jLabel.setText("Blackjack - 17 und 4");

        AnfangjProgressBar.setForeground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout AnfangjPanelLayout = new javax.swing.GroupLayout(AnfangjPanel);
        AnfangjPanel.setLayout(AnfangjPanelLayout);
        AnfangjPanelLayout.setHorizontalGroup(
            AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnfangjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AnfangjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnfangjPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(picLogo)
                        .addGroup(AnfangjPanelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Anfang1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anfang2jLabel))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AnfangjPanelLayout.setVerticalGroup(
            AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnfangjPanelLayout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(AnfangjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnfangjPanelLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(picLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AnfangjPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Anfang1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Anfang2jLabel))
                    .addGap(0, 49, Short.MAX_VALUE)))
        );

        AnfangJFrame.getContentPane().add(AnfangjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialogFehlermeldung.setBackground(new java.awt.Color(255, 255, 255));
        jDialogFehlermeldung.setMinimumSize(new java.awt.Dimension(325, 135));

        jPanelFehlermeldung.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFehlermeldung.setMaximumSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setMinimumSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setPreferredSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picDreieck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dreieck.png"))); // NOI18N
        picDreieck.setAlignmentY(0.0F);
        jPanelFehlermeldung.add(picDreieck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jTextAreaFehlermeldung.setEditable(false);
        jTextAreaFehlermeldung.setColumns(20);
        jTextAreaFehlermeldung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaFehlermeldung.setRows(5);
        jTextAreaFehlermeldung.setText("Dieser Text wird in der Funktion verändert.");
        jPanelFehlermeldung.add(jTextAreaFehlermeldung, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 40));

        jButtonFehlermeldungOk.setText("Ok");
        jButtonFehlermeldungOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFehlermeldungOkActionPerformed(evt);
            }
        });
        jPanelFehlermeldung.add(jButtonFehlermeldungOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        javax.swing.GroupLayout jDialogFehlermeldungLayout = new javax.swing.GroupLayout(jDialogFehlermeldung.getContentPane());
        jDialogFehlermeldung.getContentPane().setLayout(jDialogFehlermeldungLayout);
        jDialogFehlermeldungLayout.setHorizontalGroup(
            jDialogFehlermeldungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFehlermeldung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialogFehlermeldungLayout.setVerticalGroup(
            jDialogFehlermeldungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFehlermeldung, javax.swing.GroupLayout.PREFERRED_SIZE, 92, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("(Client) WIT2B - No.3: 17 und 4 - Blackjack (12.05.2020 - 23.06.2020)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1200, 589));
        setMinimumSize(new java.awt.Dimension(1200, 589));
        setPreferredSize(new java.awt.Dimension(1200, 589));
        setResizable(false);

        jPanelBrett.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBrett.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelBrett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableHighscore.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableHighscore.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableHighscore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rolle", "Name", "Punktestand", "Einsatz"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableHighscore);
        if (jTableHighscore.getColumnModel().getColumnCount() > 0) {
            jTableHighscore.getColumnModel().getColumn(0).setResizable(false);
            jTableHighscore.getColumnModel().getColumn(1).setResizable(false);
            jTableHighscore.getColumnModel().getColumn(2).setResizable(false);
            jTableHighscore.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanelBrett.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, 280, 170));

        jPanelRunde.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRunde.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRunde.setForeground(new java.awt.Color(51, 102, 0));

        jLabelRunde.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelRunde.setText("Setze deinen Einsatz!");

        javax.swing.GroupLayout jPanelRundeLayout = new javax.swing.GroupLayout(jPanelRunde);
        jPanelRunde.setLayout(jPanelRundeLayout);
        jPanelRundeLayout.setHorizontalGroup(
            jPanelRundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
            .addGroup(jPanelRundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRundeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelRunde)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelRundeLayout.setVerticalGroup(
            jPanelRundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelRundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRundeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelRunde)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelBrett.add(jPanelRunde, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 200, 40));

        jPanelAktuellerSpieler.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAktuellerSpieler.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelAktuellerSpieler.setForeground(new java.awt.Color(51, 102, 0));

        jLabelAktuellerSpieler.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAktuellerSpieler.setText("Spieler 1 ist am Zug!");

        javax.swing.GroupLayout jPanelAktuellerSpielerLayout = new javax.swing.GroupLayout(jPanelAktuellerSpieler);
        jPanelAktuellerSpieler.setLayout(jPanelAktuellerSpielerLayout);
        jPanelAktuellerSpielerLayout.setHorizontalGroup(
            jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
            .addGroup(jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAktuellerSpielerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAktuellerSpieler)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAktuellerSpielerLayout.setVerticalGroup(
            jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAktuellerSpielerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAktuellerSpieler)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelBrett.add(jPanelAktuellerSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 240, 40));

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenu.setMaximumSize(new java.awt.Dimension(295, 82));
        jPanelMenu.setMinimumSize(new java.awt.Dimension(295, 82));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEinsatz.setText("Einsatz");
        jPanelMenu.add(jLabelEinsatz, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 43, -1, 23));

        jTextFieldEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanelMenu.add(jTextFieldEinsatz, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 47, 220, -1));

        jButtonKarteZiehen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonKarteZiehen.setText("Karte ziehen");
        jButtonKarteZiehen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKarteZiehenActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonKarteZiehen, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 14, -1, 24));

        jButtonEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonEinsatz.setText("Einsatz setzen");
        jButtonEinsatz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEinsatz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEinsatzActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonEinsatz, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 14, 120, 24));

        jButtonStopp.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonStopp.setText("Stop");
        jButtonStopp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoppActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonStopp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 16, -1, 24));

        jPanelBrett.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 310, 80));

        jPanelStats.setBackground(new java.awt.Color(255, 255, 255));
        jPanelStats.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelKontostand.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelKontostand.setText("Kontostand");

        jLabelKontostandValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelKontostandValue.setText("10");

        javax.swing.GroupLayout jPanelStatsLayout = new javax.swing.GroupLayout(jPanelStats);
        jPanelStats.setLayout(jPanelStatsLayout);
        jPanelStatsLayout.setHorizontalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKontostand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabelKontostandValue)
                .addContainerGap())
        );
        jPanelStatsLayout.setVerticalGroup(
            jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKontostand)
                    .addComponent(jLabelKontostandValue))
                .addContainerGap())
        );

        jPanelBrett.add(jPanelStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 260, 50));

        Karten_Baenker.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Baenker.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Baenker.setAlignmentY(0.0F);
        Karten_Baenker.add(karte1_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Baenker.setAlignmentY(0.0F);
        Karten_Baenker.add(karte2_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Baenker.setAlignmentY(0.0F);
        Karten_Baenker.add(karte3_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        jPanelBrett.add(Karten_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 170, 90));

        Karten_Spieler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Spieler1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler1.setAlignmentY(0.0F);
        Karten_Spieler1.add(karte1_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler1.setAlignmentY(0.0F);
        Karten_Spieler1.add(karte2_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Spieler1.setAlignmentY(0.0F);
        Karten_Spieler1.add(karte3_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        jPanelBrett.add(Karten_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 90));

        Karten_Spieler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Spieler2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler2.setAlignmentY(0.0F);
        Karten_Spieler2.add(karte1_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler2.setAlignmentY(0.0F);
        Karten_Spieler2.add(karte2_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Spieler2.setAlignmentY(0.0F);
        Karten_Spieler2.add(karte3_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        jPanelBrett.add(Karten_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, 90));

        Karten_Spieler3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Spieler3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler3.setAlignmentY(0.0F);
        Karten_Spieler3.add(karte1_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler3.setAlignmentY(0.0F);
        Karten_Spieler3.add(karte2_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Spieler3.setAlignmentY(0.0F);
        Karten_Spieler3.add(karte3_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        jPanelBrett.add(Karten_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 170, 90));

        Karten_Spieler4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Spieler4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler4.setAlignmentY(0.0F);
        Karten_Spieler4.add(karte1_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler4.setAlignmentY(0.0F);
        Karten_Spieler4.add(karte2_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Spieler4.setAlignmentY(0.0F);
        Karten_Spieler4.add(karte3_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        jPanelBrett.add(Karten_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 170, 90));

        Karten_Spieler5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Karten_Spieler5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler5.setAlignmentY(0.0F);
        Karten_Spieler5.add(karte1_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 11, -1, 70));

        karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler5.setAlignmentY(0.0F);
        Karten_Spieler5.add(karte2_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 11, -1, 70));

        karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Spieler5.setAlignmentY(0.0F);
        Karten_Spieler5.add(karte3_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 70));

        jPanelBrett.add(Karten_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 170, 90));

        picDeck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/quer_Unbenannt.png"))); // NOI18N
        picDeck.setAlignmentY(0.0F);
        jPanelBrett.add(picDeck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        picBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brett.png"))); // NOI18N
        jPanelBrett.add(picBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        piMenuBackround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelBrett.add(piMenuBackround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelOptionen.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelOptionen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOptionen1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOptionen1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelOptionen1.setMinimumSize(new java.awt.Dimension(250, 400));
        jPanelOptionen1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelOptionen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonZurueckOptionen.setText("Zurück");
        jButtonZurueckOptionen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZurueckOptionen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckOptionenActionPerformed(evt);
            }
        });
        jPanelOptionen1.add(jButtonZurueckOptionen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 117, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox1.setText("Animationen");
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanelOptionen1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 20));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox2.setText("Sounds");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOptionen1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Internet-IP");
        jPanelOptionen1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kartenspiel");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("LAN-IP");
        jPanelOptionen1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sounds und Animationen");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 10));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("192.168.178.64");
        jPanelOptionen1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("87.56.233.77");
        jPanelOptionen1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, -1));

        jComboBoxKarten.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBoxKarten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "52 Karten", "32 Karten" }));
        jPanelOptionen1.add(jComboBoxKarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Internet- und LAN");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 10));

        jPanelOptionen.add(jPanelOptionen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackroundMP1PC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelOptionen.add(piMenuBackroundMP1PC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelCredits.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelCredits.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCredits1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCredits1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelCredits1.setMinimumSize(new java.awt.Dimension(250, 400));
        jPanelCredits1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelCredits1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonZurueckCredits.setText("Zurück");
        jButtonZurueckCredits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZurueckCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckCreditsActionPerformed(evt);
            }
        });
        jPanelCredits1.add(jButtonZurueckCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 117, -1));

        jTextAreaInfoTextMP1PC2.setEditable(false);
        jTextAreaInfoTextMP1PC2.setColumns(20);
        jTextAreaInfoTextMP1PC2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaInfoTextMP1PC2.setRows(5);
        jTextAreaInfoTextMP1PC2.setText("WIT2B - No.3: Blackjack\n(12.05.2020 - 23.06.2020)\n\nDas Spiel, 17 und 4 bzw. Blackjack ist\nein Projekt, welches wir am 12. Juni\nstarteten und am 23. Juni 2020\nvollenden. Am Ende sollen wir vor\nunserer Klasse, unser Programm in\nForm, eines Kundenvortrages\nvorstellen. Jedes Team bestand dabei\naus drei Mitgliedern und wurde mit\ndem Kundenauftrag, \n„homeschooling_WIT2_\nProjektBeschreibung_Black_Jack.pdf“\nins Projekt geschickt.\n\nvon Bianca, Timo und Lukas\naus der WIT2B :)");
        jTextAreaInfoTextMP1PC2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelCredits1.add(jTextAreaInfoTextMP1PC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 210, 290));

        jPanelCredits.add(jPanelCredits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackroundMP1PC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelCredits.add(piMenuBackroundMP1PC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMPInternet.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMPInternet.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelMPInternet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMPInternet1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMPInternet1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelMPInternet1.setMinimumSize(new java.awt.Dimension(250, 400));

        ButtonLobbySuchen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ButtonLobbySuchen.setText("Lobby suchen");
        ButtonLobbySuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLobbySuchenActionPerformed(evt);
            }
        });

        TextFieldGebenSieIhrenNamenEin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TextFieldGebenSieIhrenNamenEin.setText("Testuser");

        jTextAreaGebenSieIhrenNamenEin.setEditable(false);
        jTextAreaGebenSieIhrenNamenEin.setColumns(20);
        jTextAreaGebenSieIhrenNamenEin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaGebenSieIhrenNamenEin.setRows(5);
        jTextAreaGebenSieIhrenNamenEin.setText("Geben Sie ihren Namen ein.");

        jTextAreaServerIP.setEditable(false);
        jTextAreaServerIP.setColumns(20);
        jTextAreaServerIP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaServerIP.setRows(5);
        jTextAreaServerIP.setText("Server-IP\n");

        TextFieldServerIP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TextFieldServerIP.setText("127.0.0.1");

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");

        TextFieldPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        TextFieldPort.setText("1337");
        TextFieldPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPortActionPerformed(evt);
            }
        });

        jButtonZurueck.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonZurueck.setText("Zurück");
        jButtonZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckActionPerformed(evt);
            }
        });

        jTableSpieler.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableSpieler.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableSpieler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rolle", "Name", "IP-Adresse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneSpieler.setViewportView(jTableSpieler);

        jLabelServerstatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelServerstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServerstatus.setText("SERVERSTATUS");

        javax.swing.GroupLayout jPanelMPInternet1Layout = new javax.swing.GroupLayout(jPanelMPInternet1);
        jPanelMPInternet1.setLayout(jPanelMPInternet1Layout);
        jPanelMPInternet1Layout.setHorizontalGroup(
            jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServerstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextFieldGebenSieIhrenNamenEin)
                                .addComponent(jTextAreaGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                                    .addComponent(jTextAreaServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                                    .addComponent(TextFieldServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLobbySuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelMPInternet1Layout.setVerticalGroup(
            jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAreaServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelServerstatus)
                .addGap(16, 16, 16)
                .addComponent(jScrollPaneSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonZurueck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLobbySuchen)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelMPInternet.add(jPanelMPInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelMPInternet.add(piMenuBackround3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMP1PC.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelMP1PC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMP1PC1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMP1PC1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setMinimumSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnzahlSpielerButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        AnzahlSpielerButton1.setText("Spiel starten");
        AnzahlSpielerButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AnzahlSpielerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnzahlSpielerButton1ActionPerformed(evt);
            }
        });
        jPanelMP1PC1.add(AnzahlSpielerButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 117, -1));

        jButtonZurueckMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonZurueckMP1PC1.setText("Zurück");
        jButtonZurueckMP1PC1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZurueckMP1PC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckMP1PC1ActionPerformed(evt);
            }
        });
        jPanelMP1PC1.add(jButtonZurueckMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 117, -1));

        jTextAreaInfoTextMP1PC1.setEditable(false);
        jTextAreaInfoTextMP1PC1.setColumns(20);
        jTextAreaInfoTextMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaInfoTextMP1PC1.setRows(5);
        jTextAreaInfoTextMP1PC1.setText("Geben Sie die Anzahl der Spieler ein.\nEs können maximal fünf Spieler und\nein Bänker an einem Spiel teilnehmen.");
        jPanelMP1PC1.add(jTextAreaInfoTextMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 210, 50));

        JLabelBänkerMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelBänkerMP1PC1.setText("Bank");
        jPanelMP1PC1.add(JLabelBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, -1, -1));

        JTextlBänkerMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextlBänkerMP1PC1.setText("Bank");
        jPanelMP1PC1.add(JTextlBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 90, -1));

        JLabelSpieler1MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelSpieler1MP1PC1.setText("Spieler 1");
        jPanelMP1PC1.add(JLabelSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 134, -1, -1));

        JTextSpieler1MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextSpieler1MP1PC1.setText("Spieler 1");
        jPanelMP1PC1.add(JTextSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 154, 90, -1));

        JLabelSpieler2MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelSpieler2MP1PC1.setText("Spieler 2");
        jPanelMP1PC1.add(JLabelSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        JTextSpieler2MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextSpieler2MP1PC1.setText("Spieler 2");
        jPanelMP1PC1.add(JTextSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        JLabelSpieler3MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelSpieler3MP1PC1.setText("Spieler 3");
        jPanelMP1PC1.add(JLabelSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 180, -1, -1));

        JTextSpieler3MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextSpieler3MP1PC1.setText("Spieler 3");
        jPanelMP1PC1.add(JTextSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 91, -1));

        JLabelSpieler4MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelSpieler4MP1PC1.setText("Spieler 4");
        jPanelMP1PC1.add(JLabelSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        JTextSpieler4MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextSpieler4MP1PC1.setText("Spieler 4");
        jPanelMP1PC1.add(JTextSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 92, -1));

        JLabelSpieler5MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JLabelSpieler5MP1PC1.setText("Spieler 5");
        jPanelMP1PC1.add(JLabelSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        JTextSpieler5MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        JTextSpieler5MP1PC1.setText("Spieler 5");
        jPanelMP1PC1.add(JTextSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 92, -1));

        jComboBoxAnzahlSpielerMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBoxAnzahlSpielerMP1PC1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Bank - 1 Spieler", "1 Bank - 2 Spieler", "1 Bank - 3 Spieler", "1 Bank - 4 Spieler", "1 Bank - 5 Spieler" }));
        jComboBoxAnzahlSpielerMP1PC1.setToolTipText("");
        jComboBoxAnzahlSpielerMP1PC1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanelMP1PC1.add(jComboBoxAnzahlSpielerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 103, 212, -1));

        jPanelMP1PC.add(jPanelMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackroundMP1PC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelMP1PC.add(piMenuBackroundMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelHauptmenue.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelHauptmenue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Hauptmenue.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Hauptmenue.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanel1Hauptmenue.setMinimumSize(new java.awt.Dimension(250, 400));

        jButtonMP1PC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonMP1PC.setText("Multiplayer (1 PC)");
        jButtonMP1PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMP1PCActionPerformed(evt);
            }
        });

        jButtonMPInet.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonMPInet.setText("Mehrspieler über Internet");
        jButtonMPInet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMPInetActionPerformed(evt);
            }
        });

        jButtonOptionen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonOptionen.setText("Optionen");
        jButtonOptionen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionenActionPerformed(evt);
            }
        });

        jButtonCredits.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonCredits.setText("Credits");
        jButtonCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreditsActionPerformed(evt);
            }
        });

        jButtonBeenden.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonBeenden.setText("Beenden");
        jButtonBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeendenActionPerformed(evt);
            }
        });

        picLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo noch kleiner.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1HauptmenueLayout = new javax.swing.GroupLayout(jPanel1Hauptmenue);
        jPanel1Hauptmenue.setLayout(jPanel1HauptmenueLayout);
        jPanel1HauptmenueLayout.setHorizontalGroup(
            jPanel1HauptmenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1HauptmenueLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(picLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1HauptmenueLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1HauptmenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMPInet, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBeenden, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1HauptmenueLayout.setVerticalGroup(
            jPanel1HauptmenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1HauptmenueLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(picLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonMPInet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtonBeenden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanelHauptmenue.add(jPanel1Hauptmenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelHauptmenue.add(piMenuBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelHauptmenue, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(jPanelHauptmenue, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addComponent(jPanelMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 19, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 34, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKarteZiehenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarteZiehenActionPerformed
        karteZiehenButton();
        kartenBilderUpdaten();
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        // Das Programm wird beendet
        programmBeenden();
    }//GEN-LAST:event_jButtonStoppActionPerformed

    private void jButtonEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinsatzActionPerformed
        if (jButtonEinsatz.getText().equals("Einsatz setzen")) {
            einsatzSetzenButton();
        } else if (jButtonEinsatz.getText().equals("Weiter")) {
            weiterZiehenButton();
        }
    }//GEN-LAST:event_jButtonEinsatzActionPerformed

    private void jButtonBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeendenActionPerformed
        // Das Programm wird beendet
        programmBeenden();
    }//GEN-LAST:event_jButtonBeendenActionPerformed

    private void jButtonMP1PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMP1PCActionPerformed
        // Nur das Menü für den Multiplayer an einem Computer, ist sichbar.
        menuMP1PCVisible();
    }//GEN-LAST:event_jButtonMP1PCActionPerformed

    private void jButtonMPInetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMPInetActionPerformed
        // Nur das Menü für den Multiplayer über das Internet, ist sichbar.
        menuMPInternetVisible();
    }//GEN-LAST:event_jButtonMPInetActionPerformed

    private void jButtonZurueckMP1PC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckMP1PC1ActionPerformed
        // Nur das Hauptmenü ist sichbar.
        menuHauptmenueVisible();
    }//GEN-LAST:event_jButtonZurueckMP1PC1ActionPerformed

    private void jButtonZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckActionPerformed
        // Man kehrt zurück zum Hauptmenü zurück. -> (Hauptmenü ist sichbar)
        menuHauptmenueVisible();
    }//GEN-LAST:event_jButtonZurueckActionPerformed

    private void jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible
        /* Wenn eine andere Option gewählt wird, wird dies erkannt und die
        Möglichkeiten der Spielenameneingaben aktualisiert */
        comboBoxSpieleranzahlAnzeigeUpdate();
    }//GEN-LAST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible

    private void AnzahlSpielerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnzahlSpielerButton1ActionPerformed
        comboBoxSpielernamenEingeben();
        partie.highscoreAktuallisieren(jTableHighscore);
        menuBrettVisible();
        starteRunde1();
    }//GEN-LAST:event_AnzahlSpielerButton1ActionPerformed

    private void ButtonLobbySuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbySuchenActionPerformed
        lobbySuchenButton();
    }//GEN-LAST:event_ButtonLobbySuchenActionPerformed

    private void jButtonOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionenActionPerformed
        // Nur die Optionen sind sichbar.
        menuOptionenVisible();
    }//GEN-LAST:event_jButtonOptionenActionPerformed

    private void jButtonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditsActionPerformed
        // Nur die Credits sind sichbar.
        menuCreditsVisible();
    }//GEN-LAST:event_jButtonCreditsActionPerformed

    private void jButtonZurueckCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckCreditsActionPerformed
        menuHauptmenueVisible();
    }//GEN-LAST:event_jButtonZurueckCreditsActionPerformed

    private void jButtonZurueckOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckOptionenActionPerformed
        menuHauptmenueVisible();
    }//GEN-LAST:event_jButtonZurueckOptionenActionPerformed

    private void jButtonFehlermeldungOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFehlermeldungOkActionPerformed
        jDialogFehlermeldung.setVisible(false);
    }//GEN-LAST:event_jButtonFehlermeldungOkActionPerformed

    private void TextFieldPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPortActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public void comboBoxSpieleranzahlAnzeigeUpdate() {
        /* Wenn eine andere Option gewählt wird, wird dies erkannt und die
        Möglichkeiten der Spielenameneingaben aktualisiert */
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 0) {
            JLabelBänkerMP1PC1.setVisible(true);
            JTextlBänkerMP1PC1.setVisible(true);
            JLabelSpieler1MP1PC1.setVisible(true);
            JTextSpieler1MP1PC1.setVisible(true);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 1) {
            JLabelSpieler2MP1PC1.setVisible(true);
            JTextSpieler2MP1PC1.setVisible(true);
        } else {
            JLabelSpieler2MP1PC1.setVisible(false);
            JTextSpieler2MP1PC1.setVisible(false);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 2) {
            JLabelSpieler3MP1PC1.setVisible(true);
            JTextSpieler3MP1PC1.setVisible(true);
        } else {
            JLabelSpieler3MP1PC1.setVisible(false);
            JTextSpieler3MP1PC1.setVisible(false);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 3) {
            JLabelSpieler4MP1PC1.setVisible(true);
            JTextSpieler4MP1PC1.setVisible(true);
        } else {
            JLabelSpieler4MP1PC1.setVisible(false);
            JTextSpieler4MP1PC1.setVisible(false);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() == 4) {
            JLabelSpieler5MP1PC1.setVisible(true);
            JTextSpieler5MP1PC1.setVisible(true);
        } else {
            JLabelSpieler5MP1PC1.setVisible(false);
            JTextSpieler5MP1PC1.setVisible(false);
        }
    }

    public void kartenBilderUpdaten() {
        /* Diese Funktion ist bisher noch übel buggy. Die Idee dahinter war,
        zu gucken welcher Spieler momentan am Zug ist und demenstrechend
        seine Karten sichtbar zu machen. Somit soll nur der aktuelle Spieler
        seine eigenen Karten sehen und keine Anderen.*/

        if (partie.getAktuellerSpieler() == 0) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Baenker.setVisible(true);
                karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(0).getBilderPfad())));
                karte2_Baenker.setVisible(true);
                karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Baenker.setVisible(true);
                karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }

        if (partie.getAktuellerSpieler() == 1) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Spieler1.setVisible(true);
                karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(0).getBilderPfad())));
                karte2_Spieler1.setVisible(true);
                karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Spieler1.setVisible(true);
                karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }

        if (partie.getAktuellerSpieler() == 2) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Spieler2.setVisible(true);
                karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(0).getBilderPfad())));
                karte2_Spieler2.setVisible(true);
                karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Spieler2.setVisible(true);
                karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }

        if (partie.getAktuellerSpieler() == 3) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Spieler3.setVisible(true);
                karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(0).getBilderPfad())));
                karte2_Spieler3.setVisible(true);
                karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Spieler3.setVisible(true);
                karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }

        if (partie.getAktuellerSpieler() == 4) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Spieler4.setVisible(true);
                karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(0).getBilderPfad())));
                karte2_Spieler4.setVisible(true);
                karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Spieler4.setVisible(true);
                karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }

        if (partie.getAktuellerSpieler() == 5) {
            if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
                karte1_Spieler5.setVisible(true);
                karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(0).getBilderPfad())));
                karte2_Spieler5.setVisible(true);
                karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(1).getBilderPfad())));
            } else {
                karte3_Spieler5.setVisible(true);
                karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(2).getBilderPfad())));
            }
        } else {
            karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
            karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
        }
    }

    public void comboBoxSpielernamenEingeben() {
        /* Die erste Option in der Combobox hat den Index 0 und beinhaltet zwei Spieler.
        somit muss bei der Übergabe +2 gerechnet werden.*/
        partie.setAnzahlSpieler(jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() + 2);

        /* Hier wird überprüft welche Spieler mitspielen und somit die Karten
        sichtbar gemacht. */
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 0) {
            partie.spielerNamenEingeben(JTextlBänkerMP1PC1.getText());
            partie.spielerNamenEingeben(JTextSpieler1MP1PC1.getText());
            Karten_Baenker.setVisible(true);
            Karten_Spieler1.setVisible(true);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 1) {
            partie.spielerNamenEingeben(JTextSpieler2MP1PC1.getText());
            Karten_Spieler2.setVisible(true);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 2) {
            partie.spielerNamenEingeben(JTextSpieler3MP1PC1.getText());
            Karten_Spieler3.setVisible(true);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 3) {
            partie.spielerNamenEingeben(JTextSpieler4MP1PC1.getText());
            Karten_Spieler4.setVisible(true);
        }
        if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() == 4) {
            partie.spielerNamenEingeben(JTextSpieler5MP1PC1.getText());
            Karten_Spieler5.setVisible(true);
        }
    }

    public void programmStarten() {
        // Startfenster starten
        setVisible(true);
        menuHauptmenueVisible();

        // MP1PC1-JPanel
        JLabelSpieler2MP1PC1.setVisible(false);
        JTextSpieler2MP1PC1.setVisible(false);
        JLabelSpieler3MP1PC1.setVisible(false);
        JTextSpieler3MP1PC1.setVisible(false);
        JLabelSpieler4MP1PC1.setVisible(false);
        JTextSpieler4MP1PC1.setVisible(false);
        JLabelSpieler5MP1PC1.setVisible(false);
        JTextSpieler5MP1PC1.setVisible(false);

        // Brett-JPanel
        jPanelAktuellerSpieler.setVisible(false);
        Karten_Baenker.setVisible(false);
        Karten_Spieler1.setVisible(false);
        Karten_Spieler2.setVisible(false);
        Karten_Spieler3.setVisible(false);
        Karten_Spieler4.setVisible(false);
        Karten_Spieler5.setVisible(false);

        /* Die dritte Karte wird immer unsichtbar gestellt, da der Spieler
        selbst entscheiden kann, ob er eine Karte in der zweiten Runde ziehen möchte */
        karte1_Baenker.setVisible(false);
        karte2_Baenker.setVisible(false);
        karte3_Baenker.setVisible(false);
        karte1_Spieler1.setVisible(false);
        karte2_Spieler1.setVisible(false);
        karte3_Spieler1.setVisible(false);
        karte1_Spieler2.setVisible(false);
        karte2_Spieler2.setVisible(false);
        karte3_Spieler2.setVisible(false);
        karte1_Spieler3.setVisible(false);
        karte2_Spieler3.setVisible(false);
        karte3_Spieler3.setVisible(false);
        karte1_Spieler4.setVisible(false);
        karte2_Spieler4.setVisible(false);
        karte3_Spieler4.setVisible(false);
        karte1_Spieler5.setVisible(false);
        karte2_Spieler5.setVisible(false);
        karte3_Spieler5.setVisible(false);
    }

    public void programmBeenden() {
        System.exit(0);
    }

    public void menuMPInternetVisible() {
        // Es wird alles unsichtbar gestellt, außer das "Multiplayer über Internet"-Menü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(true);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    public void menuBrettVisible() {
        // Es wird alles unsichtbar gestellt, außer das Brett
        jPanelBrett.setVisible(true);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    public void menuMP1PCVisible() {
        // Es wird alles unsichtbar gestellt, außer das "Multiplayer an einem Computer"-Menü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(true);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    public void menuHauptmenueVisible() {
        // Es wird alles unsichtbar gestellt, außer das Hauptmenü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(true);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    public void menuCreditsVisible() {
        // Es wird alles unsichtbar gestellt, außer die Credits
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(true);
    }

    public void menuOptionenVisible() {
        // Es wird alles unsichtbar gestellt, außer die Optionen
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(true);
        jPanelCredits.setVisible(false);
    }

    public void starteRunde1() {
        partie.setRunde(1);
        jLabelRunde.setText("Setze deinen Einsatz!");
        jButtonKarteZiehen.setVisible(false);
        partie.setAktuellerSpieler(0);
        spielerAnzeigeUpdaten();
    }

    public void starteRunde2() {
        partie.setRunde(2);
        partie.jederZiehtZweiKarten();
        jLabelRunde.setText("Eine weitere Karte?");
        partie.setAktuellerSpieler(0);
        spielerAnzeigeUpdaten();
        kartenBilderUpdaten();
        jButtonKarteZiehen.setVisible(true);
        jButtonEinsatz.setText("Weiter");
    }

    public void schaltflaecheDesAktuellenSpielersFarbigAktuallisieren() {
        if (partie.getAktuellerSpieler() == 0) {
            Karten_Baenker.setBackground(Color.green);
        } else {
            Karten_Baenker.setBackground(Color.white);
        }
        if (partie.getAktuellerSpieler() == 1) {
            Karten_Spieler1.setBackground(Color.green);
        } else {
            Karten_Spieler1.setBackground(Color.white);
        }
        if (partie.getAktuellerSpieler() == 2) {
            Karten_Spieler2.setBackground(Color.green);
        } else {
            Karten_Spieler2.setBackground(Color.white);
        }
        if (partie.getAktuellerSpieler() == 3) {
            Karten_Spieler3.setBackground(Color.green);
        } else {
            Karten_Spieler3.setBackground(Color.white);
        }
        if (partie.getAktuellerSpieler() == 4) {
            Karten_Spieler4.setBackground(Color.green);
        } else {
            Karten_Spieler4.setBackground(Color.white);
        }
        if (partie.getAktuellerSpieler() == 5) {
            Karten_Spieler5.setBackground(Color.green);
        } else {
            Karten_Spieler5.setBackground(Color.white);
        }
    }

    public void einsatzSetzenButton() {
        /* Sobald der Button gedrückt wird, wird überprüft, ob das Textfeld leer ist und der Einsatz kleiner oder genauso hoch ist, als vom Bänker. */
        // && ((Integer.parseInt(jLabelEinsatz.getText())) <= partie.getSpieler().get(0).getEinsatz())
        if ((!jLabelEinsatz.getText().equals("")) && (partie.getRunde() == 1)) {
            // Sobald die Überprüfung erfolgreich war, setzt der Spieler seinen Einsatz.
            partie.getSpieler().get(partie.getAktuellerSpieler()).setEinsatz(Integer.parseInt(jTextFieldEinsatz.getText()));
            partie.highscoreAktuallisieren(jTableHighscore);
            // Die Anzeige des Einsatzes wird zurückgesetzt.
            jTextFieldEinsatz.setText("");
            // Der nächste Spieler ist am Zug
            if (partie.getAktuellerSpieler() == partie.getAnzahlSpieler() - 1) {
                starteRunde2();
            } else {
                partie.nächsterSpieler();
                // Die Anzeige des aktuellen Spielers wird aktualisiert.
                spielerAnzeigeUpdaten();
            }
        } else {
            fehlermeldungGenerieren("Fehler.");
        }
    }

    public void karteZiehenButton() {
        if (partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 2) {
            partie.getSpieler().get(partie.getAktuellerSpieler()).karteZiehen(partie.getDeck());
            kartenBilderUpdaten();
        } else {
            fehlermeldungGenerieren("Fehler.");
        }
    }

    public void weiterZiehenButton() {
        if (partie.getAktuellerSpieler() == partie.getAnzahlSpieler() - 1) {
            jButtonKarteZiehen.setVisible(false);
            jButtonEinsatz.setVisible(false);
            jLabelEinsatz.setVisible(false);
            jTextFieldEinsatz.setVisible(false);
            gewinnerHandPunkteAuswählen();
        } else {
            partie.nächsterSpieler();
            kartenBilderUpdaten();
            spielerAnzeigeUpdaten();
            jButtonKarteZiehen.setText("Karte Ziehen");
        }
    }

    public void lobbySuchenButton() {
        partie.getEtc().verbinden(TextFieldServerIP.getText(), Integer.parseInt(TextFieldPort.getText()), TextFieldGebenSieIhrenNamenEin.getText());
        partie.getEtc().spieleZurLobbyTabelleHinzugefuegen(jTableSpieler);
    }

    public void gewinnerHandPunkteAuswählen() {
        jLabelRunde.setText("Der Gewinner ist...");

        partie.kartenWerteRechnen();

        String[] namen = new String[partie.getAnzahlSpieler()];
        int[] gewinnerHandPunkte = new int[partie.getAnzahlSpieler()];

        for (int i = 0; i < partie.getSpieler().size(); i++) {
            gewinnerHandPunkte[i] = partie.getSpieler().get(i).getHandPunkte();
            namen[i] = partie.getSpieler().get(i).getName();
        }

        int tempGewinnerHandPunkte;
        String tempName;

        for (int i = 1; i < gewinnerHandPunkte.length; i++) {
            for (int j = 0; j < gewinnerHandPunkte.length - i; j++) {
                if (gewinnerHandPunkte[j] < gewinnerHandPunkte[j + 1]) {
                    tempGewinnerHandPunkte = gewinnerHandPunkte[j];
                    tempName = namen[j];
                    gewinnerHandPunkte[j] = gewinnerHandPunkte[j + 1];
                    namen[j] = namen[j + 1];
                    gewinnerHandPunkte[j + 1] = tempGewinnerHandPunkte;
                    namen[j + 1] = tempName;
                }
            }
        }

        for (int i = 1; i < gewinnerHandPunkte.length; i++) {
            if (gewinnerHandPunkte[i] <= 21) {
                System.out.println(i+". Platz - " + namen[i] + ": " + gewinnerHandPunkte[i]);
            }
        }
    }

    public void spielerAnzeigeUpdaten() {
        // Hier wird überprüft, welcher Spieler momentan am Zug ist und dementsprechend die Anzeige aktualisiert.
        jPanelAktuellerSpieler.setVisible(true);
        jLabelAktuellerSpieler.setText(partie.getSpieler().get(partie.getAktuellerSpieler()).getName() + " ist jetzt am Zug!");
        schaltflaecheDesAktuellenSpielersFarbigAktuallisieren();
    }

    public void ladebildschirmStarten() {
        // Läuft noch nicht, aber ist glaube auch nicht zwingend notwendig
        AnfangJFrame.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                AnfangjProgressBar.setValue(i);
            }
            AnfangJFrame.setVisible(false);
            programmStarten();
        } catch (Exception e) {
        }
    }

    public void fehlermeldungGenerieren(String anzeigeText) {
        jTextAreaFehlermeldung.setText(anzeigeText);
        jDialogFehlermeldung.setVisible(true);
        jDialogFehlermeldung.pack();
        jDialogFehlermeldung.setLocationRelativeTo(null);
    }

    public void jFrameInDieMitteSetzen(javax.swing.JFrame JFrame) {
        // Setzt das Fenster ganz einfach in die Mitte des Bildschirms
        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anfang1jLabel;
    private javax.swing.JLabel Anfang2jLabel;
    private javax.swing.JFrame AnfangJFrame;
    private javax.swing.JPanel AnfangjPanel;
    private javax.swing.JProgressBar AnfangjProgressBar;
    private javax.swing.JButton AnzahlSpielerButton1;
    private javax.swing.JButton ButtonLobbySuchen;
    private javax.swing.JLabel JLabelBänkerMP1PC1;
    private javax.swing.JLabel JLabelSpieler1MP1PC1;
    private javax.swing.JLabel JLabelSpieler2MP1PC1;
    private javax.swing.JLabel JLabelSpieler3MP1PC1;
    private javax.swing.JLabel JLabelSpieler4MP1PC1;
    private javax.swing.JLabel JLabelSpieler5MP1PC1;
    private javax.swing.JTextField JTextSpieler1MP1PC1;
    private javax.swing.JTextField JTextSpieler2MP1PC1;
    private javax.swing.JTextField JTextSpieler3MP1PC1;
    private javax.swing.JTextField JTextSpieler4MP1PC1;
    private javax.swing.JTextField JTextSpieler5MP1PC1;
    private javax.swing.JTextField JTextlBänkerMP1PC1;
    private javax.swing.JPanel Karten_Baenker;
    private javax.swing.JPanel Karten_Spieler1;
    private javax.swing.JPanel Karten_Spieler2;
    private javax.swing.JPanel Karten_Spieler3;
    private javax.swing.JPanel Karten_Spieler4;
    private javax.swing.JPanel Karten_Spieler5;
    private javax.swing.JTextField TextFieldGebenSieIhrenNamenEin;
    private javax.swing.JTextField TextFieldPort;
    private javax.swing.JTextField TextFieldServerIP;
    private javax.swing.JButton jButtonBeenden;
    private javax.swing.JButton jButtonCredits;
    private javax.swing.JButton jButtonEinsatz;
    private javax.swing.JButton jButtonFehlermeldungOk;
    private javax.swing.JButton jButtonKarteZiehen;
    private javax.swing.JButton jButtonMP1PC;
    private javax.swing.JButton jButtonMPInet;
    private javax.swing.JButton jButtonOptionen;
    private javax.swing.JButton jButtonStopp;
    private javax.swing.JButton jButtonZurueck;
    private javax.swing.JButton jButtonZurueckCredits;
    private javax.swing.JButton jButtonZurueckMP1PC1;
    private javax.swing.JButton jButtonZurueckOptionen;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBoxAnzahlSpielerMP1PC1;
    private javax.swing.JComboBox<String> jComboBoxKarten;
    private javax.swing.JDialog jDialogFehlermeldung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAktuellerSpieler;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
    private javax.swing.JLabel jLabelRunde;
    private javax.swing.JLabel jLabelServerstatus;
    private javax.swing.JPanel jPanel1Hauptmenue;
    private javax.swing.JPanel jPanelAktuellerSpieler;
    private javax.swing.JPanel jPanelBrett;
    private javax.swing.JPanel jPanelCredits;
    private javax.swing.JPanel jPanelCredits1;
    private javax.swing.JPanel jPanelFehlermeldung;
    private javax.swing.JPanel jPanelHauptmenue;
    private javax.swing.JPanel jPanelMP1PC;
    private javax.swing.JPanel jPanelMP1PC1;
    private javax.swing.JPanel jPanelMPInternet;
    private javax.swing.JPanel jPanelMPInternet1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelOptionen;
    private javax.swing.JPanel jPanelOptionen1;
    private javax.swing.JPanel jPanelRunde;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneSpieler;
    private javax.swing.JTable jTableHighscore;
    private javax.swing.JTable jTableSpieler;
    private javax.swing.JTextArea jTextAreaFehlermeldung;
    private javax.swing.JTextArea jTextAreaGebenSieIhrenNamenEin;
    private javax.swing.JTextArea jTextAreaInfoTextMP1PC1;
    private javax.swing.JTextArea jTextAreaInfoTextMP1PC2;
    private javax.swing.JTextArea jTextAreaPort;
    private javax.swing.JTextArea jTextAreaServerIP;
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
    private javax.swing.JLabel piMenuBackround;
    private javax.swing.JLabel piMenuBackround1;
    private javax.swing.JLabel piMenuBackround3;
    private javax.swing.JLabel piMenuBackroundMP1PC1;
    private javax.swing.JLabel piMenuBackroundMP1PC2;
    private javax.swing.JLabel piMenuBackroundMP1PC3;
    private javax.swing.JLabel picBrett;
    private javax.swing.JLabel picDeck;
    private javax.swing.JLabel picDreieck;
    private javax.swing.JLabel picLogo;
    private javax.swing.JLabel picLogo1;
    // End of variables declaration//GEN-END:variables
}
