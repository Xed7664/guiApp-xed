/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


/**
 *
 * @author ortega
 */
public class bor extends javax.swing.JInternalFrame {

    /**
     * Creates new form bor
     */
    public bor() {
        initComponents();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
    Color navcolor = new Color(153,0,51);
 Color headcolor = new Color(0,51,102);
 Color bodycolor = new Color(0,204,204);  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        v = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        a = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        m = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(651, 350));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoao-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(460, 0, 150, 150);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REAL-ESTATE PROPERTY RECORDING APP");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 0, 350, 50);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADDITIONAL  SYSTEM DESCRIPTION");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 200, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-1, 0, 630, 150);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        v.setBackground(new java.awt.Color(0, 204, 204));
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vMouseExited(evt);
            }
        });
        v.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-view-50.png"))); // NOI18N
        v.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 10)); // NOI18N
        jLabel4.setText("View Properties");
        v.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jPanel2.add(v);
        v.setBounds(430, 50, 100, 90);

        a.setBackground(new java.awt.Color(0, 204, 204));
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aMouseExited(evt);
            }
        });
        a.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-add-properties-50.png"))); // NOI18N
        a.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 60, 50));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 10)); // NOI18N
        jLabel6.setText("Add Properties");
        a.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        jPanel2.add(a);
        a.setBounds(230, 50, 110, 90);

        m.setBackground(new java.awt.Color(0, 204, 204));
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mMouseExited(evt);
            }
        });
        m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-admin-settings-male-50.png"))); // NOI18N
        m.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 50));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 10)); // NOI18N
        jLabel8.setText("Manage Records");
        m.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, 20));

        jPanel2.add(m);
        m.setBounds(50, 50, 100, 90);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-4, 150, 630, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseEntered
        v.setBackground(headcolor);
    }//GEN-LAST:event_vMouseEntered

    private void vMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMouseExited
        v.setBackground(bodycolor);
    }//GEN-LAST:event_vMouseExited

    private void aMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseEntered
        a.setBackground(headcolor);

    }//GEN-LAST:event_aMouseEntered

    private void aMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseExited

        a.setBackground(bodycolor);
    }//GEN-LAST:event_aMouseExited

    private void mMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseEntered
        m.setBackground(headcolor);
    }//GEN-LAST:event_mMouseEntered

    private void mMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMouseExited
        m.setBackground(bodycolor);
    }//GEN-LAST:event_mMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel m;
    private javax.swing.JPanel v;
    // End of variables declaration//GEN-END:variables
}
