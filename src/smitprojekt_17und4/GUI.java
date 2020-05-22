package smitprojekt_17und4;

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

        //Startet die GUI, sodass nur das Hauptmenü am Anfang zu sehen ist.
        programmStarten();
        fehlermeldungGenerieren("\"fehlermeldungGenerieren\" erzeugt diese\nFehlermeldung mit einem String eurer Wahl.");
        ladebildschirmStarten();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnfangJFrame = new javax.swing.JFrame();
        AnfangjPanel = new javax.swing.JPanel();
        picLogo = new javax.swing.JLabel();
        AnfangjProgressBar = new javax.swing.JProgressBar();
        Anfang1jLabel = new javax.swing.JLabel();
        Anfang2jLabel = new javax.swing.JLabel();
        jDialogFehlermeldung = new javax.swing.JDialog();
        jPanelFehlermeldung = new javax.swing.JPanel();
        picDreieck = new javax.swing.JLabel();
        jTextAreaFehlermeldung = new javax.swing.JTextArea();
        jButtonFehlermeldungOk = new javax.swing.JButton();
        jPanelBrett = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHighscore = new javax.swing.JTable();
        jPanelAktuellerSpieler = new javax.swing.JPanel();
        jLabelAktuellerSpieler = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonKarteZiehen = new javax.swing.JButton();
        jLabelEinsatz = new javax.swing.JLabel();
        jTextFieldEinsatz = new javax.swing.JTextField();
        jButtonEinsatz = new javax.swing.JButton();
        jButtonStopp = new javax.swing.JButton();
        jPanelStats = new javax.swing.JPanel();
        jLabelKontostand = new javax.swing.JLabel();
        jLabelKontostandValue = new javax.swing.JLabel();
        Karten_Baenker = new javax.swing.JPanel();
        karte3_Baenker = new javax.swing.JLabel();
        karte2_Baenker = new javax.swing.JLabel();
        karte1_Baenker = new javax.swing.JLabel();
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
        piMenuBackroundMP1PC2 = new javax.swing.JLabel();
        jPanelCredits = new javax.swing.JPanel();
        jPanelCredits1 = new javax.swing.JPanel();
        jButtonZurueckCredits = new javax.swing.JButton();
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
        AnfangJFrame.setMinimumSize(new java.awt.Dimension(250, 400));
        AnfangJFrame.setResizable(false);

        AnfangjPanel.setMaximumSize(null);

        picLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo klein.png"))); // NOI18N

        AnfangjProgressBar.setForeground(new java.awt.Color(0, 102, 51));

        Anfang1jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Anfang1jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang1jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anfang1jLabel.setText("von Timo, Bianca und Lukas");

        Anfang2jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Anfang2jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang2jLabel.setText("Blackjack - 17 und 4");

        javax.swing.GroupLayout AnfangjPanelLayout = new javax.swing.GroupLayout(AnfangjPanel);
        AnfangjPanel.setLayout(AnfangjPanelLayout);
        AnfangjPanelLayout.setHorizontalGroup(
            AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnfangjPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(picLogo)
                        .addGroup(AnfangjPanelLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Anfang1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anfang2jLabel)))
                        .addGroup(AnfangjPanelLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(AnfangjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        AnfangjPanelLayout.setVerticalGroup(
            AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
            .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AnfangjPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(picLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AnfangjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AnfangjPanelLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(Anfang1jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Anfang2jLabel))
                    .addGap(10, 10, 10)
                    .addComponent(AnfangjProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout AnfangJFrameLayout = new javax.swing.GroupLayout(AnfangJFrame.getContentPane());
        AnfangJFrame.getContentPane().setLayout(AnfangJFrameLayout);
        AnfangJFrameLayout.setHorizontalGroup(
            AnfangJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnfangjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AnfangJFrameLayout.setVerticalGroup(
            AnfangJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AnfangjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDialogFehlermeldung.setBackground(new java.awt.Color(255, 255, 255));
        jDialogFehlermeldung.setMaximumSize(new java.awt.Dimension(325, 135));
        jDialogFehlermeldung.setMinimumSize(new java.awt.Dimension(325, 135));
        jDialogFehlermeldung.setPreferredSize(new java.awt.Dimension(325, 135));

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
        setTitle("WIT2B - No.3: 17 und 4 - Blackjack (12.05.2020 - 23.06.2020)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1200, 579));
        setMinimumSize(new java.awt.Dimension(1200, 579));
        setPreferredSize(new java.awt.Dimension(1200, 579));
        setResizable(false);

        jPanelBrett.setBackground(new java.awt.Color(255, 255, 255));
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

        jButtonKarteZiehen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonKarteZiehen.setText("Karte ziehen");
        jButtonKarteZiehen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKarteZiehenActionPerformed(evt);
            }
        });

        jLabelEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEinsatz.setText("Einsatz");

        jButtonEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonEinsatz.setText("Einsatz setzen");
        jButtonEinsatz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEinsatzActionPerformed(evt);
            }
        });

        jButtonStopp.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonStopp.setText("Stop");
        jButtonStopp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStoppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jButtonKarteZiehen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStopp))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelEinsatz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEinsatz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKarteZiehen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEinsatz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStopp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelBrett.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, 80));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
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

        jPanelBrett.add(jPanelStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 50));

        karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Baenker.setAlignmentY(0.0F);

        karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Baenker.setAlignmentY(0.0F);

        karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Baenker.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_BaenkerLayout = new javax.swing.GroupLayout(Karten_Baenker);
        Karten_Baenker.setLayout(Karten_BaenkerLayout);
        Karten_BaenkerLayout.setHorizontalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_BaenkerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(karte1_Baenker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte2_Baenker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(karte3_Baenker)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Karten_BaenkerLayout.setVerticalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Karten_BaenkerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte2_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelBrett.add(Karten_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, 90));

        karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler1.setAlignmentY(0.0F);

        karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler1.setAlignmentY(0.0F);

        karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
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

        jPanelBrett.add(Karten_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 90));

        karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler2.setAlignmentY(0.0F);

        karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler2.setAlignmentY(0.0F);

        karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
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

        jPanelBrett.add(Karten_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, 90));

        karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler3.setAlignmentY(0.0F);

        karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler3.setAlignmentY(0.0F);

        karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
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

        jPanelBrett.add(Karten_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, 90));

        karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler4.setAlignmentY(0.0F);

        karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler4.setAlignmentY(0.0F);

        karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
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

        jPanelBrett.add(Karten_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, 90));

        karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Spieler5.setAlignmentY(0.0F);

        karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Spieler5.setAlignmentY(0.0F);

        karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
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

        jPanelBrett.add(Karten_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, -1, 90));

        picDeck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/quer_Unbenannt.png"))); // NOI18N
        picDeck.setAlignmentY(0.0F);
        jPanelBrett.add(picDeck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        picBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brett.png"))); // NOI18N
        jPanelBrett.add(picBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        piMenuBackround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelBrett.add(piMenuBackround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelOptionen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelOptionen1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelOptionen1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelOptionen1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelOptionen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonZurueckOptionen.setText("Zurück");
        jButtonZurueckOptionen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZurueckOptionen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckOptionenActionPerformed(evt);
            }
        });
        jPanelOptionen1.add(jButtonZurueckOptionen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 117, -1));

        jPanelOptionen.add(jPanelOptionen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackroundMP1PC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelOptionen.add(piMenuBackroundMP1PC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelCredits.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCredits1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCredits1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelCredits1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelCredits1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonZurueckCredits.setText("Zurück");
        jButtonZurueckCredits.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonZurueckCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckCreditsActionPerformed(evt);
            }
        });
        jPanelCredits1.add(jButtonZurueckCredits, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 117, -1));

        jPanelCredits.add(jPanelCredits1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackroundMP1PC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelCredits.add(piMenuBackroundMP1PC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMPInternet.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMPInternet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMPInternet1.setBackground(new java.awt.Color(255, 255, 255));

        ButtonLobbySuchen.setText("Lobby suchen");
        ButtonLobbySuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLobbySuchenActionPerformed(evt);
            }
        });

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

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");

        jButtonZurueck.setText("Zurück");
        jButtonZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMPInternet1Layout = new javax.swing.GroupLayout(jPanelMPInternet1);
        jPanelMPInternet1.setLayout(jPanelMPInternet1Layout);
        jPanelMPInternet1Layout.setHorizontalGroup(
            jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLobbySuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(jButtonZurueck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLobbySuchen)
                .addGap(36, 36, 36))
        );

        jPanelMPInternet.add(jPanelMPInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelMPInternet.add(piMenuBackround3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMP1PC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMP1PC1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMP1PC1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelMP1PC1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnzahlSpielerButton1.setText("Spiel starten");
        AnzahlSpielerButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AnzahlSpielerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnzahlSpielerButton1ActionPerformed(evt);
            }
        });
        jPanelMP1PC1.add(AnzahlSpielerButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 117, -1));

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

        JLabelBänkerMP1PC1.setText("Bank");
        jPanelMP1PC1.add(JLabelBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, -1, -1));
        jPanelMP1PC1.add(JTextlBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 90, -1));

        JLabelSpieler1MP1PC1.setText("Spieler 1");
        jPanelMP1PC1.add(JLabelSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 134, -1, -1));
        jPanelMP1PC1.add(JTextSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 154, 90, -1));

        JLabelSpieler2MP1PC1.setText("Spieler 2");
        jPanelMP1PC1.add(JLabelSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanelMP1PC1.add(JTextSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 195, 90, -1));

        JLabelSpieler3MP1PC1.setText("Spieler 3");
        jPanelMP1PC1.add(JLabelSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 180, -1, -1));
        jPanelMP1PC1.add(JTextSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 195, 91, -1));

        JLabelSpieler4MP1PC1.setText("Spieler 4");
        jPanelMP1PC1.add(JLabelSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, -1, -1));
        jPanelMP1PC1.add(JTextSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 241, 92, -1));

        JLabelSpieler5MP1PC1.setText("Spieler 5");
        jPanelMP1PC1.add(JLabelSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 221, -1, -1));
        jPanelMP1PC1.add(JTextSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 241, 92, -1));

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

        jPanelHauptmenue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Hauptmenue.setBackground(new java.awt.Color(255, 255, 255));

        jButtonMP1PC.setText("Multiplayer (1 PC)");
        jButtonMP1PC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMP1PCActionPerformed(evt);
            }
        });

        jButtonMPInet.setText("Mehrspieler über Internet");
        jButtonMPInet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMPInetActionPerformed(evt);
            }
        });

        jButtonOptionen.setText("Optionen");
        jButtonOptionen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOptionenActionPerformed(evt);
            }
        });

        jButtonCredits.setText("Credits");
        jButtonCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreditsActionPerformed(evt);
            }
        });

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
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelHauptmenue, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKarteZiehenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarteZiehenActionPerformed
        karteZiehenButton();
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        // Das Programm wird beendet
        programmBeenden();
    }//GEN-LAST:event_jButtonStoppActionPerformed

    private void jButtonEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinsatzActionPerformed
        einsatzSetzenButton();
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
    }//GEN-LAST:event_AnzahlSpielerButton1ActionPerformed

    private void ButtonLobbySuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbySuchenActionPerformed
        partie.getEtc().verbinden(TextFieldServerIP.getText(), Integer.parseInt(TextFieldPort.getText()));
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
        zu gucken welcher Spieler momentan am Zug ist und demenstrepchendent
        seine Karten sichtbar zu machen. Somit soll nur der aktuelle Spieler
        seine eigenen Karten sehen und keine Anderen.*/

        // Mit Switch-Case könnte man das tatsächlich am einfachsten lösen.
        switch (partie.getAktuellerSpieler()) {
            // Wenn also der Spieler 0 (Bank) am Zug ist ...
            case 0: {
                // ... und wir uns in der ersten Runde befinden, ...
                if (partie.getRunde() == 1) {
                    // werden seine ersten zwei Karten aufgedeckt.
                    karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(0).getBilderPfad())));
                    karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(1).getBilderPfad())));
                }
                // Befinden wir uns schon in Runde zwei, wird überprüft, ob der Spieler eine dritte Karte hat.
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    // Ist dies der Fall, wird diese aufgedeckt.
                    karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(2).getBilderPfad())));
                }
            }
            case 1: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(0).getBilderPfad())));
                    karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(1).getBilderPfad())));
                }
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(2).getBilderPfad())));
                }
            }
            case 2: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(0).getBilderPfad())));
                    karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(1).getBilderPfad())));
                }
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(2).getBilderPfad())));
                }
            }
            case 3: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(0).getBilderPfad())));
                    karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(1).getBilderPfad())));
                }
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(2).getBilderPfad())));
                }
            }
            case 4: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(0).getBilderPfad())));
                    karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(1).getBilderPfad())));
                }
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(2).getBilderPfad())));
                }
            }
            case 5: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(0).getBilderPfad())));
                    karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(1).getBilderPfad())));

                }
                if (partie.getRunde() == 2 && partie.getSpieler().get(partie.getAktuellerSpieler()).getHand().size() == 3) {
                    karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(2).getBilderPfad())));
                }
                partie.setRunde(2);
            }
            default:
                System.out.println("Fehler");
        }
    }

    private void comboBoxSpielernamenEingeben() {
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

    private void programmStarten() {
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
        karte3_Baenker.setVisible(false);
        karte3_Spieler1.setVisible(false);
        karte3_Spieler2.setVisible(false);
        karte3_Spieler3.setVisible(false);
        karte3_Spieler4.setVisible(false);
        karte3_Spieler5.setVisible(false);
    }

    private void programmBeenden() {
        System.exit(0);
    }

    private void menuMPInternetVisible() {
        // Es wird alles unsichtbar gestellt, außer das "Multiplayer über Internet"-Menü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(true);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    private void menuBrettVisible() {
        // Es wird alles unsichtbar gestellt, außer das Brett
        jPanelBrett.setVisible(true);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    private void menuMP1PCVisible() {
        // Es wird alles unsichtbar gestellt, außer das "Multiplayer an einem Computer"-Menü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(true);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    private void menuHauptmenueVisible() {
        // Es wird alles unsichtbar gestellt, außer das Hauptmenü
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(true);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(false);
    }

    private void menuCreditsVisible() {
        // Es wird alles unsichtbar gestellt, außer die Credits
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(false);
        jPanelCredits.setVisible(true);
    }

    private void menuOptionenVisible() {
        // Es wird alles unsichtbar gestellt, außer die Optionen
        jPanelBrett.setVisible(false);
        jPanelMPInternet.setVisible(false);
        jPanelMP1PC.setVisible(false);
        jPanelHauptmenue.setVisible(false);
        jPanelOptionen.setVisible(true);
        jPanelCredits.setVisible(false);
    }

    private void karteZiehenButton() {
        // Der Button funktioniert nur dann, wenn der Spieler zwei Karten hat.
        if (partie.getSpieler().get(WIDTH).getHand().size() == 2) {
            // Der Spieler zieht eine Karte
            partie.getSpieler().get(partie.getAktuellerSpieler()).karteZiehen(partie.getDeck());
            // Der nächste Spieler ist am Zug
            partie.nächsterSpieler();
            // Die Anzeige des aktuellen Spielers wird aktualisiert.
            spielerAnzeigeUpdaten();
        }
    }

    private void einsatzSetzenButton() {
        /* Sobald der Button gedrückt wird, wird überprüft, ob das Textfeld leer ist und der Einsatz kleiner oder genauso hoch ist, als vom Bänker. */
        if ((!jLabelEinsatz.getText().equals("")) && ((Integer.parseInt(jLabelEinsatz.getText())) <= partie.getSpieler().get(0).getEinsatz())) {
            // Sobald die Überprüfung erfolgreich war, setzt der Spieler seinen Einsatz.
            partie.getSpieler().get(partie.getAktuellerSpieler()).setEinsatz(Integer.parseInt(jTextFieldEinsatz.getText()));
            // Nachdem ist der nächste Spieler am Zug.
            partie.nächsterSpieler();
            // Die Anzeige des Einsatzes wird zurückgesetzt.
            jLabelEinsatz.setText("");
            spielerAnzeigeUpdaten();
        }
    }

    private void spielerAnzeigeUpdaten() {
        // Hier wird überprüft, welcher Spieler momentan am Zug ist und dementsprechend die Anzeige aktualisiert.
        jPanelAktuellerSpieler.setVisible(true);
        jLabelAktuellerSpieler.setText(partie.getSpieler().get(partie.getAktuellerSpieler()).getName() + " ist jetzt am Zug!");
    }

    private void ladebildschirmStarten() {
        // Läuft noch nicht, aber ist glaube auch nicht zwingend notwendig
        AnfangJFrame.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                AnfangjProgressBar.setValue(i);
                AnfangJFrame.setVisible(false);
            }
        } catch (Exception e) {
        }
    }

    private void fehlermeldungGenerieren(String anzeigeText) {
        jTextAreaFehlermeldung.setText(anzeigeText);
        jDialogFehlermeldung.setVisible(true);
        jDialogFehlermeldung.pack();
        jDialogFehlermeldung.setLocationRelativeTo(null);
    }

    private void jFrameInDieMitteSetzen(javax.swing.JFrame JFrame) {
        // Setzt das Fenster ganz einfach in die Mitte des Bildschirms
        JFrame.pack();
        JFrame.setLocationRelativeTo(null);
    }

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
    private javax.swing.JComboBox<String> jComboBoxAnzahlSpielerMP1PC1;
    private javax.swing.JDialog jDialogFehlermeldung;
    private javax.swing.JLabel jLabelAktuellerSpieler;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
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
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHighscore;
    private javax.swing.JTextArea jTextAreaFehlermeldung;
    private javax.swing.JTextArea jTextAreaGebenSieIhrenNamenEin;
    private javax.swing.JTextArea jTextAreaInfoTextMP1PC1;
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
