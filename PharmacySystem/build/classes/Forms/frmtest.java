/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entity.Drags;
import Entity.Employee;
import Entity.EmployeeSellingDrags;
import Entity.Patient;
import Entity.Store;
import pharmacysystem.myprotools;

/**
 *
 * @author Ali
 */
public class frmtest extends javax.swing.JFrame {

    /**
     * Creates new form frmtest
     */
    public frmtest() {
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

        jBUTTON1 = new systemControlsComponent.JBUTTON();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBUTTON1.setText("frmTest");
        jBUTTON1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUTTON1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Drag ID", "Drag Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jBUTTON1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jBUTTON1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBUTTON1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUTTON1ActionPerformed
        //Store str = new Store();
        //emp.setEmpID(2);
        //emp.setEmpName("mustafa");
        //emp.setEmpPhone("01275645305");
        //emp.setEmpSalary(800);
        //emp.setShiftStart("7");
        //emp.setShiftEnd("11");
        //emp.update();
        //emp.add();
        //emp.getAllRows(testTabel);
        //emp.getCustomRows("select *from employee", testTabel);
        //emp.getOneRow(testTabel);
        // myprotools.msgbooks(emp.getValueByName("mustafa"));
        //str.setStrCode(2);
        // str.setStrAddress("wgdrgdrgecsd");
        //  str.setStrPhone("3165461651");
        //str.add();
        // str.getCustomRows("select * from store where storeCode=2", testTabel1);
        // str.getOneRow(testTabel1);
        //myprotools.msgbooks(str.getNameByValue("2"));
        //str.getAllRows(testTabel1);
        //Drags d = new Drags();
        //d.setDraID(1);
        //d.setDraName("cotovan");
        //d.setDraExDate("2023-09-06");
        //d.setDraPrise(30);
        //d.setStoreCode(1);
        //d.delete();
        //d.getAllRows(jTable1);
        // myprotools.msgbooks(d.getAutoNumber()); 
        // d.getCustomRows("select *from drug", jTable1);
        //d.getOneRow(jTable1);
        //Patient p=new Patient();
        //p.setPatID(1);
        //p.setPatName("ahmed");
        //p.setPatAddress("shamma");
        //p.update();
        //myprotools.msgbooks(p.getAutoNumber());
        //p.getAllRows(jTable1);
        //p.getCustomRows("select *from patient", jTable1);
        //myprotools.msgbooks(p.getNameByValue("1"));
        //myprotools.msgbooks(p.getValueByName("ahmed"));
        EmployeeSellingDrags e=new EmployeeSellingDrags();
        //e.setid(3);
        //e.setDraID(1);
        //e.setEmpID(2);
        //e.add();
        //e.getAllRows(jTable1);
        e.getCustomRows("select *from empSdrag where emp_name='ali'", jTable1);
        
    }//GEN-LAST:event_jBUTTON1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmtest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmtest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private systemControlsComponent.JBUTTON jBUTTON1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
