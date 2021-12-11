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
public class Employee implements mainData{
    private int empID;
    private String empName;
    private String shiftStart;
    private String shiftEnd;
    private String empPhone;
    private double empSalary;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(String shiftStart) {
        this.shiftStart = shiftStart;
    }

    public String getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(String shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public void add() {
        String insert="insert into employee values("
                +empID+ 
               ","+ "'"+empName+"'"+
                ","+"'"+shiftStart+"'"+
                ","+"'"+shiftEnd+"'"+
                ","+"'"+empPhone+"'"+
                ","+"'"+empSalary+"'"+")";
        boolean isAdded=db.go.runNonQuery(insert);
        if(isAdded){
            myprotools.msgbooks("Employee data added successfully.");
        }
    }

    @Override
    public void update() {
        String update="UPDATE employee SET " 
                +"empName='"+empName+"',"
                + "shiftStart='"+shiftStart+"',"
                + "shiftEnd='"+shiftEnd+"',"
                + "empPhone='"+empPhone+"',"
                + "empSalary='"+empSalary+"'"+
                "where empId="+empID;
                
        
        boolean isUpdated=db.go.runNonQuery(update);
        if(isUpdated){
            myprotools.msgbooks("Employee data updated successfully.");
        }
    }

    @Override
    public void delete() {
        String delete="delete from employee where empId ="+empID;
        boolean isDeleted=db.go.runNonQuery(delete);
        if(isDeleted){
            myprotools.msgbooks("Employee data deleted successfully");
        }
    }

    @Override
    public String getAutoNumber() {
       return db.go.autoNumber("employee", "empId");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJtable("employee", table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJtable(statement,table);
    }

    @Override
    public void getOneRow(JTable table) {
        String str="select *from employee where empId="+empID;
        db.go.fillToJtable(str, table);
    }

    @Override
    public String getValueByName(String name) {
        String str="select  employeeId from employee where empName='"+name+"'";
       return (String)db.go.getTabelData(str).items[0][0];
    }

    @Override
    public String getNameByValue(String value) {
        String str="select employeeName from employee where empId="
                +value;
        return (String)db.go.getTabelData(str).items[0][0];
    }
    
}
