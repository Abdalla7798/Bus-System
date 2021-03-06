/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussystem;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author hp-
 */
public class frmbusInfo extends javax.swing.JFrame {

    /**
     * Creates new form frmbusInfo
     */
    
    public frmbusInfo() {
        initComponents();
        
        //setExtendedState(JFrame.MAXIMIZED_HORIZ);
        //setVisible(true);
        setResizable(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vehicletype = new javax.swing.JComboBox<>();
        nostop = new javax.swing.JRadioButton();
        onestop = new javax.swing.JRadioButton();
        manystop = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lbltriptype = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        r7seat = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        levr7 = new javax.swing.JRadioButton();
        jSeparator6 = new javax.swing.JSeparator();
        r12seat = new javax.swing.JComboBox<>();
        levr12 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        r6seat = new javax.swing.JComboBox<>();
        levr6 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        goingprice = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bus Information");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vehicle Type:");

        vehicletype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "type...", "Bus (20 Seats)", "MiniBus (10 Seats)", "Limousine (5 Seats)" }));
        vehicletype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicletypeActionPerformed(evt);
            }
        });

        nostop.setForeground(new java.awt.Color(255, 255, 255));
        nostop.setText("NonStop");
        nostop.setOpaque(false);
        nostop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nostopActionPerformed(evt);
            }
        });

        onestop.setForeground(new java.awt.Color(255, 255, 255));
        onestop.setText("One-Stop");
        onestop.setOpaque(false);
        onestop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onestopActionPerformed(evt);
            }
        });

        manystop.setForeground(new java.awt.Color(255, 255, 255));
        manystop.setText("Many-Stop");
        manystop.setOpaque(false);
        manystop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manystopActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seat Number:");

        lbltriptype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbltriptype.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price:");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        r7seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7seatActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Available Time:");

        levr7.setForeground(new java.awt.Color(255, 255, 255));
        levr7.setText("7AM");
        levr7.setOpaque(false);
        levr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levr7ActionPerformed(evt);
            }
        });

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        r12seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r12seatActionPerformed(evt);
            }
        });

        levr12.setForeground(new java.awt.Color(255, 255, 255));
        levr12.setText("12PM");
        levr12.setOpaque(false);
        levr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levr12ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seat Number:");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        r6seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6seatActionPerformed(evt);
            }
        });

        levr6.setForeground(new java.awt.Color(255, 255, 255));
        levr6.setText("6PM");
        levr6.setOpaque(false);
        levr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levr6ActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Seat Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vehicletype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(nostop)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(onestop, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)))
                                .addComponent(manystop)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(levr7, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(r7seat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(levr12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(r12seat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levr6, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(r6seat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(goingprice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltriptype, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(lbltriptype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goingprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vehicletype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nostop)
                            .addComponent(onestop)
                            .addComponent(manystop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator6)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(levr6)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(r6seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(levr7)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(r7seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(levr12)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(r12seat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jSeparator3)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (vehicletype.getSelectedItem()=="type..."||(!nostop.isSelected()&&!onestop.isSelected()&&!manystop.isSelected())||(levr7.isSelected()&&r7seat.getSelectedItem()=="select..."&&r7seat.isEnabled())||(levr12.isSelected()&&r12seat.getSelectedItem()=="select..."&&r12seat.isEnabled())||(!levr12.isSelected()&&!levr6.isSelected()&&!levr7.isSelected())){
             JOptionPane.showMessageDialog(null, "The information is not Completed....");
        }
        else{
            frmCusInfo c=new frmCusInfo();
            c.setVisible(true);
            c.setLocationRelativeTo(null);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nostopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nostopActionPerformed
        // TODO add your handling code here:
        onestop.setSelected(false);
        manystop.setSelected(false);
    }//GEN-LAST:event_nostopActionPerformed

    private void onestopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onestopActionPerformed
        // TODO add your handling code here:
        nostop.setSelected(false);
        manystop.setSelected(false);
    }//GEN-LAST:event_onestopActionPerformed

    private void manystopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manystopActionPerformed
        // TODO add your handling code here:
        nostop.setSelected(false);
        onestop.setSelected(false);
    }//GEN-LAST:event_manystopActionPerformed

    private void r7seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7seatActionPerformed

    private void vehicletypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicletypeActionPerformed
        try {
            
            // TODO add your handling code here:
            /*AddSeats(vehicletype, r7seat,new File("GoingSeats\\7AMBus (20 Seats).txt"),new File("GoingSeats\\7AMMinibus (10 Seats).txt"),new File("GoingSeats\\7AMLimousine (5 Seats).txt"));
            AddSeats(vehicletype, r12seat,new File("GoingSeats\\12PMBus (20 Seats).txt"),new File("GoingSeats\\12PMMinibus (10 Seats).txt"),new File("GoingSeats\\12PMLimousine (5 Seats).txt"));
            AddSeats(vehicletype, r6seat,new File("GoingSeats\\6PMBus (20 Seats).txt"),new File("GoingSeats\\6PMMinibus (10 Seats).txt"),new File("GoingSeats\\6PMLimousine (5 Seats).txt"));
            */
            if(vehicletype.getSelectedItem().equals("Bus (20 Seats)")){
               Vehicle v =new Bus();
               v.AddSeats(r7seat, r12seat, r6seat,new File("GoingSeats\\7AMBus (20 Seats).txt") ,new File("GoingSeats\\12PMBus (20 Seats).txt") ,new File("GoingSeats\\6PMBus (20 Seats).txt"));
            }
            else if(vehicletype.getSelectedItem().equals("MiniBus (10 Seats)")){
               Vehicle v =new Minibus();
               v.AddSeats(r7seat, r12seat, r6seat,new File("GoingSeats\\7AMMinibus (10 Seats).txt") ,new File("GoingSeats\\12PMMinibus (10 Seats).txt") ,new File("GoingSeats\\6PMMinibus (10 Seats).txt"));
            }
            else if(vehicletype.getSelectedItem().equals("Limousine (5 Seats)")){
               Vehicle v =new Limousine();
               v.AddSeats(r7seat, r12seat, r6seat,new File("GoingSeats\\7AMLimousine (5 Seats).txt") ,new File("GoingSeats\\12PMLimousine (5 Seats).txt") ,new File("GoingSeats\\6PMLimousine (5 Seats).txt"));
            }
        } catch (Exception ex) {
            Logger.getLogger(frmbusInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vehicletypeActionPerformed

    private void r12seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r12seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r12seatActionPerformed

    private void r6seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r6seatActionPerformed

    private void levr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levr7ActionPerformed
        // TODO add your handling code here:
        
        levr12.setSelected(false);
        levr6.setSelected(false);
        r7seat.setEnabled(true);
        r12seat.setEnabled(false);
        r6seat.setEnabled(false);
        
    }//GEN-LAST:event_levr7ActionPerformed

    private void levr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levr12ActionPerformed
        // TODO add your handling code here:
        levr7.setSelected(false);
        levr6.setSelected(false);
        r12seat.setEnabled(true);
        r7seat.setEnabled(false);
        r6seat.setEnabled(false);
    }//GEN-LAST:event_levr12ActionPerformed

    private void levr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levr6ActionPerformed
        // TODO add your handling code here:
        levr12.setSelected(false);
        levr7.setSelected(false);
        r6seat.setEnabled(true);
        r12seat.setEnabled(false);
        r7seat.setEnabled(false);
    }//GEN-LAST:event_levr6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Color c =new Color(0,0,150);
        this.getContentPane().setBackground(c);
        try {
            
            Image img =ImageIO.read(getClass().getResource("bus.png"));
            this.setIconImage(img);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmbusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmbusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmbusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmbusInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmbusInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> goingprice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    public static javax.swing.JLabel lbltriptype;
    public static javax.swing.JRadioButton levr12;
    public static javax.swing.JRadioButton levr6;
    public static javax.swing.JRadioButton levr7;
    public static javax.swing.JRadioButton manystop;
    public static javax.swing.JRadioButton nostop;
    public static javax.swing.JRadioButton onestop;
    public static javax.swing.JComboBox<String> r12seat;
    public static javax.swing.JComboBox<String> r6seat;
    public static javax.swing.JComboBox<String> r7seat;
    public static javax.swing.JComboBox<String> vehicletype;
    // End of variables declaration//GEN-END:variables
}
