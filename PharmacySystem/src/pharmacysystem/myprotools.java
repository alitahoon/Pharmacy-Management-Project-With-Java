package pharmacysystem;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.synth.ColorType;
import javax.swing.text.html.HTML;

/**
 *
 * @author Ali
 */
public class myprotools {
     //get screenReslution
        public static  Dimension screensize=
                    Toolkit.getDefaultToolkit().getScreenSize();
           public static int screenWidth= (int) screensize.getWidth();
            public static int screenHight=(int) screensize.getHeight();

    public static void msgbooks(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void createFolder(String folderName) {
        File f = new File(folderName);
        f.mkdir();
    }

    public static void createFolderWithPath(String folderName, String folderpath) {
        File f = new File(folderpath + "/" + folderName);
        f.mkdir();
    }

    public static void createFile(String para) {
        try {
            PrintWriter f = new PrintWriter("Empty.txt");
            f.println(para);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public static void createEmFile(String fileName) {
        try {
            PrintWriter f = new PrintWriter(fileName + ".txt");

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public static void cleartxt(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                cleartxt((Container) c);
            }
        }
    }

    public static void setOpenForm(JFrame form,String title) {
       

        try {
            Image img = ImageIO.read(pharmacysystem.PharmacySystem.class.
                    getResource("looogo.png"));  
            form.setLocationRelativeTo(null);
            form.setVisible(true);
            form.setIconImage(img);
            form.setLocation((1920-form.getWidth())/2,(1080-form.getHeight())/2);
            form.setBackground(new Color(142,180,191));
            form.setTitle("System Login Page "+"/"+title);
            form.setDefaultCloseOperation(1);
        } catch (IOException ex) {
            Logger.getLogger(myprotools.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static Object inputBox(String input){
        Object myobject=JOptionPane.showInputDialog(input);
        return myobject;
    }
    public static boolean confirmMsg(String message){
        int confirm=JOptionPane.showConfirmDialog(null,message );
        if(confirm==JOptionPane.YES_NO_OPTION) return true;
        else return false;
    }
    public static void  drawimage(JFrame f){
        JPanel pnl=new JPanel(){
          @Override
          public void paintComponent(Graphics g){
              try {
                  Graphics2D g2=(Graphics2D)g;
                  Image img=ImageIO.read(pharmacysystem.PharmacySystem.class.
                          getResource("green4.jpg"));
                  g2.drawImage(img, 0, 0, f);
              } catch (IOException ex) {
                  Logger.getLogger(myprotools.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }
        };
        f.add(pnl); 
        pnl.setBounds(0, 0, screenWidth, screenHight);
       
    }
public class Tabel{
    public int columns;
    public Object[][] items;
    public Tabel(int colums){
        this.columns=colums;
        items=new Object[0][colums];
    }
    public void addNewRow(Object row []){
        Object tempItems [][]=items;
        items=new Object[items.length +1][columns];
        for (int i = 0; i < tempItems.length; i++) {
            items[i]=tempItems[i];
        }
        items[items.length -1]=row;
    }
    public void prinItems(){
        for (Object[] objes : items) {
            for (Object  obje : objes) {
                System.out.print(obje+" / ");
            }
            System.err.println(" ");
        }
    }
    public void editRow(int rowindex,int colmunsindex,Object newItem){
        items[rowindex][colmunsindex]=newItem;
    }
    public void deletItem(int rowIndex){
        Object tempItem [][]=items;
        items=new Object[items.length-1][columns];
        int y=0;
        for (int i = 0; i <tempItem.length; i++) {
            if(i!=rowIndex){
                items[y]=tempItem[i];
                y++;
            }
        }
    }
    public Object getValue(int rowindex,int columnindes){
        return items[rowindex][columnindes];
    }
}

    

}
