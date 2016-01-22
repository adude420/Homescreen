/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homescreen;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asmi
 */
public class Homescreen {
  static homescreen1 home1;
   static homescreen2 home2;
    static library_gui1 l;
    static Schedule s;
    
    public static void main(String[] args) {
        Homescreen h=new Homescreen();
        home1=new homescreen1();
     
    }

    static void call_homescreen2() {
       home2=new homescreen2();
       home2.setVisible(true);
    }
    static void call_library(int i)
    {
      l=new library_gui1(i);  
    }
    static void callSchedule()
    {
        s=new Schedule();
    }
    static void call_homescreen1(){
        home1=new homescreen1();
    }
    static void call_homescreen2(DefaultTableModel t){
        home2.setTable(t);
        home2.setVisible(true);
    }
    static void setHomeScreenVisible()
    {
        home2.setVisible(true);
    }
    
}
