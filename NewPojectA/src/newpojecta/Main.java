package newpojecta;

import javax.swing.*;

public class Main {
 private static int sizestedent = 0;
 private static Course coursesRegistered[] = new Course[500];
 private static Student studentsRegistered[] = new Student[500];

 public static void main(String[] args) {
 
    String Main = "Registration System Menu \n " 
 +" 1. Add a new Student.\n "
+" 2. Add a new Course.\n "
+" 3. Register a Course for a Student.\n "
+" 4. Modify a Student Registration.\n " 
+" 5. Print a Student Schedule.\n "
+" 6. Exit The System.\n " ;
 String s = JOptionPane.showInputDialog(null , Main );
 int Form = Integer.parseInt(s);
 while(true){
 switch(Form) {
case 1 :  addNewStudent();break;

case 2 :addNewCourse(); 
    break;
case 3 : registerCourse();
    break;
case 4 : 
    break;
case 5 : 
    break;
case 6 : System.exit(0);
    break;
 default :  JOptionPane.showMessageDialog(null , " Your Choes Is Not Found  "+"\n you must Enter Number Butwen : {1 , 2 , 3 , 4 , 5 , 6 } " , "Note" , 0 );
 }

 }
 }
    
 private static void addNewStudent() {
 String args[] = new String[10];
 String number, name, major;
 number = JOptionPane.showInputDialog(null, "Enter student's number", "Registera new student", -1);

 name = JOptionPane.showInputDialog(null, "Enter student's name", "Register anew student", -1);

 major = JOptionPane.showInputDialog(null, "Enter student's major", "Register anew student", -1);
int SerchID = SerchNumber(number);
if( SerchID == -1 ) { 
studentsRegistered[Student.studentCounter] = new Student(number, name, major);
 Student.studentCounter++;
 JOptionPane.showMessageDialog(null, "تمت الاضافة بنجاح", "ملاحظة", 01);
 main(args);
 }else 
    JOptionPane.showMessageDialog(null, "This Is Alredy exsit", "Error", 01);
 }
 /*
 add a new course method
 */
 
