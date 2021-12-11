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
public class EmployeeSellingDrags implements mainData {

    private int empID;
    private int draID;
    private int id;

    
    public int getID(){
        return id;
    }
    public  void  setid(int  id){
        this.id=id;
    }
    public int getEmpID() {
        return empID;
    }
    

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getDraID() {
        return draID;
    }

    public void setDraID(int draID) {
        this.draID = draID;
    }

    @Override
    public void add() {
        String add = "insert into sellingDrugs values ("
                + empID + "," + draID +","+id +")";
        boolean isAdded = db.go.runNonQuery(add);
        if (isAdded) {
            myprotools.msgbooks("Data added successfully");
        }
    }

    @Override
    public void update() {
        myprotools.msgbooks("method Update not supported here");
    }

    @Override
    public void delete() {
        String delete = "delete from sellingDrugs where "
                + "employeeID=" + empID+" and "
                + "drugID=" + draID;
        boolean isDeleted = db.go.runNonQuery(delete);
        if (isDeleted) {
            myprotools.msgbooks("Data deleted successfully");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.autoNumber("sellingDrugs", "employeeid");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJtable("select *from sellingDrugs", table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJtable(statement, table);
    }

    @Override
    public void getOneRow(JTable table) {
        String getOneR="select *from sellingDrugs where employeeId="
                +empID+" and "+"drugId"+draID;
    }

    @Override
    public String getValueByName(String name) {
                return "GetValueByName method not supported here";

    }

    @Override
    public String getNameByValue(String value) {
                return "GetNameByValue method not supported here";
    }

}
