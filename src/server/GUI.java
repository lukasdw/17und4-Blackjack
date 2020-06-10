package server;

import server.ServerController;
import server.Netzwerk.Server;

public class GUI extends javax.swing.JFrame {

    private ServerController controller = new ServerController(this);
    Server server;

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelServer = new javax.swing.JPanel();
        jPanelServer1 = new javax.swing.JPanel();
        ButtonLobbyAnzahlSpieler = new javax.swing.JButton();
        jTextAreaSpieleranzahl = new javax.swing.JTextArea();
        jTextAreaServername = new javax.swing.JTextArea();
        TextFieldServername = new javax.swing.JTextField();
        jTextAreaPort = new javax.swing.JTextArea();
        TextFieldPort = new javax.swing.JTextField();
        jButtonZurueck = new javax.swing.JButton();
        jScrollPaneSpieler = new javax.swing.JScrollPane();
        jTableSpieler = new javax.swing.JTable();
        jLabelServerstatus = new javax.swing.JLabel();
        jComboBoxAnzahlSpieler = new javax.swing.JComboBox<>();
        piMenuBackround3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("(Server) WIT2B - No.3: 17 und 4 - Blackjack (12.05.2020 - 23.06.2020)");
        setMaximumSize(new java.awt.Dimension(1200, 579));
        setMinimumSize(new java.awt.Dimension(1200, 579));
        setPreferredSize(new java.awt.Dimension(1200, 579));
        setResizable(false);

        jPanelServer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServer.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelServer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelServer1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServer1.setMaximumSize(new java.awt.Dimension(250, 400));
        jPanelServer1.setMinimumSize(new java.awt.Dimension(250, 400));
        jPanelServer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonLobbyAnzahlSpieler.setText("Server starten");
        ButtonLobbyAnzahlSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLobbyAnzahlSpielerActionPerformed(evt);
            }
        });
        jPanelServer1.add(ButtonLobbyAnzahlSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 355, 117, -1));

        jTextAreaSpieleranzahl.setEditable(false);
        jTextAreaSpieleranzahl.setColumns(20);
        jTextAreaSpieleranzahl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaSpieleranzahl.setRows(5);
        jTextAreaSpieleranzahl.setText("Wähle eine Option aus.\n");
        jTextAreaSpieleranzahl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelServer1.add(jTextAreaSpieleranzahl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 210, 20));

        jTextAreaServername.setEditable(false);
        jTextAreaServername.setColumns(20);
        jTextAreaServername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaServername.setRows(5);
        jTextAreaServername.setText("Servername\n");
        jPanelServer1.add(jTextAreaServername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 20));

        TextFieldServername.setText("Testserver");
        jPanelServer1.add(TextFieldServername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 126, -1));

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");
        jPanelServer1.add(jTextAreaPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 56, 20));

        TextFieldPort.setText("1337");
        jPanelServer1.add(TextFieldPort, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 74, -1));

        jButtonZurueck.setText("Beenden");
        jButtonZurueck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZurueckActionPerformed(evt);
            }
        });
        jPanelServer1.add(jButtonZurueck, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 326, 117, -1));

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

        jPanelServer1.add(jScrollPaneSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 178, 210, 130));

        jLabelServerstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelServerstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServerstatus.setText("SERVERSTATUS");
        jPanelServer1.add(jLabelServerstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 210, 40));

        jComboBoxAnzahlSpieler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Bank - 1 Spieler", "1 Bank - 2 Spieler", "1 Bank - 3 Spieler", "1 Bank - 4 Spieler", "1 Bank - 5 Spieler" }));
        jComboBoxAnzahlSpieler.setToolTipText("");
        jPanelServer1.add(jComboBoxAnzahlSpieler, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 210, -1));

        jPanelServer.add(jPanelServer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        piMenuBackround3.setAlignmentY(0.0F);
        jPanelServer.add(piMenuBackround3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelServer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLobbyAnzahlSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbyAnzahlSpielerActionPerformed
        server = new Server(Integer.parseInt(TextFieldPort.getText()), TextFieldServername.getText());
        server.spielerSuchen();
        server.spieleZurLobbyTabelleHinzugefuegen(jTableSpieler);
        jLabelServerstatus.setText(server.getSpielername() + "ist dem Server beigetreten.");
    }//GEN-LAST:event_ButtonLobbyAnzahlSpielerActionPerformed

    private void jButtonZurueckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZurueckActionPerformed
        // Programm wird beendet.
        programmBeenden();
    }//GEN-LAST:event_jButtonZurueckActionPerformed

    private void programmBeenden() {
        System.exit(0);
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLobbyAnzahlSpieler;
    private javax.swing.JTextField TextFieldPort;
    private javax.swing.JTextField TextFieldServername;
    private javax.swing.JButton jButtonZurueck;
    private javax.swing.JComboBox<String> jComboBoxAnzahlSpieler;
    private javax.swing.JLabel jLabelServerstatus;
    private javax.swing.JPanel jPanelServer;
    private javax.swing.JPanel jPanelServer1;
    private javax.swing.JScrollPane jScrollPaneSpieler;
    private javax.swing.JTable jTableSpieler;
    private javax.swing.JTextArea jTextAreaPort;
    private javax.swing.JTextArea jTextAreaServername;
    private javax.swing.JTextArea jTextAreaSpieleranzahl;
    private javax.swing.JLabel piMenuBackround3;
    // End of variables declaration//GEN-END:variables
}