 private static void addNewCourse() {
 String args[] = new String[10];
 String number, name, major, stringCreditHours;
 CourseTime time[] = new CourseTime[4];
 int timeCounter = 0;
 int creditHours;
 number = JOptionPane.showInputDialog(null, "Enter Course number", "Register anew Course", -1);

 name = JOptionPane.showInputDialog(null, "Enter Course name", "Register a newCourse", -1);

 major = JOptionPane.showInputDialog(null, "Enter Course major", "Register anew Course", -1);

 stringCreditHours = JOptionPane.showInputDialog(null, "Enter credit hours",
"Register a new Course", -1);
 creditHours = Integer.parseInt(stringCreditHours);
 String days = "1. Sat.\n2. Sun\n3. Mon.\n4. Tue.\n5. Wed\n6. Thu.\n7. Fri.";
 String hours = "1. 8-9\n2. 9-10\n3. 10-11\n4. 11-12\n5. 12-1\n6. 1-2";
 do {
 String stringOptionChosen;
 int optionChosen;
 stringOptionChosen = JOptionPane.showInputDialog(null, days, "Register anew Course", -1);

 optionChosen = Integer.parseInt(stringOptionChosen);
 switch (optionChosen) {
 case 1:
 time[timeCounter] = new CourseTime("Saturday");
 break;
 case 2:
 time[timeCounter] = new CourseTime("Sunday");
 break;
 case 3:
 time[timeCounter] = new CourseTime("Monday");
 break;
 case 4:
 time[timeCounter] = new CourseTime("Tuesday");
 break;
 case 5:
 time[timeCounter] = new CourseTime("Wednesday");
 break;
 case 6:
 time[timeCounter] = new CourseTime("Thursday");
 break;
 case 7:
 time[timeCounter] = new CourseTime("Friday");
 break;
 default:
 time[timeCounter] = new CourseTime("None");
 }
 stringOptionChosen = JOptionPane.showInputDialog(null, hours, "Register anew Course", -1);

 optionChosen = Integer.parseInt(stringOptionChosen);
 switch (optionChosen) {
 case 1:
 time[timeCounter].setHour("8-9");
 break;
 case 2:
 time[timeCounter].setHour("9-10");
 break;
 case 3:
 time[timeCounter].setHour("10-11");
 break;
 case 4:
 time[timeCounter].setHour("11-12");
 break;
 case 5:
 time[timeCounter].setHour("12-1");
 break;
 case 6:
 time[timeCounter].setHour("1-2");
 break;
 default:
 time[timeCounter].setHour("None");
 break;
 }
 timeCounter++;
 } while (timeCounter < creditHours);
 coursesRegistered[Course.courseCounter] = new Course(number, name, major,time, creditHours);

 coursesRegistered[Course.courseCounter].setNumberOfCourseTimes(timeCounter);
 Course.courseCounter++;
 main(args);
 }
 /*
 register a course for a student method
 */
 private static void registerCourse() {
 String args[] = new String[10];
 int sIndex = 0, courseChosen;
 String stringCourseChosen, coursesMessage = "";
 String number = JOptionPane.showInputDialog(null, "Enter student's number",
"Register a course for a student", -1);
 
 if (Student.studentCounter == 0) {
 JOptionPane.showMessageDialog(null, "there are no students registered",
"Register a course for a student", JOptionPane.ERROR_MESSAGE);
 main(args);
 }
 for (int i = 0; i < Student.studentCounter; i++) {
 
     if (studentsRegistered[i].getStudentNumber().equals(number)) {
 sIndex = i;
 break;
 }
 JOptionPane.showMessageDialog(null, "The student with the number : " +
number + " Does not exist please try again!", "Register a course for a student",
JOptionPane.ERROR_MESSAGE);
 if (JOptionPane.showConfirmDialog(null, "Do you want to try again?",
"Register a course for a student", JOptionPane.YES_NO_OPTION) == 0) {
 registerCourse();
 } else main(args);
 }
 if (JOptionPane.showConfirmDialog(null,
studentsRegistered[sIndex].getStudentData(), "Is this the student you searched for?",
-1) != 0)
 registerCourse();
 for (int i = 0; i < Course.courseCounter; i++) {
 coursesMessage += (i + 1) + "." + coursesRegistered[i].getCourseName() +
"\n";
 }
 stringCourseChosen = JOptionPane.showInputDialog(null, coursesMessage,
"Register a course for a student", -1);
 courseChosen = Integer.parseInt(stringCourseChosen);
 studentsRegistered[sIndex].setCourse(coursesRegistered[courseChosen - 1],
studentsRegistered[sIndex].getRegisteredCourses());

studentsRegistered[sIndex].setRegisteredCourses(studentsRegistered[sIndex].getRegisteredCourses() + 1);

 }
 
 
 
 
 
 
 private static void modifyRegistration() {
 String args[] = new String[10];
 String stringOptionChosen = JOptionPane.showInputDialog(null, "1.Add a coursefor a student.\n2.Drop a course for a student.\n Modify a student registration", -1);

 int optionChosen = Integer.parseInt(stringOptionChosen);
 if (optionChosen == 1)
 registerCourse();
 else {
 int sIndex;
 String number = JOptionPane.showInputDialog(null, "Enter the student's NumberModify a student registration", -1);

 if (Student.studentCounter == 0) {
 JOptionPane.showMessageDialog(null, "there are no studentsregisteredRegister a course for a student","Errer", JOptionPane.ERROR_MESSAGE);

 main(args);
 }
 for (int i = 0; i < Student.studentCounter; i++) {
 if (studentsRegistered[i].getStudentNumber().equals(number)) {
 sIndex = i;
break;
 }
 }
 }
 }

    private static int SerchNumber(String number) {
        for(int i = 0 ; i<Student.studentCounter; ++i){
          if(number==studentsRegistered[i].getStudentNumber() )  
            return i ;
         
        }return -1 ;
    }

}