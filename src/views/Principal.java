/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import bank.Client;
import controllers.ControllerClient;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.exceptions.NoClientFoundException;

/**
 *
 * @author Capacitaciones
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
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
        jTable1 = new javax.swing.JTable();
        NoclientfoundDlg = new javax.swing.JDialog();
        Alertpanel = new javax.swing.JPanel();
        clientonotfounLbl = new javax.swing.JLabel();
        okbtn = new javax.swing.JButton();
        Panle_B = new javax.swing.JPanel();
        Id_Client_label = new javax.swing.JLabel();
        Id_Client_textfield = new javax.swing.JTextField();
        Search_button = new javax.swing.JButton();
        Panel_client = new javax.swing.JPanel();
        Tabla_client = new javax.swing.JScrollPane();
        Tabla_resultado = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        NoclientfoundDlg.setMinimumSize(new java.awt.Dimension(450, 150));
        NoclientfoundDlg.setModal(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("resourse/es_ES"); // NOI18N
        clientonotfounLbl.setText(bundle.getString("search.client.not.found")); // NOI18N

        okbtn.setText(bundle.getString("alert.ok")); // NOI18N

        javax.swing.GroupLayout AlertpanelLayout = new javax.swing.GroupLayout(Alertpanel);
        Alertpanel.setLayout(AlertpanelLayout);
        AlertpanelLayout.setHorizontalGroup(
            AlertpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlertpanelLayout.createSequentialGroup()
                .addGroup(AlertpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlertpanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(clientonotfounLbl))
                    .addGroup(AlertpanelLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(okbtn)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        AlertpanelLayout.setVerticalGroup(
            AlertpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlertpanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(clientonotfounLbl)
                .addGap(18, 18, 18)
                .addComponent(okbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout NoclientfoundDlgLayout = new javax.swing.GroupLayout(NoclientfoundDlg.getContentPane());
        NoclientfoundDlg.getContentPane().setLayout(NoclientfoundDlgLayout);
        NoclientfoundDlgLayout.setHorizontalGroup(
            NoclientfoundDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoclientfoundDlgLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Alertpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NoclientfoundDlgLayout.setVerticalGroup(
            NoclientfoundDlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoclientfoundDlgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Alertpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(bundle.getString("window.title")); // NOI18N

        Panle_B.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("search.panel.title"))); // NOI18N

        Id_Client_label.setText(bundle.getString("seach.panel.label")); // NOI18N
        Id_Client_label.setToolTipText("ID");

        Search_button.setText(bundle.getString("seach.panel.button")); // NOI18N
        Search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panle_BLayout = new javax.swing.GroupLayout(Panle_B);
        Panle_B.setLayout(Panle_BLayout);
        Panle_BLayout.setHorizontalGroup(
            Panle_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panle_BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Id_Client_label)
                .addGap(49, 49, 49)
                .addComponent(Id_Client_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(Search_button)
                .addGap(57, 57, 57))
        );
        Panle_BLayout.setVerticalGroup(
            Panle_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panle_BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panle_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Search_button)
                    .addComponent(Id_Client_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id_Client_label))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        Tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_client.setViewportView(Tabla_resultado);

        javax.swing.GroupLayout Panel_clientLayout = new javax.swing.GroupLayout(Panel_client);
        Panel_client.setLayout(Panel_clientLayout);
        Panel_clientLayout.setHorizontalGroup(
            Panel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_clientLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(Tabla_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        Panel_clientLayout.setVerticalGroup(
            Panel_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabla_client, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panle_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Panle_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Panel_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_buttonActionPerformed
        try {
            String Id = Id_Client_textfield.getText();
            Client request = ControllerClient.getInstance().getClientePorId(Id);
            System.out.println(request.getEmail());
            
        } 
        catch (NoClientFoundException ex) {
            System.out.println(ex.getMessage());
            NoclientfoundDlg.setVisible(true);
        }
    }//GEN-LAST:event_Search_buttonActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alertpanel;
    private javax.swing.JLabel Id_Client_label;
    private javax.swing.JTextField Id_Client_textfield;
    private javax.swing.JDialog NoclientfoundDlg;
    private javax.swing.JPanel Panel_client;
    private javax.swing.JPanel Panle_B;
    private javax.swing.JButton Search_button;
    private javax.swing.JScrollPane Tabla_client;
    private javax.swing.JTable Tabla_resultado;
    private javax.swing.JLabel clientonotfounLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton okbtn;
    // End of variables declaration//GEN-END:variables
}
