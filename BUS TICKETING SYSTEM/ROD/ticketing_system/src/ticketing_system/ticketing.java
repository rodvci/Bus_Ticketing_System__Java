package ticketing_system;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import net.proteanit.sql.DbUtils;

public class ticketing extends javax.swing.JFrame {
   Statement st;
    Connection con; 
    PreparedStatement pst; 
    ResultSet rs;
    public ticketing() {
        initComponents();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketing_db?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st = con.createStatement();
        }catch(Exception e){
            System.exit(0);
        }
         showDate();
         showTime();
        
        sched.setVisible(false);
        check.setVisible(false);
        book.setVisible(false);
        Update_table();
        ID.setText(Integer.toString(getNextIdFromDB()));
      }

    void showDate() {
       Date d = new Date();
       SimpleDateFormat s = new SimpleDateFormat("MMM dd, yyyy");
       date.setText(s.format(d));
    }

    void showTime() {
       new Timer(0,(ActionEvent ae)->{
           Date d = new Date();
           SimpleDateFormat s = new SimpleDateFormat("hh:mm a");
           time.setText(s.format(d));
       }).start();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        sched = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        passenger = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        ADate = new com.toedter.calendar.JDateChooser();
        DDate = new com.toedter.calendar.JDateChooser();
        DTime = new javax.swing.JComboBox<>();
        des = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        ATime = new javax.swing.JLabel();
        check = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        book = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        DDate1 = new com.toedter.calendar.JDateChooser();
        DTime1 = new javax.swing.JComboBox<>();
        des1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        price1 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        seat = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        pricee = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        AD = new com.toedter.calendar.JDateChooser();
        eyeD = new javax.swing.JLabel();
        bn = new javax.swing.JLabel();
        AT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(969, 687));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(969, 687));
        jPanel2.setMinimumSize(new java.awt.Dimension(969, 687));
        jPanel2.setPreferredSize(new java.awt.Dimension(969, 687));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUS TICKETING SYSTEM");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 630, 60);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(630, 10, 90, 30);

        date.setBackground(new java.awt.Color(204, 204, 255));
        date.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("DATE");
        jPanel1.add(date);
        date.setBounds(700, 10, 110, 30);

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TIME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(630, 40, 90, 30);

        time.setBackground(new java.awt.Color(204, 204, 255));
        time.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("TIME");
        jPanel1.add(time);
        time.setBounds(690, 40, 110, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(20, 20, 920, 80);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("BOOK A TICKET");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(640, 10, 230, 50);

        jButton4.setBackground(new java.awt.Color(204, 204, 255));
        jButton4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("ADD BUS SCHEDULE");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(0, 10, 260, 50);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("CHECK BUS SCHEDULES");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(300, 10, 300, 50);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(40, 110, 900, 70);

        sched.setBackground(new java.awt.Color(204, 204, 255));
        sched.setMaximumSize(new java.awt.Dimension(892, 455));
        sched.setMinimumSize(new java.awt.Dimension(892, 455));
        sched.setPreferredSize(new java.awt.Dimension(892, 455));
        sched.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Destination:");
        sched.add(jLabel2);
        jLabel2.setBounds(30, 160, 130, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departure Time: ");
        sched.add(jLabel3);
        jLabel3.setBounds(460, 100, 170, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Date of Arrival: ");
        sched.add(jLabel7);
        jLabel7.setBounds(460, 160, 180, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("No. of Passenger:");
        sched.add(jLabel8);
        jLabel8.setBounds(30, 220, 170, 40);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Price:");
        sched.add(jLabel10);
        jLabel10.setBounds(30, 100, 130, 40);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Departure Date:");
        sched.add(jLabel11);
        jLabel11.setBounds(460, 40, 160, 40);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Bus Name:");
        sched.add(jLabel12);
        jLabel12.setBounds(30, 40, 130, 40);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Time of Arrival: ");
        sched.add(jLabel13);
        jLabel13.setBounds(460, 220, 190, 40);

        passenger.setBackground(new java.awt.Color(255, 255, 255));
        passenger.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        passenger.setForeground(new java.awt.Color(0, 0, 0));
        passenger.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        passenger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerActionPerformed(evt);
            }
        });
        passenger.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passengerKeyTyped(evt);
            }
        });
        sched.add(passenger);
        passenger.setBounds(210, 220, 200, 40);

        price.setBackground(new java.awt.Color(255, 255, 255));
        price.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(0, 0, 0));
        price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        sched.add(price);
        price.setBounds(210, 100, 200, 40);

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        sched.add(name);
        name.setBounds(210, 40, 200, 40);

        ADate.setBackground(new java.awt.Color(255, 255, 255));
        ADate.setForeground(new java.awt.Color(0, 0, 0));
        sched.add(ADate);
        ADate.setBounds(630, 160, 210, 40);

        DDate.setBackground(new java.awt.Color(255, 255, 255));
        DDate.setForeground(new java.awt.Color(0, 0, 0));
        sched.add(DDate);
        DDate.setBounds(630, 40, 210, 40);

        DTime.setBackground(new java.awt.Color(255, 255, 255));
        DTime.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        DTime.setForeground(new java.awt.Color(0, 0, 0));
        DTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM" }));
        DTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTimeActionPerformed(evt);
            }
        });
        sched.add(DTime);
        DTime.setBounds(630, 100, 210, 40);

        des.setBackground(new java.awt.Color(255, 255, 255));
        des.setFont(new java.awt.Font("Simplex_IV50", 0, 12)); // NOI18N
        des.setForeground(new java.awt.Color(0, 0, 0));
        des.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tagbilaran - Panglao", "Tagbilaran - Panglao Airport", "Panglao - Tagbilaran", "Tagiblaran - Ubay", "Tagbilaran - Anda", "Tubigon - Tagbilaran", "Getafe - Tagbilaran", "Carmen - Tagbilaran", "Jagna - Tagbilaran", "Tagbilaran - Tubigon" }));
        des.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sched.add(des);
        des.setBounds(210, 160, 200, 40);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("ADD SCHEDULE");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        sched.add(jButton5);
        jButton5.setBounds(360, 320, 190, 50);

        ATime.setBackground(new java.awt.Color(255, 255, 255));
        ATime.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        ATime.setForeground(new java.awt.Color(0, 0, 0));
        ATime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sched.add(ATime);
        ATime.setBounds(630, 220, 210, 40);

        jPanel2.add(sched);
        sched.setBounds(35, 185, 892, 440);

        check.setBackground(new java.awt.Color(204, 204, 255));
        check.setMaximumSize(new java.awt.Dimension(892, 455));
        check.setMinimumSize(new java.awt.Dimension(892, 455));
        check.setPreferredSize(new java.awt.Dimension(892, 455));
        check.setLayout(null);

        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus Name", "Destination", "Departure Date", "Departure Time", "Date of Arrivial", "Time of Arrivial", "No. of Seat", "Price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        check.add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 840, 370);

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        check.add(search);
        search.setBounds(250, 20, 310, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        check.add(jButton1);
        jButton1.setBounds(570, 20, 90, 30);

        jPanel2.add(check);
        check.setBounds(35, 170, 892, 455);

        book.setBackground(new java.awt.Color(204, 204, 255));
        book.setMaximumSize(new java.awt.Dimension(892, 455));
        book.setMinimumSize(new java.awt.Dimension(892, 455));
        book.setLayout(null);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Destination");
        book.add(jLabel9);
        jLabel9.setBounds(20, 70, 130, 30);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Departure Time: ");
        book.add(jLabel14);
        jLabel14.setBounds(20, 150, 170, 30);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Departure Date:");
        book.add(jLabel19);
        jLabel19.setBounds(20, 110, 160, 30);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Name:");
        book.add(jLabel20);
        jLabel20.setBounds(20, 30, 130, 30);

        name1.setBackground(new java.awt.Color(255, 255, 255));
        name1.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 0, 0));
        name1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name1KeyTyped(evt);
            }
        });
        book.add(name1);
        name1.setBounds(190, 30, 200, 30);

        DDate1.setBackground(new java.awt.Color(255, 255, 255));
        DDate1.setForeground(new java.awt.Color(0, 0, 0));
        DDate1.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        book.add(DDate1);
        DDate1.setBounds(190, 110, 200, 30);

        DTime1.setBackground(new java.awt.Color(255, 255, 255));
        DTime1.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        DTime1.setForeground(new java.awt.Color(0, 0, 0));
        DTime1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM" }));
        DTime1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DTime1ActionPerformed(evt);
            }
        });
        book.add(DTime1);
        DTime1.setBounds(190, 150, 200, 30);

        des1.setBackground(new java.awt.Color(255, 255, 255));
        des1.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        des1.setForeground(new java.awt.Color(0, 0, 0));
        des1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Tagbilaran - Panglao", "Tagbilaran - Panglao Airport", "Panglao - Tagbilaran", "Tagiblaran - Ubay", "Tagbilaran - Anda", "Tubigon - Tagbilaran", "Getafe - Tagbilaran", "Carmen - Tagbilaran", "Jagna - Tagbilaran", "Tagbilaran - Tubigon" }));
        des1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        des1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                des1MouseClicked(evt);
            }
        });
        des1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                des1ActionPerformed(evt);
            }
        });
        book.add(des1);
        des1.setBounds(190, 70, 200, 30);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Price:");
        book.add(jLabel22);
        jLabel22.setBounds(20, 230, 190, 30);

        price1.setBackground(new java.awt.Color(255, 255, 255));
        price1.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        price1.setForeground(new java.awt.Color(0, 0, 0));
        price1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book.add(price1);
        price1.setBounds(190, 230, 200, 30);

        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(0, 0, 0));
        amount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        book.add(amount);
        amount.setBounds(190, 270, 200, 30);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Amount:");
        book.add(jLabel23);
        jLabel23.setBounds(20, 270, 130, 30);

        change.setBackground(new java.awt.Color(255, 255, 255));
        change.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        change.setForeground(new java.awt.Color(0, 0, 0));
        change.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        book.add(change);
        change.setBounds(190, 310, 200, 30);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Change:");
        book.add(jLabel24);
        jLabel24.setBounds(20, 310, 190, 30);

        ID.setEditable(false);
        ID.setBackground(new java.awt.Color(204, 204, 255));
        ID.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(204, 204, 255));
        ID.setBorder(null);
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        book.add(ID);
        ID.setBounds(30, 420, 90, 30);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("BOOK");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        book.add(jButton7);
        jButton7.setBounds(200, 360, 180, 40);

        seat.setEditable(false);
        seat.setBackground(new java.awt.Color(204, 204, 255));
        seat.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        seat.setForeground(new java.awt.Color(204, 204, 255));
        seat.setBorder(null);
        book.add(seat);
        seat.setBounds(400, 430, 20, 20);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("No. of Seat");
        book.add(jLabel25);
        jLabel25.setBounds(20, 190, 130, 30);

        no.setBackground(new java.awt.Color(255, 255, 255));
        no.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        no.setForeground(new java.awt.Color(0, 0, 0));
        no.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                noKeyTyped(evt);
            }
        });
        book.add(no);
        no.setBounds(190, 190, 200, 30);

        pricee.setEditable(false);
        pricee.setBackground(new java.awt.Color(204, 204, 255));
        pricee.setFont(new java.awt.Font("Simplex_IV50", 0, 18)); // NOI18N
        pricee.setForeground(new java.awt.Color(204, 204, 255));
        pricee.setBorder(null);
        book.add(pricee);
        pricee.setBounds(240, 420, 70, 30);

        ta.setEditable(false);
        ta.setColumns(20);
        ta.setRows(5);
        ta.setText("\n");
        jScrollPane2.setViewportView(ta);

        book.add(jScrollPane2);
        jScrollPane2.setBounds(440, 20, 430, 330);

        AD.setBackground(new java.awt.Color(255, 255, 255));
        AD.setForeground(new java.awt.Color(255, 255, 255));
        AD.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        book.add(AD);
        AD.setBounds(840, 380, 0, 26);

        eyeD.setBackground(new java.awt.Color(204, 204, 255));
        eyeD.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        eyeD.setForeground(new java.awt.Color(204, 204, 255));
        book.add(eyeD);
        eyeD.setBounds(120, 410, 200, 30);

        bn.setBackground(new java.awt.Color(204, 204, 255));
        bn.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        bn.setForeground(new java.awt.Color(204, 204, 255));
        book.add(bn);
        bn.setBounds(270, 410, 200, 30);

        AT.setBackground(new java.awt.Color(204, 204, 255));
        AT.setFont(new java.awt.Font("Simplex_IV50", 0, 14)); // NOI18N
        AT.setForeground(new java.awt.Color(204, 204, 255));
        book.add(AT);
        AT.setBounds(290, 410, 30, 30);

        jPanel2.add(book);
        book.setBounds(35, 170, 892, 455);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 969, 687);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked

    }//GEN-LAST:event_searchMouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

    }//GEN-LAST:event_searchKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search.getText()));
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(search.getText())));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       sched.setVisible(false);
       check.setVisible(true);
       book.setVisible(false);
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passengerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerActionPerformed

    private void DTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTimeActionPerformed
     
    }//GEN-LAST:event_DTimeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       sched.setVisible(true);
       check.setVisible(false);
       book.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DTime1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sched.setVisible(false);
        check.setVisible(false);
        book.setVisible(true);
    
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String Ddate = sdf.format(DDate.getDate());
    String Adate = sdf.format(ADate.getDate());

    Date today = new Date();
    if (DDate.getDate().before(today)) {
        JOptionPane.showMessageDialog(this, "Invalid departure date.");
        return;
    }

    if (name.getText().isEmpty() || des.getSelectedIndex() == 0 || DTime.getSelectedIndex() == 0
            || ADate.getDate() == null || passenger.getText().isEmpty() || price.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
    } else {
        String destination = des.getSelectedItem().toString();
        String departureTime = DTime.getSelectedItem().toString();
        String arrivalTime = calculateArrivalTime(destination, departureTime);

        // Check if a record with the same bus name, destination, and date/time of arrival already exists
        String checkDuplicate = "SELECT * FROM `schedule` WHERE `Bus Name` = ? AND `Destination` = ? AND `DateOfArrival` = ? AND `TimeOfArrival` = ?";
        pst = con.prepareStatement(checkDuplicate);
        pst.setString(1, name.getText());
        pst.setString(2, destination);
        pst.setString(3, Adate);
        pst.setString(4, arrivalTime);
        rs = pst.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Record with the same bus name, destination, and date/time of arrival already exists.");
        } else {
            // If no duplicate, proceed with insertion
            String insert = "INSERT INTO `schedule`(`Bus Name`, `Destination`, `DepartureDate`, `DepartureTime`, `DateOfArrival`, `TimeOfArrival`, `No.OfPassenger`, `Price`)"
                    + " VALUES ('" + name.getText() + "','" + destination + "','" + Ddate + "','" + departureTime + "','" + Adate + "','" + arrivalTime + "',"
                    + "'" + passenger.getText() + "','" + price.getText() + "')";
            pst.executeUpdate(insert);

            String updateTable = "SELECT * FROM `schedule` WHERE 1";
            pst = con.prepareStatement(updateTable);
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

            // Reset input fields
            name.setText("");
            des.setSelectedIndex(0);
            DDate.setDate(null);
            DTime.setSelectedIndex(0);
            ADate.setDate(null);
            passenger.setText("");
            price.setText("");
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, ex);
}

    }//GEN-LAST:event_jButton5ActionPerformed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        
    }//GEN-LAST:event_priceKeyPressed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
         String currentText = price.getText();
         char a = evt.getKeyChar();

         if (!(Character.isDigit(a) && currentText.length() < 4)) {
            evt.consume();
         } else if (currentText.length() == 0 && a == '0') {
            JOptionPane.showMessageDialog(null, "Incorrect Format (Cannot start with 0)");
            evt.consume();
        }
     
    }//GEN-LAST:event_priceKeyTyped

    private void passengerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_passengerKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        String currentText = name.getText();
        int maxLength = 15;
        if (currentText.length() >= maxLength ) {
            evt.consume();

        }

    }//GEN-LAST:event_nameKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String Ddate = sdf.format(DDate1.getDate());

            if (name1.getText().isEmpty() || des1.getSelectedIndex() == 0 || DDate1.getDate() == null
                    || DTime1.getSelectedIndex() == 0 || amount.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter All Data!!");
            } else {
                String insert = "INSERT INTO `booking`(`ID`, `Name`, `Destination`, `DepartureDate`, `DepartureTime`,`No.OfSeats`,`Price`)"
                        + " VALUES ('" + ID.getText() + "','" + name1.getText() + "','" + des1.getSelectedItem() + "','"
                        + Ddate + "','" + DTime1.getSelectedItem() + "','" + no.getText() + "','" + pricee.getText() + "')";
                pst.executeUpdate(insert);
                getStock();

                    try {
             
                  String bookingID = ID.getText();
                  String customerName = name1.getText();
                  String destination = des1.getSelectedItem().toString();
                  String departureDate = new SimpleDateFormat("yyyy-MM-dd").format(DDate1.getDate());
                  String departureTime = DTime1.getSelectedItem().toString();
                  String numberOfSeats = no.getText();
                  String price = price1.getText();
                  double amountPaid = Double.parseDouble(amount.getText());
                  String changeAmount = change.getText();
                  
              
                  JTextPane textPane = new JTextPane();
                  textPane.setEditable(false);

              
                  Font monospacedFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
                  textPane.setFont(monospacedFont);

                  StyledDocument doc = textPane.getStyledDocument();
                  SimpleAttributeSet center = new SimpleAttributeSet();
                  StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
                  doc.setParagraphAttributes(0, doc.getLength(), center, false);

                  
                  doc.insertString(doc.getLength(), "******************************************************\n", null);
                  doc.insertString(doc.getLength(), "               BOOKING RECEIPT\n", null);
                  doc.insertString(doc.getLength(), "******************************************************\n", null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Booking ID:", bookingID), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Name:", customerName), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Destination:", destination), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Departure Date:", departureDate), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Departure Time:", departureTime), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "No. of Seats:", numberOfSeats), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Price:", "₱" + price), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Amount Paid:", "₱" + amountPaid), null);
                  doc.insertString(doc.getLength(), String.format("%-20s%-20s\n", "Change:", "₱" + changeAmount), null);
                  doc.insertString(doc.getLength(), "******************************************************\n", null);
                  doc.insertString(doc.getLength(), "        THANK YOU FOR BOOKING WITH US!\n", null);
                  
                   ta.setFont(monospacedFont);
                   ta.setText(textPane.getText());
                 
                  boolean completed = textPane.print();
                  if (completed) {
                      JOptionPane.showMessageDialog(null, "Booking receipt sent to printer.");
                  } else {
                      JOptionPane.showMessageDialog(null, "Print job canceled or failed.");
                  }
                    ID.setText(String.valueOf(getNextIdFromDB()));
                    name1.setText("");
                    des1.setSelectedIndex(0);
                    DDate1.setDate(null);
                    DTime1.setSelectedIndex(0);
                    amount.setText("");
                    price1.setText("");
                    change.setText("");
                    seat.setText("");
                    no.setText("");
                    pricee.setText("");
                    ta.setText("");
              } catch (BadLocationException ex) {
                  JOptionPane.showMessageDialog(null, "Error while printing: " + ex.getMessage());
              }
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        String currentText = amount.getText();
        char a = evt.getKeyChar();

        if (!(Character.isDigit(a) && currentText.length() < 4)) {
            evt.consume();
        } else if (currentText.length() == 0 && a == '0') {
            JOptionPane.showMessageDialog(null, "Incorrect Format (Cannot start with 0)");
            evt.consume();
        }
       
    }//GEN-LAST:event_amountKeyTyped

    private void des1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_des1ActionPerformed
        
    
    }//GEN-LAST:event_des1ActionPerformed

    private void des1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_des1MouseClicked
         
    }//GEN-LAST:event_des1MouseClicked

    private void name1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyTyped
       String currentText = name1.getText();
       char a = evt.getKeyChar();
       if (!(Character.isLetter(a) || a == ' ' || (a == '.' && !currentText.contains(".")))) {
           getToolkit().beep();
           evt.consume();
       } else if (Character.isLetter(a) && (currentText.isEmpty() || currentText.endsWith(" "))) {
           name1.setText(currentText + Character.toUpperCase(a));
           evt.consume();
       }
    }//GEN-LAST:event_name1KeyTyped

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Date dateValue = (Date) model.getValueAt(selectedRow,3);
        Date Adate = (Date) model.getValueAt(selectedRow,5);
        
        eyeD.setText(model.getValueAt(selectedRow, 0).toString());
        bn.setText(model.getValueAt(selectedRow, 1).toString());
        des1.setSelectedItem(model.getValueAt(selectedRow, 2));
        DDate1.setDate(dateValue);
        DTime1.setSelectedItem(model.getValueAt(selectedRow, 4));
        AD.setDate(Adate);
        AT.setText(model.getValueAt(selectedRow, 6).toString());
        seat.setText(model.getValueAt(selectedRow, 7).toString());
        pricee.setText(model.getValueAt(selectedRow,8).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyPressed
       if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
           try {
            String kwarta = amount.getText();
            double money = Double.parseDouble(kwarta);

            String tanan = price1.getText();
            double all = Double.parseDouble(tanan);

            if (money >= all) {
                double changeAmount = money - all;
                change.setText(Double.toString(changeAmount));

            } else {
                JOptionPane.showMessageDialog(this, "Not enough money! Please enter a sufficient amount.");
            }
           } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
           }
       }
    }//GEN-LAST:event_amountKeyPressed

    private void noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyPressed
          if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
              if (seat.getText().isEmpty()){
                  JOptionPane.showMessageDialog (null, "There no available seats!");
              }else if (Integer.parseInt(seat.getText()) < Integer.parseInt(no.getText())){
                  JOptionPane.showMessageDialog (null, "There are just "+ seat.getText() + " available left");
              }else{
                  int selectedRow = table.getSelectedRow();
                  DefaultTableModel model = (DefaultTableModel) table.getModel();
                  String presyo = pricee.getText();
                  double tanan = Double.parseDouble(presyo);
                  double all = tanan * Double.parseDouble(no.getText());
                  price1.setText(String.valueOf(all));
              }  
          }
    }//GEN-LAST:event_noKeyPressed

    private void noKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_noKeyTyped

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(ticketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ticketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AD;
    private com.toedter.calendar.JDateChooser ADate;
    private javax.swing.JLabel AT;
    private javax.swing.JLabel ATime;
    private com.toedter.calendar.JDateChooser DDate;
    private com.toedter.calendar.JDateChooser DDate1;
    private javax.swing.JComboBox<String> DTime;
    private javax.swing.JComboBox<String> DTime1;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField amount;
    private javax.swing.JLabel bn;
    private javax.swing.JPanel book;
    private javax.swing.JLabel change;
    private javax.swing.JPanel check;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> des;
    private javax.swing.JComboBox<String> des1;
    private javax.swing.JLabel eyeD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField no;
    private javax.swing.JTextField passenger;
    private javax.swing.JTextField price;
    private javax.swing.JLabel price1;
    private javax.swing.JTextField pricee;
    private javax.swing.JPanel sched;
    private javax.swing.JTextField search;
    private javax.swing.JTextField seat;
    private javax.swing.JTextArea ta;
    private javax.swing.JTable table;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
 private void Update_table(){
     try {
         String sql = "SELECT * FROM `schedule` WHERE 1";
         pst = con.prepareStatement(sql);
         rs = pst.executeQuery();
         table.setModel(DbUtils.resultSetToTableModel(rs));
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, ex);
     }
 }
 
 private int getNextIdFromDB() {
     int nextId = 0;
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketing_db?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
         st = con.createStatement();

         String sql = "SELECT MAX(ID) FROM booking";
         try (ResultSet rs = st.executeQuery(sql)) {
         if (rs.next()) {
             nextId = rs.getInt(1) + 1;
         }
         }
     } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return nextId;
    }
 
   private String calculateArrivalTime(String destination, String departureTime) {
    int additionalMinutes = 0;

    switch (des.getSelectedIndex()) {
        case 1:
            additionalMinutes = 45;
            break;
        case 2:
            additionalMinutes = 40;
            break;
        case 3:
             additionalMinutes = 30;
            break;
        case 4:
            additionalMinutes = 45;
            break;
        case 5:
            additionalMinutes = 50;
            break;
        case 6:
            additionalMinutes = 60; 
            break;
        case 7:
            additionalMinutes = 90;
            break;
        case 8:
            additionalMinutes = 120;
            break;
        case 9:
            additionalMinutes = 105;
            break;
        case 10:
            additionalMinutes = 60;
            break;
        default:
            break;
    }

    try {
        SimpleDateFormat inputFormat = new SimpleDateFormat("HH:mm");
        Date departureDateTime = inputFormat.parse(departureTime);

        Calendar cal = Calendar.getInstance();
        cal.setTime(departureDateTime);
        cal.add(Calendar.MINUTE, additionalMinutes);

        SimpleDateFormat outputFormat = new SimpleDateFormat("hh:mm a");
        return outputFormat.format(cal.getTime());
    } catch (ParseException e) {
        e.printStackTrace();
        return "Error";
    }
}
   public void getStock(){
        try {    
             int selectedRow = table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Date dateValue = (Date) model.getValueAt(selectedRow, 3);
            Date Adate = (Date) model.getValueAt(selectedRow, 5);
            int i = Integer.parseInt(seat.getText()) - Integer.parseInt(no.getText());
            
          String q = "UPDATE `schedule` SET `Bus Name`='" + bn.getText() + "', " +
           "`Destination`='" + des1.getSelectedItem() + "', " +
           "`DepartureDate`='" + dateValue + "', " +
           "`DepartureTime`='" + DTime1.getSelectedItem() + "', " +
           "`DateOfArrival`='" + Adate + "', " +
           "`TimeOfArrival`='" + AT.getText() + "', " +
           "`No.OfPassenger`='" + i + "', " +
           "`Price`='" + pricee.getText() + "' " +
           "WHERE `ID`='" + eyeD.getText() + "'";

            st = con.createStatement();
            st.executeUpdate(q);
                try{
                    String q1 ="SELECT * FROM `schedule` WHERE 1";
                    rs = pst.executeQuery(q1);
                    model.setRowCount(0);
                    while(rs.next()){

                           Object o [] = {
                            rs.getInt("ID"), rs.getString("Bus Name"),
                            rs.getString("Destination"),
                            rs.getDate("DepartureDate"), rs.getString("DepartureTime"),
                            rs.getDate("DateOfArrival"), rs.getString("TimeOfArrival"),
                            rs.getInt("No.OfPassenger"), rs.getInt("Price")
                        };
                        model.addRow(o);
                    }
                   
                   
                }catch(Exception e){
                    
                }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            System.out.print(e);
        }
    }


}
