/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BankApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ezzat
 */
public class Bank_Login extends javax.swing.JFrame {

    private static final String CUSTOMER_FILE_PATH = Path.getCustomer();
    private static final String PAYMENTS_FILE_PATH = Path.getPayment();
    private static final String USER_FILE_PATH = Path.getUser();
    Customer c;
    File temp = new File("temp.txt");
    List<User> users = new ArrayList<>();
    List<Customer> cu = new ArrayList<>();
    Bank_app client;
    AdmininsratorFrame ad;
    Bank_register br;
    DataFile df;

    /**
     * Creates new form Bank_Login
     */
    public Bank_Login() throws IOException, ClassNotFoundException {
        if (temp.exists()) {
            c = df.readCustomerFromFile("temp.txt");
            client = new Bank_app(c);
            client.setVisible(true);
            this.setVisible(false);

        } else {
            initComponents();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        T2 = new javax.swing.JPasswordField();
        B1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 141, 129, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 214, -1, -1));

        T1.setBackground(new java.awt.Color(204, 204, 204));
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        jPanel1.add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 147, 213, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 97, -1, -1));

        T2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 212, 213, 34));

        B1.setBackground(new java.awt.Color(102, 102, 102));
        B1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("Login");
        B1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 110, 31));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Helwan National Bank");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        B2.setBackground(new java.awt.Color(102, 102, 102));
        B2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("Sign-up");
        B2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        String name, pass, id = null;
        int flag = 0;
        name = T1.getText();
        pass = T2.getText();
        boolean admin = false;
        try {

            users = DataFile.readUserFromFile(USER_FILE_PATH);

            for (int i = 0; i < users.size(); i++) {
                if (name.equals(users.get(i).getUsername()) && pass.equals(users.get(i).getPass())) {
                    flag = 1;
                    admin = users.get(i).isIs_admin();
                    id = users.get(i).getId();
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (flag == 0) {
                JOptionPane.showMessageDialog(null, "You have entered wrong password or username.");
            } else {
                if (!admin) {
                    try {
                        cu = DataFile.readCustomersFromFile(CUSTOMER_FILE_PATH);
                        for (int i = 0; i < cu.size(); i++) {
                            if (id.equals(cu.get(i).getId())) {
                                c = cu.get(i);
                                temp.createNewFile();
                                DataFile.writeCustomerToFile("temp.txt", c);
                            }
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    client = new Bank_app(c);
                    client.setVisible(true);
                    this.setVisible(false);
                } else {
                    ad = new AdmininsratorFrame();
                    ad.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        br = new Bank_register();
        br.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_B2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bank_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bank_Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Bank_Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JTextField T1;
    private javax.swing.JPasswordField T2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
