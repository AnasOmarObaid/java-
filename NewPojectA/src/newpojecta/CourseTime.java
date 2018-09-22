
package newpojecta;

public class CourseTime {
  private String day, hour;
 public CourseTime(String day, String hour) {
 this.day = day;
 this.hour = hour;
 }
 public CourseTime(String day) {
 this.day = day;
 }
 /*
 setters methods
 */
 public void setDay(String day) {
 this.day = day;
 }
 public void setHour(String hour) {
 this.hour = hour;
 }
 /*
 getters methods
 */
 public String getDay() {
 return this.day;
 }
 public String getHour() {
 return this.hour;
    
    
    
}
}