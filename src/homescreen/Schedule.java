/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package homescreen;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Schedule extends javax.swing.JFrame {
    static GregorianCalendar cal;
    static int nod;
    static int tnod;
    static int fnod;
    static int nodPrevMonth;
    static int nodNextMonth;
//                static int copyNexttoNext;
    static int realTareek ;
    static int realMonth;
    static int realYear;
    static int realDay;//sunday,monday...
    //  static int currentDay;
    static int currentMonth;
    static int currentYear;
    //static int nextTareek;
    static int from;
    static int to;
    static int fMonth;
    static int tMonth;
    static int fYear;
    static int tYear;
    static int tmonth_changed=0;
    static int fmonth_changed=0;
    static int prevTareek;
    static String day;
    static String month;
    static boolean Firstrun=true;
    static int month_changed=0;
    static int month_changed2=0;
      static  String []months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        static String []days={"NONE","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
         
        static DefaultTableModel m;
    /**
     * Creates new form Schedule
     */
    public Schedule() {
        initComponents();
        
        System.out.println("change..");
        cal = new GregorianCalendar(); //Create calendar
        realTareek=cal.get(GregorianCalendar.DAY_OF_MONTH);
        realMonth=cal.get(GregorianCalendar.MONTH);
        currentMonth=realMonth;
        realYear = cal.get(GregorianCalendar.YEAR); //Get year
        //  System.out.println(realYear+1);
        currentYear=realYear;
        cal=new GregorianCalendar(realYear,realMonth,realTareek);
        realDay=cal.get(GregorianCalendar.DAY_OF_WEEK);//sunday=1,monday=2....
        nod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal=new GregorianCalendar(realYear,realMonth-1,realTareek);
        nodPrevMonth=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        cal=new GregorianCalendar(realYear,realMonth+1,realTareek);
        nodNextMonth=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
        tYear=realYear;
        fYear=realYear;
        
        setStringDay();
        setStringMonth();
        myinit();
        Font font = weekFrom.getFont();
        int size = font.getSize();
        Font f=font.deriveFont(size-30);
       WeekView.setShowGrid(true);
        WeekView.getTableHeader().setFont(f);
        WeekView.getTableHeader().setForeground(Color.BLACK);
    }
    void setStringDay()
    {   
        day=days[realDay];
    }
    static void setStringMonth()
    {
        month=months[realMonth];
    }

    static void incrementcurrentMonth()
    {
        if(currentMonth==11)
        {
            currentMonth=0;
            currentYear+=1;
        }
        else
            currentMonth+=1;
    }
    static void decrementCurrentMonth()
    {
        if(currentMonth==0)
        {
            currentMonth=11;
            currentYear-=1;
        }
        else
            currentMonth-=1;
    }
    static void incrementfMonth()
    {
            if(fMonth==11)
        {
            fMonth=0;
            fYear+=1;
        }
        else
            fMonth+=1;
        cal=new GregorianCalendar(fYear,fMonth,from);
        fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }
    static void incrementtMonth()
    {
            if(tMonth==11)
        {
            tMonth=0;
            tYear+=1;
        }
        else
            tMonth+=1;
         cal=new GregorianCalendar(tYear,tMonth,to);
         tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
   
    }
    static void decrementtMonth()
    {
        if(tMonth==0)
        {
            tMonth=11;
            tYear-=1;
        }
        else
            tMonth-=1;
        cal=new GregorianCalendar(tYear,tMonth,1);
        tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }
    
    static void decremenfMonth()
    {
        if(fMonth==0)
        {
            fMonth=11;
            fYear-=1;
        }
        else
            fMonth-=1;
        cal=new GregorianCalendar(fYear,fMonth,1);
        fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
    }
    void refreshHeader(String header[])
    {
        
        JTableHeader th = WeekView.getTableHeader();
        th.setSize(10, 20);
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc;
        for(int i=1;i<=7;i++)
        {
            tc = tcm.getColumn(i);
            tc.setHeaderValue( header[i] );
            th.repaint();
        }
        MultiLineHeaderRenderer renderer = new MultiLineHeaderRenderer();
    Enumeration e = WeekView.getColumnModel().getColumns();
    while (e.hasMoreElements()) {
      ((TableColumn) e.nextElement()).setHeaderRenderer(renderer);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        WeekView = new javax.swing.JTable();
        prev = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        weekTo = new javax.swing.JLabel();
        weekFrom = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        next.setText(">>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        WeekView.setBackground(new java.awt.Color(255, 102, 102));
        WeekView.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        WeekView.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        WeekView.setForeground(new java.awt.Color(0, 0, 102));
        WeekView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"09:00 am", null, null, null, null, null, null, null},
                {"09:30 am", null, null, null, null, null, null, null},
                {"10:00 am", null, null, null, null, null, null, null},
                {"10:30 am", null, null, null, null, null, null, null},
                {"11:00 am", null, null, null, null, null, null, null},
                {"11:30 am", null, null, null, null, null, null, null},
                {"12:00 noon", null, null, null, null, null, null, null},
                {"12:30 pm", null, null, null, null, null, null, null},
                {"01:00 pm", null, null, null, null, null, null, null},
                {"01:30 pm", null, null, null, null, null, null, null},
                {"02:00 pm", null, null, null, null, null, null, null},
                {"02:30 pm", null, null, null, null, null, null, null},
                {"03:00 pm", null, null, null, null, null, null, null},
                {"03:30 pm", null, null, null, null, null, null, null},
                {"04:00 pm", null, null, null, null, null, null, null},
                {"04:30 pm", null, null, null, null, null, null, null}
            },
            new String [] {
                "Time", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WeekView.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        WeekView.setColumnSelectionAllowed(true);
        WeekView.setGridColor(new java.awt.Color(51, 51, 51));
        WeekView.setRowHeight(38);
        WeekView.setSelectionForeground(new java.awt.Color(255, 204, 204));
        WeekView.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(WeekView);
        WeekView.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        prev.setText("<<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        weekTo.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        weekTo.setForeground(new java.awt.Color(0, 0, 51));
        weekTo.setText("jLabel2");

        weekFrom.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        weekFrom.setForeground(new java.awt.Color(0, 0, 51));
        weekFrom.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("to");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(weekFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weekFrom)
                    .addComponent(weekTo)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("reset");

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(179, 179, 179))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(prev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(next)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next)
                            .addComponent(jButton2))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prev)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        String []header={"NONE","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        fmonth_changed=0;
        tmonth_changed=0;
        from=from+7;
        if(from>fnod)
        {
            from=from%fnod;
            incrementfMonth();//inc month and update fnod
            fmonth_changed=1;
            
        }
        weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(fYear));
        System.out.println(from);
        header[1]=Integer.toString(from)+" "+months[fMonth]+"\n"+header[1];
//        to=from+6;
        boolean flag=false;
        int temp_tnod=tnod;
        for(int i=1;i<=6;i++)
        {
            to=from+i;
            
            if(to>temp_tnod)
            {
                to=to%temp_tnod;
                if(!flag)
                {
                    incrementtMonth();//inc month and update tnod
                    flag=true;
                }
            }
            if(fmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            header[i+1]=Integer.toString(to)+" "+months[tMonth]+"\n"+header[i+1];
            
        }
        refreshHeader(header);
        weekTo.setText(Integer.toString(to)+" "+months[tMonth]+"\n"+Integer.toString(tYear));
        
    }//GEN-LAST:event_nextActionPerformed
    
    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        String []header={"NONE","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        from=from-7;
        if(from<1)
        {
            decremenfMonth();
            from=fnod+from;
            
        }
        weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(fYear));
        header[1]=Integer.toString(from)+" "+months[fMonth]+"\n"+header[1];
        
        // to=from+6;
        boolean flag=false;
        for(int i=1;i<=6;i++)
        {
            to=from+i;
            if(to>fnod)
            {
                flag=false;
                to=to%fnod;
                header[i+1]=Integer.toString(to)+" "+months[tMonth]+"\n"+header[i+1];                
            }
            else
            {
                flag=true;
                header[i+1]=Integer.toString(to)+" "+months[fMonth]+"\n"+header[i+1];
                
            }
        }
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(tYear));
        refreshHeader(header);
        if(flag)
        {
            tMonth=fMonth;
            tYear=fYear;
        }
    }//GEN-LAST:event_prevActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Homescreen.setHomeScreenVisible();
    }//GEN-LAST:event_jButton1ActionPerformed
    void myinit()
    {
        setVisible(true);
        System.out.println("");
        tMonth=realMonth;
        tnod=nod;
        fnod=nod;
        fMonth=realMonth;
        if(day.compareTo("Monday")==0)
        {
              
            from=realTareek;
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                    incrementcurrentMonth();
                    cal=new GregorianCalendar(currentYear,currentMonth,to);
                    nod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            }
                tMonth=currentMonth;
                tnod=nod;
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
                    
//                   prevTareek=realTareek-7;
//                   if(prevTareek<1)
//                   {
//                       prevTareek=nod+prevTareek;
//                        refreshPrev();
//                   }
            //incrementNextTareek(7);
//                   decrementPrevTareek(7);
//                   nextTareek=realTareek+6+1;
//                   if(nextTareek>nod)
//                   {
//                       nextTareek=nextTareek%nod;
//                        refreshNext();
//                   }
            
        }
        else if(day.compareTo("Tuesday")==0)
        { 
            from=realTareek-1;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
//         =realTareek-8;
//                   incrementNextTareek(6);
//                   decrementPrevTareek(8);
//                   nextTareek=realTareek+5+1;
        }
        else if(day.compareTo("Wednesday")==0)
        {
            
            from=realTareek-2;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=from+fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
            //         prevTareek=realTareek-9;
            //incrementNextTareek(5);
//                   decrementPrevTareek(9);
//                   1=realTareek+4+1;
        }
        else if(day.compareTo("Thursday")==0)
        {

            from=realTareek-3;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=from+fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
                       
//                   prevTareek=realTareek-10;
//                   incrementNextTareek(4);
//                   decrementPrevTareek(10);
//                   1=realTareek+3+1;
        }
        else if(day.compareTo("Friday")==0)
        {
            
            from=realTareek-4;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=from+fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
            //                   prevTareek=realTareek-11;
//                   incrementNextTareek(3);
//                   decrementPrevTareek(11);
//                   nextTareek=realTareek+2+1;
        }
        else if(day.compareTo("Saturday")==0)
        {
            
            from=realTareek-5;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=from+fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
//                   prevTareek=realTareek-12;
//                   incrementNextTareek(2);
//                   decrementPrevTareek(12);
//                   nextTareek=realTareek+1+1;
        }
        else if(day.compareTo("Sunday")==0)
        {
            
            from=realTareek-6;
            if(from<1)
            {
                decrementCurrentMonth();
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                fnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                from=from+fnod;
                fMonth=currentMonth;
                fmonth_changed=1;
            }
            weekFrom.setText(Integer.toString(from)+" "+months[fMonth]+" "+Integer.toString(currentYear));
            to=from+6;
            if(to>tnod)
            {
                    to=to%tnod;
                   tmonth_changed=1;
            }    
            if(fmonth_changed==1&&tmonth_changed==1)
            {
                tMonth=fMonth;
                tnod=fnod;
            }
            else if(fmonth_changed==0&&tmonth_changed==1)
            {
                incrementcurrentMonth();
                tMonth=currentMonth;
                cal=new GregorianCalendar(currentYear,currentMonth,1);
                tnod=cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
                
            }
                
            weekTo.setText(Integer.toString(to)+" "+months[tMonth]+" "+Integer.toString(currentYear));
           
//                   incrementNextTareek(1);
//                   decrementPrevTareek(13);
//                   prevTareek=realTareek-13;
//                   nextTareek=realTareek+0+1;
        }
        //  s.currentMonth = s.realMonth; //Match month and year
        //No resize/reorder
        WeekView.getTableHeader().setResizingAllowed(false);
        WeekView.getTableHeader().setReorderingAllowed(false);
    }
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
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Schedule s= new Schedule();
               // s.myinit();
                //    s.weekFrom.setText(Integer.toString(realTareek)+month+Integer.toString(realYear));
//  s.setExtendedState(MAXIMIZED_BOTH);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable WeekView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JLabel weekFrom;
    private javax.swing.JLabel weekTo;
    // End of variables declaration//GEN-END:variables
}





class MultiLineHeaderRenderer extends JList implements TableCellRenderer {
  public MultiLineHeaderRenderer() {
    setOpaque(true);
    //setForeground(UIManager.getColor("TableHeader.foreground"));
    setForeground(Color.BLACK);
    //setBackground(UIManager.getColor("TableHeader.background"));
    setBackground(Color.CYAN);
    setBorder(UIManager.getBorder("TableHeader.cellBorder"));
    ListCellRenderer renderer = getCellRenderer();
    ((JLabel) renderer).setHorizontalAlignment(JLabel.CENTER);
    setCellRenderer(renderer);
  }

  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    setFont(table.getFont());
    String str = (value == null) ? "" : value.toString();
    BufferedReader br = new BufferedReader(new StringReader(str));
    String line;
    Vector v = new Vector();
    try {
      while ((line = br.readLine()) != null) {
        v.addElement(line);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    setListData(v);
    return this;
  }
}