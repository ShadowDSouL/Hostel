/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.hostelmanagement;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tan Zhong
 */
public class RoomReservation extends javax.swing.JFrame {
    
    public static String username;
    public static String roomID;
    /**
     * Creates new form RoomReservation
     */
    public RoomReservation(String userName, String roomID) {
        initComponents();
        displayBookingDetails(roomID);
        RoomReservation.username = userName;
        RoomReservation.roomID = roomID;
        userLab2.setText(username);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rrLab1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rrRoomIDLab1 = new javax.swing.JLabel();
        rrRoomTypeLab1 = new javax.swing.JLabel();
        rrPriceLab1 = new javax.swing.JLabel();
        rrPeriodLab1 = new javax.swing.JLabel();
        rrLab2 = new javax.swing.JLabel();
        rrCombo1 = new javax.swing.JComboBox<>();
        rrRoomIDLab2 = new javax.swing.JLabel();
        rrRoomTypeLab2 = new javax.swing.JLabel();
        rrPriceLab2 = new javax.swing.JLabel();
        rrBackBtn = new javax.swing.JButton();
        rrPayBtn = new javax.swing.JButton();
        userLab1 = new javax.swing.JLabel();
        userLab2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Room Reservation");

        rrLab1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        rrLab1.setText("Please confirm your booking here");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rrRoomIDLab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrRoomIDLab1.setText("Room ID:");

        rrRoomTypeLab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrRoomTypeLab1.setText("Room Type:");

        rrPriceLab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrPriceLab1.setText("Price:");

        rrPeriodLab1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrPeriodLab1.setText("Duration:");

        rrLab2.setText("How long would you like to rent this room?");

        rrCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Month", "6 Months", "12 Months", "24 Months" }));

        rrRoomIDLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrRoomIDLab2.setText("MR0101");

        rrRoomTypeLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrRoomTypeLab2.setText("Master Room");

        rrPriceLab2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rrPriceLab2.setText("RM1000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rrRoomIDLab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rrPriceLab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rrPeriodLab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rrRoomTypeLab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rrCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rrRoomIDLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rrRoomTypeLab2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(rrPriceLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(rrLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rrRoomIDLab1)
                    .addComponent(rrRoomIDLab2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rrRoomTypeLab1)
                    .addComponent(rrRoomTypeLab2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rrPriceLab1)
                    .addComponent(rrPriceLab2))
                .addGap(24, 24, 24)
                .addComponent(rrLab2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rrPeriodLab1)
                    .addComponent(rrCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        rrBackBtn.setText("Back");
        rrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrBackBtnActionPerformed(evt);
            }
        });

        rrPayBtn.setText("Pay with Card");
        rrPayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrPayBtnActionPerformed(evt);
            }
        });

        userLab1.setText("User:");

        userLab2.setText("User001");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rrLab1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rrBackBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rrPayBtn))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLab2)
                    .addComponent(userLab1))
                .addGap(5, 5, 5)
                .addComponent(rrLab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rrBackBtn)
                    .addComponent(rrPayBtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayBookingDetails(String roomSelected){
        hostel h = new hostel(null,null,null,null,0,null,null);
        ArrayList<String> tmp = h.mainFunc("Room.txt","r");
        for(int i=0; i<tmp.size(); i++){
            String rDetails = tmp.get(i);
            String[] rData = rDetails.split(",");
            
            if(rData[0].equals(roomSelected)){
                rrRoomIDLab2.setText(rData[0]);
                rrRoomTypeLab2.setText(rData[2]);
                rrPriceLab2.setText("RM "+rData[4]);
            }
        }
    }
    
    private void rrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrBackBtnActionPerformed
        // TODO add your handling code here:
        HostelApplication ha = new HostelApplication(username);
        ha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_rrBackBtnActionPerformed

    private void rrPayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrPayBtnActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog
                (this, "Are you sure you want to proceed to payment?", 
                "Confirm!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION)
        {
            String roomID = rrRoomIDLab2.getText();
            String roomType = rrRoomTypeLab2.getText();
            String price = rrPriceLab2.getText().substring(3);
            String duration = rrCombo1.getSelectedItem().toString();  
            
            Payment p = new Payment(roomID, roomType, price, duration, username);
            p.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rrPayBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomReservation(username, roomID).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rrBackBtn;
    private javax.swing.JComboBox<String> rrCombo1;
    private javax.swing.JLabel rrLab1;
    private javax.swing.JLabel rrLab2;
    private javax.swing.JButton rrPayBtn;
    private javax.swing.JLabel rrPeriodLab1;
    private javax.swing.JLabel rrPriceLab1;
    private javax.swing.JLabel rrPriceLab2;
    private javax.swing.JLabel rrRoomIDLab1;
    private javax.swing.JLabel rrRoomIDLab2;
    private javax.swing.JLabel rrRoomTypeLab1;
    private javax.swing.JLabel rrRoomTypeLab2;
    private javax.swing.JLabel userLab1;
    private javax.swing.JLabel userLab2;
    // End of variables declaration//GEN-END:variables
}
