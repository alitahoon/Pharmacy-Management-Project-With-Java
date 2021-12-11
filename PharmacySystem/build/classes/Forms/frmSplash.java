/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Image;
import javax.imageio.ImageIO;
import pharmacysystem.myprotools;

/**
 *
 * @author Ali
 */
public class frmSplash extends javax.swing.JFrame {

    /**
     * Creates new form frmSplash
     */
    public frmSplash() {
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

        percent = new javax.swing.JLabel();
        progresspar = new javax.swing.JProgressBar();
        lblloading = new javax.swing.JLabel();
        percent1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        percent.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        percent.setForeground(new java.awt.Color(37, 79, 33));
        percent.setText("0 %");
        getContentPane().add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 520, -1, -1));

        progresspar.setForeground(new java.awt.Color(217, 224, 33));
        getContentPane().add(progresspar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 570, 1040, 40));

        lblloading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblloading.setForeground(new java.awt.Color(37, 79, 33));
        lblloading.setText("Loading...");
        getContentPane().add(lblloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        percent1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        percent1.setForeground(new java.awt.Color(37, 79, 33));
        percent1.setText("X");
        percent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                percent1MouseClicked(evt);
            }
        });
        getContentPane().add(percent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\courses\\Paharmacy project\\Design Phase\\splash3.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void percent1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_percent1MouseClicked
        System.exit(2);
    }//GEN-LAST:event_percent1MouseClicked
    public void open() {
        try {
            frmSplash sp = new frmSplash();
            sp.setVisible(true);
            int c=0;
            for (int i = 1; i <= 100; i++) {
                Thread.sleep(100);
                sp.percent.setText(i + "%");
                if (i == 10) {
                    sp.lblloading.setText("Turning on modules...");
                } else if (i == 20) {
                    sp.lblloading.setText("Loading modules...");
                } else if (i == 50) {
                    sp.lblloading.setText("Connecting to Database...");
                } else if (i == 70) {
                    sp.lblloading.setText("connection successfull...");
                } else if (i == 80) {
                    sp.lblloading.setText("Lunching Application...");
                }
                c=i;
                sp.progresspar.setValue(i);
            }
            sp.dispose();
            if(c==100){
              myprotools.setOpenForm(new frmlogin(), "");  
            }
            

        } catch (Exception e) {
            myprotools.msgbooks(e.getMessage());
        }
    }

  
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblloading;
    private javax.swing.JLabel percent;
    private javax.swing.JLabel percent1;
    private javax.swing.JProgressBar progresspar;
    // End of variables declaration//GEN-END:variables
}