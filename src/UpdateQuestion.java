/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import project.DBConnection;
public class UpdateQuestion extends javax.swing.JFrame {

    /**
     * Creates new form UpdateQuestion
     */
    public UpdateQuestion() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        question = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        option1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        option2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        option3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        option4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ans = new javax.swing.JTextField();
        updateB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        idnum = new javax.swing.JTextField();
        searchB = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(400, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        jLabel1.setText("Update Question");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 13, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 1066, 15));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Question ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Question:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        question.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 171, 720, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Option 1:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 20));

        option1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 720, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Option 2:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        option2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 720, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("Option 3:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        option3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 720, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Option 4:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        option4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 720, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Answer:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        ans.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 720, 40));

        updateB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        updateB.setText("UPDATE");
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });
        getContentPane().add(updateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 150, 40));

        clearB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clearB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear.png"))); // NOI18N
        clearB.setText("CLEAR");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });
        getContentPane().add(clearB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 160, 40));

        idnum.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(idnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 122, 160, 40));

        searchB.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        searchB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchB.setText("Search");
        searchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBActionPerformed(evt);
            }
        });
        getContentPane().add(searchB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        // TODO add your handling code here:
        String id = idnum.getText();
        String ques = question.getText();
        String opt1 = option1.getText();
        String opt2 = option2.getText();
        String opt3 = option3.getText();
        String opt4 = option4.getText();
        String answer = ans.getText();
        try{
            Connection con = DBConnection.getCon();
            PreparedStatement ps=con.prepareStatement("update question set ques=?, opt1=?, opt2=?, opt3=?, opt4=?, answer=? where id=? ");
            ps.setString(1,answer);
            ps.setString(2,ques);
            ps.setString(3,opt1);
            ps.setString(4,opt2);
            ps.setString(5,opt3);
            ps.setString(6,opt4);
            ps.setString(7,id);
            ps.executeUpdate();
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Successfully Updated");
            setVisible(false);
            new UpdateQuestion().setVisible(true);
            
        } catch(Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true); 
            JOptionPane.showMessageDialog(jf,e);
        }
    }//GEN-LAST:event_updateBActionPerformed

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        // TODO add your handling code here:
        idnum.setText("");
        question.setText("");
        option1.setText("");
        option2.setText("");
        option3.setText("");
        option4.setText("");
        ans.setText("");
        idnum.setEditable(true);
    }//GEN-LAST:event_clearBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adminhome.open=0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBActionPerformed
        // TODO add your handling code here:
        String id = idnum.getText();
        try {
            Connection con = DBConnection.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select * from question where id='"+id+"'");
            if(rs.first()){
                question.setText(rs.getString(2));
                option1.setText(rs.getString(3));
                option2.setText(rs.getString(4));
                option3.setText(rs.getString(5));
                option4.setText(rs.getString(6));
                ans.setText(rs.getString(7));
                idnum.setEditable(false);
            } else {
                JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Question ID doesn't exist!");
            }
        }catch(Exception e){
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Question ID doesn't exist!");
        }
    }//GEN-LAST:event_searchBActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JButton clearB;
    private javax.swing.JTextField idnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField option1;
    private javax.swing.JTextField option2;
    private javax.swing.JTextField option3;
    private javax.swing.JTextField option4;
    private javax.swing.JTextField question;
    private javax.swing.JButton searchB;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
