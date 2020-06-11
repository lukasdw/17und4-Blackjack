package client;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GUI extends javax.swing.JFrame {

    private ClientController controller = new ClientController(this);

    private javax.swing.JLabel spielerKartenJLabelArray[][] = new javax.swing.JLabel[6][3];
    private javax.swing.JLabel spielerCoins[][] = new javax.swing.JLabel[6][2];
    private javax.swing.JTextField comboBoxSpieleranzahlJTextArray[] = new javax.swing.JTextField[6];
    private javax.swing.JLabel comboBoxSpieleranzahlJLabelArray[] = new javax.swing.JLabel[6];
    private javax.swing.JPanel spielerKartenJPanelArray[] = new javax.swing.JPanel[6];

    /* Konstruktor */
    public GUI() {
        initComponents();
        //Startet den LoadingScreen und danach startet das Hauptmenü.
        ladebildschirmStarten();
        arraysFuellen();
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
        jPanelHauptmenue = new javax.swing.JPanel();
        jPanel1Hauptmenue = new javax.swing.JPanel();
        jButtonMP1PC = new javax.swing.JButton();
        jButtonMPInet = new javax.swing.JButton();
        jButtonOptionen = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jButtonBeenden = new javax.swing.JButton();
        picLogo1 = new javax.swing.JLabel();
        piMenuBackround = new javax.swing.JLabel();
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
        jPanelOptionen = new javax.swing.JPanel();
        jPanelOptionen1 = new javax.swing.JPanel();
        jButtonZurueckOptionen = new javax.swing.JButton();
        jCheckBoxAnimation = new javax.swing.JCheckBox();
        jCheckBoxSounds = new javax.swing.JCheckBox();
        jLabelInternetText = new javax.swing.JLabel();
        jLabelKartenspielAnzeige = new javax.swing.JLabel();
        jLabelLANIPText = new javax.swing.JLabel();
        jLabelSoundUndAnimationAnzeige = new javax.swing.JLabel();
        jLabelLANIP = new javax.swing.JLabel();
        jLabelInternetIP = new javax.swing.JLabel();
        jLabelInternetUndLANAnzeige = new javax.swing.JLabel();
        jComboBoxKarten = new javax.swing.JComboBox<>();
        piMenuBackroundMP1PC2 = new javax.swing.JLabel();
        jPanelCredits = new javax.swing.JPanel();
        jPanelCredits1 = new javax.swing.JPanel();
        jButtonZurueckCredits = new javax.swing.JButton();
        jTextAreaInfoTextMP1PC2 = new javax.swing.JTextArea();
        piMenuBackroundMP1PC3 = new javax.swing.JLabel();
        jPanelBrett = new javax.swing.JPanel();
        BankCoin1 = new javax.swing.JLabel();
        BankCoin2 = new javax.swing.JLabel();
        Spieler1Coin1 = new javax.swing.JLabel();
        Spieler1Coin2 = new javax.swing.JLabel();
        Spieler2Coin1 = new javax.swing.JLabel();
        Spieler2Coin2 = new javax.swing.JLabel();
        Spieler3Coin1 = new javax.swing.JLabel();
        Spieler3Coin2 = new javax.swing.JLabel();
        Spieler4Coin1 = new javax.swing.JLabel();
        Spieler4Coin2 = new javax.swing.JLabel();
        Spieler5Coin1 = new javax.swing.JLabel();
        Spieler5Coin2 = new javax.swing.JLabel();
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

        AnfangJFrame.setAlwaysOnTop(true);
        AnfangJFrame.setMinimumSize(new java.awt.Dimension(250, 365));
        AnfangJFrame.setResizable(false);
        AnfangJFrame.setSize(new java.awt.Dimension(250, 365));
        AnfangJFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AnfangjPanel.setMaximumSize(new java.awt.Dimension(240, 325));
        AnfangjPanel.setMinimumSize(new java.awt.Dimension(240, 325));
        AnfangjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo klein.png"))); // NOI18N
        AnfangjPanel.add(picLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, 220));

        Anfang1jLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Anfang1jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang1jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Anfang1jLabel.setText("von Timo, Bianca und Lukas");
        AnfangjPanel.add(Anfang1jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, 180, 30));

        Anfang2jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Anfang2jLabel.setForeground(new java.awt.Color(0, 51, 0));
        Anfang2jLabel.setText("Blackjack - 17 und 4");
        AnfangjPanel.add(Anfang2jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 226, -1, -1));

        AnfangjProgressBar.setForeground(new java.awt.Color(0, 102, 51));
        AnfangjPanel.add(AnfangjProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 22));

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
        setMinimumSize(new java.awt.Dimension(1200, 579));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 579));

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

        jCheckBoxAnimation.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxAnimation.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBoxAnimation.setText("Animationen");
        jCheckBoxAnimation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOptionen1.add(jCheckBoxAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 20));

        jCheckBoxSounds.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxSounds.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBoxSounds.setText("Sounds");
        jCheckBoxSounds.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBoxSounds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanelOptionen1.add(jCheckBoxSounds, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 20));

        jLabelInternetText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelInternetText.setText("Internet-IP");
        jPanelOptionen1.add(jLabelInternetText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabelKartenspielAnzeige.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelKartenspielAnzeige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKartenspielAnzeige.setText("Kartenspiel");
        jLabelKartenspielAnzeige.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabelKartenspielAnzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 10));

        jLabelLANIPText.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelLANIPText.setText("LAN-IP");
        jPanelOptionen1.add(jLabelLANIPText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabelSoundUndAnimationAnzeige.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelSoundUndAnimationAnzeige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSoundUndAnimationAnzeige.setText("Sounds und Animationen");
        jLabelSoundUndAnimationAnzeige.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabelSoundUndAnimationAnzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 190, 10));

        jLabelLANIP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelLANIP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLANIP.setText("192.168.178.64");
        jPanelOptionen1.add(jLabelLANIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 110, -1));

        jLabelInternetIP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelInternetIP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelInternetIP.setText("87.56.233.77");
        jPanelOptionen1.add(jLabelInternetIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 110, -1));

        jLabelInternetUndLANAnzeige.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelInternetUndLANAnzeige.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInternetUndLANAnzeige.setText("Internet- und LAN");
        jLabelInternetUndLANAnzeige.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanelOptionen1.add(jLabelInternetUndLANAnzeige, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 10));

        jComboBoxKarten.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBoxKarten.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "52 Karten", "32 Karten" }));
        jPanelOptionen1.add(jComboBoxKarten, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 190, 20));

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

        jPanelBrett.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBrett.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelBrett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BankCoin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BankCoin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(BankCoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, 30));

        BankCoin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BankCoin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(BankCoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 30, 30));

        Spieler1Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler1Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(Spieler1Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 30, 30));

        Spieler1Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler1Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(Spieler1Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 30, 30));

        Spieler2Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler2Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(Spieler2Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 30, 30));

        Spieler2Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler2Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(Spieler2Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 30, 30));

        Spieler3Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler3Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(Spieler3Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 30, 30));

        Spieler3Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler3Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(Spieler3Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 30, 30));

        Spieler4Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler4Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(Spieler4Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 30, 30));

        Spieler4Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler4Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(Spieler4Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 30, 30));

        Spieler5Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler5Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-blau.png"))); // NOI18N
        jPanelBrett.add(Spieler5Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 30, 30));

        Spieler5Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Spieler5Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chip-rot.png"))); // NOI18N
        jPanelBrett.add(Spieler5Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 30, 30));

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

        jLabelEinsatz.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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

        Karten_Baenker.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Baenker.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        karte1_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte1_Baenker.setAlignmentY(0.0F);

        karte2_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte2_Baenker.setAlignmentY(0.0F);

        karte3_Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        karte3_Baenker.setAlignmentY(0.0F);

        javax.swing.GroupLayout Karten_BaenkerLayout = new javax.swing.GroupLayout(Karten_Baenker);
        Karten_Baenker.setLayout(Karten_BaenkerLayout);
        Karten_BaenkerLayout.setHorizontalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_BaenkerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte1_Baenker)
                .addGap(6, 6, 6)
                .addComponent(karte2_Baenker)
                .addGap(6, 6, 6)
                .addComponent(karte3_Baenker))
        );
        Karten_BaenkerLayout.setVerticalGroup(
            Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_BaenkerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_BaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte1_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte3_Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Baenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 170, 90));

        Karten_Spieler1.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Spieler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(Karten_Spieler1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte3_Spieler1)
                .addGap(6, 6, 6)
                .addComponent(karte2_Spieler1)
                .addGap(6, 6, 6)
                .addComponent(karte1_Spieler1))
        );
        Karten_Spieler1Layout.setVerticalGroup(
            Karten_Spieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_Spieler1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_Spieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte3_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Spieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 90));

        Karten_Spieler2.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Spieler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(Karten_Spieler2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte3_Spieler2)
                .addGap(6, 6, 6)
                .addComponent(karte2_Spieler2)
                .addGap(6, 6, 6)
                .addComponent(karte1_Spieler2))
        );
        Karten_Spieler2Layout.setVerticalGroup(
            Karten_Spieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_Spieler2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_Spieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte3_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Spieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, 90));

        Karten_Spieler3.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Spieler3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(Karten_Spieler3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte3_Spieler3)
                .addGap(6, 6, 6)
                .addComponent(karte2_Spieler3)
                .addGap(6, 6, 6)
                .addComponent(karte1_Spieler3))
        );
        Karten_Spieler3Layout.setVerticalGroup(
            Karten_Spieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_Spieler3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_Spieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte3_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Spieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 170, 90));

        Karten_Spieler4.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Spieler4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(Karten_Spieler4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte3_Spieler4)
                .addGap(6, 6, 6)
                .addComponent(karte2_Spieler4)
                .addGap(6, 6, 6)
                .addComponent(karte1_Spieler4))
        );
        Karten_Spieler4Layout.setVerticalGroup(
            Karten_Spieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_Spieler4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_Spieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte3_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Spieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 170, 90));

        Karten_Spieler5.setBackground(new java.awt.Color(9, 86, 6));
        Karten_Spieler5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
            .addGroup(Karten_Spieler5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(karte3_Spieler5)
                .addGap(6, 6, 6)
                .addComponent(karte2_Spieler5)
                .addGap(6, 6, 6)
                .addComponent(karte1_Spieler5))
        );
        Karten_Spieler5Layout.setVerticalGroup(
            Karten_Spieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Karten_Spieler5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(Karten_Spieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karte3_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte2_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(karte1_Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(Karten_Spieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 170, 90));

        picDeck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/quer_Unbenannt.png"))); // NOI18N
        picDeck.setAlignmentY(0.0F);
        jPanelBrett.add(picDeck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        picBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brett.png"))); // NOI18N
        jPanelBrett.add(picBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        piMenuBackround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelBrett.add(piMenuBackround1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelHauptmenue, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBrett, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelHauptmenue, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMP1PC, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelMPInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelOptionen, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKarteZiehenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKarteZiehenActionPerformed
        karteZiehenButton();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        // Das Programm wird beendet
        programmBeenden();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonStoppActionPerformed

    private void jButtonEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinsatzActionPerformed
        if (jButtonEinsatz.getText().equals("Einsatz setzen")) {
            einsatzSetzenButton();
        } else if (jButtonEinsatz.getText().equals("Weiter")) {
            weiterZiehenButton();
        } else {
            starteRunde1_EinsatzSetzen();
        }
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonEinsatzActionPerformed

    private void jButtonBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeendenActionPerformed
        // Das Programm wird beendet
        programmBeenden();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonBeendenActionPerformed

    private void jButtonMP1PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMP1PCActionPerformed
        // Nur das Menü für den Multiplayer an einem Computer, ist sichbar.
        menuMP1PCVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonMP1PCActionPerformed

    private void jButtonMPInetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMPInetActionPerformed
        // Nur das Menü für den Multiplayer über das Internet, ist sichbar.
        menuMPInternetVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonMPInetActionPerformed

    private void jButtonZurueckMP1PC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckMP1PC1ActionPerformed
        // Nur das Hauptmenü ist sichbar.
        menuHauptmenueVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckMP1PC1ActionPerformed

    private void jButtonZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckActionPerformed
        // Man kehrt zurück zum Hauptmenü zurück. -> (Hauptmenü ist sichbar)
        menuHauptmenueVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckActionPerformed

    private void jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible
        /* Wenn eine andere Option gewählt wird, wird dies erkannt und die
        Möglichkeiten der Spielenameneingaben aktualisiert */
        comboBoxSpieleranzahlAnzeigeUpdate();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible

    private void AnzahlSpielerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnzahlSpielerButton1ActionPerformed
        comboBoxSpielernamenEingeben();
        controller.highscoreAktuallisieren(jTableHighscore);
        menuBrettVisible();
        starteRunde1_EinsatzSetzen();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_AnzahlSpielerButton1ActionPerformed

    private void ButtonLobbySuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbySuchenActionPerformed
        lobbySuchenButton();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_ButtonLobbySuchenActionPerformed

    private void jButtonOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionenActionPerformed
        // Nur die Optionen sind sichbar.
        menuOptionenVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonOptionenActionPerformed

    private void jButtonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditsActionPerformed
        // Nur die Credits sind sichbar.
        menuCreditsVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonCreditsActionPerformed

    private void jButtonZurueckCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckCreditsActionPerformed
        menuHauptmenueVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckCreditsActionPerformed

    private void jButtonZurueckOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckOptionenActionPerformed
        menuHauptmenueVisible();
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckOptionenActionPerformed

    private void jButtonFehlermeldungOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFehlermeldungOkActionPerformed
        jDialogFehlermeldung.setVisible(false);
        controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonFehlermeldungOkActionPerformed

    public void comboBoxSpieleranzahlAnzeigeUpdate() {
        /* Wenn eine andere Option gewählt wird, wird dies erkannt und die
        Möglichkeiten der Spielenameneingaben aktualisiert */
        for (int i = 0; i < jComboBoxAnzahlSpielerMP1PC1.getItemCount(); i++) {
            if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= 0) {
                comboBoxSpieleranzahlJLabelArray[0].setVisible(true);
                comboBoxSpieleranzahlJTextArray[0].setVisible(true);
                comboBoxSpieleranzahlJLabelArray[1].setVisible(true);
                comboBoxSpieleranzahlJTextArray[1].setVisible(true);
            }
            if (jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() >= i) {
                comboBoxSpieleranzahlJTextArray[i + 1].setVisible(true);
                comboBoxSpieleranzahlJLabelArray[i + 1].setVisible(true);
            } else {
                comboBoxSpieleranzahlJTextArray[i + 1].setVisible(false);
                comboBoxSpieleranzahlJLabelArray[i + 1].setVisible(false);
            }
        }
    }

    public void KartenBilderUpdaten_aktuellerSpieler() {
        /* Hier wird geschaut, welcher Spieler zurzeit am Zug ist und demenstrechend
        seine Karten sichtbar gemacht. Somit soll nur der aktuelle Spieler
        seine eigenen Karten sehen und die Anderen Karten unsichtbar gemacht werden.*/
        for (int spieler = 0; spieler < controller.getSpieler().size(); spieler++) {
            for (int karten = 0; karten < controller.getSpieler().get(spieler).getHand().size(); karten++) {
                if (controller.getAktuellerSpieler() == spieler) {
                    // Gehört die Karte dem aktuellen Spieler wird das demensprechende Kartenbild geladen und sichtbar gemacht.
                    spielerKartenJLabelArray[spieler][karten].setVisible(true);
                    spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource(controller.getSpieler().get(spieler).getHand().get(karten).getBilderPfad())));
                } else {
                    // Gehört die Karte nicht dem aktuellen Spieler wird die Rückseite der Karte angezeigt.
                    spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
                }
            }
        }
    }

    public void KartenBilderUpdaten_alleKarten() {
        for (int spieler = 0; spieler < controller.getSpieler().size(); spieler++) {
            for (int karten = 0; karten < controller.getSpieler().get(spieler).getHand().size(); karten++) {
                spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource(controller.getSpieler().get(spieler).getHand().get(karten).getBilderPfad())));
            }
        }
    }

    public void comboBoxSpielernamenEingeben() {
        /* Die erste Option in der Combobox hat den Index 0 und beinhaltet zwei Spieler, daher muss bei der Übergabe +2 gerechnet werden.*/
        controller.setAnzahlSpieler(jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() + 2);
        for (int i = 0; i < controller.getAnzahlSpieler(); i++) {
            controller.spielerNamenEingeben(comboBoxSpieleranzahlJTextArray[i].getText());
        }
    }

    public void spielerKartenJPanelArraySichtbarMachen() {
        /* Hier wird überprüft welche Spieler mitspielen und somit die Karten
        sichtbar gemacht. */
        for (int i = 0; i < controller.getAnzahlSpieler(); i++) {
            spielerKartenJPanelArray[i].setVisible(true);
        }
    }

    public void programmStarten() {
        // Startfenster starten
        setVisible(true);
        menuHauptmenueVisible();
        controller.getSound().abspielen("music");

        // MP1PC1-JPanel
        JLabelSpieler2MP1PC1.setVisible(false);
        JTextSpieler2MP1PC1.setVisible(false);
        JLabelSpieler3MP1PC1.setVisible(false);
        JTextSpieler3MP1PC1.setVisible(false);
        JLabelSpieler4MP1PC1.setVisible(false);
        JTextSpieler4MP1PC1.setVisible(false);
        JLabelSpieler5MP1PC1.setVisible(false);
        JTextSpieler5MP1PC1.setVisible(false);
        brettKartenUnsichtbarMachen();
    }

    public void brettKartenUnsichtbarMachen() {
        /* Die dritte Karte wird immer unsichtbar gestellt, da der Spieler
        selbst entscheiden kann, ob er eine Karte in der zweiten Runde ziehen möchte */
        for (int i = 0; i < spielerKartenJLabelArray.length; i++) {
            for (int j = 0; j < 3; j++) {
                spielerKartenJLabelArray[i][j].setVisible(false);
            }
        }

        // Brett-JPanel
        for (int i = 0; i < spielerKartenJLabelArray.length; i++) {
            spielerKartenJPanelArray[i].setVisible(false);
        }
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
        menuOptionenUpdateIPs();
    }

    public void menuOptionenUpdateIPs() {
        jLabelLANIP.setText(controller.getEtc().getLocalIP());
        jLabelInternetIP.setText(controller.getEtc().getInternetIP());
    }

    public void starteRunde1_EinsatzSetzen() {
        controller.setRunde(1);
        controller.setAktuellerSpieler(0);

        brettKartenUnsichtbarMachen();
        spielerKartenJPanelArraySichtbarMachen();

        for (int i = 0; i < controller.getSpieler().size(); i++) {
            controller.getSpieler().get(i).getHand().clear();
            controller.getSpieler().get(i).setHandPunkte(0);
            controller.getSpieler().get(i).setEinsatz(0);
        }

        controller.deckEinlesen(jComboBoxKarten.getSelectedItem().toString());

        jLabelRunde.setVisible(true);
        jButtonEinsatz.setVisible(true);
        jLabelEinsatz.setVisible(true);
        jTextFieldEinsatz.setVisible(true);

        jButtonKarteZiehen.setVisible(false);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                spielerCoins[i][j].setVisible(false);
            }
        }

        jLabelRunde.setText("Setze deinen Einsatz!");
        jButtonEinsatz.setText("Einsatz setzen");

        spielerTextfeldAnzeigeUpdaten();
        KartenBilderUpdaten_aktuellerSpieler();
    }

    public void starteRunde2_KartenZiehen() {
        controller.setRunde(2);
        controller.setAktuellerSpieler(0);
        controller.jederZiehtZweiKarten();

        jButtonKarteZiehen.setVisible(true);
        jButtonEinsatz.setVisible(true);
        jLabelEinsatz.setVisible(false);

        jTextFieldEinsatz.setVisible(false);

        jButtonEinsatz.setText("Weiter");
        jLabelRunde.setText("Eine weitere Karte?");

        spielerTextfeldAnzeigeUpdaten();
        KartenBilderUpdaten_aktuellerSpieler();
    }

    public void schaltflaecheDesAktuellenSpielersFarbigAktuallisieren() {
        for (int i = 0; i < spielerKartenJPanelArray.length; i++) {
            if (controller.getAktuellerSpieler() == i) {
                float[] hsb = Color.RGBtoHSB(4, 39, 3, null);
                spielerKartenJPanelArray[i].setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            } else {
                float[] hsb = Color.RGBtoHSB(9, 88, 7, null);
                spielerKartenJPanelArray[i].setBackground(Color.getHSBColor(hsb[0], hsb[1], hsb[2]));
            }
        }
    }

    public void einsatzSetzenButton() {
        /* Sobald der Button gedrückt wird, wird überprüft, ob das Textfeld leer ist und der Einsatz kleiner oder genauso hoch ist, als vom Bänker. */
        if (!jLabelEinsatz.getText().equals("") && controller.getRunde() == 1) {
            // Sobald die Überprüfung erfolgreich war, setzt der Spieler seinen Einsatz.
            controller.getSpieler().get(controller.getAktuellerSpieler()).setEinsatz(Integer.parseInt(jTextFieldEinsatz.getText()));
            spielerCoins[controller.getAktuellerSpieler()][(int) (Math.random() * 2)*1].setVisible(true);
            controller.highscoreAktuallisieren(jTableHighscore);
            jTextFieldEinsatz.setText("");
            // Der nächste Spieler ist am Zug
            if (controller.getAktuellerSpieler() == controller.getAnzahlSpieler() - 1) {
                starteRunde2_KartenZiehen();
            } else {
                controller.nächsterSpieler();
                spielerTextfeldAnzeigeUpdaten();
            }
        } else {
            fehlermeldungGenerieren("Fehler.");
        }
    }

    public void karteZiehenButton() {
        if (controller.getSpieler().get(controller.getAktuellerSpieler()).getHand().size() == 2) {
            controller.getSpieler().get(controller.getAktuellerSpieler()).karteZiehen(controller.getDeck());
            KartenBilderUpdaten_aktuellerSpieler();
            // verschiebeKarte(spielerKartenJLabelArray[controller.getAktuellerSpieler()][controller.getSpieler().get(controller.getAktuellerSpieler()).getHand().size() - 1], picDeck);
            controller.getSound().abspielen("card");
        } else {
            fehlermeldungGenerieren("Fehler.");
        }
    }

    public void weiterZiehenButton() {
        if (controller.getAktuellerSpieler() == controller.getAnzahlSpieler() - 1) {
            jButtonKarteZiehen.setVisible(false);
            controller.setRunde(3);
            KartenBilderUpdaten_alleKarten();
            starteRunde3_gewinnerAusgeben();
        } else {
            controller.nächsterSpieler();
            KartenBilderUpdaten_aktuellerSpieler();
            spielerTextfeldAnzeigeUpdaten();
        }
    }

    public void lobbySuchenButton() {
        controller.getEtc().verbinden(TextFieldServerIP.getText(), Integer.parseInt(TextFieldPort.getText()), TextFieldGebenSieIhrenNamenEin.getText());
        controller.getEtc().spieleZurLobbyTabelleHinzugefuegen(jTableSpieler);
    }

    public void starteRunde3_gewinnerAusgeben() {
        jLabelRunde.setText("Der Gewinner ist...");
        controller.getSound().abspielen("win");

        int ArrayGewinnerPunkte[] = new int[controller.getSpieler().size()];
        String ArrayGewinnerNamen[] = new String[controller.getSpieler().size()];

        for (int i = 0; i < controller.getSpieler().size(); i++) {
            if (controller.getSpieler().get(i).getHandPunkte() <= 21) {
                ArrayGewinnerPunkte[i] = controller.getSpieler().get(i).getHandPunkte();
                ArrayGewinnerNamen[i] = controller.getSpieler().get(i).getSpielerName();
            }
        }

        int tempPunkte;
        String tempName;
        for (int i = 1; i < ArrayGewinnerPunkte.length; i++) {
            for (int j = 0; j < ArrayGewinnerPunkte.length - i; j++) {
                if (ArrayGewinnerPunkte[j] < ArrayGewinnerPunkte[j + 1]) {
                    tempPunkte = ArrayGewinnerPunkte[j];
                    tempName = ArrayGewinnerNamen[j];
                    ArrayGewinnerPunkte[j] = ArrayGewinnerPunkte[j + 1];
                    ArrayGewinnerNamen[j] = ArrayGewinnerNamen[j + 1];
                    ArrayGewinnerPunkte[j + 1] = tempPunkte;
                    ArrayGewinnerNamen[j + 1] = tempName;
                }
            }
        }

        if (ArrayGewinnerNamen[0].equals(null)) {
            fehlermeldungGenerieren("Jeder ist ueber 21.. Die Bank hat gewonnen!");
            controller.getSpieler().get(0).setKontostand(controller.getSpieler().get(0).getKontostand() + (controller.getSpieler().get(0).getEinsatz() * 2));
        } else {
            for (int i = 0; i < ArrayGewinnerNamen.length; i++) {
                if (ArrayGewinnerPunkte[0] == ArrayGewinnerPunkte[i]) {
                    fehlermeldungGenerieren(ArrayGewinnerNamen[0] + " hat mit " + ArrayGewinnerPunkte[0] + " gewonnen!");
                }
            }

            for (int i = 0; i < controller.getSpieler().size(); i++) {
                if (controller.getSpieler().get(i).getSpielerName().equals(ArrayGewinnerNamen[0])) {
                    controller.getSpieler().get(i).setKontostand(controller.getSpieler().get(i).getKontostand() + (controller.getSpieler().get(i).getEinsatz() * 2));
                } else {
                    controller.getSpieler().get(i).setKontostand(controller.getSpieler().get(i).getKontostand() - controller.getSpieler().get(i).getEinsatz());
                }
            }
        }
        controller.highscoreAktuallisieren(jTableHighscore);
        jButtonEinsatz.setText("naechste Runde");
    }

    public void spielerTextfeldAnzeigeUpdaten() {
        // Hier wird überprüft, welcher Spieler momentan am Zug ist und dementsprechend die Anzeige aktualisiert.
        jPanelAktuellerSpieler.setVisible(true);
        jLabelAktuellerSpieler.setText(controller.getSpieler().get(controller.getAktuellerSpieler()).getSpielerName() + " ist jetzt am Zug!");
        schaltflaecheDesAktuellenSpielersFarbigAktuallisieren();
    }

    public void ladebildschirmStarten() {
        // Läuft noch nicht, aber ist glaube auch nicht zwingend notwendig
        AnfangJFrame.setVisible(true);
        // Setzt das JFrame in die Mitte des Bildschirms
        jFrameInDieMitteSetzen(AnfangJFrame);
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

    public void arraysFuellen() {
        spielerKartenJLabelArray[0][0] = karte1_Baenker;
        spielerKartenJLabelArray[0][1] = karte2_Baenker;
        spielerKartenJLabelArray[0][2] = karte3_Baenker;
        spielerKartenJLabelArray[1][0] = karte1_Spieler1;
        spielerKartenJLabelArray[1][1] = karte2_Spieler1;
        spielerKartenJLabelArray[1][2] = karte3_Spieler1;
        spielerKartenJLabelArray[2][0] = karte1_Spieler2;
        spielerKartenJLabelArray[2][1] = karte2_Spieler2;
        spielerKartenJLabelArray[2][2] = karte3_Spieler2;
        spielerKartenJLabelArray[3][0] = karte1_Spieler3;
        spielerKartenJLabelArray[3][1] = karte2_Spieler3;
        spielerKartenJLabelArray[3][2] = karte3_Spieler3;
        spielerKartenJLabelArray[4][0] = karte1_Spieler4;
        spielerKartenJLabelArray[4][1] = karte2_Spieler4;
        spielerKartenJLabelArray[4][2] = karte3_Spieler4;
        spielerKartenJLabelArray[5][0] = karte1_Spieler5;
        spielerKartenJLabelArray[5][1] = karte2_Spieler5;
        spielerKartenJLabelArray[5][2] = karte3_Spieler5;

        spielerCoins[0][0] = BankCoin1;
        spielerCoins[0][1] = BankCoin2;
        spielerCoins[1][0] = Spieler1Coin1;
        spielerCoins[1][1] = Spieler1Coin2;
        spielerCoins[2][0] = Spieler2Coin1;
        spielerCoins[2][1] = Spieler2Coin2;
        spielerCoins[3][0] = Spieler3Coin1;
        spielerCoins[3][1] = Spieler3Coin2;
        spielerCoins[4][0] = Spieler4Coin1;
        spielerCoins[4][1] = Spieler4Coin2;
        spielerCoins[5][0] = Spieler5Coin1;
        spielerCoins[5][1] = Spieler5Coin2;

        comboBoxSpieleranzahlJLabelArray[0] = JLabelBänkerMP1PC1;
        comboBoxSpieleranzahlJLabelArray[1] = JLabelSpieler1MP1PC1;
        comboBoxSpieleranzahlJLabelArray[2] = JLabelSpieler2MP1PC1;
        comboBoxSpieleranzahlJLabelArray[3] = JLabelSpieler3MP1PC1;
        comboBoxSpieleranzahlJLabelArray[4] = JLabelSpieler4MP1PC1;
        comboBoxSpieleranzahlJLabelArray[5] = JLabelSpieler5MP1PC1;

        comboBoxSpieleranzahlJTextArray[0] = JTextlBänkerMP1PC1;
        comboBoxSpieleranzahlJTextArray[1] = JTextSpieler1MP1PC1;
        comboBoxSpieleranzahlJTextArray[2] = JTextSpieler2MP1PC1;
        comboBoxSpieleranzahlJTextArray[3] = JTextSpieler3MP1PC1;
        comboBoxSpieleranzahlJTextArray[4] = JTextSpieler4MP1PC1;
        comboBoxSpieleranzahlJTextArray[5] = JTextSpieler5MP1PC1;

        spielerKartenJPanelArray[0] = Karten_Baenker;
        spielerKartenJPanelArray[1] = Karten_Spieler1;
        spielerKartenJPanelArray[2] = Karten_Spieler2;
        spielerKartenJPanelArray[3] = Karten_Spieler3;
        spielerKartenJPanelArray[4] = Karten_Spieler4;
        spielerKartenJPanelArray[5] = Karten_Spieler5;
    }

    // Läuft nicht!
    public void verschiebeKarte(javax.swing.JLabel karte, javax.swing.JLabel picDeck) {
        try {
            for (int x = picDeck.getLocation().x; x != karte.getLocation().y; x--) {
                for (int y = picDeck.getLocation().y; y != karte.getLocation().y; y--) {
                    picDeck.setIcon(new ImageIcon("/Karten/quer_Unbenannt.png"));
                    System.out.println("Zur Sicherheit X: " + x);
                    System.out.println("Zur Sicherheit Y: " + y + "\n");
                    picDeck.setLocation(x, y);
                    this.repaint();
                    this.revalidate();
                    Thread.sleep(10);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anfang1jLabel;
    private javax.swing.JLabel Anfang2jLabel;
    private javax.swing.JFrame AnfangJFrame;
    private javax.swing.JPanel AnfangjPanel;
    private javax.swing.JProgressBar AnfangjProgressBar;
    private javax.swing.JButton AnzahlSpielerButton1;
    private javax.swing.JLabel BankCoin1;
    private javax.swing.JLabel BankCoin2;
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
    private javax.swing.JLabel Spieler1Coin1;
    private javax.swing.JLabel Spieler1Coin2;
    private javax.swing.JLabel Spieler2Coin1;
    private javax.swing.JLabel Spieler2Coin2;
    private javax.swing.JLabel Spieler3Coin1;
    private javax.swing.JLabel Spieler3Coin2;
    private javax.swing.JLabel Spieler4Coin1;
    private javax.swing.JLabel Spieler4Coin2;
    private javax.swing.JLabel Spieler5Coin1;
    private javax.swing.JLabel Spieler5Coin2;
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
    private javax.swing.JCheckBox jCheckBoxAnimation;
    private javax.swing.JCheckBox jCheckBoxSounds;
    private javax.swing.JComboBox<String> jComboBoxAnzahlSpielerMP1PC1;
    private javax.swing.JComboBox<String> jComboBoxKarten;
    private javax.swing.JDialog jDialogFehlermeldung;
    private javax.swing.JLabel jLabelAktuellerSpieler;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelInternetIP;
    private javax.swing.JLabel jLabelInternetText;
    private javax.swing.JLabel jLabelInternetUndLANAnzeige;
    private javax.swing.JLabel jLabelKartenspielAnzeige;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
    private javax.swing.JLabel jLabelLANIP;
    private javax.swing.JLabel jLabelLANIPText;
    private javax.swing.JLabel jLabelRunde;
    private javax.swing.JLabel jLabelServerstatus;
    private javax.swing.JLabel jLabelSoundUndAnimationAnzeige;
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
