
package newpojecta;

public class Course {
   
   private String courseNumber, courseName, courseMajor;
 private CourseTime courseTime[] = new CourseTime[4];
 private int courseCreditHours;
 private int numberOfCourseTimes = 0;
 public static int courseCounter = 0;
 public Course() {
 }
 public Course(String courseNumber, String courseName, String courseMajor,
CourseTime courseTime[], int courseCreditHours) {
 this.courseNumber = courseNumber;
 this.courseName = courseName;
 this.courseMajor = courseMajor;
 this.courseTime = courseTime;
 this.courseCreditHours = courseCreditHours;
 }
 /*
 Setters methods
 */
 public void setCourseNumber(String courseNumber) {
 this.courseNumber = courseNumber;
 }
 public void setCourseName(String courseName) {
 this.courseName = courseName;
 }
 public void setCourseMajor(String courseMajor) {
 this.courseMajor = courseMajor;
 }
 public void setcourseTime(CourseTime courseTime[]) {
 this.courseTime[0] = courseTime[0];
 this.courseTime[1] = courseTime[1];
 this.courseTime[2] = courseTime[2];
 this.courseTime[3] = courseTime[3];
 }
 public void setCourseCrefitHours(int courseCreditHours) {
 this.courseCreditHours = courseCreditHours;
 }
 public void setNumberOfCourseTimes(int n) {
 this.numberOfCourseTimes = n;
 }
 /*
 getters methods
 */
 public String getCourseNumber() {
 return this.courseNumber;
 }
 public String getCourseName() {
 return this.courseName;
 }
 public String getCourseMajor() {
 return this.courseMajor;
 }
 public CourseTime[] getCourseTime() {
 return this.courseTime;
 }
 public int getCourseCreditHours() {
 return this.courseCreditHours;
 }
 /*
 test method
 */
 public void printCourseData() {
 String day = "", hour = "";
 for (int i = 0; i < this.numberOfCourseTimes; i++) {
 day += this.courseTime[i].getDay() + ", " + this.courseTime[i].getHour() +
"\n";
 }
 javax.swing.JOptionPane.showMessageDialog(null, this.courseName + "\n" +
this.courseNumber + "\n" + this.courseMajor + "\n" + this.courseCreditHours + "\n" +
day);
 }
 //////////////////////////////
} 
    
    
    
    
    
    
    

