/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import org.json.simple.*;
import org.json.simple.parser.*;
/**
 *
 * @author mhill9
 */


import model.AdminList;
import model.DoctorList;
import model.PatientList;
import model.SecretaryList;
import model.Singleton;
public class HospitalGui extends javax.swing.JFrame {

    /**
     * Creates new form HospitalGui
     */
    public HospitalGui() {
        initComponents();
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserComboBox = new javax.swing.JComboBox<>();
        LogIn = new javax.swing.JButton();
        PasswordField = new javax.swing.JTextField();
        IDField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogInFailText = new javax.swing.JLabel();
        AdminButton = new javax.swing.JButton();
        PatientReq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Doctor", "Secretary", "Patient" }));
        UserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserComboBoxActionPerformed(evt);
            }
        });

        LogIn.setText("Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        IDField.setActionCommand("<Not Set>");
        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("ID number");

        jLabel2.setText("Password");

        AdminButton.setText("Admin Creation");
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        PatientReq.setText("Patient Acc Request");
        PatientReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(AdminButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(PatientReq, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LogInFailText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(UserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(UserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addComponent(LogInFailText, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminButton)
                    .addComponent(PatientReq)
                    .addComponent(LogIn))
                .addGap(40, 40, 40))
        );

        LogIn.getAccessibleContext().setAccessibleName("LogInBtn");
        jLabel1.getAccessibleContext().setAccessibleName("Label ID");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_UserComboBoxActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed
    Singleton newInstance = Singleton.getInstance();
    AdminList Admins = new AdminList();
    DoctorList Doctors = new DoctorList();
    PatientList Patients = new PatientList();
    SecretaryList Secretarys = new SecretaryList();
    
    private void getData(){

        Doctors.doctorlist();
        Admins.adminList();
        Patients.patientlist();
        Secretarys.secretarylist();
    }
    
    
    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
        UserComboBox.getSelectedIndex();
        PasswordField.getText();
        IDField.getText();
        String Letter = "A";
        int n = 0;
        if (UserComboBox.getSelectedItem().equals("Administrator")) {
            Letter = "A"; //converting easy to understand dropdown to tags used to identify role
            n = Admins.AdminList.size()  ; // the -1 is to make it match the for loop
        }
        else if (UserComboBox.getSelectedItem().equals("Doctor")){
            Letter = "D";
            n = Doctors.DoctorList.size() ;
            System.out.println(Doctors.DoctorList.size());
        }
         else if (UserComboBox.getSelectedItem().equals("Patient")){
            Letter = "P";
            n = Patients.PatientList.size() ;
        }
         else if (UserComboBox.getSelectedItem().equals("Secretary")){
            Letter = "S";
            n = Secretarys.SecretaryList.size() ;
        }
        System.out.println(n);
        int NoOfAdmins = Admins.AdminList.size();
        int NoOfDoctors = Doctors.DoctorList.size();
        int NoOfPatients = Patients.PatientList.size();
        int NoOfSecretarys = Secretarys.SecretaryList.size();
        for (int i = 0; i < n; i++) {
            if(i >= NoOfAdmins)
            {
            }
            else{
        if (PasswordField.getText().equals(Admins.AdminList.get(i).getPreferedPassword()) && IDField.getText().equals(String.valueOf(Admins.AdminList.get(i).getUserId())) && Letter.equals("A")) 
        {
            System.out.println(Admins.AdminList.get(i).getUserId());
            System.out.println(Admins.AdminList.get(i).getPreferedPassword());
            System.out.println(Admins.AdminList.get(i).getLetter());
            this.setVisible(false);
        new MainPageGuiAdmin().setVisible(true);
        }   
        }
            if(i >= NoOfDoctors)
            {
            }
            else{
        if(PasswordField.getText().equals(Doctors.DoctorList.get(i).getPreferedPassword()) && IDField.getText().equals(String.valueOf(Doctors.DoctorList.get(i).getUserId())) && Letter.equals("D"))
        {
            System.out.println(Doctors.DoctorList.get(i).getUserId());
            System.out.println(Doctors.DoctorList.get(i).getPreferedPassword());
            System.out.println(Doctors.DoctorList.get(i).getLetter());
             this.setVisible(false);
        new MainPageGuiDoctor().setVisible(true);
        }
            }if(i >= NoOfPatients)
            {
            }
            else{
            
        if(PasswordField.getText().equals(Patients.PatientList.get(i).getPreferedPassword()) && IDField.getText().equals(String.valueOf(Patients.PatientList.get(i).getUserId()))  && Letter.equals("P"))
        {
            System.out.println(Patients.PatientList.get(i).getUserId());
            System.out.println(Patients.PatientList.get(i).getPreferedPassword());
            System.out.println(Patients.PatientList.get(i).getLetter());
             this.setVisible(false);
        new MainPageGuiPatient().setVisible(true);
        }
            }
        if(i >= NoOfSecretarys)
            {
            }
            else{
        if (PasswordField.getText().equals(Secretarys.SecretaryList.get(i).getPreferedPassword()) && IDField.getText().equals(String.valueOf(Secretarys.SecretaryList.get(i).getUserId())) && Letter.equals("S"))
        {
            System.out.println(Secretarys.SecretaryList.get(i).getUserId());
            System.out.println(Secretarys.SecretaryList.get(i).getPreferedPassword());
            System.out.println(Secretarys.SecretaryList.get(i).getLetter());
             this.setVisible(false);
        new MainPageGuiSecretary().setVisible(true);
        }
        
        else 
        {
        LogInFailText.setText("log in Failed. Please try again!");
        }
        }
        } 
    }//GEN-LAST:event_LogInActionPerformed

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDFieldActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new CreateOwnAdmin().setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void PatientReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientReqActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        new PatientRequest().setVisible(true);
    }//GEN-LAST:event_PatientReqActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel LogInFailText;
    private javax.swing.JTextField PasswordField;
    private javax.swing.JButton PatientReq;
    private javax.swing.JComboBox<String> UserComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
