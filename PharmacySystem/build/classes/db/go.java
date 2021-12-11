/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pharmacysystem.myprotools;
import pharmacysystem.myprotools.Tabel;
import sun.security.rsa.RSACore;
import systemControlsComponent.JCOMPBOX;

/**
 *
 * @author Ali
 */
public class go {

    private static Connection con;
    private static String url = " ";
    private static String dbName = "";

    private static void setURL() {
        url = "jdbc:mysql://localhost:3306/pharmacyDatabase"
                + "?useUnicode=true&characterEncoding=UTF-8";
    }

    private static void setConnection() {
        try {
            setURL();
            con = (Connection) DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
        }
    }

    public static boolean checkUserName_Password(String username, String password) {
        try {
            setConnection();
            Statement stmt = con.createStatement();
            String strcheck = "select * from users where "
                    + "userName='" + username + "'" + " and " + "pass='"
                    + password + "'";
            stmt.executeQuery(strcheck);
            while (stmt.getResultSet().next()) {
                con.close();
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
        }
        return false;
    }

    public static boolean runNonQuery(String sqlStatement) {
        setConnection();
        Statement stmt;
        try {
            stmt = con.createStatement();
            stmt.execute(sqlStatement);
            con.close();
            return true;
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
            return false;
        }
    }

    public static String autoNumber(String tableName, String columName) {
        try {
            setConnection();
            Statement stat = con.createStatement();
            String autonum = "select max(" + columName + ")+1 as autonum" + " from " + tableName;
            stat.executeQuery(autonum);
            String num = "";
            while (stat.getResultSet().next()) {
                num = stat.getResultSet().getString("autonum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
            return "0";
        }
    }

    public static Tabel getTabelData(String statement) {
        myprotools t = new myprotools();
        try {
            setConnection();
            Statement stmt = con.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(statement);
            ResultSetMetaData rsmd = rs.getMetaData();
            int c = rsmd.getColumnCount();
            Tabel tabel = t.new Tabel(c);
            while(rs.next()){
                Object row[]=new Object[c];
                for (int i = 0; i <c; i++) {
                    row[i]=rs.getString(i+1);
                }
                tabel.addNewRow(row);
            }
            con.close();
            return tabel;
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
            return t.new Tabel(0);
        }
    }
    public static void fillCompoBox(String tableName,String columnName,JCOMPBOX compo){
        try {
            setConnection();
            Statement stat=con.createStatement();
            String str="select "+columnName+" from "+tableName;
            ResultSet rs=stat.executeQuery(str);
            rs.last();
            int c=rs.getRow();
            rs.beforeFirst();
            String values[]=new String[c];
            int i=0;
            while(rs.next()){
                values[i]=rs.getString(1);
                i++;
            }
            compo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {
            myprotools.msgbooks(ex.getMessage());
        }
    }
    public static void fillToJtable(String tabelNameOrStatement,JTable tabel){
        try{
            setConnection();
             Statement stat=con.createStatement();
                ResultSet rs;
                String strselect;
            if("select ".equals(tabelNameOrStatement.subSequence(0, 7))){
               strselect=tabelNameOrStatement;
                
            }else{
                strselect="select *from "+tabelNameOrStatement;
            }
            rs=stat.executeQuery(strselect);
            ResultSetMetaData rsmd=rs.getMetaData();
            int c=rsmd.getColumnCount();
            DefaultTableModel tModel=(DefaultTableModel)tabel.getModel();
            Vector row=new Vector();
            tModel.setRowCount(0);
            while(rs.next()){
                row= new Vector(c);
                for(int i=1;i<=c;i++){
                    row.add(rs.getString(i));
                }
                tModel.addRow(row); 
            }
            if(tabel.getColumnCount()!=c){
                myprotools.msgbooks("Tabel columns Do not equal Query Column");
            }
            con.close();
        }catch(SQLException ex){
            myprotools.msgbooks(ex.getMessage());
        }
        
    }
}
