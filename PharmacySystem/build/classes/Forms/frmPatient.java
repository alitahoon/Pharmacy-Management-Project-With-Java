/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.Patient;
import java.awt.Color;
import pharmacysystem.myprotools;

/**
 *
 * @author Ali
 */
public class frmPatient extends javax.swing.JFrame {

    /**
     * Creates new form frmPatient
     */
    public frmPatient() {
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

        btnGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new systemControlsComponent.JBUTTON();
        btnUpdate = new systemControlsComponent.JBUTTON();
        btnDelete = new systemControlsComponent.JBUTTON();
        btnClear = new systemControlsComponent.JBUTTON();
        btnAll = new systemControlsComponent.JBUTTON();
        btnFind = new systemControlsComponent.JBUTTON();
        jLabel5 = new javax.swing.JLabel();
        txtSearchKey = new systemControlsComponent.JTEXTBOX(50);
        rdID = new javax.swing.JRadioButton();
        rdName = new javax.swing.JRadioButton();
        jBUTTON7 = new systemControlsComponent.JBUTTON();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientInfo = new javax.swing.JTable();
        btnBack = new systemControlsComponent.JBUTTON();
        txtID = new systemControlsComponent.JTEXTBOX(70);
        txtName = new systemControlsComponent.JTEXTBOX(70);
        txtAddress = new systemControlsComponent.JTEXTBOX(70);
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1600, 900));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Search by:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Address:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        btnAdd.setText("Add");
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 80, -1));

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 470, -1, -1));

        btnClear.setText("Clear");
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, 90, -1));

        btnAll.setText("All");
        btnAll.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 100, -1));

        btnFind.setText("Find");
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 80, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Patient ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        txtSearchKey.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtSearchKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 200, 30));

        rdID.setBackground(new java.awt.Color(219, 240, 237));
        rdID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdID.setSelected(true);
        rdID.setText("ID");
        getContentPane().add(rdID, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        rdName.setBackground(new java.awt.Color(219, 240, 237));
        rdName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rdName.setText("Name");
        getContentPane().add(rdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 150, -1, -1));

        jBUTTON7.setText("Search");
        jBUTTON7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBUTTON7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUTTON7ActionPerformed(evt);
            }
        });
        getContentPane().add(jBUTTON7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 200, 100, 40));

        tblPatientInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPatientInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 566, 410));

        btnBack.setText("Back");
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 650, 80, 40));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 210, 30));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 210, 30));

        txtAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 210, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\courses\\Paharmacy project\\Design Phase\\Selling3.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setVlues();
        p.update();
        clearText();
        p.getAllRows(tblPatientInfo);
        txtID.setText(p.getAutoNumber());
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        setVlues();
        p.delete();
        clearText();
        p.getAllRows(tblPatientInfo);
        txtID.setText(p.getAutoNumber());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        p.setPatID(Integer.parseInt(myprotools.inputBox("Enter ID").toString()));
        p.getOneRow(tblPatientInfo);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        myprotools.setOpenForm(new frmMain(),"Main Form");
    }//GEN-LAST:event_btnBackActionPerformed
    Patient p=new Patient();
    private void setVlues(){
        p.setPatID(Integer.parseInt(txtID.getText()));
        p.setPatName(txtName.getText());
        p.setPatAddress(txtAddress.getText());
        
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    private void clearText(){
        myprotools.cleartxt(this);
        btnAdd.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtName.requestFocus();
        
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setVlues();
        p.add();
        clearText();
        p.getAllRows(tblPatientInfo);
        txtID.setText(p.getAutoNumber());
    }//GEN-LAST:event_btnAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clearText();
        btnGroup.add(rdID);
        btnGroup.add(rdName);
        p.getAllRows(tblPatientInfo);
        txtID.setText(p.getAutoNumber());
    }//GEN-LAST:event_formWindowOpened

    private void tblPatientInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientInfoMouseClicked
        int row =tblPatientInfo.getSelectedRow();
        txtID.setText(tblPatientInfo.getValueAt(row, 0).toString());
        txtName.setText(tblPatientInfo.getValueAt(row, 1).toString());
        txtAddress.setText(tblPatientInfo.getValueAt(row, 2).toString());
        btnAdd.setEnabled(false);
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_tblPatientInfoMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void jBUTTON7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUTTON7ActionPerformed
        try {
            String search="select * from patient where ";
            if(rdID.isSelected()){
                search+="patientid";
            }else{
                search+="patientName";
            }
            search+=" like'%"+txtSearchKey+"'%";
            db.go.fillToJtable(search, tblPatientInfo);
        } catch (Exception e) {
            myprotools.msgbooks(e.getMessage());
        }
    }//GEN-LAST:event_jBUTTON7ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private systemControlsComponent.JBUTTON btnAdd;
    private systemControlsComponent.JBUTTON btnAll;
    private systemControlsComponent.JBUTTON btnBack;
    private systemControlsComponent.JBUTTON btnClear;
    private systemControlsComponent.JBUTTON btnDelete;
    private systemControlsComponent.JBUTTON btnFind;
    private javax.swing.ButtonGroup btnGroup;
    private systemControlsComponent.JBUTTON btnUpdate;
    private systemControlsComponent.JBUTTON jBUTTON7;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdID;
    private javax.swing.JRadioButton rdName;
    private javax.swing.JTable tblPatientInfo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchKey;
    // End of variables declaration//GEN-END:variables
}
