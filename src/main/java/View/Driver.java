/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package View;

import Control.Controller;
import Models.Response;
import javax.swing.JPanel;

/**
 *
 * @author memis
 */
public class Driver extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer Driver
     */
    public Driver() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BT_vehicle_register = new javax.swing.JButton();
        BT_route_register = new javax.swing.JButton();
        BT_view_routes = new javax.swing.JButton();
        BT_view_vehicles = new javax.swing.JButton();
        BT_edit_vehicle = new javax.swing.JButton();
        BT_cancel_route = new javax.swing.JButton();
        BT_log_out = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Driver");

        BT_vehicle_register.setBackground(new java.awt.Color(0, 0, 255));
        BT_vehicle_register.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_vehicle_register.setForeground(new java.awt.Color(255, 255, 255));
        BT_vehicle_register.setText("Vehicle register");
        BT_vehicle_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_vehicle_registerActionPerformed(evt);
            }
        });

        BT_route_register.setBackground(new java.awt.Color(0, 0, 255));
        BT_route_register.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_route_register.setForeground(new java.awt.Color(255, 255, 255));
        BT_route_register.setText("Route register");
        BT_route_register.setToolTipText("");
        BT_route_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_route_registerActionPerformed(evt);
            }
        });

        BT_view_routes.setBackground(new java.awt.Color(0, 0, 255));
        BT_view_routes.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_view_routes.setForeground(new java.awt.Color(255, 255, 255));
        BT_view_routes.setText("View routes");

        BT_view_vehicles.setBackground(new java.awt.Color(0, 0, 255));
        BT_view_vehicles.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_view_vehicles.setForeground(new java.awt.Color(255, 255, 255));
        BT_view_vehicles.setText("View vehicles");
        BT_view_vehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_view_vehiclesActionPerformed(evt);
            }
        });

        BT_edit_vehicle.setBackground(new java.awt.Color(0, 0, 255));
        BT_edit_vehicle.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_edit_vehicle.setForeground(new java.awt.Color(255, 255, 255));
        BT_edit_vehicle.setText("Edit vehicle");

        BT_cancel_route.setBackground(new java.awt.Color(0, 0, 255));
        BT_cancel_route.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_cancel_route.setForeground(new java.awt.Color(255, 255, 255));
        BT_cancel_route.setText("Cancel route");

        BT_log_out.setBackground(new java.awt.Color(0, 0, 255));
        BT_log_out.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BT_log_out.setForeground(new java.awt.Color(255, 255, 255));
        BT_log_out.setText("Log Out");
        BT_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BT_view_vehicles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_route_register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_view_routes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_vehicle_register, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(BT_edit_vehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_cancel_route, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_log_out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(BT_vehicle_register)
                .addGap(18, 18, 18)
                .addComponent(BT_route_register)
                .addGap(18, 18, 18)
                .addComponent(BT_view_routes)
                .addGap(18, 18, 18)
                .addComponent(BT_view_vehicles)
                .addGap(18, 18, 18)
                .addComponent(BT_edit_vehicle)
                .addGap(18, 18, 18)
                .addComponent(BT_cancel_route)
                .addGap(18, 18, 18)
                .addComponent(BT_log_out)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BT_vehicle_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_vehicle_registerActionPerformed
                JPanel register_vehicle = new Insert_vehicle_panel();
                Main_window.render_panel(register_vehicle);
    }//GEN-LAST:event_BT_vehicle_registerActionPerformed

    private void BT_route_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_route_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_route_registerActionPerformed

    private void BT_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_log_outActionPerformed
        Response response = Controller.log_out();
        JPanel log_in = new Login_panel();
        Main_window.render_panel(log_in);
    }//GEN-LAST:event_BT_log_outActionPerformed

    private void BT_view_vehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_view_vehiclesActionPerformed
        JPanel view_vehicle = new get_available_vehicles();
        Main_window.render_panel(view_vehicle);
    }//GEN-LAST:event_BT_view_vehiclesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_cancel_route;
    private javax.swing.JButton BT_edit_vehicle;
    private javax.swing.JButton BT_log_out;
    private javax.swing.JButton BT_route_register;
    private javax.swing.JButton BT_vehicle_register;
    private javax.swing.JButton BT_view_routes;
    private javax.swing.JButton BT_view_vehicles;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
