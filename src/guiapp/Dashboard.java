/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapp;

import java.awt.Color; 
import internalPages.*;
/**
 *
 * @author SCC-COLLEGE
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }
 Color navcolor = new Color(153,0,51);
 Color headcolor = new Color(0,51,102);
 Color bodycolor = new Color(153,204,255);   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        dashpane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        userpane3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dtop = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(null);

        navbar.setBackground(new java.awt.Color(153, 0, 51));
        navbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashpane.setBackground(new java.awt.Color(153, 0, 51));
        dashpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashpaneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashpaneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashpaneMouseExited(evt);
            }
        });
        dashpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-dashboard-layout-24.png"))); // NOI18N
        dashpane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD");
        dashpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 20));

        navbar.add(dashpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, 40));

        main.setBackground(new java.awt.Color(153, 0, 51));
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainMouseExited(evt);
            }
        });
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-home-page-24.png"))); // NOI18N
        main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        userpane3.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        userpane3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userpane3.setText("HOME PAGE");
        main.add(userpane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 20));

        navbar.add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 40));

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoao-removebg-preview.png"))); // NOI18N
        navbar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 140));

        jPanel1.add(navbar);
        navbar.setBounds(0, 0, 140, 410);

        header.setBackground(new java.awt.Color(0, 51, 102));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-close-30.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-subtract-30.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(542, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(8, 8, 8))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(header);
        header.setBounds(140, 0, 620, 60);

        dtop.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel4.setText("REAL-ESTATE ");

        jLabel5.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel5.setText("RECORDING APP");

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel6.setText("PROPERTY ");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/pngtree-creative-synthesis-city-comic-real-estate-picture-image_916360-removebg-preview.png"))); // NOI18N

        dtop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dtop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dtop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dtop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dtopLayout = new javax.swing.GroupLayout(dtop);
        dtop.setLayout(dtopLayout);
        dtopLayout.setHorizontalGroup(
            dtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dtopLayout.createSequentialGroup()
                .addGroup(dtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dtopLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4))
                    .addGroup(dtopLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5))
                    .addGroup(dtopLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel6)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        dtopLayout.setVerticalGroup(
            dtopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dtopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(dtop);
        dtop.setBounds(140, 60, 620, 350);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(757, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseClicked
      bor down = new bor();
        dtop.add(down).setVisible(true);
    }//GEN-LAST:event_dashpaneMouseClicked

    private void dashpaneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseEntered
    
        dashpane.setBackground(bodycolor);
    }//GEN-LAST:event_dashpaneMouseEntered

    private void dashpaneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashpaneMouseExited
       dashpane.setBackground(navcolor);
    }//GEN-LAST:event_dashpaneMouseExited

    private void mainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseClicked
              main down = new main();
        dtop.add(down).setVisible(true);
       
    }//GEN-LAST:event_mainMouseClicked

    private void mainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseEntered
        main.setBackground(bodycolor);
    }//GEN-LAST:event_mainMouseEntered

    private void mainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseExited
        main.setBackground(navcolor);
    }//GEN-LAST:event_mainMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
     
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
         
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
       
    }//GEN-LAST:event_jLabel3MouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dashpane;
    public static javax.swing.JDesktopPane dtop;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel main;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel userpane3;
    // End of variables declaration//GEN-END:variables
}
