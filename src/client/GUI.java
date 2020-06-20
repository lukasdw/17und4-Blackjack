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

    private int arrayGewinnerPunkte[];
    private String arrayGewinnerNamen[];

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

        jFrameLadeBildschirm = new javax.swing.JFrame();
        jPanelLadeBildschirm = new javax.swing.JPanel();
        pictureJLabelLogoLadeBildschirm = new javax.swing.JLabel();
        jLabelLadeBildschirmNamen = new javax.swing.JLabel();
        jLabelLadeBildschirmProjekName = new javax.swing.JLabel();
        jProgressBarLadeBildschirm = new javax.swing.JProgressBar();
        jDialogFehlermeldung = new javax.swing.JDialog();
        jPanelFehlermeldung = new javax.swing.JPanel();
        pictureJLabelDreieck = new javax.swing.JLabel();
        jTextAreaFehlermeldung = new javax.swing.JTextArea();
        jButtonFehlermeldungOk = new javax.swing.JButton();
        jFrameGewinner = new javax.swing.JFrame();
        jPanelGewinner = new javax.swing.JPanel();
        jTextGewinner1Siegerehrung = new javax.swing.JTextField();
        jTextGewinner2Siegerehrung = new javax.swing.JTextField();
        jTextGewinner3Siegerehrung = new javax.swing.JTextField();
        jButtonBeendenSiegerehrung = new javax.swing.JButton();
        jLabelSiegerehrung = new javax.swing.JLabel();
        jPanelHauptmenue = new javax.swing.JPanel();
        jPanel1Hauptmenue = new javax.swing.JPanel();
        jButtonMP1PC = new javax.swing.JButton();
        jButtonMPInet = new javax.swing.JButton();
        jButtonOptionen = new javax.swing.JButton();
        jButtonCredits = new javax.swing.JButton();
        jButtonBeenden = new javax.swing.JButton();
        pictureJLabelLogoHauptmenu = new javax.swing.JLabel();
        pictureJLabelHauptmenuBackround = new javax.swing.JLabel();
        jPanelMP1PC = new javax.swing.JPanel();
        jPanelMP1PC1 = new javax.swing.JPanel();
        jButtonAnzahlSpieler = new javax.swing.JButton();
        jButtonZurueckMP1PC1 = new javax.swing.JButton();
        jTextAreaInfoTextMP1PC1 = new javax.swing.JTextArea();
        jLabelBänkerMP1PC1 = new javax.swing.JLabel();
        jTextlBänkerMP1PC1 = new javax.swing.JTextField();
        jLabelSpieler1MP1PC1 = new javax.swing.JLabel();
        jTextSpieler1MP1PC1 = new javax.swing.JTextField();
        jLabelSpieler2MP1PC1 = new javax.swing.JLabel();
        jTextSpieler2MP1PC1 = new javax.swing.JTextField();
        jLabelSpieler3MP1PC1 = new javax.swing.JLabel();
        jTextSpieler3MP1PC1 = new javax.swing.JTextField();
        jLabelSpieler4MP1PC1 = new javax.swing.JLabel();
        jTextSpieler4MP1PC1 = new javax.swing.JTextField();
        jLabelSpieler5MP1PC1 = new javax.swing.JLabel();
        jTextSpieler5MP1PC1 = new javax.swing.JTextField();
        jComboBoxAnzahlSpielerMP1PC1 = new javax.swing.JComboBox<>();
        pictureJLabelBackroundMP1PC1 = new javax.swing.JLabel();
        jPanelMPInternet = new javax.swing.JPanel();
        jPanelMPInternet1 = new javax.swing.JPanel();
        jButtonLobbySuchen = new javax.swing.JButton();
        jTextFieldGebenSieIhrenNamenEin = new javax.swing.JTextField();
        jTextAreaGebenSieIhrenNamenEin = new javax.swing.JTextArea();
        jTextAreaServerIP = new javax.swing.JTextArea();
        jTextFieldServerIP = new javax.swing.JTextField();
        jTextAreaPort = new javax.swing.JTextArea();
        jTextFieldPort = new javax.swing.JTextField();
        jButtonZurueck = new javax.swing.JButton();
        jScrollPaneSpieler = new javax.swing.JScrollPane();
        jTableSpieler = new javax.swing.JTable();
        jLabelServerstatus = new javax.swing.JLabel();
        pictureJLabelBackroundMPInternet = new javax.swing.JLabel();
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
        pictureJLabelBackroundMP1PC2 = new javax.swing.JLabel();
        jPanelCredits = new javax.swing.JPanel();
        jPanelCredits1 = new javax.swing.JPanel();
        jButtonZurueckCredits = new javax.swing.JButton();
        jTextAreaInfoTextMP1PC2 = new javax.swing.JTextArea();
        pictureJLabelBackroundMP1PC3 = new javax.swing.JLabel();
        jPanelBrett = new javax.swing.JPanel();
        pictureJLabelBankCoin1 = new javax.swing.JLabel();
        pictureJLabelBankCoin2 = new javax.swing.JLabel();
        pictureJLabelSpieler1Coin1 = new javax.swing.JLabel();
        pictureJLabelSpieler1Coin2 = new javax.swing.JLabel();
        pictureJLabelSpieler2Coin1 = new javax.swing.JLabel();
        pictureJLabelSpieler2Coin2 = new javax.swing.JLabel();
        pictureJLabelSpieler3Coin1 = new javax.swing.JLabel();
        pictureJLabelSpieler3Coin2 = new javax.swing.JLabel();
        pictureJLabelSpieler4Coin1 = new javax.swing.JLabel();
        pictureJLabelSpieler4Coin2 = new javax.swing.JLabel();
        pictureJLabelSpieler5Coin1 = new javax.swing.JLabel();
        pictureJLabelSpieler5Coin2 = new javax.swing.JLabel();
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
        jPanelKartenBaenker = new javax.swing.JPanel();
        pictureJLabelKarte1Baenker = new javax.swing.JLabel();
        pictureJLabelKarte2Baenker = new javax.swing.JLabel();
        pictureJLabelKarte3Baenker = new javax.swing.JLabel();
        jPanelKartenSpieler1 = new javax.swing.JPanel();
        pictureJLabelKarte1Spieler1 = new javax.swing.JLabel();
        pictureJLabelKarte2Spieler1 = new javax.swing.JLabel();
        pictureJLabelKarte3Spieler1 = new javax.swing.JLabel();
        jPanelKartenSpieler2 = new javax.swing.JPanel();
        pictureJLabelKarte1Spieler2 = new javax.swing.JLabel();
        pictureJLabelKarte2Spieler2 = new javax.swing.JLabel();
        pictureJLabelKarte3Spieler2 = new javax.swing.JLabel();
        jPanelKartenSpieler3 = new javax.swing.JPanel();
        pictureJLabelKarte1Spieler3 = new javax.swing.JLabel();
        pictureJLabelKarte2Spieler3 = new javax.swing.JLabel();
        pictureJLabelKarte3Spieler3 = new javax.swing.JLabel();
        jPanelKartenSpieler4 = new javax.swing.JPanel();
        pictureJLabelKarte1Spieler4 = new javax.swing.JLabel();
        pictureJLabelKarte2Spieler4 = new javax.swing.JLabel();
        pictureJLabelKarte3Spieler4 = new javax.swing.JLabel();
        jPanelKartenSpieler5 = new javax.swing.JPanel();
        pictureJLabelKarte1Spieler5 = new javax.swing.JLabel();
        pictureJLabelKarte2Spieler5 = new javax.swing.JLabel();
        pictureJLabelKarte3Spieler5 = new javax.swing.JLabel();
        pictureJLabelDeck = new javax.swing.JLabel();
        pictureJLabelBrett = new javax.swing.JLabel();
        pictureJLabelBackroundBrett = new javax.swing.JLabel();

        jFrameLadeBildschirm.setAlwaysOnTop(true);
        jFrameLadeBildschirm.setMinimumSize(new java.awt.Dimension(250, 365));
        jFrameLadeBildschirm.setResizable(false);
        jFrameLadeBildschirm.setSize(new java.awt.Dimension(250, 365));
        jFrameLadeBildschirm.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLadeBildschirm.setMaximumSize(new java.awt.Dimension(240, 325));
        jPanelLadeBildschirm.setMinimumSize(new java.awt.Dimension(240, 325));
        jPanelLadeBildschirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureJLabelLogoLadeBildschirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoLadeBildschirm.png"))); // NOI18N
        jPanelLadeBildschirm.add(pictureJLabelLogoLadeBildschirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, 220));

        jLabelLadeBildschirmNamen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelLadeBildschirmNamen.setForeground(new java.awt.Color(0, 51, 0));
        jLabelLadeBildschirmNamen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLadeBildschirmNamen.setText("von Timo, Bianca und Lukas");
        jPanelLadeBildschirm.add(jLabelLadeBildschirmNamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, 180, 30));

        jLabelLadeBildschirmProjekName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelLadeBildschirmProjekName.setForeground(new java.awt.Color(0, 51, 0));
        jLabelLadeBildschirmProjekName.setText("Blackjack - 17 und 4");
        jPanelLadeBildschirm.add(jLabelLadeBildschirmProjekName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 226, -1, -1));

        jProgressBarLadeBildschirm.setForeground(new java.awt.Color(0, 102, 51));
        jPanelLadeBildschirm.add(jProgressBarLadeBildschirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 22));

        jFrameLadeBildschirm.getContentPane().add(jPanelLadeBildschirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jDialogFehlermeldung.setBackground(new java.awt.Color(255, 255, 255));
        jDialogFehlermeldung.setMinimumSize(new java.awt.Dimension(325, 135));

        jPanelFehlermeldung.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFehlermeldung.setMaximumSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setMinimumSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setPreferredSize(new java.awt.Dimension(310, 103));
        jPanelFehlermeldung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureJLabelDreieck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dreieck.png"))); // NOI18N
        pictureJLabelDreieck.setAlignmentY(0.0F);
        jPanelFehlermeldung.add(pictureJLabelDreieck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jTextAreaFehlermeldung.setEditable(false);
        jTextAreaFehlermeldung.setColumns(20);
        jTextAreaFehlermeldung.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaFehlermeldung.setRows(5);
        jTextAreaFehlermeldung.setText("Dieser Text wird in der Funktion verändert.");
        jPanelFehlermeldung.add(jTextAreaFehlermeldung, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, 50));

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
            .addComponent(jPanelFehlermeldung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jFrameGewinner.setBackground(new java.awt.Color(255, 255, 0));
        jFrameGewinner.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGewinner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextGewinner1Siegerehrung.setEditable(false);
        jTextGewinner1Siegerehrung.setBackground(new java.awt.Color(218, 165, 33));
        jTextGewinner1Siegerehrung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextGewinner1Siegerehrung.setForeground(new java.awt.Color(255, 255, 255));
        jTextGewinner1Siegerehrung.setText("jTextField1");
        jTextGewinner1Siegerehrung.setBorder(null);
        jTextGewinner1Siegerehrung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGewinner1SiegerehrungActionPerformed(evt);
            }
        });
        jPanelGewinner.add(jTextGewinner1Siegerehrung, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 340, 90));

        jTextGewinner2Siegerehrung.setBackground(new java.awt.Color(192, 192, 192));
        jTextGewinner2Siegerehrung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextGewinner2Siegerehrung.setForeground(new java.awt.Color(255, 255, 255));
        jTextGewinner2Siegerehrung.setText("jTextField1");
        jTextGewinner2Siegerehrung.setBorder(null);
        jPanelGewinner.add(jTextGewinner2Siegerehrung, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 340, 90));

        jTextGewinner3Siegerehrung.setBackground(new java.awt.Color(152, 99, 67));
        jTextGewinner3Siegerehrung.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextGewinner3Siegerehrung.setForeground(new java.awt.Color(255, 255, 255));
        jTextGewinner3Siegerehrung.setText("jTextField1");
        jTextGewinner3Siegerehrung.setBorder(null);
        jTextGewinner3Siegerehrung.setCaretColor(new java.awt.Color(152, 99, 67));
        jTextGewinner3Siegerehrung.setDisabledTextColor(new java.awt.Color(152, 99, 67));
        jTextGewinner3Siegerehrung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGewinner3SiegerehrungActionPerformed(evt);
            }
        });
        jPanelGewinner.add(jTextGewinner3Siegerehrung, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 340, 80));

        jButtonBeendenSiegerehrung.setText("Beenden");
        jButtonBeendenSiegerehrung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeendenSiegerehrungActionPerformed(evt);
            }
        });
        jPanelGewinner.add(jButtonBeendenSiegerehrung, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, 30));

        jLabelSiegerehrung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sieger.png"))); // NOI18N
        jPanelGewinner.add(jLabelSiegerehrung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 408));

        jFrameGewinner.getContentPane().add(jPanelGewinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 460));

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

        pictureJLabelLogoHauptmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoHauptmenu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1HauptmenueLayout = new javax.swing.GroupLayout(jPanel1Hauptmenue);
        jPanel1Hauptmenue.setLayout(jPanel1HauptmenueLayout);
        jPanel1HauptmenueLayout.setHorizontalGroup(
            jPanel1HauptmenueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1HauptmenueLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pictureJLabelLogoHauptmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(pictureJLabelLogoHauptmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        pictureJLabelHauptmenuBackround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelHauptmenue.add(pictureJLabelHauptmenuBackround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMP1PC.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelMP1PC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMP1PC1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMP1PC1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setMinimumSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setPreferredSize(new java.awt.Dimension(250, 400));
        jPanelMP1PC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAnzahlSpieler.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonAnzahlSpieler.setText("Spiel starten");
        jButtonAnzahlSpieler.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAnzahlSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnzahlSpielerActionPerformed(evt);
            }
        });
        jPanelMP1PC1.add(jButtonAnzahlSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 117, -1));

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

        jLabelBänkerMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelBänkerMP1PC1.setText("Bank");
        jPanelMP1PC1.add(jLabelBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 134, -1, -1));

        jTextlBänkerMP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextlBänkerMP1PC1.setText("Bank");
        jPanelMP1PC1.add(jTextlBänkerMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, 90, -1));

        jLabelSpieler1MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSpieler1MP1PC1.setText("Spieler 1");
        jPanelMP1PC1.add(jLabelSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 134, -1, -1));

        jTextSpieler1MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextSpieler1MP1PC1.setText("Spieler 1");
        jPanelMP1PC1.add(jTextSpieler1MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 154, 90, -1));

        jLabelSpieler2MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSpieler2MP1PC1.setText("Spieler 2");
        jPanelMP1PC1.add(jLabelSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jTextSpieler2MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextSpieler2MP1PC1.setText("Spieler 2");
        jPanelMP1PC1.add(jTextSpieler2MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 90, -1));

        jLabelSpieler3MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSpieler3MP1PC1.setText("Spieler 3");
        jPanelMP1PC1.add(jLabelSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 180, -1, -1));

        jTextSpieler3MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextSpieler3MP1PC1.setText("Spieler 3");
        jPanelMP1PC1.add(jTextSpieler3MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 91, -1));

        jLabelSpieler4MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSpieler4MP1PC1.setText("Spieler 4");
        jPanelMP1PC1.add(jLabelSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jTextSpieler4MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextSpieler4MP1PC1.setText("Spieler 4");
        jPanelMP1PC1.add(jTextSpieler4MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 92, -1));

        jLabelSpieler5MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabelSpieler5MP1PC1.setText("Spieler 5");
        jPanelMP1PC1.add(jLabelSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jTextSpieler5MP1PC1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextSpieler5MP1PC1.setText("Spieler 5");
        jPanelMP1PC1.add(jTextSpieler5MP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 92, -1));

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

        pictureJLabelBackroundMP1PC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelMP1PC.add(pictureJLabelBackroundMP1PC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelMPInternet.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMPInternet.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelMPInternet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMPInternet1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMPInternet1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelMPInternet1.setMinimumSize(new java.awt.Dimension(250, 400));

        jButtonLobbySuchen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButtonLobbySuchen.setText("Lobby suchen");
        jButtonLobbySuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLobbySuchenActionPerformed(evt);
            }
        });

        jTextFieldGebenSieIhrenNamenEin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldGebenSieIhrenNamenEin.setText("Testuser");

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

        jTextFieldServerIP.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldServerIP.setText("127.0.0.1");

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");

        jTextFieldPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextFieldPort.setText("1337");

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
                                .addComponent(jTextFieldGebenSieIhrenNamenEin)
                                .addComponent(jTextAreaGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                                    .addComponent(jTextAreaServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelMPInternet1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanelMPInternet1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLobbySuchen, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jTextFieldServerIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldGebenSieIhrenNamenEin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelServerstatus)
                .addGap(16, 16, 16)
                .addComponent(jScrollPaneSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonZurueck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLobbySuchen)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanelMPInternet.add(jPanelMPInternet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        pictureJLabelBackroundMPInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelMPInternet.add(pictureJLabelBackroundMPInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

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

        pictureJLabelBackroundMP1PC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelOptionen.add(pictureJLabelBackroundMP1PC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

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

        pictureJLabelBackroundMP1PC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelCredits.add(pictureJLabelBackroundMP1PC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        jPanelBrett.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBrett.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelBrett.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureJLabelBankCoin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelBankCoin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelBankCoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 30, 30));

        pictureJLabelBankCoin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelBankCoin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelBankCoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 30, 30));

        pictureJLabelSpieler1Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler1Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler1Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 30, 30));

        pictureJLabelSpieler1Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler1Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler1Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 30, 30));

        pictureJLabelSpieler2Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler2Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler2Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 30, 30));

        pictureJLabelSpieler2Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler2Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler2Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 30, 30));

        pictureJLabelSpieler3Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler3Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler3Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 30, 30));

        pictureJLabelSpieler3Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler3Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler3Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 30, 30));

        pictureJLabelSpieler4Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler4Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler4Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 30, 30));

        pictureJLabelSpieler4Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler4Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler4Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 30, 30));

        pictureJLabelSpieler5Coin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler5Coin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipBlau.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler5Coin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 30, 30));

        pictureJLabelSpieler5Coin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pictureJLabelSpieler5Coin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chipRot.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelSpieler5Coin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 30, 30));

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

        jPanelKartenBaenker.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenBaenker.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Baenker.setAlignmentY(0.0F);

        pictureJLabelKarte2Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Baenker.setAlignmentY(0.0F);

        pictureJLabelKarte3Baenker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Baenker.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenBaenkerLayout = new javax.swing.GroupLayout(jPanelKartenBaenker);
        jPanelKartenBaenker.setLayout(jPanelKartenBaenkerLayout);
        jPanelKartenBaenkerLayout.setHorizontalGroup(
            jPanelKartenBaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenBaenkerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte1Baenker)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Baenker)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte3Baenker))
        );
        jPanelKartenBaenkerLayout.setVerticalGroup(
            jPanelKartenBaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenBaenkerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenBaenkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte1Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte3Baenker, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenBaenker, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 170, 90));

        jPanelKartenSpieler1.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenSpieler1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Spieler1.setAlignmentY(0.0F);

        pictureJLabelKarte2Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Spieler1.setAlignmentY(0.0F);

        pictureJLabelKarte3Spieler1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Spieler1.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenSpieler1Layout = new javax.swing.GroupLayout(jPanelKartenSpieler1);
        jPanelKartenSpieler1.setLayout(jPanelKartenSpieler1Layout);
        jPanelKartenSpieler1Layout.setHorizontalGroup(
            jPanelKartenSpieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte3Spieler1)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Spieler1)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte1Spieler1))
        );
        jPanelKartenSpieler1Layout.setVerticalGroup(
            jPanelKartenSpieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenSpieler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte3Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte1Spieler1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenSpieler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 170, 90));

        jPanelKartenSpieler2.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenSpieler2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Spieler2.setAlignmentY(0.0F);

        pictureJLabelKarte2Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Spieler2.setAlignmentY(0.0F);

        pictureJLabelKarte3Spieler2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Spieler2.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenSpieler2Layout = new javax.swing.GroupLayout(jPanelKartenSpieler2);
        jPanelKartenSpieler2.setLayout(jPanelKartenSpieler2Layout);
        jPanelKartenSpieler2Layout.setHorizontalGroup(
            jPanelKartenSpieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte3Spieler2)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Spieler2)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte1Spieler2))
        );
        jPanelKartenSpieler2Layout.setVerticalGroup(
            jPanelKartenSpieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenSpieler2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte3Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte1Spieler2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenSpieler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 170, 90));

        jPanelKartenSpieler3.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenSpieler3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Spieler3.setAlignmentY(0.0F);

        pictureJLabelKarte2Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Spieler3.setAlignmentY(0.0F);

        pictureJLabelKarte3Spieler3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Spieler3.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenSpieler3Layout = new javax.swing.GroupLayout(jPanelKartenSpieler3);
        jPanelKartenSpieler3.setLayout(jPanelKartenSpieler3Layout);
        jPanelKartenSpieler3Layout.setHorizontalGroup(
            jPanelKartenSpieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte3Spieler3)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Spieler3)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte1Spieler3))
        );
        jPanelKartenSpieler3Layout.setVerticalGroup(
            jPanelKartenSpieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenSpieler3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte3Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte1Spieler3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenSpieler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 170, 90));

        jPanelKartenSpieler4.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenSpieler4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Spieler4.setAlignmentY(0.0F);

        pictureJLabelKarte2Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Spieler4.setAlignmentY(0.0F);

        pictureJLabelKarte3Spieler4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Spieler4.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenSpieler4Layout = new javax.swing.GroupLayout(jPanelKartenSpieler4);
        jPanelKartenSpieler4.setLayout(jPanelKartenSpieler4Layout);
        jPanelKartenSpieler4Layout.setHorizontalGroup(
            jPanelKartenSpieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte3Spieler4)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Spieler4)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte1Spieler4))
        );
        jPanelKartenSpieler4Layout.setVerticalGroup(
            jPanelKartenSpieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenSpieler4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte3Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte1Spieler4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenSpieler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 170, 90));

        jPanelKartenSpieler5.setBackground(new java.awt.Color(9, 86, 6));
        jPanelKartenSpieler5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pictureJLabelKarte1Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte1Spieler5.setAlignmentY(0.0F);

        pictureJLabelKarte2Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte2Spieler5.setAlignmentY(0.0F);

        pictureJLabelKarte3Spieler5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png"))); // NOI18N
        pictureJLabelKarte3Spieler5.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelKartenSpieler5Layout = new javax.swing.GroupLayout(jPanelKartenSpieler5);
        jPanelKartenSpieler5.setLayout(jPanelKartenSpieler5Layout);
        jPanelKartenSpieler5Layout.setHorizontalGroup(
            jPanelKartenSpieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler5Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pictureJLabelKarte3Spieler5)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte2Spieler5)
                .addGap(6, 6, 6)
                .addComponent(pictureJLabelKarte1Spieler5))
        );
        jPanelKartenSpieler5Layout.setVerticalGroup(
            jPanelKartenSpieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKartenSpieler5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanelKartenSpieler5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureJLabelKarte3Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte2Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureJLabelKarte1Spieler5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBrett.add(jPanelKartenSpieler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 170, 90));

        pictureJLabelDeck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Karten/quer_Unbenannt.png"))); // NOI18N
        pictureJLabelDeck.setAlignmentY(0.0F);
        jPanelBrett.add(pictureJLabelDeck, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 70));

        pictureJLabelBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/brett.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 927, 460));

        pictureJLabelBackroundBrett.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backround.png"))); // NOI18N
        jPanelBrett.add(pictureJLabelBackroundBrett, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

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
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonKarteZiehenActionPerformed

    private void jButtonStoppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStoppActionPerformed
        // Das Programm wird beendet
        siegerehrungStarten(arrayGewinnerNamen, arrayGewinnerPunkte);
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonStoppActionPerformed

    private void jButtonEinsatzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEinsatzActionPerformed
        if (jButtonEinsatz.getText().equals("Einsatz setzen")) {
            einsatzSetzenButton();
        } else if (jButtonEinsatz.getText().equals("Weiter")) {
            weiterZiehenButton();
        } else {
            starteRunde1_EinsatzSetzen();
        }
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonEinsatzActionPerformed

    private void jButtonBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeendenActionPerformed
        // Das Programm wird beendet
        programmBeenden();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonBeendenActionPerformed

    private void jButtonMP1PCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMP1PCActionPerformed
        // Nur das Menü für den Multiplayer an einem Computer, ist sichbar.
        menuMP1PCVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonMP1PCActionPerformed

    private void jButtonMPInetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMPInetActionPerformed
        // Nur das Menü für den Multiplayer über das Internet, ist sichbar.
        menuMPInternetVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonMPInetActionPerformed

    private void jButtonZurueckMP1PC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckMP1PC1ActionPerformed
        // Nur das Hauptmenü ist sichbar.
        menuHauptmenueVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckMP1PC1ActionPerformed

    private void jButtonZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckActionPerformed
        // Man kehrt zurück zum Hauptmenü zurück. -> (Hauptmenü ist sichbar)
        menuHauptmenueVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckActionPerformed

    private void jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible
        /* Wenn eine andere Option gewählt wird, wird dies erkannt und die
        Möglichkeiten der Spielenameneingaben aktualisiert */
        comboBoxSpieleranzahlAnzeigeUpdate();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jComboBoxAnzahlSpielerMP1PC1PopupMenuWillBecomeInvisible

    private void jButtonAnzahlSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnzahlSpielerActionPerformed
        comboBoxSpielernamenEingeben();
        this.controller.highscoreAktuallisieren(jTableHighscore);
        menuBrettVisible();
        starteRunde1_EinsatzSetzen();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonAnzahlSpielerActionPerformed

    private void jButtonLobbySuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLobbySuchenActionPerformed
        lobbySuchenButton();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonLobbySuchenActionPerformed

    private void jButtonOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOptionenActionPerformed
        // Nur die Optionen sind sichbar.
        menuOptionenVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonOptionenActionPerformed

    private void jButtonCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreditsActionPerformed
        // Nur die Credits sind sichbar.
        menuCreditsVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonCreditsActionPerformed

    private void jButtonZurueckCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckCreditsActionPerformed
        menuHauptmenueVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckCreditsActionPerformed

    private void jButtonZurueckOptionenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckOptionenActionPerformed
        menuHauptmenueVisible();
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonZurueckOptionenActionPerformed

    private void jButtonFehlermeldungOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFehlermeldungOkActionPerformed
        jDialogFehlermeldung.setVisible(false);
        this.controller.getSound().abspielen("klick");
    }//GEN-LAST:event_jButtonFehlermeldungOkActionPerformed

    private void jTextGewinner1SiegerehrungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGewinner1SiegerehrungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGewinner1SiegerehrungActionPerformed

    private void jTextGewinner3SiegerehrungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGewinner3SiegerehrungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGewinner3SiegerehrungActionPerformed

    private void jButtonBeendenSiegerehrungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeendenSiegerehrungActionPerformed
        programmBeenden();
    }//GEN-LAST:event_jButtonBeendenSiegerehrungActionPerformed

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
        for (int spieler = 0; spieler < this.controller.getSpieler().size(); spieler++) {
            for (int karten = 0; karten < this.controller.getSpieler().get(spieler).getHand().size(); karten++) {
                if (this.controller.getAktuellerSpieler() == spieler) {
                    // Gehört die Karte dem aktuellen Spieler wird das demensprechende Kartenbild geladen und sichtbar gemacht.
                    spielerKartenJLabelArray[spieler][karten].setVisible(true);
                    spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource(this.controller.getSpieler().get(spieler).getHand().get(karten).getBilderPfad())));
                } else {
                    // Gehört die Karte nicht dem aktuellen Spieler wird die Rückseite der Karte angezeigt.
                    spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource("/karten-klein/rückseite.png")));
                }
            }
        }
    }

    public void KartenBilderUpdaten_alleKarten() {
        for (int spieler = 0; spieler < this.controller.getSpieler().size(); spieler++) {
            for (int karten = 0; karten < this.controller.getSpieler().get(spieler).getHand().size(); karten++) {
                spielerKartenJLabelArray[spieler][karten].setIcon(new javax.swing.ImageIcon(getClass().getResource(this.controller.getSpieler().get(spieler).getHand().get(karten).getBilderPfad())));
            }
        }
    }

    public void comboBoxSpielernamenEingeben() {
        /* Die erste Option in der Combobox hat den Index 0 und beinhaltet zwei Spieler, daher muss bei der Übergabe +2 gerechnet werden.*/
        this.controller.setAnzahlSpieler(jComboBoxAnzahlSpielerMP1PC1.getSelectedIndex() + 2);
        for (int i = 0; i < this.controller.getAnzahlSpieler(); i++) {
            this.controller.spielerNamenEingeben(comboBoxSpieleranzahlJTextArray[i].getText());
        }
    }

    public void spielerKartenJPanelArraySichtbarMachen() {
        /* Hier wird überprüft welche Spieler mitspielen und somit die Karten
        sichtbar gemacht. */
        for (int i = 0; i < this.controller.getAnzahlSpieler(); i++) {
            spielerKartenJPanelArray[i].setVisible(true);
        }
    }

    public void programmStarten() {
        // Startfenster starten
        setVisible(true);
        menuHauptmenueVisible();
        this.controller.getSound().abspielen("music");

        // MP1PC1-JPanel
        jLabelSpieler2MP1PC1.setVisible(false);
        jTextSpieler2MP1PC1.setVisible(false);
        jLabelSpieler3MP1PC1.setVisible(false);
        jTextSpieler3MP1PC1.setVisible(false);
        jLabelSpieler4MP1PC1.setVisible(false);
        jTextSpieler4MP1PC1.setVisible(false);
        jLabelSpieler5MP1PC1.setVisible(false);
        jTextSpieler5MP1PC1.setVisible(false);
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
        jLabelLANIP.setText(this.controller.getEtc().getLocalIP());
        jLabelInternetIP.setText(this.controller.getEtc().getInternetIP());
    }

    public void starteRunde1_EinsatzSetzen() {
        this.controller.setRunde(1);
        this.controller.setAktuellerSpieler(0);

        brettKartenUnsichtbarMachen();
        spielerKartenJPanelArraySichtbarMachen();

        for (int i = 0; i < this.controller.getSpieler().size(); i++) {
            this.controller.getSpieler().get(i).getHand().clear();
            this.controller.getSpieler().get(i).setHandPunkte(0);
            this.controller.getSpieler().get(i).setEinsatz(0);
        }

        this.controller.deckEinlesen(jComboBoxKarten.getSelectedItem().toString());

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
        this.controller.setRunde(2);
        this.controller.setAktuellerSpieler(0);
        this.controller.jederZiehtZweiKarten();

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
            if (this.controller.getAktuellerSpieler() == i) {
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
        if ((!jLabelEinsatz.getText().equals("")) && (this.controller.getRunde() == 1) && (Integer.parseInt(jTextFieldEinsatz.getText()) <= this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getKontostand()) && (Integer.parseInt(jTextFieldEinsatz.getText()) > 0)) {
            // Sobald die Überprüfung erfolgreich war, setzt der Spieler seinen Einsatz.
            this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).setEinsatz(Integer.parseInt(jTextFieldEinsatz.getText()));
            gelegteCoinsUpdaten();
            this.controller.highscoreAktuallisieren(jTableHighscore);
            jTextFieldEinsatz.setText("");
            // Der nächste Spieler ist am Zug
            if (this.controller.getAktuellerSpieler() == this.controller.getAnzahlSpieler() - 1) {
                starteRunde2_KartenZiehen();
            } else {
                this.controller.nächsterSpieler();
                spielerTextfeldAnzeigeUpdaten();
            }
        } else {
            fehlermeldungGenerieren("Dein Einsatz muss zwischen 1 und " + this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getKontostand() + " sein\nund darf den Einsatz des Bänkers nicht\nüberschreiten.");
        }
    }

    public void karteZiehenButton() {
        if (this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getHand().size() == 2) {
            this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).karteZiehen(this.controller.getDeck());
            KartenBilderUpdaten_aktuellerSpieler();
            // verschiebeKarte(spielerKartenJLabelArray[this.controller.getAktuellerSpieler()][this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getHand().size() - 1], picDeck);
            this.controller.getSound().abspielen("card");
        } else {
            fehlermeldungGenerieren("Du hast bereits drei Karten.");
        }
    }

    public void weiterZiehenButton() {
        if (this.controller.getAktuellerSpieler() == this.controller.getAnzahlSpieler() - 1) {
            jButtonKarteZiehen.setVisible(false);
            this.controller.setRunde(3);
            KartenBilderUpdaten_alleKarten();
            starteRunde3_gewinnerAusgeben();
        } else {
            this.controller.nächsterSpieler();
            KartenBilderUpdaten_aktuellerSpieler();
            spielerTextfeldAnzeigeUpdaten();
        }
    }

    public void lobbySuchenButton() {
        this.controller.getEtc().verbinden(jTextFieldServerIP.getText(), Integer.parseInt(jTextFieldPort.getText()), jTextFieldGebenSieIhrenNamenEin.getText());
        this.controller.getEtc().spieleZurLobbyTabelleHinzugefuegen(jTableSpieler);
    }

    public void starteRunde3_gewinnerAusgeben() {
        jLabelRunde.setText("Der Gewinner ist...");
        this.controller.getSound().abspielen("win");

        int arrayGewinnerPunkte[] = new int[this.controller.getSpieler().size()];
        String arrayGewinnerNamen[] = new String[this.controller.getSpieler().size()];

        for (int i = 0; i < this.controller.getSpieler().size(); i++) {
            if (this.controller.getSpieler().get(i).getHandPunkte() <= 21) {
                arrayGewinnerPunkte[i] = this.controller.getSpieler().get(i).getHandPunkte();
                arrayGewinnerNamen[i] = this.controller.getSpieler().get(i).getSpielerName();
            }
        }

        int tempPunkte;
        String tempName;
        for (int i = 1; i < arrayGewinnerPunkte.length; i++) {
            for (int j = 0; j < arrayGewinnerPunkte.length - i; j++) {
                if (arrayGewinnerPunkte[j] < arrayGewinnerPunkte[j + 1]) {
                    tempPunkte = arrayGewinnerPunkte[j];
                    tempName = arrayGewinnerNamen[j];
                    arrayGewinnerPunkte[j] = arrayGewinnerPunkte[j + 1];
                    arrayGewinnerNamen[j] = arrayGewinnerNamen[j + 1];
                    arrayGewinnerPunkte[j + 1] = tempPunkte;
                    arrayGewinnerNamen[j + 1] = tempName;
                }
            }
        }

        if (arrayGewinnerNamen[0].equals(null)) {
            fehlermeldungGenerieren("Jeder ist ueber 21.. Die Bank hat gewonnen!");
            this.controller.getSpieler().get(0).setKontostand(this.controller.getSpieler().get(0).getKontostand() + (this.controller.getSpieler().get(0).getEinsatz() * 2));
        } else {
            for (int i = 0; i < arrayGewinnerNamen.length; i++) {
                if (arrayGewinnerPunkte[0] == arrayGewinnerPunkte[i]) {
                    fehlermeldungGenerieren(arrayGewinnerNamen[0] + " hat mit " + arrayGewinnerPunkte[0] + " gewonnen!");
                }
            }

            for (int i = 0; i < this.controller.getSpieler().size(); i++) {
                if (this.controller.getSpieler().get(i).getSpielerName().equals(arrayGewinnerNamen[0])) {
                    this.controller.getSpieler().get(i).setKontostand(this.controller.getSpieler().get(i).getKontostand() + (this.controller.getSpieler().get(i).getEinsatz() * 2));
                } else {
                    this.controller.getSpieler().get(i).setKontostand(this.controller.getSpieler().get(i).getKontostand() - this.controller.getSpieler().get(i).getEinsatz());
                }
            }
        }
        this.controller.highscoreAktuallisieren(jTableHighscore);
        jButtonEinsatz.setText("naechste Runde");
    }

    public void spielerTextfeldAnzeigeUpdaten() {
        // Hier wird überprüft, welcher Spieler momentan am Zug ist und dementsprechend die Anzeige aktualisiert.
        jPanelAktuellerSpieler.setVisible(true);
        jLabelAktuellerSpieler.setText(this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getSpielerName() + " ist jetzt am Zug!");
        schaltflaecheDesAktuellenSpielersFarbigAktuallisieren();
    }

    public void ladebildschirmStarten() {
        // Läuft noch nicht, aber ist glaube auch nicht zwingend notwendig
        jFrameLadeBildschirm.setVisible(true);
        // Setzt das JFrame in die Mitte des Bildschirms
        jFrameInDieMitteSetzen(jFrameLadeBildschirm);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(10);
                jProgressBarLadeBildschirm.setValue(i);
            }
            jFrameLadeBildschirm.setVisible(false);
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
        spielerKartenJLabelArray[0][0] = pictureJLabelKarte1Baenker;
        spielerKartenJLabelArray[0][1] = pictureJLabelKarte2Baenker;
        spielerKartenJLabelArray[0][2] = pictureJLabelKarte3Baenker;
        spielerKartenJLabelArray[1][0] = pictureJLabelKarte1Spieler1;
        spielerKartenJLabelArray[1][1] = pictureJLabelKarte2Spieler1;
        spielerKartenJLabelArray[1][2] = pictureJLabelKarte3Spieler1;
        spielerKartenJLabelArray[2][0] = pictureJLabelKarte1Spieler2;
        spielerKartenJLabelArray[2][1] = pictureJLabelKarte2Spieler2;
        spielerKartenJLabelArray[2][2] = pictureJLabelKarte3Spieler2;
        spielerKartenJLabelArray[3][0] = pictureJLabelKarte1Spieler3;
        spielerKartenJLabelArray[3][1] = pictureJLabelKarte2Spieler3;
        spielerKartenJLabelArray[3][2] = pictureJLabelKarte3Spieler3;
        spielerKartenJLabelArray[4][0] = pictureJLabelKarte1Spieler4;
        spielerKartenJLabelArray[4][1] = pictureJLabelKarte2Spieler4;
        spielerKartenJLabelArray[4][2] = pictureJLabelKarte3Spieler4;
        spielerKartenJLabelArray[5][0] = pictureJLabelKarte1Spieler5;
        spielerKartenJLabelArray[5][1] = pictureJLabelKarte2Spieler5;
        spielerKartenJLabelArray[5][2] = pictureJLabelKarte3Spieler5;

        spielerCoins[0][0] = pictureJLabelBankCoin1;
        spielerCoins[0][1] = pictureJLabelBankCoin2;
        spielerCoins[1][0] = pictureJLabelSpieler1Coin1;
        spielerCoins[1][1] = pictureJLabelSpieler1Coin2;
        spielerCoins[2][0] = pictureJLabelSpieler2Coin1;
        spielerCoins[2][1] = pictureJLabelSpieler2Coin2;
        spielerCoins[3][0] = pictureJLabelSpieler3Coin1;
        spielerCoins[3][1] = pictureJLabelSpieler3Coin2;
        spielerCoins[4][0] = pictureJLabelSpieler4Coin1;
        spielerCoins[4][1] = pictureJLabelSpieler4Coin2;
        spielerCoins[5][0] = pictureJLabelSpieler5Coin1;
        spielerCoins[5][1] = pictureJLabelSpieler5Coin2;

        comboBoxSpieleranzahlJLabelArray[0] = jLabelBänkerMP1PC1;
        comboBoxSpieleranzahlJLabelArray[1] = jLabelSpieler1MP1PC1;
        comboBoxSpieleranzahlJLabelArray[2] = jLabelSpieler2MP1PC1;
        comboBoxSpieleranzahlJLabelArray[3] = jLabelSpieler3MP1PC1;
        comboBoxSpieleranzahlJLabelArray[4] = jLabelSpieler4MP1PC1;
        comboBoxSpieleranzahlJLabelArray[5] = jLabelSpieler5MP1PC1;

        comboBoxSpieleranzahlJTextArray[0] = jTextlBänkerMP1PC1;
        comboBoxSpieleranzahlJTextArray[1] = jTextSpieler1MP1PC1;
        comboBoxSpieleranzahlJTextArray[2] = jTextSpieler2MP1PC1;
        comboBoxSpieleranzahlJTextArray[3] = jTextSpieler3MP1PC1;
        comboBoxSpieleranzahlJTextArray[4] = jTextSpieler4MP1PC1;
        comboBoxSpieleranzahlJTextArray[5] = jTextSpieler5MP1PC1;

        spielerKartenJPanelArray[0] = jPanelKartenBaenker;
        spielerKartenJPanelArray[1] = jPanelKartenSpieler1;
        spielerKartenJPanelArray[2] = jPanelKartenSpieler2;
        spielerKartenJPanelArray[3] = jPanelKartenSpieler3;
        spielerKartenJPanelArray[4] = jPanelKartenSpieler4;
        spielerKartenJPanelArray[5] = jPanelKartenSpieler5;
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

    public void gelegteCoinsUpdaten() {
        if (this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getEinsatz() >= 10) {
            spielerCoins[this.controller.getAktuellerSpieler()][0].setVisible(true);
        }
        if (this.controller.getSpieler().get(this.controller.getAktuellerSpieler()).getEinsatz() % 10 != 0) {
            spielerCoins[this.controller.getAktuellerSpieler()][1].setVisible(true);
        }
    }

    public void siegerehrungStarten(String[] arrayGewinnerNamen, int[] arrayGewinnerPunkte) {
        jFrameInDieMitteSetzen(jFrameGewinner);
        jFrameGewinner.setVisible(true);

        int ArrayTempPunkte[] = new int[this.controller.getSpieler().size()];
        String ArrayTempNamen[] = new String[this.controller.getSpieler().size()];

        for (int Zeile = 0; Zeile < jTableHighscore.getRowCount(); Zeile++) {
            ArrayTempNamen[Zeile] = (String) jTableHighscore.getModel().getValueAt(Zeile, 1);
            ArrayTempPunkte[Zeile] = (int) jTableHighscore.getModel().getValueAt(Zeile, 2);
        }

        int tempPunkte;
        String tempName;
        for (int i = 1; i < ArrayTempPunkte.length; i++) {
            for (int j = 0; j < ArrayTempPunkte.length - i; j++) {
                if (ArrayTempPunkte[j] < ArrayTempPunkte[j + 1]) {
                    tempPunkte = ArrayTempPunkte[j];
                    tempName = ArrayTempNamen[j];
                    ArrayTempPunkte[j] = ArrayTempPunkte[j + 1];
                    ArrayTempNamen[j] = ArrayTempNamen[j + 1];
                    ArrayTempPunkte[j + 1] = tempPunkte;
                    ArrayTempNamen[j + 1] = tempName;
                }
            }
        }

        jTextGewinner1Siegerehrung.setText(ArrayTempNamen[0] + " - " + ArrayTempPunkte[0]);
        jTextGewinner2Siegerehrung.setText(ArrayTempNamen[1] + " - " + ArrayTempPunkte[1]);
        jTextGewinner3Siegerehrung.setText(ArrayTempNamen[2] + " - " + ArrayTempPunkte[2]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnzahlSpieler;
    private javax.swing.JButton jButtonBeenden;
    private javax.swing.JButton jButtonBeendenSiegerehrung;
    private javax.swing.JButton jButtonCredits;
    private javax.swing.JButton jButtonEinsatz;
    private javax.swing.JButton jButtonFehlermeldungOk;
    private javax.swing.JButton jButtonKarteZiehen;
    private javax.swing.JButton jButtonLobbySuchen;
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
    private javax.swing.JFrame jFrameGewinner;
    private javax.swing.JFrame jFrameLadeBildschirm;
    private javax.swing.JLabel jLabelAktuellerSpieler;
    private javax.swing.JLabel jLabelBänkerMP1PC1;
    private javax.swing.JLabel jLabelEinsatz;
    private javax.swing.JLabel jLabelInternetIP;
    private javax.swing.JLabel jLabelInternetText;
    private javax.swing.JLabel jLabelInternetUndLANAnzeige;
    private javax.swing.JLabel jLabelKartenspielAnzeige;
    private javax.swing.JLabel jLabelKontostand;
    private javax.swing.JLabel jLabelKontostandValue;
    private javax.swing.JLabel jLabelLANIP;
    private javax.swing.JLabel jLabelLANIPText;
    private javax.swing.JLabel jLabelLadeBildschirmNamen;
    private javax.swing.JLabel jLabelLadeBildschirmProjekName;
    private javax.swing.JLabel jLabelRunde;
    private javax.swing.JLabel jLabelServerstatus;
    private javax.swing.JLabel jLabelSiegerehrung;
    private javax.swing.JLabel jLabelSoundUndAnimationAnzeige;
    private javax.swing.JLabel jLabelSpieler1MP1PC1;
    private javax.swing.JLabel jLabelSpieler2MP1PC1;
    private javax.swing.JLabel jLabelSpieler3MP1PC1;
    private javax.swing.JLabel jLabelSpieler4MP1PC1;
    private javax.swing.JLabel jLabelSpieler5MP1PC1;
    private javax.swing.JPanel jPanel1Hauptmenue;
    private javax.swing.JPanel jPanelAktuellerSpieler;
    private javax.swing.JPanel jPanelBrett;
    private javax.swing.JPanel jPanelCredits;
    private javax.swing.JPanel jPanelCredits1;
    private javax.swing.JPanel jPanelFehlermeldung;
    private javax.swing.JPanel jPanelGewinner;
    private javax.swing.JPanel jPanelHauptmenue;
    private javax.swing.JPanel jPanelKartenBaenker;
    private javax.swing.JPanel jPanelKartenSpieler1;
    private javax.swing.JPanel jPanelKartenSpieler2;
    private javax.swing.JPanel jPanelKartenSpieler3;
    private javax.swing.JPanel jPanelKartenSpieler4;
    private javax.swing.JPanel jPanelKartenSpieler5;
    private javax.swing.JPanel jPanelLadeBildschirm;
    private javax.swing.JPanel jPanelMP1PC;
    private javax.swing.JPanel jPanelMP1PC1;
    private javax.swing.JPanel jPanelMPInternet;
    private javax.swing.JPanel jPanelMPInternet1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelOptionen;
    private javax.swing.JPanel jPanelOptionen1;
    private javax.swing.JPanel jPanelRunde;
    private javax.swing.JPanel jPanelStats;
    private javax.swing.JProgressBar jProgressBarLadeBildschirm;
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
    private javax.swing.JTextField jTextFieldGebenSieIhrenNamenEin;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldServerIP;
    private javax.swing.JTextField jTextGewinner1Siegerehrung;
    private javax.swing.JTextField jTextGewinner2Siegerehrung;
    private javax.swing.JTextField jTextGewinner3Siegerehrung;
    private javax.swing.JTextField jTextSpieler1MP1PC1;
    private javax.swing.JTextField jTextSpieler2MP1PC1;
    private javax.swing.JTextField jTextSpieler3MP1PC1;
    private javax.swing.JTextField jTextSpieler4MP1PC1;
    private javax.swing.JTextField jTextSpieler5MP1PC1;
    private javax.swing.JTextField jTextlBänkerMP1PC1;
    private javax.swing.JLabel pictureJLabelBackroundBrett;
    private javax.swing.JLabel pictureJLabelBackroundMP1PC1;
    private javax.swing.JLabel pictureJLabelBackroundMP1PC2;
    private javax.swing.JLabel pictureJLabelBackroundMP1PC3;
    private javax.swing.JLabel pictureJLabelBackroundMPInternet;
    private javax.swing.JLabel pictureJLabelBankCoin1;
    private javax.swing.JLabel pictureJLabelBankCoin2;
    private javax.swing.JLabel pictureJLabelBrett;
    private javax.swing.JLabel pictureJLabelDeck;
    private javax.swing.JLabel pictureJLabelDreieck;
    private javax.swing.JLabel pictureJLabelHauptmenuBackround;
    private javax.swing.JLabel pictureJLabelKarte1Baenker;
    private javax.swing.JLabel pictureJLabelKarte1Spieler1;
    private javax.swing.JLabel pictureJLabelKarte1Spieler2;
    private javax.swing.JLabel pictureJLabelKarte1Spieler3;
    private javax.swing.JLabel pictureJLabelKarte1Spieler4;
    private javax.swing.JLabel pictureJLabelKarte1Spieler5;
    private javax.swing.JLabel pictureJLabelKarte2Baenker;
    private javax.swing.JLabel pictureJLabelKarte2Spieler1;
    private javax.swing.JLabel pictureJLabelKarte2Spieler2;
    private javax.swing.JLabel pictureJLabelKarte2Spieler3;
    private javax.swing.JLabel pictureJLabelKarte2Spieler4;
    private javax.swing.JLabel pictureJLabelKarte2Spieler5;
    private javax.swing.JLabel pictureJLabelKarte3Baenker;
    private javax.swing.JLabel pictureJLabelKarte3Spieler1;
    private javax.swing.JLabel pictureJLabelKarte3Spieler2;
    private javax.swing.JLabel pictureJLabelKarte3Spieler3;
    private javax.swing.JLabel pictureJLabelKarte3Spieler4;
    private javax.swing.JLabel pictureJLabelKarte3Spieler5;
    private javax.swing.JLabel pictureJLabelLogoHauptmenu;
    private javax.swing.JLabel pictureJLabelLogoLadeBildschirm;
    private javax.swing.JLabel pictureJLabelSpieler1Coin1;
    private javax.swing.JLabel pictureJLabelSpieler1Coin2;
    private javax.swing.JLabel pictureJLabelSpieler2Coin1;
    private javax.swing.JLabel pictureJLabelSpieler2Coin2;
    private javax.swing.JLabel pictureJLabelSpieler3Coin1;
    private javax.swing.JLabel pictureJLabelSpieler3Coin2;
    private javax.swing.JLabel pictureJLabelSpieler4Coin1;
    private javax.swing.JLabel pictureJLabelSpieler4Coin2;
    private javax.swing.JLabel pictureJLabelSpieler5Coin1;
    private javax.swing.JLabel pictureJLabelSpieler5Coin2;
    // End of variables declaration//GEN-END:variables
}
