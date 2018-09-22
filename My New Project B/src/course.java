
 class Course {
private String courseNumber ;
 private String courseName ;
private int courseCreditHours;
private String courseMajor ;
 private boolean timeOfCourse [][] ;
 
 //=========================================================================================
public Course(String courseNumber, String courseName, int courseCreditHours, String courseMajor,
		boolean[][] timeOfCourse) {
	super();
	this.courseNumber = courseNumber;
	this.courseName = courseName;
	this.courseCreditHours = courseCreditHours;
	this.courseMajor = courseMajor;
	this.timeOfCourse = new boolean [7][7];
	

	
}

public String getCourseNumber() {
	return courseNumber;
}

public void setCourseNumber(String courseNumber) {
	this.courseNumber = courseNumber;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseCreditHours() {
	return courseCreditHours;
}

public void setCourseCreditHours(int courseCreditHours) {
	this.courseCreditHours = courseCreditHours;
}

public String getCourseMajor() {
	return courseMajor;
}

public void setCourseMajor(String courseMajor) {
	this.courseMajor = courseMajor;
}

public boolean[][] getTimeOfCourse() {
	return timeOfCourse;
}

public void setTimeOfCourse(boolean[][] timeOfCourse) {
	this.timeOfCourse = timeOfCourse;
}



}
