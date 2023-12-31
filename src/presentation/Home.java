/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import entety.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Home extends javax.swing.JFrame {

    Student user;

    public Home(Student user) {
        this.user = user;
        initComponents();
        txtUsername.setText(user.getUsername());
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaFeedback = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaFeedback1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        browseCourses = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        topCourses = new javax.swing.JButton();
        myCourses = new javax.swing.JButton();
        courseCalendar = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user (3).png"))); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 140, 60));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 30, 40));

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book-stack.png"))); // NOI18N
        jLabel1.setText(" Course Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homeimg1.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/homeimg2.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome to your Course Manager...");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(51, 0, 102)));

        txtAreaFeedback.setEditable(false);
        txtAreaFeedback.setBackground(new java.awt.Color(204, 204, 255));
        txtAreaFeedback.setColumns(20);
        txtAreaFeedback.setFont(new java.awt.Font("Bookman Old Style", 2, 16)); // NOI18N
        txtAreaFeedback.setForeground(new java.awt.Color(102, 0, 204));
        txtAreaFeedback.setLineWrap(true);
        txtAreaFeedback.setRows(5);
        txtAreaFeedback.setText("- Unbiased Reviews: Read and write honest, in-depth reviews of courses and university experiences.\n-Detailed Insights: Find reviews covering course workload, professor effectiveness, learning materials, and more.\n-Stay Informed: Share your own experiences and contribute to a growing database of valuable reviews.\n-Empowered Decisions: Gain valuable insights to choose the right courses, prepare for classes, and excel in your studies.");
        txtAreaFeedback.setWrapStyleWord(true);
        txtAreaFeedback.setMaximumSize(new java.awt.Dimension(100, 400));
        jScrollPane2.setViewportView(txtAreaFeedback);

        txtAreaFeedback1.setEditable(false);
        txtAreaFeedback1.setBackground(new java.awt.Color(255, 204, 255));
        txtAreaFeedback1.setColumns(20);
        txtAreaFeedback1.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        txtAreaFeedback1.setForeground(new java.awt.Color(255, 102, 153));
        txtAreaFeedback1.setLineWrap(true);
        txtAreaFeedback1.setRows(5);
        txtAreaFeedback1.setText(" Discover and Share Insights on Your Courses with Course manager\n\nAn easy way  to  connect students and instructors by providing a platform to share and explore comprehensive course reviews.");
        txtAreaFeedback1.setWrapStyleWord(true);
        txtAreaFeedback1.setMaximumSize(new java.awt.Dimension(100, 400));
        jScrollPane3.setViewportView(txtAreaFeedback1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(527, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1100, 710));

        jPanel2.setBackground(new java.awt.Color(71, 29, 186));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        browseCourses.setBackground(new java.awt.Color(51, 0, 153));
        browseCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        browseCourses.setForeground(new java.awt.Color(255, 255, 255));
        browseCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/online-graduation.png"))); // NOI18N
        browseCourses.setText("Browse Courses");
        browseCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        browseCourses.setFocusPainted(false);
        browseCourses.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        browseCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseCoursesActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(51, 0, 153));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-page.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeButton.setFocusPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        topCourses.setBackground(new java.awt.Color(51, 0, 153));
        topCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        topCourses.setForeground(new java.awt.Color(255, 255, 255));
        topCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/badge (1).png"))); // NOI18N
        topCourses.setText("Top Courses");
        topCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        topCourses.setFocusPainted(false);
        topCourses.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        topCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topCoursesActionPerformed(evt);
            }
        });

        myCourses.setBackground(new java.awt.Color(51, 0, 153));
        myCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        myCourses.setForeground(new java.awt.Color(255, 255, 255));
        myCourses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/online-learning_1.png"))); // NOI18N
        myCourses.setText("My Courses");
        myCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCourses.setFocusPainted(false);
        myCourses.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        myCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCoursesActionPerformed(evt);
            }
        });

        courseCalendar.setBackground(new java.awt.Color(51, 0, 153));
        courseCalendar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        courseCalendar.setForeground(new java.awt.Color(255, 255, 255));
        courseCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar (1).png"))); // NOI18N
        courseCalendar.setText(" Courses Calendar");
        courseCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        courseCalendar.setFocusPainted(false);
        courseCalendar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        courseCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCalendarActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(51, 0, 153));
        logout.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout (1).png"))); // NOI18N
        logout.setText(" Logout");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setFocusPainted(false);
        logout.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(browseCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(courseCalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(myCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(browseCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(topCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(courseCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(629, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(myCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(530, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 720));

        setSize(new java.awt.Dimension(1280, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void browseCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseCoursesActionPerformed
        BrowseCourses allCoursesPage=new BrowseCourses(user);
        disposeCurrentFrame();
    }//GEN-LAST:event_browseCoursesActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        Home homepage = new Home(user);
        disposeCurrentFrame();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void topCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topCoursesActionPerformed
        TopCourses topCoursesPage=new TopCourses(user);
        disposeCurrentFrame();
    }//GEN-LAST:event_topCoursesActionPerformed

    private void myCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myCoursesActionPerformed
        MyCourses myCoursesPage=new MyCourses(user);
        disposeCurrentFrame();
    }//GEN-LAST:event_myCoursesActionPerformed

    private void courseCalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCalendarActionPerformed
        CourseCalendar schedulePage=new CourseCalendar(user);
        disposeCurrentFrame();
    }//GEN-LAST:event_courseCalendarActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
       int response = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                Login login=new Login();
                dispose(); 
            }
      
    }//GEN-LAST:event_logoutActionPerformed

    //the only purpose of this method is to improve user experinence
    public void disposeCurrentFrame() {
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dispose the current frame  after the delay
                dispose();
            }
        });
        // Start the timer
        timer.setRepeats(false);
        timer.start();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton browseCourses;
    private javax.swing.JButton courseCalendar;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton logout;
    private javax.swing.JButton myCourses;
    private javax.swing.JButton topCourses;
    private javax.swing.JTextArea txtAreaFeedback;
    private javax.swing.JTextArea txtAreaFeedback1;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
