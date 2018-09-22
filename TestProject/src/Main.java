                                                        //    بسم الله الرحمن الرحيم// 


/*   
Engineer Anas Omar Obaid
*/

 
import javax.swing.*;
import java.util.*;

class Main {

    public static Student student[] = new Student[50];
    public static CoorsTime time[] = new CoorsTime[100];

    public static Cours[] cours = new Cours[100];
    public static int sizectime = 0;

    public static String stringOptionChosen;
    public static int optionChosen;

    public static void main(String[] argse) {

        MainMenu();

    }

    /*
 
Greate Main Mine ..... 
       
     */
   
    public static void MainMenu() {
   while (true) {
        String Main = "Registration System Menu \n "
                + " 1. Add a new Student.\n "
                + " 2. Add a new Course.\n "
                + " 3. Register a Course for a Student.\n "
                + " 4. Modify a Student Registration.\n "
                + " 5. Print a Student Schedule.\n "
                + " 6. Exit The System.\n ";
      {
            String s = JOptionPane.showInputDialog(null, Main);
            int Form = Integer.parseInt(s);

            switch (Form) {

                case 1:
                    AddAnewStudent();
                    break;
                case 2:
                    AddANewCourse();
                    break;
                case 3:
                    registerCourse();
                    break;
                case 4:
                    modifyRegistration();
                    break;
                case 5:
                    printStudentSchedule();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, " Your Choes Is Not Found  " + "\n you must Enter Number Butwen : {1 , 2 , 3 , 4 , 5 , 6 } ", "Note", -1);

            }
        }
    }

    /*

Greate Add New Student........
   
     */
    }
    private static void AddAnewStudent() {
        JTextField StudentNumber = new JTextField();
        JTextField StudentName = new JTextField();
        JTextField StudentMajor = new JTextField();
        Object Masseg[] = {"ادخل رقم الطلب ", StudentNumber, "ادخل اسم الطالب ", StudentName, "ادخل تخصص الطالب ", StudentMajor};
        int Confirm = JOptionPane.showConfirmDialog(null, Masseg);

        int ID = Integer.parseInt(StudentNumber.getText());
        String studentInfor = StudentName.getText();
        String StudentMajorInfor = StudentMajor.getText();

        int SerchId = SerchIdNumberStudent(ID);
        if (SerchId == -1) {
            Cours[] listCoures = null;
            student[Student.sizestedent] = new Student(ID, studentInfor, StudentMajorInfor, listCoures);
            Student.sizestedent++;
            JOptionPane.showMessageDialog(null, " تم اضافة الطالب بنجاح ", "ملاحظة", 1);
       
        } else {
            JOptionPane.showMessageDialog(null, "رقم الطالب موجود مسبقا   ", "خطأ ", 0);
        }

    }

    /*

Greate New Course......



     */
    private static void AddANewCourse() {
        String number;
        String name, major, StringCreadiHoyrs;
        int crediHourse;
        Cours.timeConter = 0;

        JTextField CORSENUMBER = new JTextField();
        JTextField CORSNAME = new JTextField();
        JTextField CORSEMAJOR = new JTextField();
        JTextField CORSEHOURS = new JTextField();

        Object[] Masseg2 = {"ادخل رقم المادة", CORSENUMBER, "ادخل اسم المادة", CORSNAME, "ادخل تخصص المادة ", CORSEMAJOR, "ادخل عدد ساعات المادة", CORSEHOURS};
        int Confirm2 = JOptionPane.showConfirmDialog(null, Masseg2);

        number = CORSENUMBER.getText();
        name = CORSNAME.getText();
        major = CORSEMAJOR.getText();
        crediHourse = Integer.parseInt(CORSEHOURS.getText());

        String day = "\n1. Sat. \n2. Sun. \n3. Mon. \n4. Tue. \n5. Wed. \n6. Thu. \n7. Fri";
        String hours = "\n1. 8-9 \n2. 9-10 \n3. 10-11 \n4. 11-12 \n5. 12-1 \n6. 1-2 \n7. 2-3 ";

        do {

            stringOptionChosen = JOptionPane.showInputDialog(null, day, "ادخل اليوم ", 1);
            optionChosen = Integer.parseInt(stringOptionChosen);

            switch (optionChosen) {
                case 1:
                    time[Cours.timeConter] = new CoorsTime("السبت");
                    break;
                case 2:
                    time[Cours.timeConter] = new CoorsTime("الاحد");
                    break;

                case 3:
                    time[Cours.timeConter] = new CoorsTime("الاثنين");
                    break;

                case 4:
                    time[Cours.timeConter] = new CoorsTime("الثلاثاء");
                    break;

                case 5:
                    time[Cours.timeConter] = new CoorsTime("الاربعاء");
                    break;

                case 6:
                    time[Cours.timeConter] = new CoorsTime("الخميس");
                    break;

                case 7:
                    time[Cours.timeConter] = new CoorsTime("الجمعة");
                    break;

                default:
                    time[Cours.timeConter] = new CoorsTime("لايوجد");
                    break;

            }

            stringOptionChosen = JOptionPane.showInputDialog(null, hours, "ادخل وقت المادة", 1);
            optionChosen = Integer.parseInt(stringOptionChosen);

            switch (optionChosen) {

                case 1:

                    time[Cours.timeConter].setHour("8-9");
                    JOptionPane.showMessageDialog(null, "لقد تمت اضافة المادة الساعة   8-9 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 2:

                    time[Cours.timeConter].setHour("9-10");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة  9-10 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 3:

                    time[Cours.timeConter].setHour("10-11");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة  10-11" + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 4:
                    time[Cours.timeConter].setHour("11-12");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة  10-11 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 5:
                    time[Cours.timeConter].setHour("12-1");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة 10-11 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 6:
                    time[Cours.timeConter].setHour("1-2");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة 10-11 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                case 7:
                    time[Cours.timeConter].setHour("2-3");
                    JOptionPane.showMessageDialog(null, " لقد تمت اضافة المادة الساعة 10-11 " + time[Cours.timeConter].getDay(), "ملاحظة", 1);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "  1-7  يجب ان تختار رقم ما بين ", "خطأ", 0);
                    break;

            }

            Cours.timeConter++;

        } while (Cours.timeConter < crediHourse);

        int SerchNoBook;

        SerchNoBook = SerchNo(number);

        if (SerchNoBook == -1) {

            cours[Cours.courseCounter] = new Cours(number, name, major, crediHourse, time);

            cours[Cours.courseCounter].setNumberOfCourseTimes(Cours.timeConter);
            Cours.courseCounter++;

            JOptionPane.showMessageDialog(null, "لقد تمت الاضافة  المادة  بنجاح   ", "ملاحظة", 1);
        } else {
            JOptionPane.showMessageDialog(null, "لقد تمت اضافة هده المادة مسبقا ", "خطأ", 0);
        }
    }

    private static int SerchNo(String number) {
        for (int i = 0; i < Cours.courseCounter; ++i) {
            if (number == cours[i].getNumber()) {
                return i;
            }

        }
        return -1;
    }

    private static int SerchIdNumberStudent(int ID) {
        for (int i = 0; i < Student.sizestedent; ++i) {
            if (ID == student[i].getStudentNumber()) {
                return i;
            }
        }
        return -1;
    }

