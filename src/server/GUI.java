package server;

public class GUI extends javax.swing.JFrame {

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

        jPanelServer.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServer.setMaximumSize(new java.awt.Dimension(1200, 550));
        jPanelServer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelServer1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServer1.setMinimumSize(new java.awt.Dimension(250, 400));

        ButtonLobbyAnzahlSpieler.setText("Server starten");
        ButtonLobbyAnzahlSpieler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLobbyAnzahlSpielerActionPerformed(evt);
            }
        });

        jTextAreaSpieleranzahl.setEditable(false);
        jTextAreaSpieleranzahl.setColumns(20);
        jTextAreaSpieleranzahl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaSpieleranzahl.setRows(5);
        jTextAreaSpieleranzahl.setText("Wähle eine Option aus.\n");

        jTextAreaServername.setEditable(false);
        jTextAreaServername.setColumns(20);
        jTextAreaServername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaServername.setRows(5);
        jTextAreaServername.setText("Servername\n");

        TextFieldServername.setText("Testserver");

        jTextAreaPort.setEditable(false);
        jTextAreaPort.setColumns(20);
        jTextAreaPort.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextAreaPort.setRows(5);
        jTextAreaPort.setText("Port\n");

        TextFieldPort.setText("1337");

        jButtonZurueck.setText("Beenden");
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

        jLabelServerstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelServerstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelServerstatus.setText("SERVERSTATUS");

        jComboBoxAnzahlSpieler.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Bank - 1 Spieler", "1 Bank - 2 Spieler", "1 Bank - 3 Spieler", "1 Bank - 4 Spieler", "1 Bank - 5 Spieler" }));
        jComboBoxAnzahlSpieler.setToolTipText("");

        javax.swing.GroupLayout jPanelServer1Layout = new javax.swing.GroupLayout(jPanelServer1);
        jPanelServer1.setLayout(jPanelServer1Layout);
        jPanelServer1Layout.setHorizontalGroup(
            jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServer1Layout.createSequentialGroup()
                .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelServer1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonZurueck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonLobbyAnzahlSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelServer1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelServerstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextAreaSpieleranzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServer1Layout.createSequentialGroup()
                                    .addComponent(jTextAreaServername, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21))
                                .addGroup(jPanelServer1Layout.createSequentialGroup()
                                    .addComponent(TextFieldServername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBoxAnzahlSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelServer1Layout.setVerticalGroup(
            jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServer1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAreaServername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAreaPort, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelServer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldServername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextAreaSpieleranzahl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAnzahlSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelServerstatus)
                .addGap(16, 16, 16)
                .addComponent(jScrollPaneSpieler, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonZurueck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonLobbyAnzahlSpieler)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanelServer.add(jPanelServer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 250, 400));

        piMenuBackround3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_backround.png"))); // NOI18N
        jPanelServer.add(piMenuBackround3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLobbyAnzahlSpielerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLobbyAnzahlSpielerActionPerformed
        server = new Server(Integer.parseInt(TextFieldPort.getText()), TextFieldServername.getText());
        server.laufen(jTableSpieler);
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