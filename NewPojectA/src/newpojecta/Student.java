
package newpojecta;

public class Student {
 private String studentNumber, studentName, studentMajor;
 private Course courseList[] = new Course[6];
 public static int studentCounter = 0;
 private int registeredCourses = 0;
 public Student() {
 }
 public Student(String studentNumber, String studentName, String studentMajor) {
 this.studentNumber = studentNumber;
 this.studentName = studentName;
 this.studentMajor = studentMajor;
 }

 public void setStudentNumber(String studentNumber) {
 this.studentNumber = studentNumber;
 }
 public void setStudentName(String studentName) {
 this.studentName = studentName;
 }
 public void setStudentMajor(String studentMajor) {
 this.studentMajor = studentMajor;
 }
 public void setCourseList(Course courseList[]) {
 this.courseList = courseList;
 }
 public void setCourse(Course course, int index) {
 this.courseList[index] = course;
 }
 public void setRegisteredCourses(int registerdCourses) {
 this.registeredCourses = registerdCourses;
 }
 /*
 getters methods
 */
 public String getStudentNumber() {
 return this.studentNumber;
 }
 public String getStudentName() {
 return this.studentName;
 }
 public String gerStudentMajor() {
 return this.studentMajor;
 }
 public Course[] getCourseList() {
 return this.courseList;
 }
 public String getStudentData() {
 return ("Name : " + this.studentName + "\nID : " + this.studentNumber +
"\nMajor : " + this.studentMajor);
 }
 public int getRegisteredCourses() {
 return this.registeredCourses;
 }
 /*
 test method
 */
 public void printStudentData() {
 javax.swing.JOptionPane.showMessageDialog(null, "Name : " + this.studentName +
"\nID : " + this.studentNumber + "\nMajor : " + this.studentMajor);

 }

}