//register a course for a student method//
    private static void registerCourse() {

        int findStudent = SearchForStudent();

        Cours courseOFMajorStudents[] = new Cours[21];
        int sizecourseOFMajorStudents = 0;

//تحزين دورات التى بنفس مجال الطالب 
        for (int i = 0; i < Cours.courseCounter; ++i) {
            if (cours[i].getMajor().equals(student[findStudent].getStudentMajor())) {
                courseOFMajorStudents[sizecourseOFMajorStudents] = cours[i];
                ++sizecourseOFMajorStudents;
            }
        }
// جعل دورات الطالب بنص 
        String courseOFMajorStudentsExits = "";
        for (int i = 0; i < sizecourseOFMajorStudents; ++i) {
            courseOFMajorStudentsExits += i + 1 + "- " + courseOFMajorStudents[i].getNumber()
                    + " " + courseOFMajorStudents[i].getName() + " ["
                    + courseOFMajorStudents[i].getCrediHourse() + "credit]" + "\n";
        }
// جمل الادخال 
        String courseChoice = JOptionPane.showInputDialog(null, student[findStudent].getStudentMajor() + " course"
                + "\n" + courseOFMajorStudentsExits + "\n0. Return to a main menu\r\n"
                + "Enter your choice");
        int numberCourseChoice = Integer.parseInt(courseChoice);
        numberCourseChoice = numberCourseChoice - 1;
        //فحص ماذا اختار المسنخدم
        if (numberCourseChoice == -1) {
            return;
        }
        for (int i = 0; i < sizecourseOFMajorStudents; ++i) {
            if (numberCourseChoice == i) {
                student[findStudent].addCourse(courseOFMajorStudents[i]);
                student[findStudent].courseCounter++;
            }
        }
    }

    /*
   
   Greade Modify Registration.....
   
   
     */
    private static void modifyRegistration() {

        int findStudent = SearchForStudent();

        Cours courseOFMajorStudents[] = new Cours[21];

        int sizecourseOFMajorStudents = 0;

        //delete for all elements of array 
        for (int i = 0; i < courseOFMajorStudents.length; ++i) {
            courseOFMajorStudents[i] = null;
        }
        // find the course the same major of stdents 
        for (int i = 0; i < Cours.courseCounter; ++i) {
            if (cours[i].getMajor().equals(student[findStudent].getStudentMajor())) {
                courseOFMajorStudents[sizecourseOFMajorStudents] = cours[i];
                ++sizecourseOFMajorStudents;
            }
        }

        String courseOFMajorStudentsExits = "";
        String RegisteredOrNotRegistered = null;
        for (int i = 0; i < sizecourseOFMajorStudents; ++i) {
            courseOFMajorStudentsExits += i + 1 + "- " + courseOFMajorStudents[i].getNumber()
                    + " " + courseOFMajorStudents[i].getName() + " ["
                    + courseOFMajorStudents[i].getCrediHourse() + "credit]";

            int find = 0;
            for (int j = 0; j < student[findStudent].getNumberOfCourse(); ++j) {
                if (student[findStudent].getCourse()[j].getName().
                        equals(courseOFMajorStudents[i].getName())) {
                    find = 1;
                }
            }

            if (find == 1) {
                courseOFMajorStudentsExits += "(Registered )" + "\n";
            } else {
                courseOFMajorStudentsExits += "(Not Registered )" + "\n";
            }
        }
        String processAddORDropChoice = JOptionPane.showInputDialog(null,
                "What you want to modify ?" + "\n"
                + "a. Add course for Student." + "\n"
                + "d. Drop course for Student." + "\n"
                + "r. Return to the main menu." + "\n"
                + "Enter your choice [a Add, d Drop, r Return]:");

        if (processAddORDropChoice.equals("r")) {
            return;
        }

        String optionNumberChoice = JOptionPane.showInputDialog(null, "The current registered and not registered Course list of "
                + student[findStudent].getStudentMajor() + " major"
                + "\n" + courseOFMajorStudentsExits + "0. Return to a main menu\r\n"
                + "The total registered credit hours is [" + student[findStudent].getTotalCreditHoursRegistration() + "]." + "\n"
                + "plasee choice the number of course to " + (processAddORDropChoice.equals("a") ? "Add" : "Drop"));

        int numberOptionNumberChoice = Integer.parseInt(optionNumberChoice);
        numberOptionNumberChoice = numberOptionNumberChoice - 1;
        if (processAddORDropChoice.equals("a")) {
            student[findStudent].addCourse(courseOFMajorStudents[numberOptionNumberChoice]);
        }
        if (processAddORDropChoice.equals("d")) {
            student[findStudent].dropCourse(courseOFMajorStudents[numberOptionNumberChoice]);

        }

    }

