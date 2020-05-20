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
        JFrameInDieMitteSetzen(AnfangJFrame);

        // Startfenster starten
        setVisible(true);
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
        jPanel2MP1PC = new javax.swing.JPanel();
        AnzahlSpielerButton1 = new javax.swing.JButton();
        TextFieldAnzahlSpieler = new javax.swing.JTextField();
        jTextAreaInfoText = new javax.swing.JTextArea();
        JLabelBänker = new javax.swing.JLabel();
        JTextlBänker = new javax.swing.JTextField();
        JLabelSpieler1 = new javax.swing.JLabel();
        JTextSpieler1 = new javax.swing.JTextField();
        JLabelSpieler2 = new javax.swing.JLabel();
        JTextSpieler2 = new javax.swing.JTextField();
        JLabelSpieler3 = new javax.swing.JLabel();
        JTextSpieler3 = new javax.swing.JTextField();
        JLabelSpieler4 = new javax.swing.JLabel();
        JTextSpieler4 = new javax.swing.JTextField();
        JLabelSpieler5 = new javax.swing.JLabel();
        JTextSpieler5 = new javax.swing.JTextField();
        jButtonZurueck1 = new javax.swing.JButton();
        piMP1PCBackround = new javax.swing.JLabel();
        jPanelHauptmenue = new javax.swing.JPanel();
        jPanel1Hauptmenue = new javax.swing.JPanel();
        jButtonMP1PC = new javax.swing.JButton();
        jButtonMPInet = new javax.swing.JButton();
        jButtonOptionen = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jButtonBeenden = new javax.swing.JButton();
        picLogo1 = new javax.swing.JLabel();
        piMenuBackround = new javax.swing.JLabel();
        jPanelBrett = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHighscore = new javax.swing.JTable();
        deck = new javax.swing.JLabel();
        jPanelAktuellerSpieler = new javax.swing.JPanel();
        jLabelAktuellerSpieler = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jButtonKarteZiehen = new javax.swing.JButton();
        jLabelEinsatz = new javax.swing.JLabel();
        jTextFieldEinsatz = new javax.swing.JTextField();
        jButtonEinsatz = new javax.swing.JButton();
        jButtonStopp = new javax.swing.JButton();
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
        piMenuBackround1 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WIT2B - No.3: 17 und 4 - Blackjack (12.05.2020 - 23.06.2020)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanelMPInternet.setBackground(new java.awt.Color(204, 255, 204));
        jPanelMPInternet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMPInternet1.setBackground(new java.awt.Color(255, 255, 255));

        ButtonLobbySuchen.setText("Lobby suchen");
        ButtonLobbySuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLobbySuchenActionPerformed(evt);
            }
        });

        TextFieldGebenSieIhrenNamenEin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldGebenSieIhrenNamenEinActionPerformed(evt);
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

        TextFieldServerIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldServerIPActionPerformed(evt);
            }
        });

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");

        TextFieldPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPortActionPerformed(evt);
            }
        });

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
                .addGap(20, 20, 20)
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextFieldGebenSieIhrenNamenEin)
                    .addComponent(jTextAreaGebenSieIhrenNamenEin, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addComponent(jTextAreaServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addComponent(TextFieldServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextFieldPort)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMPInternet1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLobbySuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanelMPInternet1Layout.setVerticalGroup(
            jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jButtonZurueck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLobbySuchen)
                .addGap(24, 24, 24))
        );

        jPanelMPInternet.add(jPanelMPInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelMPInternet.add(piMenuBackround3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMP1PC.setBackground(new java.awt.Color(204, 255, 204));
        jPanelMP1PC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2MP1PC.setBackground(new java.awt.Color(255, 255, 255));

        AnzahlSpielerButton1.setText("Spiel starten");
        AnzahlSpielerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnzahlSpielerButton1ActionPerformed(evt);
            }
        });

        TextFieldAnzahlSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAnzahlSpielerActionPerformed(evt);
            }
        });

        jTextAreaInfoText.setEditable(false);
        jTextAreaInfoText.setColumns(20);
        jTextAreaInfoText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaInfoText.setRows(5);
        jTextAreaInfoText.setText("Geben Sie die Anzahl der Spieler ein.\nEs können maximal fünf Spieler und\nein Bänker an einem Spiel teilnehmen.");

        JLabelBänker.setText("Bänker");

        JLabelSpieler1.setText("Spieler 1");

        JLabelSpieler2.setText("Spieler 2");

        JLabelSpieler3.setText("Spieler 3");

        JLabelSpieler4.setText("Spieler 4");

        JLabelSpieler5.setText("Spieler 5");

        JTextSpieler5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextSpieler5ActionPerformed(evt);
            }
        });

        jButtonZurueck1.setText("Zurück");
        jButtonZurueck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueck1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2MP1PCLayout = new javax.swing.GroupLayout(jPanel2MP1PC);
        jPanel2MP1PC.setLayout(jPanel2MP1PCLayout);
        jPanel2MP1PCLayout.setHorizontalGroup(
            jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelSpieler2)
                    .addComponent(JLabelBänker)
                    .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldAnzahlSpieler)
                        .addComponent(jTextAreaInfoText, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addComponent(JTextlBänker, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                        .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                                    .addComponent(JLabelSpieler4)
                                    .addGap(69, 69, 69))
                                .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                                    .addComponent(JTextSpieler2)
                                    .addGap(20, 20, 20)))
                            .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                                .addComponent(JTextSpieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(JTextSpieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2MP1PCLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabelSpieler5)
                                    .addComponent(JTextSpieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelSpieler3)
                                    .addComponent(JTextSpieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelSpieler1))))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2MP1PCLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonZurueck1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(AnzahlSpielerButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64))
        );
        jPanel2MP1PCLayout.setVerticalGroup(
            jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2MP1PCLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTextAreaInfoText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldAnzahlSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelBänker)
                    .addComponent(JLabelSpieler1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextlBänker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextSpieler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelSpieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabelSpieler3))
                .addGap(1, 1, 1)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextSpieler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextSpieler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelSpieler5)
                    .addComponent(JLabelSpieler4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2MP1PCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextSpieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextSpieler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButtonZurueck1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnzahlSpielerButton1)
                .addGap(25, 25, 25))
        );

        jPanelMP1PC.add(jPanel2MP1PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMP1PCBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelMP1PC.add(piMP1PCBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelHauptmenue.setBackground(new java.awt.Color(204, 255, 204));
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

        jPanelBrett.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBrett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableHighscore.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableHighscore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        deck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/quer_Unbenannt.png"))); // NOI18N
        deck.setAlignmentY(0.0F);
        jPanelBrett.add(deck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        jPanelAktuellerSpieler.setBackground(new java.awt.Color(51, 102, 0));
        jPanelAktuellerSpieler.setForeground(new java.awt.Color(51, 102, 0));

        jLabelAktuellerSpieler.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAktuellerSpieler.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAktuellerSpieler.setText("Spieler 1 ist am Zug!");

        javax.swing.GroupLayout jPanelAktuellerSpielerLayout = new javax.swing.GroupLayout(jPanelAktuellerSpieler);
        jPanelAktuellerSpieler.setLayout(jPanelAktuellerSpielerLayout);
        jPanelAktuellerSpielerLayout.setHorizontalGroup(
            jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAktuellerSpielerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAktuellerSpieler)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanelAktuellerSpielerLayout.setVerticalGroup(
            jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanelAktuellerSpielerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAktuellerSpielerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabelAktuellerSpieler)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanelBrett.add(jPanelAktuellerSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 40));

        jPanelMenu.setBackground(new java.awt.Color(51, 102, 0));

        jButtonKarteZiehen.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jButtonKarteZiehen.setText("Karte ziehen");
        jButtonKarteZiehen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKarteZiehenActionPerformed(evt);
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
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jButtonKarteZiehen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEinsatz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonStopp)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelEinsatz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldEinsatz)))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKarteZiehen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEinsatz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonStopp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEinsatz, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jPanelBrett.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 290, 80));

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

        karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Baenker.setAlignmentY(0.0F);

        karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Baenker.setAlignmentY(0.0F);

        karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Spieler1.setAlignmentY(0.0F);

        karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Spieler1.setAlignmentY(0.0F);

        karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Spieler2.setAlignmentY(0.0F);

        karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Spieler2.setAlignmentY(0.0F);

        karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Spieler3.setAlignmentY(0.0F);

        karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Spieler3.setAlignmentY(0.0F);

        karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Spieler4.setAlignmentY(0.0F);

        karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Spieler4.setAlignmentY(0.0F);

        karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte1_Spieler5.setAlignmentY(0.0F);

        karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
        karte2_Spieler5.setAlignmentY(0.0F);

        karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/klein/rückseite.png"))); // NOI18N
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

        picBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brett.png"))); // NOI18N
        jPanelBrett.add(picBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        piMenuBackround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelBrett.add(piMenuBackround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKarteZiehenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarteZiehenActionPerformed
        /* Am Anfang jeder Runde muss jeder Spieler erstmal einen Einsatz legen. */
        kartenBilderUpdaten();
        spielerWechseln();
        if (partie.getAktuellerSpieler() == partie.getSpieler().size()) {
            partie.setAnzahlSpielerCounter(0);
        }
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonStoppActionPerformed

    // Sollte so tatsächlich funktionieren
    private void jButtonEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinsatzActionPerformed
        /* Durch das Umbennen des Einsatzes wird direkt der Einsatz des 
        Spielers in der Variable live-umgeändert*/
        if ((partie.getAktuellerSpieler() <= partie.getSpieler().size()) && (!jLabelEinsatz.getText().equals(""))) {
            partie.getSpieler().get(partie.getAktuellerSpieler()).einsatzSetzen(partie.getEinsatzPool());
            spielerWechseln();
            jLabelEinsatz.setText("");
        }
    }//GEN-LAST:event_jButtonEinsatzActionPerformed

    private void jTextFieldEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEinsatzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEinsatzActionPerformed

    private void jButtonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreditsActionPerformed

    private void jButtonMP1PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMP1PCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMP1PCActionPerformed

    private void jButtonMPInetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMPInetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMPInetActionPerformed

    private void jButtonOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOptionenActionPerformed

    private void jButtonBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeendenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBeendenActionPerformed

    private void AnzahlSpielerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnzahlSpielerButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnzahlSpielerButton1ActionPerformed

    private void JTextSpieler5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextSpieler5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextSpieler5ActionPerformed

    private void TextFieldAnzahlSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAnzahlSpielerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAnzahlSpielerActionPerformed

    private void ButtonLobbySuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbySuchenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonLobbySuchenActionPerformed

    private void TextFieldGebenSieIhrenNamenEinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldGebenSieIhrenNamenEinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldGebenSieIhrenNamenEinActionPerformed

    private void TextFieldServerIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldServerIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldServerIPActionPerformed

    private void TextFieldPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPortActionPerformed

    private void jButtonZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonZurueckActionPerformed

    private void jButtonZurueck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonZurueck1ActionPerformed

    public Partie getPartie() {
        return partie;
    }

    public void kartenBilderUpdaten() {
        switch (partie.getAktuellerSpieler()) {
            case 0: {
                if (partie.getRunde() == 1) {
                    karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(0).getBilderPfad())));
                } else {
                    karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(1).getBilderPfad())));
                    karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(0).getHand().get(2).getBilderPfad())));
                }
            }

            case 1: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(0).getBilderPfad())));
                } else {
                    karte2_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(1).getBilderPfad())));
                    karte3_Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(1).getHand().get(2).getBilderPfad())));
                }
            }
            case 2: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(0).getBilderPfad())));
                } else {
                    karte2_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(1).getBilderPfad())));
                    karte3_Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(2).getHand().get(2).getBilderPfad())));
                }
            }
            case 3: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(0).getBilderPfad())));
                } else {
                    karte2_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(1).getBilderPfad())));
                    karte3_Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(3).getHand().get(2).getBilderPfad())));
                }
            }

            case 4: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(0).getBilderPfad())));

                } else {
                    karte2_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(1).getBilderPfad())));
                    karte3_Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(4).getHand().get(2).getBilderPfad())));
                }
            }

            case 5: {
                if (partie.getRunde() == 1) {
                    karte1_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(0).getBilderPfad())));
                    partie.setRunde(2);
                } else {
                    karte2_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(1).getBilderPfad())));
                    karte3_Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource(partie.getSpieler().get(5).getHand().get(2).getBilderPfad())));
                }
            }
            default: System.out.println("Fehler");
        }
    }

    private void spielerWechseln() {
        jLabelAktuellerSpieler.setText(partie.getSpieler().get(partie.getAktuellerSpieler()).getName() + " ist jetzt am Zug!");
    }

    private void ladebildschirmStarten() {
        AnfangJFrame.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                AnfangjProgressBar.setValue(i);
                AnfangJFrame.setVisible(false);
            }
        } catch (Exception e) {
        }
    }

    private void JFrameInDieMitteSetzen(javax.swing.JFrame JFrame) {
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
    private javax.swing.JLabel JLabelBänker;
    private javax.swing.JLabel JLabelSpieler1;
    private javax.swing.JLabel JLabelSpieler2;
    private javax.swing.JLabel JLabelSpieler3;
    private javax.swing.JLabel JLabelSpieler4;
    private javax.swing.JLabel JLabelSpieler5;
    private javax.swing.JTextField JTextSpieler1;
    private javax.swing.JTextField JTextSpieler2;
    private javax.swing.JTextField JTextSpieler3;
    private javax.swing.JTextField JTextSpieler4;
    private javax.swing.JTextField JTextSpieler5;
    private javax.swing.JTextField JTextlBänker;
    private javax.swing.JPanel Karten_Baenker;
    private javax.swing.JPanel Karten_Spieler1;
    private javax.swing.JPanel Karten_Spieler2;
    private javax.swing.JPanel Karten_Spieler3;
    private javax.swing.JPanel Karten_Spieler4;
    private javax.swing.JPanel Karten_Spieler5;
    private javax.swing.JTextField TextFieldAnzahlSpieler;
    private javax.swing.JTextField TextFieldGebenSieIhrenNamenEin;
    private javax.swing.JTextField TextFieldPort;
    private javax.swing.JTextField TextFieldServerIP;
    private javax.swing.JLabel deck;
    private javax.swing.JButton jButtonBeenden;
    private javax.swing.JButton jButtonCredits;
    private javax.swing.JButton jButtonEinsatz;
    private javax.swing.JButton jButtonKarteZiehen;
    private javax.swing.JButton jButtonMP1PC;
    private javax.swing.JButton jButtonMPInet;
    private javax.swing.JButton jButtonOptionen;
    private javax.swing.JButton jButtonStopp;
    private javax.swing.JButton jButtonZurueck;
    private javax.swing.JButton jButtonZurueck1;
    private javax.swing.JLabel jLabelAktuellerSpieler;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
    private javax.swing.JLabel jLabelPunktestand;
    private javax.swing.JLabel jLabelPunktestandValue;
    private javax.swing.JPanel jPanel1Hauptmenue;
    private javax.swing.JPanel jPanel2MP1PC;
    private javax.swing.JPanel jPanelAktuellerSpieler;
    private javax.swing.JPanel jPanelBrett;
    private javax.swing.JPanel jPanelHauptmenue;
    private javax.swing.JPanel jPanelMP1PC;
    private javax.swing.JPanel jPanelMPInternet;
    private javax.swing.JPanel jPanelMPInternet1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHighscore;
    private javax.swing.JTextArea jTextAreaGebenSieIhrenNamenEin;
    private javax.swing.JTextArea jTextAreaInfoText;
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
    private javax.swing.JLabel piMP1PCBackround;
    private javax.swing.JLabel piMenuBackround;
    private javax.swing.JLabel piMenuBackround1;
    private javax.swing.JLabel piMenuBackround3;
    private javax.swing.JLabel picBrett;
    private javax.swing.JLabel picLogo;
    private javax.swing.JLabel picLogo1;
    // End of variables declaration//GEN-END:variables
}
