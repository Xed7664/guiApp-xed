/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import static guiapp.Dashboard.dtop;
import javax.swing.JOptionPane;
 
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ortega
 */
public class add extends javax.swing.JInternalFrame {

    /**
     * Creates new form add
     */
    public add() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        meter = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        code = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        header.setBackground(new java.awt.Color(0, 51, 102));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property Information");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 170, 30));
        header.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 30));
        header.add(meter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));
        header.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 30));
        header.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Square Meter");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Property Price in ₱");
        header.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Postal Code");
        header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-left-30.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        header.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Continue");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        header.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 70, 30));

        BG.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Real Estate page banner (1).jpg"))); // NOI18N
        BG.setText("jbkmnb");
        header.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
             
             
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        cont down = new cont();
        dtop.add(down).setVisible(true);  
    }//GEN-LAST:event_jButton1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        bor down = new bor();
        dtop.add(down).setVisible(true);
    }//GEN-LAST:event_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JTextField code;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField meter;
    // End of variables declaration//GEN-END:variables
}
