CREATE TABLE student(
    student_id INT UNIQUE AUTO_INCREMENT,
    student_name VARCHAR(20) PRIMARY KEY ,
    major VARCHAR(20),
    password varchar(20)
);

CREATE TABLE course (
  course_id INT PRIMARY KEY AUTO_INCREMENT,
  course_name VARCHAR(255) NOT NULL,
  instructor VARCHAR(255) NOT NULL,
  location VARCHAR(255) NOT NULL,
  rating INT 
);

drop table course;
drop table course_schedule;
drop table student_course;

CREATE TABLE student_course (
  student_name VARCHAR(255) NOT NULL,
  course_id INT NOT NULL,
  feedback VARCHAR(1000),
  rating INT ,
  date DATE,
  PRIMARY KEY (student_name, course_id),
  FOREIGN KEY (student_name) REFERENCES student(student_name)ON DELETE CASCADE,
  FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE CASCADE
);

CREATE TABLE course_schedule (
  course_id INT NOT NULL,
  meeting_day VARCHAR(10) NOT NULL,
  start_time TIME NOT NULL,
  end_time TIME NOT NULL,
  PRIMARY KEY (course_id, meeting_day),
  FOREIGN KEY (course_id) REFERENCES course(course_id) ON DELETE CASCADE
);




DESCRIBE student;
DESCRIBE course;
DESCRIBE student_course;
DESCRIBE course_schedule;

DROP TABLE student_course;


INSERT INTO student(name,major) VALUES('John','Biology');
INSERT INTO student (name,major) VALUES('Kate','Sociology');
INSERT INTO student(name) VALUES( 'Claire');
INSERT INTO student (name,major) VALUES( 'Jack', 'Biology');
INSERT INTO student (name,major) VALUES( 'Mike', 'Computer Science');


INSERT INTO course (course_id, course_name, instructor, location,rating)
VALUES
(1, 'Introduction to Computer Science', 'Prof. Ada Lovelace', 'Hall 203',0),
(2, 'Programming Fundamentals with Python', 'Dr. Grace Hopper', 'Lecture Hall A',0),
(3, 'Data Structures and Algorithms', 'Mr. John von Neumann', 'Room 314',0),
(4, 'Web Development with HTML, CSS, and JavaScript', 'Ms. Brenda Cargill', 'Computer Lab 2',0),
(5, 'Computer Networks and Cybersecurity', 'Prof. Alan Turing', 'Seminar Room B',0),
(6, 'Object-Oriented Programming with Java', 'Dr. James Gosling', 'Hall 210',0),
(7, 'Artificial Intelligence', 'Prof. John McCarthy', 'Lecture Hall C',0),
(8, 'Machine Learning', 'Dr. Andrew Ng', 'Computer Lab 1',0),
(9, 'Database Management Systems', 'Prof. E.F. Codd', 'Room 321',0),
(10, 'Software Engineering', 'Dr. Frederick Brooks', 'Hall 205',0);

INSERT INTO course (course_id, course_name, instructor, location, rating)
VALUES
(11, 'Discrete Mathematics', 'Prof. Claude Shannon', 'Room 309', 0),
(12, 'Operating Systems', 'Dr. Avi Rubin', 'Hall 212', 0),
(13, 'Software Design and Architecture', 'Mr. Grady Booch', 'Lecture Hall D', 0),
(14, 'Computer Graphics', 'Ms. Daniela Rus', 'Computer Lab 3', 0),
(15, 'Data Mining and Analytics', 'Prof. Jeff Dean', 'Seminar Room C', 0);


INSERT INTO course_schedule (course_id, meeting_day, start_time, end_time)
VALUES
(1, 'Monday', '09:00:00', '10:00:00'),
(1, 'Wednesday', '09:00:00', '10:00:00'),
(2, 'Tuesday', '11:00:00', '12:00:00'),
(2, 'Thursday', '11:00:00', '12:00:00'),
(3, 'Friday', '01:00:00', '02:00:00'),
(4, 'Monday', '03:00:00', '04:00:00'),
(4, 'Wednesday', '03:00:00', '04:00:00'),
(5, 'Tuesday', '05:00:00', '06:00:00'),
(5, 'Thursday', '05:00:00', '06:00:00'),
(6, 'Monday', '01:00:00', '02:00:00'),
(6, 'Wednesday', '01:00:00', '02:00:00'),
(7, 'Tuesday', '03:00:00', '04:00:00'),
(7, 'Thursday', '03:00:00', '04:00:00'),
(8, 'Monday', '05:00:00', '06:00:00'),
(8, 'Wednesday', '05:00:00', '06:00:00'),
(9, 'Tuesday', '11:00:00', '12:00:00'),
(9, 'Thursday', '11:00:00', '12:00:00'),
(10, 'Friday', '09:00:00', '10:00:00');

INSERT INTO course_schedule (course_id, meeting_day, start_time, end_time)
VALUES
(11, 'Tuesday', '01:00:00', '02:00:00'),
(11, 'Thursday', '01:00:00', '02:00:00'),
(12, 'Monday', '05:00:00', '06:00:00'),
(12, 'Wednesday', '05:00:00', '06:00:00'),
(13, 'Friday', '11:00:00', '12:00:00'),
(14, 'Tuesday', '09:00:00', '10:00:00'),
(14, 'Thursday', '09:00:00', '10:00:00'),
(15, 'Monday', '03:00:00', '04:00:00'),
(15, 'Wednesday', '03:00:00', '04:00:00');

SELECT * FROM student;
SELECT * FROM course;
SELECT * FROM student_course;
SElect * FRom course_schedule;
delete  from student_course;

UPDATE student 
SET major='Bio'
WHERE major='Biology';

DELETE FROM student
WHERE student_id=6;

SELECT name,student_id FROM student 
WHERE major='Bio' OR student_id<3
ORDER BY student_id DESC;

select Distinct course.*,course_schedule.*  from course  join course_schedule on course.course_id=course_schedule.course_id ;

select * from course_schedule where course_id=1;

select * from course_schedule where course_id = (
select  course_id from course where course_name="Introduction to Computer Science"
);


insert into student_course (student_name,course_id) values ("kiara",(
select  course_id from course where course_name="Introduction to Computer Science"
));

delete from course;

update  student_course set rating=0 where student_name="kiara" AND course_id=(
select  course_id from course where course_name="Introduction to Computer Science"
);

select *  from student_course where student_name="kiara" AND course_id=(
select  course_id from course where course_name="Introduction to Computer Science"
);


select AVG(rating) from student_course where course_id=(
    select course_id from course where course_name="Introduction to Computer Science");


select * from course where course.course_id in (select student_course.course_id from student_course);

update course set rating=0 where course_id=3;

-- changes--
UPDATE course_schedule
SET start_time = CAST(CONCAT(HOUR(start_time) + 12, ':', MINUTE(start_time)) AS TIME),
end_time = CAST(CONCAT(HOUR(end_time) + 12, ':', MINUTE(end_time)) AS TIME)
WHERE start_time >= '1:00:00' AND start_time <= '7:00:00';

ALTER TABLE course MODIFY COLUMN rating float;
--changes--

ALTER TABLE student MODIFY password VARCHAR(200);



delete from student where student_id=9;
update student set password="a591024321c5e2bdbd23ed35f0574dde" where student_id=6;_