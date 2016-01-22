package homescreen;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javax.swing.JComboBox;
public class library_gui1 extends javax.swing.JFrame {
    //Homescreen homes;
    MediaPlayer mediaPlayer=null;
    String []s;
    ResultSet rs;
    ListSelectionModel selectionModel;
    String dept;
    String type;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/sakila";
    //  Database credentials
    static final String USER = "root";
    static final String PASS = "26842684";
    static Connection conn = null;
    static Statement stmt = null;
    String col1;
    String col2;
    String col3;
    String col4;
    String col5;
    String col6;
    DefaultTableModel model;
   
   
    String song_query=new String();
    
    String[] r1=new String[1];

    library_gui1(int i) {
      //homes=home;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //STEP 1. Import required packages
                // JDBC driver name and database URL
                
                try
                {
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");
                    
                    //STEP 3: Open a connection
    //                System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL,USER,PASS);
                }catch(SQLException se){
                    //Handle errors for JDBC
                    se.printStackTrace();
                }catch(Exception e){
                    //Handle errors for Class.forName
                    e.printStackTrace();
                }
                
                
                if(i==1){
                  int j;
                  init_pickfromlibrary();
                     
                }
                else if(i==2)
                    init_viewlibrary();
                else
                    System.out.println("");//left for archiving
              
                
            }
        });
        initComponents();
         model = (DefaultTableModel) list_table.getModel();
        JFXPanel fxPanel = new JFXPanel();// for javafx media player to initialize
        select.addActionListener(null);
        done.addActionListener(null);
        search.addActionListener(null);
        songs_table.addMouseListener(null);
        list_table.addMouseListener(null);
        selectionModel= songs_table.getSelectionModel();
        selectionModel.addListSelectionListener(null);
        
        //just for testing purpose
        
       
        
       
        type_combo.addActionListener(new ActionListener(){
       

            @Override
            public void actionPerformed(ActionEvent e) {
                  type_combo=(JComboBox)e.getSource();
                  type=(String) type_combo.getSelectedItem();   //type string to be used in the query
        
                 if(type_combo.getSelectedItem().equals("RECORDINGS"))
                  { 
                      enter.setVisible(true);
                      dept_combo.setVisible(false);
                  }
                 else
                 {
                      dept_combo.setVisible(true);
                      enter.setVisible(false);
                 }
    
     
            }
    });
        dept_combo.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                dept_combo=(JComboBox)e.getSource();
                dept=(String) type_combo.getSelectedItem();         //dept string to be used in query
         
            }
        });
        enter.setEnabled(false);

    }//contains the assigned listeners and other action related assignments
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selection_panel = new javax.swing.JPanel();
        songs_pane = new javax.swing.JScrollPane();
        songs_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        seekButton = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        play = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        selected_items = new javax.swing.JLabel();
        selection_pane = new javax.swing.JScrollPane();
        list_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        select = new javax.swing.JButton();
        selectall = new javax.swing.JButton();
        delete_panel = new javax.swing.JPanel();
        done = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        delete_all = new javax.swing.JButton();
        search_panel = new javax.swing.JPanel();
        type_combo = new javax.swing.JComboBox();
        dept_combo = new javax.swing.JComboBox();
        search = new javax.swing.JButton();
        song_name = new javax.swing.JTextField();
        enter = new javax.swing.JLabel();
        db_combo = new javax.swing.JComboBox();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Community Radio Transmission manager");
        setBackground(new java.awt.Color(153, 153, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        selection_panel.setBackground(new java.awt.Color(0, 0, 0));

        songs_table.setBackground(new java.awt.Color(102, 102, 102));
        songs_table.setForeground(new java.awt.Color(255, 255, 255));
        songs_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Title", "Duration","Artist","Album","Last Played","Count Played","path"
            }
        ){

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        }

    );
    songs_table.setFillsViewportHeight(true);
    songs_table.setShowVerticalLines(false);
    songs_pane.setViewportView(songs_table);
    if (songs_table.getColumnModel().getColumnCount() > 0) {
        songs_table.getColumnModel().getColumn(6).setMinWidth(0);
        songs_table.getColumnModel().getColumn(6).setPreferredWidth(0);
        songs_table.getColumnModel().getColumn(6).setMaxWidth(0);
    }

    jLabel1.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
    jLabel1.setText("Search Results");

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    seekButton.setBackground(new java.awt.Color(0, 153, 153));
    seekButton.setText("SEEK");
    seekButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 0, true));
    seekButton.setFocusable(false);
    seekButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    seekButton.setMargin(new java.awt.Insets(2, 0, 2, 0));
    seekButton.setMaximumSize(new java.awt.Dimension(30, 30));
    seekButton.setMinimumSize(new java.awt.Dimension(30, 30));
    seekButton.setPreferredSize(new java.awt.Dimension(71, 31));
    seekButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    seekButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            seekButtonMouseClicked(evt);
        }
    });

    stop.setBackground(new java.awt.Color(0, 102, 102));
    stop.setText("STOP");
    stop.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 0, true));
    stop.setFocusable(false);
    stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    stop.setMaximumSize(new java.awt.Dimension(30, 30));
    stop.setMinimumSize(new java.awt.Dimension(30, 30));
    stop.setPreferredSize(new java.awt.Dimension(71, 31));
    stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    stop.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            stopMouseClicked(evt);
        }
    });
    stop.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            stopActionPerformed(evt);
        }
    });

    play.setBackground(new java.awt.Color(0, 204, 204));
    play.setText("PLAY");
    play.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 0, true));
    play.setFocusable(false);
    play.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    play.setMargin(new java.awt.Insets(2, 0, 2, 0));
    play.setMaximumSize(new java.awt.Dimension(30, 30));
    play.setMinimumSize(new java.awt.Dimension(30, 30));
    play.setPreferredSize(new java.awt.Dimension(71, 31));
    play.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    play.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            playMouseClicked(evt);
        }
    });
    play.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            playActionPerformed(evt);
        }
    });

    next.setBackground(new java.awt.Color(0, 51, 51));
    next.setText("NEXT");
    next.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
    next.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            nextActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(seekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(49, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(next, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(play, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addComponent(seekButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel3.setBackground(new java.awt.Color(0, 0, 0));

    selected_items.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
    selected_items.setLabelFor(list_table);
    selected_items.setText("Selected List");
    selected_items.setToolTipText("hey babes");

    list_table.setBackground(new java.awt.Color(102, 102, 102));
    list_table.setModel(new DefaultTableModel(new Object [][] {
    },
    new String [] {
        "song", "duration","path"
    }){

        @Override
        public boolean isCellEditable(int row, int column) {
            //all cells false
            return false;
        }
    });
    list_table.setFillsViewportHeight(true);
    list_table.setGridColor(new java.awt.Color(204, 255, 255));
    list_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    list_table.setShowVerticalLines(false);
    list_table.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            list_tableMouseClicked(evt);
        }
    });
    selection_pane.setViewportView(list_table);
    if (list_table.getColumnModel().getColumnCount() > 0) {
        list_table.getColumnModel().getColumn(2).setMinWidth(0);
        list_table.getColumnModel().getColumn(2).setPreferredWidth(0);
        list_table.getColumnModel().getColumn(2).setMaxWidth(0);
    }

    jPanel2.setBackground(new java.awt.Color(0, 0, 0));

    select.setBackground(new java.awt.Color(0, 204, 204));
    select.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    select.setText("SELECT");
    select.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 0, true));
    select.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selectActionPerformed(evt);
        }
    });

    selectall.setBackground(new java.awt.Color(0, 153, 153));
    selectall.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    selectall.setText("SELECT ALL");
    selectall.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
    selectall.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selectallActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(selectall, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(select, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(selectall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    delete_panel.setBackground(new java.awt.Color(0, 0, 0));
    delete_panel.setForeground(new java.awt.Color(153, 0, 0));

    done.setBackground(new java.awt.Color(0, 102, 102));
    done.setText("DONE");
    done.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
    done.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            doneMouseClicked(evt);
        }
    });
    done.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            doneActionPerformed(evt);
        }
    });

    delete.setBackground(new java.awt.Color(0, 204, 204));
    delete.setText("DELETE");
    delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
    delete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteActionPerformed(evt);
        }
    });

    delete_all.setBackground(new java.awt.Color(0, 153, 153));
    delete_all.setText("DELETE ALL");
    delete_all.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
    delete_all.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            delete_allActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout delete_panelLayout = new javax.swing.GroupLayout(delete_panel);
    delete_panel.setLayout(delete_panelLayout);
    delete_panelLayout.setHorizontalGroup(
        delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, delete_panelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(done, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_all, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    delete_panelLayout.setVerticalGroup(
        delete_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(delete_panelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(delete_all, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(done, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(138, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(selection_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(delete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(selected_items, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addComponent(selected_items, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(selection_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(delete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(94, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout selection_panelLayout = new javax.swing.GroupLayout(selection_panel);
    selection_panel.setLayout(selection_panelLayout);
    selection_panelLayout.setHorizontalGroup(
        selection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(selection_panelLayout.createSequentialGroup()
            .addGroup(selection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(selection_panelLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(songs_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGap(1, 1, 1))
                .addGroup(selection_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(21, 21, 21))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selection_panelLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(439, 439, 439))
    );
    selection_panelLayout.setVerticalGroup(
        selection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(selection_panelLayout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(selection_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(selection_panelLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(songs_pane)
                    .addGap(94, 94, 94))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    search_panel.setBackground(new java.awt.Color(51, 51, 51));

    type_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "EDUCATIONAL", "ENTERTAINMENT", "INFORMATICS", "RECORDINGS", " " }));
    type_combo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            type_comboActionPerformed(evt);
        }
    });

    dept_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ARTIST", "ALBUM", "SONG TITLE", "ALL" }));
    dept_combo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dept_comboActionPerformed(evt);
        }
    });

    search.setBackground(new java.awt.Color(102, 102, 255));
    search.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
    search.setText("Search ");
    search.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchActionPerformed(evt);
        }
    });

    song_name.setBackground(new java.awt.Color(0, 0, 0));
    song_name.setFont(song_name.getFont());
    song_name.setForeground(new java.awt.Color(255, 255, 255));
    song_name.setDisabledTextColor(new java.awt.Color(102, 102, 102));
    song_name.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            song_nameActionPerformed(evt);
        }
    });
    song_name.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            song_nameKeyTyped(evt);
        }
    });

    enter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    enter.setForeground(new java.awt.Color(255, 255, 255));
    enter.setText("Enter interviewee's name");

    db_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SONGS", "PLAYLIST", "RECORDINGS" }));
    db_combo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            db_comboActionPerformed(evt);
        }
    });

    back.setText("Back");
    back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout search_panelLayout = new javax.swing.GroupLayout(search_panel);
    search_panel.setLayout(search_panelLayout);
    search_panelLayout.setHorizontalGroup(
        search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(search_panelLayout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addComponent(db_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(search_panelLayout.createSequentialGroup()
                    .addComponent(song_name, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(search)
                    .addGap(603, 603, 603)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
            .addGap(27, 27, 27))
    );
    search_panelLayout.setVerticalGroup(
        search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, search_panelLayout.createSequentialGroup()
            .addContainerGap(24, Short.MAX_VALUE)
            .addGroup(search_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(type_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dept_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(song_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(db_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(1, 1, 1)
            .addComponent(enter)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(search_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selection_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(search_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(selection_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(42, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
   
 
 
   
    private void songs_tableMouseClicked(java.awt.event.MouseEvent evt)
    {
        
        selectionModel=songs_table.getSelectionModel();
        int minSelectionIndex = selectionModel.getMinSelectionIndex();
        
        if(evt.getClickCount()==2)
        {
            String[] songDetails={songs_table.getValueAt(minSelectionIndex, 0).toString(),songs_table.getValueAt(minSelectionIndex,1).toString()};
            System.out.println(songDetails);
            DefaultTableModel model = (DefaultTableModel) list_table.getModel();
            model.addRow(songDetails);
            list_table.setModel(model);
        }
    }
    //action performed on enter key pressed
    private void song_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_song_nameActionPerformed
        searchActionPerformed(evt);
    }//GEN-LAST:event_song_nameActionPerformed
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        if(songs_table.getModel().getRowCount()==0)
        {
            song_query=song_name.getText();
            if(song_query.length()!=0)
            {
                selection_panel.setVisible(true);
                try {
                    search_query(song_query);
                } catch (SQLException ex) {
                    Logger.getLogger(library_gui1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            DefaultTableModel m=(DefaultTableModel) songs_table.getModel();
            System.out.println(m.getRowCount());
            for(int i=m.getRowCount()-1;i>=0;i--)
            {
                m.removeRow(i);
            }
            songs_table.setModel(m);
            song_query=song_name.getText();
            if(song_query.length()!=0)
            {
                try {
                    search_query(song_query);
                } catch (SQLException ex) {
                    Logger.getLogger(library_gui1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_searchActionPerformed
            
    private void type_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_comboActionPerformed
        type=type_combo.getName();
        
    }//GEN-LAST:event_type_comboActionPerformed
            
    private void song_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_song_nameKeyTyped
        // TODO add your handling code here:
        if(evt.isActionKey())
        {
            searchActionPerformed(null);
        }
    }//GEN-LAST:event_song_nameKeyTyped

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:Z
        song_name.requestFocusInWindow();
        
    }//GEN-LAST:event_formFocusGained

    private void dept_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept_comboActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed

         model=(DefaultTableModel) list_table.getModel();
        int[] rowCount = songs_table.getSelectedRows();
        int i;
         for(i=0;i<=rowCount.length-1;i++)
         {
              String[] songDetails={songs_table.getValueAt(rowCount[i], 0).toString(),songs_table.getValueAt(rowCount[i],1).toString()};
             model.addRow(songDetails);
//             list_table.setModel(model);
         } 
    }//GEN-LAST:event_selectActionPerformed

    private void list_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_tableMouseClicked
        //   row=list_table.getSelectedRow();
        // TODO add your handling code here:
    }//GEN-LAST:event_list_tableMouseClicked

    private void doneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_doneMouseClicked

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
       
       ;
        
    }//GEN-LAST:event_doneActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       
         model=(DefaultTableModel) list_table.getModel();
        int[] rowCount = list_table.getSelectedRows();
        int i;
         for(i=rowCount.length-1;i>=0;i--)
         {
             model.removeRow(rowCount[i]);
//             list_table.setModel(model);
         } 
                 
    }//GEN-LAST:event_deleteActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stopActionPerformed

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        // TODO add your handling code here:
        if(mediaPlayer.getStatus()==MediaPlayer.Status.PLAYING)
        {
            mediaPlayer.stop();
            mediaPlayer.dispose();
        }
        play.setBackground(Color.getHSBColor(0, 204, 204));
    }//GEN-LAST:event_stopMouseClicked

    private void seekButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seekButtonMouseClicked
        // TODO add your handling code here:
        if(mediaPlayer!=null)
        {
            if(mediaPlayer.getStatus()==MediaPlayer.Status.PLAYING)
            {
                Duration d=new Duration(5000);
                mediaPlayer.seek(mediaPlayer.getCurrentTime().add(d));//seek 5 seconds ahead;
            }
        }
    }//GEN-LAST:event_seekButtonMouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        // TODO add your handling code here:
        int selectedRow=songs_table.getSelectedRow();
if(selectedRow==-1)
{
    selectedRow=list_table.getSelectedRow();
}
play_music(selectedRow);
    }//GEN-LAST:event_playMouseClicked

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        int r=songs_table.getRowCount();
           
        for(int i=0;i<r;i++)
        { 
            model.addRow(new String[]{(String)songs_table.getValueAt(i,0),(String.valueOf(songs_table.getValueAt(i,1)))});
        }
    
    }//GEN-LAST:event_selectallActionPerformed

    private void delete_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_allActionPerformed
        
         
        model = (DefaultTableModel) list_table.getModel();
        
        int r=list_table.getRowCount();
        int i;
         for(i=r-1;i>=0;i--)
         {model.removeRow(i);
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_allActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
int selectedRow=songs_table.getSelectedRow();
if(selectedRow==-1)
{
    selectedRow=list_table.getSelectedRow();
}
        play_music(selectedRow+1); 
        songs_table.setRowSelectionInterval(selectedRow+1,selectedRow+1 );
    }//GEN-LAST:event_nextActionPerformed

    private void db_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db_comboActionPerformed
        db_combo=(JComboBox)evt.getSource();
        String db = (String) db_combo.getSelectedItem(); //type string to be used in the query
        model=(DefaultTableModel)songs_table.getModel();
        if(db.equals("RECORDINGS"))
        {
             type_combo.setVisible(false);
             dept_combo.setVisible(false);
             enter.setVisible(true);
             col1="RECORDING NAME";
             col2="DURATION";
             col3="LAST PLAYED";
             col4="COUNT PLAYED";
            String col[]={col1,col2,col3,col4};
            model.setColumnIdentifiers(col);
        }
        else if(db.equals("PLAYLIST"))
        {
             type_combo.setVisible(true);
             dept_combo.setVisible(false);
             enter.setVisible(false);
        }
        else
        {
            type_combo.setVisible(true);
            type_combo.removeItem("RECORDINGS");
            dept_combo.setVisible(true);
            enter.setVisible(false);
            col1="TITLE";
            col2="DURATION";
            col3="ALBUM";
            col4="ARTIST";
            col5="LAST PLAYED";
            col6="COUNT PLAYED";
            String col[]={col1,col2,col3,col4,col5,col6};
            model.setColumnIdentifiers(col);
        }
    }//GEN-LAST:event_db_comboActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Homescreen.setHomeScreenVisible();
        dispose();
    }//GEN-LAST:event_backActionPerformed
            
                
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox db_combo;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete_all;
    private javax.swing.JPanel delete_panel;
    private javax.swing.JComboBox dept_combo;
    private javax.swing.JButton done;
    private javax.swing.JLabel enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable list_table;
    private javax.swing.JButton next;
    private javax.swing.JButton play;
    private javax.swing.JButton search;
    private javax.swing.JPanel search_panel;
    private javax.swing.JButton seekButton;
    private javax.swing.JButton select;
    private javax.swing.JButton selectall;
    private javax.swing.JLabel selected_items;
    private javax.swing.JScrollPane selection_pane;
    private javax.swing.JPanel selection_panel;
    private javax.swing.JTextField song_name;
    private javax.swing.JScrollPane songs_pane;
    private javax.swing.JTable songs_table;
    private javax.swing.JButton stop;
    private javax.swing.JComboBox type_combo;
    // End of variables declaration//GEN-END:variables
    
    public library_gui1() {
       
       
    }
    void search_query(String str) throws SQLException
    {
        int size=0,i = 0;
        stmt = conn.createStatement();
        String sql;
        //type and dept are two strings containing search option selected..pass it in the query
        sql = "select title,duration,album,artist,date_played,count_played,path from sakila.songs"+" where title like '%"+str+"%';";
        rs = stmt.executeQuery(sql);
        
        //STEP 5: Extract data from result set
        DefaultTableModel d=(DefaultTableModel) songs_table.getModel();
        while(rs.next()){
            size++;
        }
//        MediaFile m=new MediaFile();
        rs.first();
        rs.previous();
        s=new String[size];
        while(rs.next()){
            /*retrieve from the database,
            store in song attributes in mediafile object,
            store the mediafile object in the array of objects of medialist class*/
            //Retrieve by column name
            
            
            String title = rs.getString("title");
            int dur = rs.getInt("duration");
            String lp= rs.getString("date_played");
            int cp = rs.getInt("count_played");
            String album=rs.getString("album");
            String artist=rs.getString("artist");
            String path=rs.getString("path");
//          String type=rs.getString("type");
            s[i]=path;
            Object[] r={title,dur,artist,album,lp,cp,path};
            d.addRow(r);
           // m.add(title,album,artist,cp,lp,dur,path);
            i++;
            
        }
        songs_table.setModel(d);
    }
    
    void hello()
    {
        
    }
void play_music(int r)
{
        play.setBackground(Color.red);
        if(mediaPlayer==null)
        {
            if(r!=-1)
            {
                File file1=new File(s[r]);

                String source=file1.toURI().toString();

                Media file = new Media(source);
                //                System.out.println(c.toSeconds());
                mediaPlayer = new MediaPlayer(file);

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
                Media media = new Media(source);
                mediaPlayer = new MediaPlayer(media);
                mediaPlayer.play();
            }
        }
    
}
void init_pickfromlibrary()
{
    
                selection_panel.setVisible(true);
                setVisible(true);
                getContentPane().setBackground(Color.DARK_GRAY);
                songs_table.setOpaque(true);
                list_table.setOpaque(true);
                songs_table.setFillsViewportHeight(true);// key functn
                songs_table.setBackground(Color.BLACK);      
                enter.setVisible(false);
                dept_combo.setVisible(true);
                db_combo.setVisible(true);
                type_combo.setVisible(true);
                back.setVisible(false);
                 pack();//solved the problem of resizing the components when maximizing
}
    
    void init_viewlibrary(){
         
                back.setVisible(true);
                selection_panel.setVisible(true);
                setVisible(true);
                getContentPane().setBackground(Color.DARK_GRAY);
                songs_table.setOpaque(true);
                list_table.setEnabled(false);
                list_table.setVisible(false);
                
                delete.setVisible(false);
                delete_all.setVisible(false);
                select.setVisible(false);
                selectall.setVisible(false);
                done.setVisible(false);
                jPanel3.setVisible(false);
                
                songs_table.setFillsViewportHeight(true);// key functn
                songs_table.setBackground(Color.BLACK);      
                enter.setVisible(false);
                dept_combo.setVisible(true);
                db_combo.setVisible(true);
                type_combo.setVisible(true);
                db_combo.addItem("MISC");
                pack();//solved the problem of resizing the components when maximizing
              
                
               
    }
            
}
