package presentation;

import entety.CourseReview;
import entety.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import service.CourseService;
import service.StudentService;

public class Reviews extends javax.swing.JFrame {

    Student user;
    String courseName;
    String studentName; //selected student 
    CourseService courseService;
    StudentService studentService;

    public Reviews(Student user, String courseName) {
        this.user = user;
        this.courseName = courseName;
        courseService = new CourseService();
        studentService = new StudentService();
        initComponents();
        txtUsername.setText(user.getUsername());
        txtCourseName.setText("Reviews for " + courseName);
        setLocationRelativeTo(null);
        setVisible(true);
        showAllReviews();
        reviewsPanel.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        txtUsername = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReviews = new rojeru_san.complementos.RSTableMetro();
        reviewsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaFeedback = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtReviewer = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JLabel();
        txtRating = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        browseCourses = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        topCourses = new javax.swing.JButton();
        myCourses = new javax.swing.JButton();
        courseCalendar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book-stack.png"))); // NOI18N
        jLabel1.setText(" Course Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 320, 70));

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

        txtUsername.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user (3).png"))); // NOI18N
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 140, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblReviews.setBackground(new java.awt.Color(255, 255, 255));
        tblReviews.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "Rating", "Date"
            }
        ));
        tblReviews.setAlignmentY(1.0F);
        tblReviews.setColorBackgoundHead(new java.awt.Color(51, 0, 153));
        tblReviews.setColorFilasBackgound2(new java.awt.Color(204, 204, 255));
        tblReviews.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblReviews.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblReviews.setColorSelBackgound(new java.awt.Color(153, 153, 255));
        tblReviews.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        tblReviews.setRowHeight(40);
        tblReviews.setShowGrid(false);
        tblReviews.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReviewsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReviews);

        reviewsPanel.setBackground(new java.awt.Color(255, 153, 204));
        reviewsPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 153), new java.awt.Color(255, 51, 153), null, new java.awt.Color(204, 0, 153)));

        txtAreaFeedback.setEditable(false);
        txtAreaFeedback.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaFeedback.setColumns(20);
        txtAreaFeedback.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtAreaFeedback.setLineWrap(true);
        txtAreaFeedback.setRows(5);
        txtAreaFeedback.setWrapStyleWord(true);
        txtAreaFeedback.setMaximumSize(new java.awt.Dimension(100, 400));
        jScrollPane2.setViewportView(txtAreaFeedback);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 153));
        jLabel3.setText(" Feedback ");

        txtReviewer.setBackground(new java.awt.Color(255, 255, 255));
        txtReviewer.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        txtReviewer.setForeground(new java.awt.Color(204, 0, 153));

        javax.swing.GroupLayout reviewsPanelLayout = new javax.swing.GroupLayout(reviewsPanel);
        reviewsPanel.setLayout(reviewsPanelLayout);
        reviewsPanelLayout.setHorizontalGroup(
            reviewsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reviewsPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(reviewsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReviewer, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        reviewsPanelLayout.setVerticalGroup(
            reviewsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, reviewsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtReviewer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        txtCourseName.setBackground(new java.awt.Color(255, 255, 255));
        txtCourseName.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        txtCourseName.setForeground(new java.awt.Color(51, 0, 153));
        txtCourseName.setText("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");

        txtRating.setBackground(new java.awt.Color(255, 255, 255));
        txtRating.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        txtRating.setForeground(new java.awt.Color(153, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addComponent(reviewsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(reviewsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1110, 710));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        browseCourses.setBackground(new java.awt.Color(255, 255, 255));
        browseCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        browseCourses.setForeground(new java.awt.Color(51, 0, 153));
        browseCourses.setText("Browse Courses");
        browseCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        browseCourses.setFocusPainted(false);
        browseCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseCoursesActionPerformed(evt);
            }
        });

        homeButton.setBackground(new java.awt.Color(255, 255, 255));
        homeButton.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        homeButton.setForeground(new java.awt.Color(51, 0, 153));
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home (1).png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        homeButton.setFocusPainted(false);
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        topCourses.setBackground(new java.awt.Color(255, 255, 255));
        topCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        topCourses.setForeground(new java.awt.Color(51, 0, 153));
        topCourses.setText("Top Courses");
        topCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        topCourses.setFocusPainted(false);
        topCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topCoursesActionPerformed(evt);
            }
        });

        myCourses.setBackground(new java.awt.Color(255, 255, 255));
        myCourses.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        myCourses.setForeground(new java.awt.Color(51, 0, 153));
        myCourses.setText("My Courses");
        myCourses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myCourses.setFocusPainted(false);
        myCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myCoursesActionPerformed(evt);
            }
        });

        courseCalendar.setBackground(new java.awt.Color(255, 255, 255));
        courseCalendar.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        courseCalendar.setForeground(new java.awt.Color(51, 0, 153));
        courseCalendar.setText(" Courses Calendar");
        courseCalendar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        courseCalendar.setFocusPainted(false);
        courseCalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCalendarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topCourses, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
            .addComponent(browseCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(courseCalendar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
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
                .addContainerGap(347, Short.MAX_VALUE))
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

    private void tblReviewsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReviewsMouseClicked

        int row = tblReviews.getSelectedRow();
        TableModel model = tblReviews.getModel();
        studentName = model.getValueAt(row, 0).toString();
        reviewsPanel.setVisible(true);
        showFeedback(studentName);
        
    }//GEN-LAST:event_tblReviewsMouseClicked

    private void browseCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseCoursesActionPerformed
        BrowseCourses allCoursesPage=new BrowseCourses(user);
        disposeCurrentFrame();

    }//GEN-LAST:event_browseCoursesActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
         Home homepage=new Home(user);
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
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCalendarActionPerformed

    public void showAllReviews() {
        List<CourseReview> reviews = courseService.getAllReviews(courseName);

        DefaultTableModel model = (DefaultTableModel) tblReviews.getModel();

        for (CourseReview review : reviews) {
            Object[] row = {review.getStudentName(), review.getRating(), review.getDate()};
            model.addRow(row);
        }
        txtRating.setText("Rating: "+ courseService.getRating(courseName));
    }

    public void showFeedback(String studentName) {
        txtReviewer.setText("Reviewer: " + studentName);
        List<CourseReview> reviews = courseService.getAllReviews(courseName);
        for (CourseReview review : reviews) {
            if (review.getStudentName().equals(studentName)) {
                txtAreaFeedback.setText(review.getFeedback());
            }

        }
    }
    //the only purpose of this method is to improve user experinence
    public void disposeCurrentFrame(){
         Timer timer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Dispose the current frame  after the delay
            dispose();}
    });
    // Start the timer
    timer.setRepeats(false);
    timer.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton browseCourses;
    private javax.swing.JButton courseCalendar;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton myCourses;
    private javax.swing.JPanel reviewsPanel;
    private rojeru_san.complementos.RSTableMetro tblReviews;
    private javax.swing.JButton topCourses;
    private javax.swing.JTextArea txtAreaFeedback;
    private javax.swing.JLabel txtCourseName;
    private javax.swing.JLabel txtRating;
    private javax.swing.JLabel txtReviewer;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
