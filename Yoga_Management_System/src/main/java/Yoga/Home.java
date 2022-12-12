package Yoga;


import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame  {
    
}

    public Home() {
       
 initComponents();
    }

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog( null, "Do you Really want to  Logout", "select", JOptionPane.YES_NO_OPTION);
        if(a ==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }                                  

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog( null, "Do you want to Exit Application", "select", JOptionPane.YES_NO_OPTION);
        if(a ==0){
            System.exit(0);
        }
    }                                   

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        new NewMember().setVisible(true);
    }                                   

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        new UpdateDeleteMember().setVisible(true);
    }                                   

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        new ListMembers().setVisible(true);
    }                                   

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
        new Payment().setVisible(true);
    }                                   

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

   