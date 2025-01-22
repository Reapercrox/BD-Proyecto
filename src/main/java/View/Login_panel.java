/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Constants.Response_code;
import Control.Controller;
import Models.Response;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author memis
 */
public class Login_panel extends javax.swing.JPanel {
    
    private void clean_fields(){
        FT_username.setText("");
        FT_password.setText("");
    }

    /**
     * Creates new form Login_panel
     */
    
    public Login_panel() {
        initComponents();
        setPreferredSize(new Dimension(650, 700));
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
        FT_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FT_password = new javax.swing.JTextField();
        BT_sign_in = new javax.swing.JButton();
        sign_up_bt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LB_error_message = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("News701 BT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("UniDrive Carpooling");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setText("Username:");

        FT_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FT_usernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setText("Password:");

        BT_sign_in.setBackground(new java.awt.Color(0, 0, 255));
        BT_sign_in.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        BT_sign_in.setForeground(new java.awt.Color(255, 255, 255));
        BT_sign_in.setText("Sign in");
        BT_sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_sign_inActionPerformed(evt);
            }
        });

        sign_up_bt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        sign_up_bt.setForeground(new java.awt.Color(0, 0, 255));
        sign_up_bt.setText("Sign up");
        sign_up_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_up_btActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 2, 10)); // NOI18N
        jLabel4.setText("Not registered yet? ->");

        LB_error_message.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FT_password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FT_username, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sign_up_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BT_sign_in))
                        .addComponent(LB_error_message, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(FT_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FT_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sign_up_bt)
                    .addComponent(BT_sign_in))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LB_error_message)
                .addGap(158, 158, 158))
        );

        FT_username.getAccessibleContext().setAccessibleName("FT_username");
        FT_password.getAccessibleContext().setAccessibleName("FT_password");
        BT_sign_in.getAccessibleContext().setAccessibleName("BT_sign_in");
        LB_error_message.getAccessibleContext().setAccessibleName("LB_error_message");

        getAccessibleContext().setAccessibleName("login_panel");
        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void FT_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FT_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FT_usernameActionPerformed

    private void sign_up_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_up_btActionPerformed
        JPanel registration = new Register_panel();
        Main_window.render_panel(registration);  
    }//GEN-LAST:event_sign_up_btActionPerformed

    private void BT_sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_sign_inActionPerformed
        String user_email = FT_username.getText();
        String user_password = FT_password.getText();
        
        Response response = Controller.login_user(user_email,user_password);
        
        LB_error_message.setText(response.getMessage());
        
        if (response.getResponse_code() == Response_code.SUCCESS){
            LB_error_message.setForeground(Color.black);
            if(response.getResponse_code2() == 0){
                JPanel driver1 = new Driver();
                Main_window.render_panel(driver1); 
            }
            else if(response.getResponse_code2() == 1){
                JPanel passenger1 = new Passenger1();
                Main_window.render_panel(passenger1); 
            }
            else{
                JPanel admin1 = new Admin1();
                Main_window.render_panel(admin1); 
            }
            clean_fields();
        }
        
        LB_error_message.setVisible(true);
        
        
    }//GEN-LAST:event_BT_sign_inActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_sign_in;
    private javax.swing.JTextField FT_password;
    private javax.swing.JTextField FT_username;
    private javax.swing.JLabel LB_error_message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sign_up_bt;
    // End of variables declaration//GEN-END:variables
}
