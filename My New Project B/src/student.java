
import javax.swing.JOptionPane;

public class student {
private int studentNumber ;
private String studentName ;
private String studentMajor ;
private Course   course [] =new Course [21] ;
private  int numberOfCourse =0 ;
private int totalCreditHoursRegistration=0 ;

//=======================================================================================


 student(int studentNumber, String studentName, String studentMajor, Course[] course) {
	super();
	this.studentNumber = studentNumber;
	this.studentName = studentName;
	this.studentMajor = studentMajor;
	this.course = new Course [21] ;
}


//=======================================================================================


public int getStudentNumber() {
	return studentNumber;
}
//=======================================================================================


public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}
//=======================================================================================


public String getStudentName() {
	return studentName;
}


//=======================================================================================


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


//=======================================================================================


public String getStudentMajor() {
	return studentMajor;
}


//=======================================================================================


public void setStudentMajor(String studentMajor) {
	this.studentMajor = studentMajor;
}


//=======================================================================================


public Course[] getCourse() {
	return course;
}


//=======================================================================================


public void setCourse(Course[] course) {
	this.course = course;
}


//=======================================================================================



public  int getNumberOfCourse() {
	return numberOfCourse;
}


//=======================================================================================


public  void setNumberOfCourse(int numberOfCourse) {
	numberOfCourse = numberOfCourse;
}

//=======================================================================================


public int getTotalCreditHoursRegistration() {
	return totalCreditHoursRegistration;
}


//=======================================================================================


public void setTotalCreditHoursRegistration(int totalCreditHoursRegistration) {
	this.totalCreditHoursRegistration = totalCreditHoursRegistration;
}


//=======================================================================================
public void addCourse(Course c) {
	//لا يوجد دورات مسجلة لطالب اضفها دون فحص 
	if(this.numberOfCourse==0) {
		course[numberOfCourse]=c ;
		++numberOfCourse;
		totalCreditHoursRegistration=totalCreditHoursRegistration+c.getCourseCreditHours() ;
		JOptionPane.showMessageDialog(null, "The course ["+
				c.getCourseNumber() + 
				c.getCourseName() +"] registration is success" +"\n" +
				"The total credit hours is ["+ this.getTotalCreditHoursRegistration() +"]");
	}// end first if 
	// يوجد دورات مسجلة لدى طالب 
	else {
	int find =0 ;
	for(int i=0 ;i<numberOfCourse ;++i) {
		if(course[i].getCourseName().equals(c.getCourseName())) {
			find =1; } // end if  
		             }// end for loop
	//  دورة مسجلة مسبقا 
	if(find==1) {
		JOptionPane.showMessageDialog(null, "The course ["+
				c.getCourseNumber() + 
				c.getCourseName() +"] registration is already registered" +"\n"+
				"The total credit hours is ["+ this.getTotalCreditHoursRegistration() +"]");
                    } // end if
	// دورة غير مسجلة مسبقا 
	else {
	if(	totalCreditHoursRegistration <=21) {
	course[numberOfCourse]=c ;
	++numberOfCourse;
	totalCreditHoursRegistration=totalCreditHoursRegistration+c.getCourseCreditHours() ;
	JOptionPane.showMessageDialog(null, "The course ["+
			c.getCourseNumber() + 
			c.getCourseName() +"] registration is success" +"\n" +
			"The total credit hours is ["+ this.getTotalCreditHoursRegistration() +"]");
	         }  // end if 
	else {
		JOptionPane.showMessageDialog(null, "You can not add a cycle that exceeds the number of hours allowed");

	} // end else 3
	} // end else 2 
	} // end else 1
    } // end function


//=======================================================================================

// دالة حذف مادة مسجلة لدى الطالب
public void dropCourse(Course c) {
	int find =0 ;
	for(int i=0 ;i<numberOfCourse ;++i) {
		if(course[i].getCourseName().equals(c.getCourseName())) {
			find=1;
		}}
		if(find==0) {
			JOptionPane.showMessageDialog(null, "The course [ " +c.getCourseName() + " ] is Not registered");

		}
		else {
	for (int i = 0; i <numberOfCourse; i++) {
		// Delete Function
		if (c.getCourseName().equals(course[i].getCourseName())) {
		for (int j = i + 1; i < numberOfCourse - 1; j++) {
		course[i] = course[j];
		i++;
		}
		}
	    }// end loop 
		}// end else 
	totalCreditHoursRegistration=totalCreditHoursRegistration-c.getCourseCreditHours() ;
	--numberOfCourse ;
JOptionPane.showMessageDialog(null, "تمت عملية الحدف بنجاح", "ملاحظة ", 0);
	}// end function

//=======================================================================================


}
