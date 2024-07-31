import javax.swing.JOptionPane;
import project.InsertUpdateDelete;
import java.sql.*;
import project.*;

public class Signup extends javax.swing.JFrame 
{

   
    public Signup() {
        initComponents();
        //setExtendedState(JFrame.MAXIMISED BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(866, 11, 73, 33);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(450, 90, 100, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 170, 40, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 210, 50, 14);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 250, 70, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 290, 110, 14);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(380, 170, 310, 30);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(380, 210, 310, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(380, 250, 310, 30);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your pet name?", "What is your Favourite colour?", "What is your school name?" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(380, 290, 310, 30);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 440, 73, 23);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Signup");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 440, 73, 23);

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Forgot Password?");
        getContentPane().add(jButton4);
        jButton4.setBounds(560, 440, 133, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Answer");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 330, 60, 14);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(380, 330, 310, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 370, 50, 14);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(380, 370, 310, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.PNG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-230, 0, 1180, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do You Really want to close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String name=jTextField1.getText();
        String email=jTextField2.getText();
        String password=jPasswordField1.getText();
        String securityQuestion=(String)jComboBox1.getSelectedItem();
        String answer=jTextField3.getText();
        String address=jTextField4.getText();
        if(name.equals("") || password.equals("") || answer.equals("") || address.equals("") )
            JOptionPane.showMessageDialog(null,"Every Field Is Required");
       
        else
        {
           String Query; 
           Query="insert into users values('"+name+"','"+email+"','"+password+"','"+securityQuestion+"','"+answer+"','"+address+"','false')";
           InsertUpdateDelete.setData(Query,"Registered Successfully");
           setVisible(false);
           new NewJFrame().setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
