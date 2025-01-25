package View;

import Constants.Response_code;
import Control.Controller;
import Models.Person;
import Models.Response;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author memis
 */
public class Register_panel extends javax.swing.JPanel {
    
    
    private void clean_fields(){
        FT_first_name.setText("");
        FT_last_name.setText("");
        FT_second_name.setText("");
        FT_second_last.setText("");
        FT_Id_Number.setText("");
        FT_Institution_Email.setText("");
        FT_district.setText("");
        FT_exact_address.setText("");
        FT_zip_code.setText("");
        FT_password_register.setText("");
        birthday_formatted.setText("");
        expiration_date.setText("");
        accepts_check.setSelected(false);
    }

        
    public Register_panel() {
        initComponents();
        
        
        setPreferredSize(new Dimension(650, 700));
        
        CB_Province.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateItemsCB_Municipality();
            }
        });
        
        Conditional_options.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FT_second_name = new javax.swing.JTextField();
        FT_first_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FT_last_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FT_second_last = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        birthday_formatted = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        CB_Gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CB_institution = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        FT_Institution_Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CB_type_user = new javax.swing.JComboBox<>();
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
        FT_password_register = new javax.swing.JTextField();
        CB_Country = new javax.swing.JComboBox<>();
        CB_Province = new javax.swing.JComboBox<>();
        FT_district = new javax.swing.JTextField();
        FT_exact_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        CB_Municipality = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        FT_zip_code = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        CB_type_id = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        FT_Id_Number = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        LB_registration_message = new javax.swing.JLabel();
        BT_go_back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(650, 600));
        setPreferredSize(new java.awt.Dimension(650, 600));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Register New User");

        jLabel2.setText("First Name:");

        jLabel4.setText("Second Name:");

        FT_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FT_first_nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        jLabel5.setText("Second Last Name:");

        jLabel6.setText("Birthday:");

        birthday_formatted.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yy"))));
        birthday_formatted.setText("dd-MMM-yy");

        jLabel8.setText("Gender:");

        CB_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Man", "Woman", "Other", "Prefer not to say" }));
        CB_Gender.setToolTipText("");

        jLabel9.setText("Institution:");

        CB_institution.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEC", "UCR", "UNA", "UNED" }));

        jLabel7.setText("Institutional e-mail:");

        jLabel10.setText("Type of user:");

        CB_type_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Driver", "Passenger" }));
        CB_type_user.setSelectedIndex(1);
        CB_type_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_type_userActionPerformed(evt);
            }
        });

        Conditional_options.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 204), null, java.awt.Color.lightGray, java.awt.Color.white));
        Conditional_options.setEnabled(false);

        jLabel11.setText("License number:");

        try {
            license_formated.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA-#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        license_formated.setText("B#-#########");
        license_formated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                license_formatedActionPerformed(evt);
            }
        });

        jLabel12.setText("Expiration date:");

        expiration_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-yy"))));
        expiration_date.setText("dd-MMM-yy");
        expiration_date.setToolTipText("");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        CB_Country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Costa Rica" }));
        CB_Country.setToolTipText("");

        CB_Province.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        CB_Province.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_ProvinceActionPerformed(evt);
            }
        });

        FT_district.setText(" ");

        FT_exact_address.setText(" ");

        jLabel14.setText("Exact_address");

        jLabel16.setText("District");

        jLabel17.setText("Province:");

        jLabel18.setText("Country:");

        jLabel19.setText("Municipality");

        CB_Municipality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_MunicipalityActionPerformed(evt);
            }
        });

        jLabel20.setText("Zip code:");

        FT_zip_code.setText(" ");

        jLabel21.setText("Type of ID:");

        CB_type_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula Nacional", "Pasaporte", "DIMEX" }));

        jLabel22.setText("ID Number:");

        LB_registration_message.setText("  ");

        BT_go_back.setText("Go back");
        BT_go_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_go_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FT_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(FT_second_name, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FT_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(birthday_formatted))
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FT_second_last, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(CB_type_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CB_institution, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CB_type_user, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addComponent(CB_Municipality, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FT_Institution_Email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FT_district, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FT_password_register, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CB_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CB_Province, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel17)
                                            .addComponent(FT_Id_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(FT_zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(FT_exact_address, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Conditional_options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(accepts_check)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(register_sign_up_bt)
                            .addGap(18, 18, 18)
                            .addComponent(LB_registration_message, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BT_go_back))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(register_terms_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 122, Short.MAX_VALUE))
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
                    .addComponent(FT_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FT_second_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel21))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FT_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FT_second_last, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CB_type_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FT_Id_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthday_formatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_institution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_Municipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FT_Institution_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CB_Province, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FT_district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FT_exact_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FT_zip_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB_type_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FT_password_register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Conditional_options, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_terms_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accepts_check)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_sign_up_bt)
                    .addComponent(BT_go_back)
                    .addComponent(LB_registration_message))
                .addGap(55, 55, 55)
                .addComponent(jLabel23)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        FT_second_name.getAccessibleContext().setAccessibleName("FT_second_name");
        FT_first_name.getAccessibleContext().setAccessibleName("FT_first_name");
        FT_last_name.getAccessibleContext().setAccessibleName("FT_last_name");
        FT_second_last.getAccessibleContext().setAccessibleName("FT_second_last");
        CB_Gender.getAccessibleContext().setAccessibleName("CB_Gender");
        CB_institution.getAccessibleContext().setAccessibleName("CB_institution");
        FT_Institution_Email.getAccessibleContext().setAccessibleName("FT_Institution_Email");
        CB_type_user.getAccessibleContext().setAccessibleName("CB_type_user");
        FT_password_register.getAccessibleContext().setAccessibleName("FT_password_register");
        CB_Country.getAccessibleContext().setAccessibleName("cb_country");
        CB_Province.getAccessibleContext().setAccessibleName("CB_Province");
        FT_district.getAccessibleContext().setAccessibleName("TF_district");
        FT_exact_address.getAccessibleContext().setAccessibleName("FT_exact_address");
        CB_Municipality.getAccessibleContext().setAccessibleName("CB_Municipality");
        CB_Municipality.getAccessibleContext().setAccessibleDescription("");
        FT_zip_code.getAccessibleContext().setAccessibleName("FT_zip_code");
        CB_type_id.getAccessibleContext().setAccessibleName("CB_type_id");
        CB_type_id.getAccessibleContext().setAccessibleDescription("");
        FT_Id_Number.getAccessibleContext().setAccessibleName("FT_Id_Number");
        LB_registration_message.getAccessibleContext().setAccessibleName("LB_registration_message");
        LB_registration_message.getAccessibleContext().setAccessibleDescription("");
        BT_go_back.getAccessibleContext().setAccessibleName("BT_go back");

        getAccessibleContext().setAccessibleName("Register_panel");
    }// </editor-fold>//GEN-END:initComponents

    private void CB_type_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_type_userActionPerformed
        String selectedType = (String) CB_type_user.getSelectedItem();
        
        if("Driver".equals(selectedType)){
            Conditional_options.setVisible(true);
        }
        else {
            Conditional_options.setVisible(false);
        }
    }//GEN-LAST:event_CB_type_userActionPerformed

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
        
        int isChecked = accepts_check.isSelected() ? 1 : 0;
        
        Person person = new Person(FT_first_name.getText(), FT_second_name.getText(), FT_last_name.getText(), FT_second_last.getText(),
                                   birthday_formatted.getText(), FT_Institution_Email.getText(), FT_password_register.getText(),
                                   isChecked, CB_Gender.getSelectedIndex(), CB_institution.getSelectedIndex(),
                                   CB_type_id.getSelectedIndex(), FT_Id_Number.getText(), 0,
                                   CB_Country.getSelectedIndex(), CB_Province.getSelectedIndex()+1,
                                   FT_district.getText(),(String)CB_Municipality.getSelectedItem(), FT_exact_address.getText(), FT_zip_code.getText(),
                                   CB_type_user.getSelectedIndex() 
                                   );
        
        if(CB_type_user.getSelectedIndex() == 0){
            person = new Person(FT_first_name.getText(), FT_second_name.getText(), FT_last_name.getText(), FT_second_last.getText(),
                    birthday_formatted.getText(), FT_Institution_Email.getText(), FT_password_register.getText(),
                    isChecked, CB_Gender.getSelectedIndex(), CB_institution.getSelectedIndex(),
                    CB_type_id.getSelectedIndex(), FT_Id_Number.getText(), 0,
                    CB_Country.getSelectedIndex(), CB_Province.getSelectedIndex()+1,
                    FT_district.getText(),(String)CB_Municipality.getSelectedItem(), FT_exact_address.getText(), FT_zip_code.getText(),
                    CB_type_user.getSelectedIndex(), license_formated.getText(), expiration_date.getText()
                    );
        } 

        Response response = Controller.register_person(person);
        LB_registration_message.setText(response.getMessage());
        LB_registration_message.setForeground(Color.red);
        if (response.getResponse_code() == Response_code.SUCCESS){
            LB_registration_message.setForeground(Color.black);
            clean_fields();
        }
        LB_registration_message.setVisible(true);
    }//GEN-LAST:event_register_sign_up_btActionPerformed

    private void FT_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FT_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FT_first_nameActionPerformed

    private void CB_ProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_ProvinceActionPerformed

    }//GEN-LAST:event_CB_ProvinceActionPerformed

    private void CB_MunicipalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_MunicipalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_MunicipalityActionPerformed

    private void BT_go_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_go_backActionPerformed
         JPanel login = new Login_panel();
         Main_window.render_panel(login);
    }//GEN-LAST:event_BT_go_backActionPerformed

    
    private void updateItemsCB_Municipality(){
        CB_Municipality.removeAllItems();
        
        String selectedProvince = (String) CB_Province.getSelectedItem();
        
        if ("San José".equals(selectedProvince)){
            CB_Municipality.addItem("Acosta");
            CB_Municipality.addItem("Alajuelita");
            CB_Municipality.addItem("Aserrí");
            CB_Municipality.addItem("Curridabat");
            CB_Municipality.addItem("Desamparados");
            CB_Municipality.addItem("Dota");
            CB_Municipality.addItem("Escazú");
            CB_Municipality.addItem("Goicochea");
            CB_Municipality.addItem("Leon Cortéz");
            CB_Municipality.addItem("Montes de Oca");
            CB_Municipality.addItem("Mora");
            CB_Municipality.addItem("Moravia");
            CB_Municipality.addItem("Pérez Zeledón");
            CB_Municipality.addItem("Puriscal");
            CB_Municipality.addItem("San José");
            CB_Municipality.addItem("Tarrazú");
            CB_Municipality.addItem("Santa Ana");
            CB_Municipality.addItem("Tibás");
            CB_Municipality.addItem("Turrubares");
            CB_Municipality.addItem("Vázquez de Coronado");    
        }
        else if ("Alajuela".equals(selectedProvince)){
            CB_Municipality.addItem("Alajuela");
            CB_Municipality.addItem("Atenas");
            CB_Municipality.addItem("Grecia");
            CB_Municipality.addItem("Guatuso");
            CB_Municipality.addItem("Los Chiles");
            CB_Municipality.addItem("Naranjo");
            CB_Municipality.addItem("Orotina");
            CB_Municipality.addItem("Palmáres");
            CB_Municipality.addItem("Poás");
            CB_Municipality.addItem("Río Cuarto");
            CB_Municipality.addItem("San Carlos");
            CB_Municipality.addItem("San Mateo");
            CB_Municipality.addItem("San Ramón");
            CB_Municipality.addItem("Sarchí");
            CB_Municipality.addItem("Upala");
            CB_Municipality.addItem("Zarcero");
            CB_Municipality.addItem("Peñas Blancas");
        }
        else if("Cartago".equals(selectedProvince)){
            CB_Municipality.addItem("Alvarado");
            CB_Municipality.addItem("Cartago");
            CB_Municipality.addItem("El Guarco");
            CB_Municipality.addItem("Jiménez");
            CB_Municipality.addItem("La Unión");
            CB_Municipality.addItem("Oreamuno");
            CB_Municipality.addItem("Paraíso");
            CB_Municipality.addItem("Turrialba");
            CB_Municipality.addItem("Cervantes");
            CB_Municipality.addItem("Tucurrique");
        }
        else if ("Heredia".equals(selectedProvince)){
            CB_Municipality.addItem("Barva");
            CB_Municipality.addItem("Belén");
            CB_Municipality.addItem("Flores");
            CB_Municipality.addItem("Heredia");
            CB_Municipality.addItem("San Isidro");
            CB_Municipality.addItem("San Pablo");
            CB_Municipality.addItem("San Rafael");
            CB_Municipality.addItem("Santa Bárbara");
            CB_Municipality.addItem("Santo Domingo");
            CB_Municipality.addItem("Sarapiquí");
        }
        else if ("Guanacaste".equals(selectedProvince)){
            CB_Municipality.addItem("Bagaces");
            CB_Municipality.addItem("Cañas");
            CB_Municipality.addItem("Carrillo");
            CB_Municipality.addItem("Colorado");
            CB_Municipality.addItem("Hojancha");
            CB_Municipality.addItem("La Cruz");
            CB_Municipality.addItem("Liberia");
            CB_Municipality.addItem("Nandayure");
            CB_Municipality.addItem("Nicoya");
            CB_Municipality.addItem("Santa Cruz");
            CB_Municipality.addItem("Tilarán");
        }
        else if ("Puntarenas".equals(selectedProvince)){
            CB_Municipality.addItem("Buenos Aires");
            CB_Municipality.addItem("Corredores");
            CB_Municipality.addItem("Coto Brus");
            CB_Municipality.addItem("Esparza");
            CB_Municipality.addItem("Garabito");
            CB_Municipality.addItem("Montes de Oro");
            CB_Municipality.addItem("Monteverde");
            CB_Municipality.addItem("Osa");
            CB_Municipality.addItem("Parrita");
            CB_Municipality.addItem("Puntarenas");
            CB_Municipality.addItem("Quepos");
            CB_Municipality.addItem("Cobano");
            CB_Municipality.addItem("Lepanto");
            CB_Municipality.addItem("Paquera");
        }
        else if ("Limón".equals(selectedProvince)){
            CB_Municipality.addItem("Limón");
            CB_Municipality.addItem("Matina");
            CB_Municipality.addItem("Pococí");
            CB_Municipality.addItem("Siquirres");
            CB_Municipality.addItem("Talamanca");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_go_back;
    private javax.swing.JComboBox<String> CB_Country;
    private javax.swing.JComboBox<String> CB_Gender;
    private javax.swing.JComboBox<String> CB_Municipality;
    private javax.swing.JComboBox<String> CB_Province;
    private javax.swing.JComboBox<String> CB_institution;
    private javax.swing.JComboBox<String> CB_type_id;
    private javax.swing.JComboBox<String> CB_type_user;
    private javax.swing.JPanel Conditional_options;
    private javax.swing.JTextField FT_Id_Number;
    private javax.swing.JTextField FT_Institution_Email;
    private javax.swing.JTextField FT_district;
    private javax.swing.JTextField FT_exact_address;
    private javax.swing.JTextField FT_first_name;
    private javax.swing.JTextField FT_last_name;
    private javax.swing.JTextField FT_password_register;
    private javax.swing.JTextField FT_second_last;
    private javax.swing.JTextField FT_second_name;
    private javax.swing.JTextField FT_zip_code;
    private javax.swing.JLabel LB_registration_message;
    private javax.swing.JCheckBox accepts_check;
    private javax.swing.JFormattedTextField birthday_formatted;
    private javax.swing.JFormattedTextField expiration_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField license_formated;
    private javax.swing.JButton register_sign_up_bt;
    private javax.swing.JButton register_terms_bt;
    // End of variables declaration//GEN-END:variables

}
