package View;

/**
 *
 * @author memis
 */
public class Register_panel extends javax.swing.JPanel {

    /** Creates new form Register_panel */
    public Register_panel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        second_name_tbox = new javax.swing.JTextField();
        first_name_tbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        last_name_tbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        second_last_name_tbox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        birthday_formatted = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        gender_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        institution_combo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        institutional_email_tbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        type_user_combo = new javax.swing.JComboBox<>();
        Conditional_options = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        license_formated = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        expiration_date = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        register_terms_bt = new javax.swing.JButton();
        accepts_check = new javax.swing.JCheckBox();
        register_sign_up_bt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        register_password_tbox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(600, 550));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Register New User");

        jLabel2.setText("First Name:");

        jLabel4.setText("Second Name:");

        first_name_tbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                first_name_tboxActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        jLabel5.setText("Second Last Name:");

        jLabel6.setText("Birthday:");

        birthday_formatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        birthday_formatted.setText("d/M/y");

        jLabel8.setText("Gender:");

        gender_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Man", "Woman", "Other", "Prefer not to say" }));
        gender_combo.setToolTipText("");

        jLabel9.setText("Institution:");

        institution_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEC", "UCR", "UNA", "UNED" }));

        jLabel7.setText("Institutional e-mail:");

        jLabel10.setText("Type of user:");

        type_user_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driver", "Passenger" }));
        type_user_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_user_comboActionPerformed(evt);
            }
        });

        Conditional_options.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), null, java.awt.Color.lightGray, java.awt.Color.white));
        Conditional_options.setEnabled(false);

        jLabel11.setText("License number:");

        try {
            license_formated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        license_formated.setText("xx-xxxxxxxxx");
        license_formated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                license_formatedActionPerformed(evt);
            }
        });

        jLabel12.setText("Expiration date:");

        expiration_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));

        javax.swing.GroupLayout Conditional_optionsLayout = new javax.swing.GroupLayout(Conditional_options);
        Conditional_options.setLayout(Conditional_optionsLayout);
        Conditional_optionsLayout.setHorizontalGroup(
            Conditional_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conditional_optionsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(Conditional_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Conditional_optionsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel12))
                    .addGroup(Conditional_optionsLayout.createSequentialGroup()
                        .addComponent(license_formated, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(expiration_date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        Conditional_optionsLayout.setVerticalGroup(
            Conditional_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Conditional_optionsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(Conditional_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(4, 4, 4)
                .addGroup(Conditional_optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(license_formated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiration_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Have you read and accepted terms and conditions?");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        register_terms_bt.setBackground(new java.awt.Color(242, 242, 242));
        register_terms_bt.setForeground(new java.awt.Color(0, 0, 255));
        register_terms_bt.setText("Terms and conditions");
        register_terms_bt.setBorder(null);
        register_terms_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        register_terms_bt.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        register_terms_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_terms_btActionPerformed(evt);
            }
        });

        accepts_check.setText("Accept");
        accepts_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accepts_checkActionPerformed(evt);
            }
        });

        register_sign_up_bt.setBackground(new java.awt.Color(0, 51, 255));
        register_sign_up_bt.setForeground(new java.awt.Color(255, 255, 255));
        register_sign_up_bt.setText("Sign up");
        register_sign_up_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_sign_up_btActionPerformed(evt);
            }
        });

        jLabel15.setText("Password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(register_terms_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(accepts_check)
                    .addComponent(register_sign_up_bt)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type_user_combo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 100, Short.MAX_VALUE)
                            .addComponent(institution_combo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(institutional_email_tbox)
                                .addComponent(register_password_tbox, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(first_name_tbox, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(second_name_tbox)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addComponent(Conditional_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthday_formatted, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(last_name_tbox))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(second_last_name_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gender_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206))
                            .addComponent(jLabel8))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(first_name_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second_name_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(last_name_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(second_last_name_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthday_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(institution_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(institutional_email_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(type_user_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_password_tbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Conditional_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_terms_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(accepts_check)
                .addGap(10, 10, 10)
                .addComponent(register_sign_up_bt)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void type_user_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_user_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_type_user_comboActionPerformed

    private void license_formatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_license_formatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_license_formatedActionPerformed

    private void register_terms_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_terms_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_terms_btActionPerformed

    private void accepts_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accepts_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accepts_checkActionPerformed

    private void register_sign_up_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_sign_up_btActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_register_sign_up_btActionPerformed

    private void first_name_tboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_first_name_tboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_first_name_tboxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Conditional_options;
    private javax.swing.JCheckBox accepts_check;
    private javax.swing.JFormattedTextField birthday_formatted;
    private javax.swing.JFormattedTextField expiration_date;
    private javax.swing.JTextField first_name_tbox;
    private javax.swing.JComboBox<String> gender_combo;
    private javax.swing.JComboBox<String> institution_combo;
    private javax.swing.JTextField institutional_email_tbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField last_name_tbox;
    private javax.swing.JFormattedTextField license_formated;
    private javax.swing.JTextField register_password_tbox;
    private javax.swing.JButton register_sign_up_bt;
    private javax.swing.JButton register_terms_bt;
    private javax.swing.JTextField second_last_name_tbox;
    private javax.swing.JTextField second_name_tbox;
    private javax.swing.JComboBox<String> type_user_combo;
    // End of variables declaration//GEN-END:variables

}
