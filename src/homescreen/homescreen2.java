/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homescreen;

import com.sun.media.jfxmedia.Media;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

import javafx.scene.media.MediaPlayer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Asmi
 */
public class homescreen2 extends javax.swing.JFrame {
    Homescreen homes; 
    int TotalDurationOfPlaylist=0;
    MediaPlayer mediaPlayer=null;
   String []s;
  int rowCount2;
   int mouseclick=0;
    DefaultTableModel m1,m2;
 
    

   homescreen2(Homescreen home,JTable list_table) {
       homes=home;
       initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        setVisible(true);
         // ClockLabel dateLable = new ClockLabel("date");
    ClockLabel timeLable = new ClockLabel("time");
   // ClockLabel dayLable = new ClockLabel("day");
     JPanel p=new JPanel();
    p.setSize(350,60);
    p.setLocation(30,60);
   // p.add(dateLable);
    p.add(timeLable);
   // p.add(dayLable);
    p.setBackground(Color.black);
    p.setVisible(true);
    add(p);
   String text=Integer.toString(TotalDurationOfPlaylist);
       duration_label.setText(text); 
     
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
      
      // current.setDefaultRenderer(Object.class, new MyRenderer());
     //  current.setCellRenderer(new MyRenderer());
       //add(current);
      // current.setVisible(true);
      // current.setLocation(10,100);
         pack();
       
        m1=(DefaultTableModel) list_table.getModel();
        m2=(DefaultTableModel) current.getModel();
         int rowCount1 = m1.getRowCount();
         System.out.println("r1 "+rowCount1);
         
         System.out.println("r2 "+rowCount2);
         m2.setNumRows(rowCount1+rowCount2);
        int i;
        for(i=rowCount2;i<rowCount1+rowCount2;i++)
        {
                Object value=m1.getValueAt(i, 0);
                m2.setValueAt(value, i, 0);
                value=m1.getValueAt(i, 1);
                m2.setValueAt(value, i, 1);
             //   duration=(int) m2.getValueAt(i, 1)+duration;
        }
        current.setModel(m2);
        text=Integer.toString(TotalDurationOfPlaylist);
       duration_label.setText(text); 
    }

    homescreen2() {
       
        //homes=home;
        initComponents();
    String text=Integer.toString(TotalDurationOfPlaylist);
       duration_label.setText(text); 
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        setVisible(true);
         // ClockLabel dateLable = new ClockLabel("date");
    ClockLabel timeLable = new ClockLabel("time");
   // ClockLabel dayLable = new ClockLabel("day");
     JPanel p=new JPanel();
    p.setSize(350,60);
    p.setLocation(30,60);
   // p.add(dateLable);
    p.add(timeLable);
   // p.add(dayLable);
    p.setBackground(Color.black);
    p.setVisible(true);
    add(p);
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // current.setDefaultRenderer(Object.class, new MyRenderer());
     //  current.setCellRenderer(new MyRenderer());
       //add(current);
      // current.setVisible(true);
      // current.setLocation(10,100);
         pack();
         
    }

 
    void setTable(DefaultTableModel model)
    {
        Object value;
        int rc=model.getRowCount();
        m1=(DefaultTableModel) current.getModel();
        int rowcount=m1.getRowCount();
        m1.setNumRows(rowcount+rc);
        for(int i=rc-1;i>=0;i--)
        {
            value=model.getValueAt(i, 0);
            m1.setValueAt(value, rowcount+i, 0);
            
            value=model.getValueAt(i, 1);
            m1.setValueAt(value, rowcount+i, 1);
            TotalDurationOfPlaylist+=(Integer)value;
        }
        
       
        for(int i=0;i<m1.getRowCount();i++)
        {
        }
        
        current.setModel(m1);
    }
            
            
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        back_panel = new javax.swing.JPanel();
        broadcast_panel = new javax.swing.JPanel();
        pause = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        current = new javax.swing.JTable();
        play = new javax.swing.JButton();
        next = new javax.swing.JButton();
        duration_label = new javax.swing.JLabel();
        playlist_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        new_package = new javax.swing.JButton();
        view_schedule = new javax.swing.JButton();
        view_library = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        pick_from_library = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_panel.setBackground(new java.awt.Color(0, 255, 204));

        broadcast_panel.setBackground(new java.awt.Color(0, 0, 0));

