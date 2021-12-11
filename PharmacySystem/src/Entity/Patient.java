/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import javax.swing.JTable;
import pharmacysystem.myprotools;

/**
 *
 * @author Ali
 */
public class Patient implements mainData {

    private int patientID;
    private String patientName;
    private String patientAddress;

    public int getPatID() {
        return patientID;
    }

    public void setPatID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatName() {
        return patientName;
    }

    public void setPatName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatAddress() {
        return patientAddress;
    }

    public void setPatAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    @Override
    public void add() {
        String add = "insert into patient values ("
                + patientID + ","
                + "'" + patientName + "',"
                + "'" + patientAddress + "')";
        boolean isAdded = db.go.runNonQuery(add);
        if (isAdded) {
            myprotools.msgbooks("Data patient added successfully");
        }
    }

    @Override
    public void update() {
        String update = "update patient set"
                + " patientName='" + patientName + "',"
                + " patientAddress='" + patientAddress + "'"
                + " where patientID=" + patientID;
        boolean isUpdated = db.go.runNonQuery(update);
        if (isUpdated) {
            myprotools.msgbooks("Data patient updated successfully");
        }
    }

    @Override
    public void delete() {
        String delete = "delete from patient where patientID="
                + patientID;
        boolean isDeleted = db.go.runNonQuery(delete);
        if (isDeleted) {
            myprotools.msgbooks("Data patient deleted successfully");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.autoNumber("patient", "patientID");
    }

    @Override
    public void getAllRows(JTable table) {
        String getAllR = "select *from patient ";
        db.go.fillToJtable("patient", table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJtable(statement, table);
    }

    @Override
    public void getOneRow(JTable table) {
        String getOneR = "select *from patient where patientID="
                + patientID;
        db.go.fillToJtable(getOneR, table);
    }

    @Override
    public String getValueByName(String name) {
        String getValueBN = "select patientID from patient where patName ="
                + "'" + name + "'";
        return db.go.getTabelData(getValueBN).items[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        String getNameBV = "select patName from patient where patientID ="
                + value ;
        return db.go.getTabelData(getNameBV).items[0][0].toString();
    }

}