// دالة لبحث عن رقم الطالب..
    public static int SearchForStudent() {
        int find = 0;
        String NumberOfStudent = JOptionPane.showInputDialog(null, "ادخل رقم الطالب:");
        int idStudent = Integer.parseInt(NumberOfStudent);
        int findStudent = -1;

        for (int i = 0; i < Student.sizestedent; ++i) {
            if (idStudent == student[i].getStudentNumber()) {
                findStudent = i;
                break;
            }
        }      // end for loop

        if (findStudent >= 0) {
            JOptionPane.showMessageDialog(null, "  رقم الطالب: " + student[findStudent].getStudentNumber()
                    + ",اسم الطالب " + student[findStudent].getStudentName()
                    + ",التخصص: " + student[findStudent].getStudentMajor());
        } else {
            //  students not find 
            String againSearch = JOptionPane.showInputDialog(null, "الطالب غير موجود هل تريد المحاولة ؟(yes/no)?");
            if (againSearch.equals("yes")) {
                SearchForStudent();
            } else {
                MainMenu();
            }
        }

        return findStudent;
    }

    // دالة طباعة جدول محاضرات التابع لطالب الذي تم اختياره
    public static void printStudentSchedule() {

        int findStudent = SearchForStudent();
        Cours CourseOfStudent[] = student[findStudent].getCourse();
        String StudentSchedule[][] = new String[7][7];
        Cours c = new Cours();
        int n = 0;
        String[] day = {"Sat",
            "Sun",
            "Mon",
            "Tue",
            "Wed",
            "Thu",
            "Fri"};
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {

                StudentSchedule[i][j] = "-";
            }
        }
        for (int f = 0; f < student[findStudent].getNumberOfCourse(); ++f) {

            for (int i = 0; i < StudentSchedule.length; ++i) {

                for (int j = 0; j < StudentSchedule[i].length; ++j) {
                    for (int course = 0; course < student[findStudent].courseCounter; course++) {
                       for (int credit = 0; credit < student[findStudent].getCorse()[course].getCrediHourse(); credit++) {
                            if (student[findStudent].getCorse()[course].getTime()[course].getDay() !=day[findStudent]) {
                              
                             StudentSchedule[i][j] = student[findStudent].getCorse()[course].getName();
                                 
                            }  
                                
                                }
                    }

                }
            }

        }

        JTextArea t = new JTextArea();
        String output = "Day" + "\t" + "8-9" + "\t" + "9-10" + "\t" + "10-11" + "\t" + "11-12" + "\t"
                + "12-1" + "\t" + "1-2" + "\t" + "2-3" + "\n";
        for (int i = 0; i < StudentSchedule.length; ++i) {
            output += day[i] + "\t";
            for (int j = 0; j < StudentSchedule[i].length; ++j) {
                output += StudentSchedule[i][j] + "\t";
            }
            output += "\n";
        }
        t.setText(output);
        JOptionPane.showMessageDialog(null, t);

    }

}


/*

Engieneer Anas Omar Obaid.....

 */
 
/// تم بحمد الله انجاز المشروع ///