        pause.setText("Pause");
        pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        current.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SONG", "DURATION"
            }
        ));
        jScrollPane4.setViewportView(current);

        play.setText("Play");

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        duration_label.setForeground(new java.awt.Color(255, 255, 51));
        duration_label.setText("dur");

        javax.swing.GroupLayout broadcast_panelLayout = new javax.swing.GroupLayout(broadcast_panel);
        broadcast_panel.setLayout(broadcast_panelLayout);
        broadcast_panelLayout.setHorizontalGroup(
            broadcast_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(broadcast_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(broadcast_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(broadcast_panelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(pause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(play)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(duration_label, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        broadcast_panelLayout.setVerticalGroup(
            broadcast_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(broadcast_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(broadcast_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pause, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        playlist_panel.setBackground(new java.awt.Color(0, 0, 0));

        new_package.setText("NEW PACKAGE");

        view_schedule.setText("VIEW SCHEDULE");
        view_schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_scheduleActionPerformed(evt);
            }
        });

        view_library.setText(" LIBRARY");
        view_library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_libraryActionPerformed(evt);
            }
        });

        log_out.setText("Log Out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        pick_from_library.setText("Pick From Library");
        pick_from_library.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pick_from_libraryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playlist_panelLayout = new javax.swing.GroupLayout(playlist_panel);
        playlist_panel.setLayout(playlist_panelLayout);
        playlist_panelLayout.setHorizontalGroup(
            playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playlist_panelLayout.createSequentialGroup()
                .addGroup(playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playlist_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(playlist_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(view_library, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(pick_from_library)
                        .addGap(32, 32, 32)
                        .addComponent(view_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(new_package, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(log_out)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        playlist_panelLayout.setVerticalGroup(
            playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playlist_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(playlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(view_library, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pick_from_library, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view_schedule, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_package, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(204, 204, 204))
        );

        javax.swing.GroupLayout back_panelLayout = new javax.swing.GroupLayout(back_panel);
        back_panel.setLayout(back_panelLayout);
        back_panelLayout.setHorizontalGroup(
            back_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(back_panelLayout.createSequentialGroup()
                .addComponent(broadcast_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playlist_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        back_panelLayout.setVerticalGroup(
            back_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(broadcast_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playlist_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_libraryActionPerformed
        setVisible(false);
       Homescreen.call_library(2);
      
        
        
    }//GEN-LAST:event_view_libraryActionPerformed

    private void pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pauseActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
    int selectedRow=current.getSelectedRow();
    if(selectedRow==-1)
    {
      selectedRow=current.getSelectedRow();
    }
        play_music(selectedRow+1); 
        current.setRowSelectionInterval(selectedRow+1,selectedRow+1 );
    }//GEN-LAST:event_nextActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
      Homescreen.call_homescreen1();
       dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void pick_from_libraryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pick_from_libraryActionPerformed
        setVisible(false);
       Homescreen.call_library(1);
    }//GEN-LAST:event_pick_from_libraryActionPerformed

    private void view_scheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_scheduleActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Homescreen.callSchedule();
    }//GEN-LAST:event_view_scheduleActionPerformed
    private void modeMouseClicked(java.awt.event.MouseEvent evt)
    {   Thread t;
        mouseclick=mouseclick+1;
       if(mouseclick%2==1)
        t=new Thread();
       
   }
    private void pauseMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        if(mediaPlayer.getStatus()==MediaPlayer.Status.PLAYING)
        {
            mediaPlayer.pause();
            
        }
        pause.setBackground(Color.getHSBColor(0, 204, 204));
    }   
    
    private void playMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        int selectedRow=current.getSelectedRow();
        if(selectedRow==-1)
        {
            selectedRow=current.getSelectedRow();
        }
        play_music(selectedRow);
    }                    
   
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
            java.util.logging.Logger.getLogger(homescreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homescreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homescreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homescreen2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               homescreen2 h= new homescreen2();
               h.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel back_panel;
    private javax.swing.JPanel broadcast_panel;
    private javax.swing.JTable current;
    private javax.swing.JLabel duration_label;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton new_package;
    private javax.swing.JButton next;
    private javax.swing.JButton pause;
    private javax.swing.JButton pick_from_library;
    private javax.swing.JButton play;
    private javax.swing.JPanel playlist_panel;
    private javax.swing.JButton view_library;
    private javax.swing.JButton view_schedule;
    // End of variables declaration//GEN-END:variables

 void play_music(int r) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        play.setBackground(Color.red);
        if(mediaPlayer==null)
        {
            if(r!=-1)
            {
                File file1=new File(s[r]);

                String source=file1.toURI().toString();

                //Media file = new Media(source);//error
                //mediaPlayer = new MediaPlayer(file);//error

                mediaPlayer.play();
             

            }
        }
        else
        {
            mediaPlayer.stop();
            mediaPlayer.dispose();
            if(r!=-1)
            {
                File file=new File(s[r]);
                String source=file.toURI().toString();
              //  Media media = new Media(source); error
                //mediaPlayer = new MediaPlayer(media); error
                mediaPlayer.play();
            }
        }
    
    }
 public class Thread implements Runnable{

        @Override
        public void run() {
          int selectedRow;
      
            selectedRow=current.getSelectedRow();
            int count=current.getRowCount();
            while(selectedRow!=count)//a thread to be created
            {
                //get duration of the song..when this song finishes..play the next song in the next row
                play_music(selectedRow+1); 
                current.setRowSelectionInterval(selectedRow+1,selectedRow+1 );
            }    
        
        
        
        }
     
 }

   class MyRenderer extends JLabel implements ListCellRenderer {

        public MyRenderer() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
             JLabel editor = new JLabel();
    if(value!=null)
            editor.setText(value.toString());
    editor.setBackground(Color.CYAN);
    return editor;
    
        }
    }
}
