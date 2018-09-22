
/*
Engineer Anas Omar Obaid
*/

class Cours {
public int numberOfCourseTimes = 0;
 static int timeConter=0;
 static int courseCounter =0;
String  number;
  String name;  
  String major;  
  int crediHourse;
CoorsTime time [];
    private boolean timeOfCourse [][];

    public static int getTimeConter() {
        return timeConter;
    }

    public static void setTimeConter(int timeConter) {
        Cours.timeConter = timeConter;
    }

    public static int getCourseCounter() {
        return courseCounter;
    }

    public static void setCourseCounter(int courseCounter) {
        Cours.courseCounter = courseCounter;
    }


 
  
public Cours(String number, String name, String major, int crediHourse,CoorsTime time[] ) {
        
    this.number = number;
    this.name = name;
    this.major = major;
    this.crediHourse = crediHourse;
     this.time = time;
     
}

   
public Cours(){
    
}


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCrediHourse() {
        return crediHourse;
    }

    public void setCrediHourse(int crediHourse) {
        this.crediHourse = crediHourse;
    }

    public CoorsTime[] getTime() {
        return time;
    }

    public void setTime(CoorsTime[] time) {
        this.time[0] = time[0];
    this.time[1] = time[1];
this.time[2] = time[2];    
    this.time[3] = time[3];
    }
 
    public int getNumberOfCourseTimes() {
        return numberOfCourseTimes;
    }

    public void setNumberOfCourseTimes(int numberOfCourseTimes) {
        this.numberOfCourseTimes = numberOfCourseTimes;
    }
    
  
    /*
 test method
 */
 
    public void printCourseData() {
 String day = "", hour = "";
 for (int i = 0; i < this.numberOfCourseTimes; i++) {
 day += this.time[i].getDay() + ", " + this.time[i].getHour() +
"\n";
 }
 javax.swing.JOptionPane.showMessageDialog(null, this.name + "\n" +
this.number + "\n" + this.major + "\n" + this.crediHourse + "\n" +
day);
 }

} 