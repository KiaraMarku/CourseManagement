package presentation;

import entety.Course;
import entety.CourseSchedule;
import entety.Student;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.Timer;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


import service.CourseService;
import service.StudentService;

public class TopCourses extends javax.swing.JFrame {

    Student user;
    String courseName; // selected course from table
    CourseService courseService;
    StudentService studentService;

    public TopCourses(Student user) {
        this.user = user;
        courseService = new CourseService();
        studentService = new StudentService();
        initComponents();
        txtUsername.setText(user.getUsername());
        setLocationRelativeTo(null);
        setVisible(true);
        showTopCourses();
        courseDetailsPanel.setVisible(false);
    }

    //for testing purposes
    public TopCourses() {

        courseService = new CourseService();

        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        showTopCourses();
        courseDetailsPanel.setVisible(false);
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        courseDetailsPanel = new javax.swing.JPanel();
        txtLecturer = new javax.swing.JLabel();
        txtSchedule = new javax.swing.JLabel();
        txtLocation = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JLabel();
        txtNoStudents = new javax.swing.JLabel();
        viewFeedbacsButton = new javax.swing.JButton();
        btnJoinDrop = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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

        courseDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        courseDetailsPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(40, 1, 1, 1, new java.awt.Color(204, 153, 255)));

        txtLecturer.setBackground(new java.awt.Color(255, 255, 255));
        txtLecturer.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtLecturer.setForeground(new java.awt.Color(51, 51, 51));
        txtLecturer.setText("Lecturer: ");

        txtSchedule.setBackground(new java.awt.Color(204, 204, 255));
        txtSchedule.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtSchedule.setForeground(new java.awt.Color(51, 51, 51));
        txtSchedule.setText("Schedule");

        txtLocation.setBackground(new java.awt.Color(204, 204, 255));
        txtLocation.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtLocation.setForeground(new java.awt.Color(51, 51, 51));
        txtLocation.setText("Location:");

        txtCourseName.setBackground(new java.awt.Color(204, 204, 255));
        txtCourseName.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtCourseName.setForeground(new java.awt.Color(204, 153, 255));
        txtCourseName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtNoStudents.setBackground(new java.awt.Color(204, 204, 255));
        txtNoStudents.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtNoStudents.setForeground(new java.awt.Color(51, 51, 51));
        txtNoStudents.setText("Number of students");

        viewFeedbacsButton.setBackground(new java.awt.Color(204, 153, 255));
        viewFeedbacsButton.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        viewFeedbacsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewFeedbacsButton.setText("View Feedbacks");
        viewFeedbacsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFeedbacsButtonActionPerformed(evt);
            }
        });

        btnJoinDrop.setBackground(new java.awt.Color(204, 153, 255));
        btnJoinDrop.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnJoinDrop.setForeground(new java.awt.Color(255, 255, 255));
        btnJoinDrop.setText("jButton1");
        btnJoinDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinDropActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout courseDetailsPanelLayout = new javax.swing.GroupLayout(courseDetailsPanel);
        courseDetailsPanel.setLayout(courseDetailsPanelLayout);
        courseDetailsPanelLayout.setHorizontalGroup(
            courseDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(courseDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(courseDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLecturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNoStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseDetailsPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnJoinDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(viewFeedbacsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        courseDetailsPanelLayout.setVerticalGroup(
            courseDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseDetailsPanelLayout.createSequentialGroup()
                .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(txtLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNoStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(courseDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewFeedbacsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJoinDrop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Wavy_Bus-09_Single-02.jpg"))); // NOI18N

        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(courseDetailsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(courseDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(courseDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2)
                    .addContainerGap()))
        );

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/star.png"))); // NOI18N
        jLabel3.setText("TOP RATED COURSES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1060, 710));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        setSize(new java.awt.Dimension(1275, 750));
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

    private void btnJoinDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinDropActionPerformed
        if (studentService.followsCourses(user, courseName)) {
            studentService.dropCourse(user, courseName);
        } else {
            studentService.joinCourse(user, courseName);
        }
        showCourseDetails(courseName);
    }//GEN-LAST:event_btnJoinDropActionPerformed

    private void viewFeedbacsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFeedbacsButtonActionPerformed
        Reviews feedbackpage = new Reviews(user, courseName);
        this.setVisible(false);
    }//GEN-LAST:event_viewFeedbacsButtonActionPerformed

    private void tblCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCourseMouseClicked
        // TODO add your handling code here:
        int row = tblCourse.getSelectedRow();
        TableModel model = tblCourse.getModel();
        courseName = model.getValueAt(row, 0).toString();
        showCourseDetails(courseName);
        courseDetailsPanel.setVisible(true);
    }//GEN-LAST:event_tblCourseMouseClicked

    public void showTopCourses() {
        Course[] topCourses = courseService.getTopCourses();
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();

        for (Course course : topCourses) {
            Object[] row = {course.getName(),course.getRating()};

            model.addRow(row);
        }

    }

    public void showCourseDetails(String name) {
        Course course = courseService.getCourseDetails(name);
        txtCourseName.setText(name);
        txtLecturer.setText("Lecturer: " + course.getInstructor());
        txtLocation.setText("Location: " + course.getLocation());

        List<CourseSchedule> courseSchedule = courseService.getCourseSchedule(name);
        txtSchedule.setText("Schedule: ");;
        for (CourseSchedule schedule : courseSchedule) {
            txtSchedule.setText(txtSchedule.getText() + schedule.getMeetingDay() + " "
                    + schedule.getStartTime() + "-" + schedule.getEndTime() + "   ");
        }

        txtNoStudents.setText("Number of students: " + courseService.getNoStudents(name));

        if (studentService.followsCourses(user, name)) {
            btnJoinDrop.setText("Drop Course");
        } else {
            btnJoinDrop.setText("Join Course");
        };

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopCourses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton browseCourses;
    private javax.swing.JButton btnJoinDrop;
    private javax.swing.JButton courseCalendar;
    private javax.swing.JPanel courseDetailsPanel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton myCourses;
    private javax.swing.JButton topCourses;
    private javax.swing.JLabel txtCourseName;
    private javax.swing.JLabel txtLecturer;
    private javax.swing.JLabel txtLocation;
    private javax.swing.JLabel txtNoStudents;
    private javax.swing.JLabel txtSchedule;
    private javax.swing.JLabel txtUsername;
    private javax.swing.JButton viewFeedbacsButton;
    // End of variables declaration//GEN-END:variables
}
