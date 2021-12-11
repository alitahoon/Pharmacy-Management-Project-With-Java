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
public class Drags implements mainData {

    private int draID;
    private String draName;
    private String draExDate;
    private double draPrise;
    private int draQuantity;
    private int storeCode;

    public int getDraID() {
        return draID;
    }

    public void setDraID(int draID) {
        this.draID = draID;
    }
    public int getDraQuantity(){
        return draQuantity;
    }
    public void setDraQuantity(int draQuantity){
        this.draQuantity=draQuantity;
    }

    public String getDraName() {
        return draName;
    }

    public void setDraName(String draName) {
        this.draName = draName;
    }

    public String getDraExDate() {
        return draExDate;
    }

    public void setDraExDate(String draExDate) {
        this.draExDate = draExDate;
    }

    public double getDraPrise() {
        return draPrise;
    }

    public void setDraPrise(double draPrise) {
        this.draPrise = draPrise;
    }

    public int getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(int storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public void add() {
        String add = "insert into drug values("
                + draID + ","
                + "'" + draName + "',"
                + "'" + draExDate + "',"
                + draPrise+","
                +draQuantity+","
                + storeCode+")";
        boolean isAdded = db.go.runNonQuery(add);
        if (isAdded) {
            myprotools.msgbooks("Drug data added successful");
        }
    }

    @Override
    public void update() {
        String update = "update drug set"
                + " drugId='" + draName + "',"
                + " drugName='" + draExDate + "',"
                + " drugExDate=" + draPrise+","
                + " drugQuantity= "+draQuantity+","
                + " storeCode=" + storeCode
                + " where drugID=" + draID;
        boolean isUpdated = db.go.runNonQuery(update);
        if (isUpdated) {
            myprotools.msgbooks("Drug data updated successfully");
        }
    }

    @Override
    public void delete() {
        String delete = "delete from drug where drugID= "
                + draID;
        boolean isDeleted = db.go.runNonQuery(delete);
        if (isDeleted) {
            myprotools.msgbooks("Drug data deleted successfully");
        }

    }

    @Override
    public String getAutoNumber() {
        return db.go.autoNumber("drug", "drugID");
    }

    @Override
    public void getAllRows(JTable table) {
        String GetAllR = "select *from drug";
        db.go.fillToJtable(GetAllR, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJtable(statement, table);
    }

    @Override
    public void getOneRow(JTable table) {
        String getOneR = "select *from drug where drugID="
                + draID;
        db.go.fillToJtable(getOneR, table);
    }

    @Override
    public String getValueByName(String name) {
        String getValueByN = "select drugID from drug where drugName='"
                + name + "'";
        return db.go.getTabelData(getValueByN).items[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        String getNameByV = "select drugID from drug where drugName='"
                + value + "'";
        return db.go.getTabelData(getNameByV).items[0][0].toString();
    }
}
