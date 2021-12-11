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
public class Store implements mainData {

    private int strCode;
    private String strAddress;
    private String StrPhone;

    public int getStrCode() {
        return strCode;
    }

    public void setStrCode(int strCode) {
        this.strCode = strCode;
    }

    public String getStrAddress() {
        return strAddress;
    }

    public void setStrAddress(String strAddress) {
        this.strAddress = strAddress;
    }

    public String getStrPhone() {
        return StrPhone;
    }

    public void setStrPhone(String StrPhone) {
        this.StrPhone = StrPhone;
    }

    @Override
    public void add() {
        String strAdd = "insert into store values ("
                + strCode + ","
                + "'" + strAddress + "',"
                + "'" + StrPhone+"')";
        boolean isAdded = db.go.runNonQuery(strAdd);
        if (isAdded) {
            myprotools.msgbooks("Store data added successfully");
        }
    }

    @Override
    public void update() {
        String strUpdate = "update store set "
                + "storeAddress='" + strAddress + "',"
                + "storePhone='" + StrPhone + "'"
                + "where storeCode=" + strCode;
        boolean isUpadated = db.go.runNonQuery(strUpdate);
        if (isUpadated) {
            myprotools.msgbooks("Store data Updated successfully");
        }
    }

    @Override
    public void delete() {
        String strDelete="delete from store where storeCode= "+
                strCode;
        boolean isDeleted=db.go.runNonQuery(strDelete);
        if(isDeleted){
            myprotools.msgbooks("Store data deleted successfully");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.autoNumber("store", "storeCode");
    }

    @Override
    public void getAllRows(JTable table) {
        String strGetAllRows="select *from store";
        db.go.fillToJtable(strGetAllRows,table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJtable(statement, table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strGetOneRaw="select *from store where storeCode="+
                strCode;
        db.go.fillToJtable(strGetOneRaw, table);
    }

    @Override
    public String getValueByName(String name) {
        String getVluByName="select storeCode from store where storeAddress='"
                +name+"'";
        return db.go.getTabelData(getVluByName).items[0][0].toString();
    }

    @Override
    public String getNameByValue(String value) {
        String strGetNameByValue="select storeAddress from store where storeCode="
                +value;
        return (String)db.go.getTabelData(strGetNameByValue).items[0][0];
    }

}
