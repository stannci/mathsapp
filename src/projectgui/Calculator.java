/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectgui;

/**
 *
 * @author dylankilkenny
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form ExamPapers
     */
    public Calculator() {
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

        ExamPapers = new javax.swing.JPanel();
        ordHead = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 100, 400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(null);

        ExamPapers.setLayout(null);

        ordHead.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ordHead.setForeground(new java.awt.Color(255, 255, 255));
        ordHead.setText("Coming Soon...");
        ExamPapers.add(ordHead);
        ordHead.setBounds(70, 100, 300, 70);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgui/images/Maths.jpg"))); // NOI18N
        ExamPapers.add(background2);
        background2.setBounds(0, 0, 400, 480);

        getContentPane().add(ExamPapers);
        ExamPapers.setBounds(0, 0, 400, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ExamPapers;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel ordHead;
    // End of variables declaration//GEN-END:variables
}
