/*
Engineer Anas Omar Obaid

*/


import javax.swing.JOptionPane;

public class Student  {
    public int courseCounter = 0;
  CoorsTime  time [] = new CoorsTime[100];
    private  int numberOfCourse =0 ;
    int  studentNumber;
private String  studentName, studentMajor;
 private Cours corse[] = new Cours[1000];

   
 static int sizestedent = 0;
 private int registeredCourses = 0;
 private int totalCreditHoursRegistration=0 ;
 
 public Student() {
 }
  Student(int studentNumber, String studentName, String studentMajor,Cours corse[]) {
 this.studentNumber = studentNumber;
 this.studentName = studentName;
 this.studentMajor = studentMajor;
 this.corse = new Cours[22];
 }

  
    

    public Student(int studentNumber, String studentName, String studentMajor) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentMajor = studentMajor;
    }

  

 public void setStudentNumber(int studentNumber) {
 this.studentNumber = studentNumber;
 }
 public void setStudentName(String studentName) {
 this.studentName = studentName;
 }
 public void setStudentMajor(String studentMajor) {
 this.studentMajor = studentMajor;
 }
  void setCourseList(Cours courseList[]) {
 this.corse = courseList;
 }
  void setCourse(Cours course, int index) {
 this.corse[index] = course;
 }
 public void setRegisteredCourses(int registerdCourses) {
 this.registeredCourses = registerdCourses;
 }

public int getTotalCreditHoursRegistration() {
	return totalCreditHoursRegistration;
}


public void setTotalCreditHoursRegistration(int totalCreditHoursRegistration) {
	this.totalCreditHoursRegistration = totalCreditHoursRegistration;
}

/*
 getters methods
 */
 public int getStudentNumber() {
 return this.studentNumber;
 }
 public String getStudentName() {
 return this.studentName;
 }
 public String getStudentMajor() {
 return this.studentMajor;
 }
  Cours[] getCourseList() {
 return this.corse;
 }
 public String getStudentData() {
 return ("Name : " + this.studentName + "\nID : " + this.studentNumber +
"\nMajor : " + this.studentMajor);
 }
 public int getRegisteredCourses() {
 return this.registeredCourses;
 }
 
 
public  int getNumberOfCourse() {
	return numberOfCourse;
}

public  void setNumberOfCourse(int numberOfCourse) {
	numberOfCourse = numberOfCourse;
} 
 Cours[] getCourse() {
	return corse;
}


 void setCourse(Cours[] corse) {
	this.corse = corse;
}


/*
 test method
 */
 public void printStudentData() {
 javax.swing.JOptionPane.showMessageDialog(null, "Name : " + this.studentName +
"\nID : " + this.studentNumber + "\nMajor : " + this.studentMajor);
 }
 /////////////////

 public CoorsTime[] getTime() {
        return time;
    }

    public void setTime(CoorsTime[] time) {
        this.time = time;
    }

    public Cours[] getCorse() {
        return corse;
    }

    public void setCorse(Cours[] corse) {
        this.corse = corse;
    }

    public static int getSizestedent() {
        return sizestedent;
    }

    public static void setSizestedent(int sizestedent) {
        Student.sizestedent = sizestedent;
    }

 void addCourse(Cours c) {
	//لا يوجد دورات مسجلة لطالب اضفها دون فحص 
	if(this.numberOfCourse == 0) {
		corse[numberOfCourse]=c ;
		++numberOfCourse;
		totalCreditHoursRegistration=totalCreditHoursRegistration+c.getCrediHourse();
		JOptionPane.showMessageDialog(null, "The Course ["+
				c.getNumber() + 
				c.getName() +"] تمت عملية الاضافة بنجاح" +"\n" +
				"عدد الساعات الكلي  ["+ this.getTotalCreditHoursRegistration() +"]");
	}// end first if 
	// يوجد دورات مسجلة لدى طالب 
	else {
	int find =0 ;
	for(int i=0 ;i<numberOfCourse ;++i) {
		if(corse[i].getName().equals(c.getName())) {
			find =1; }  
		             }
	//  دورة مسجلة مسبقا 
	if(find==1) {
		JOptionPane.showMessageDialog(null, "The course ["+
				c.getName() + 
				c.getName() +"] هده المادة مضافة بلفعل" +"\n"+
				"عدد الساعات الكلي  ["+ this.getTotalCreditHoursRegistration() +"]");
                    } // end if
	// دورة غير مسجلة مسبقا 
	else {
	if(totalCreditHoursRegistration <=21) {
	corse[numberOfCourse]=c ;
	++numberOfCourse;
	totalCreditHoursRegistration=totalCreditHoursRegistration+c.getCrediHourse() ;
	JOptionPane.showMessageDialog(null, "The course ["+
			c.getName() + 
			c.getName() +"] تمت عملية الاضافة بنجاح" +"\n" +
			"عدد الساعاع الكلي ["+ this.getTotalCreditHoursRegistration() +"]");
	         }  // end if 
	else {
		JOptionPane.showMessageDialog(null, "You can not add a cycle that exceeds the number of hours allowed");

	} // end else 3
	} // end else 2 
	} // end else 1
    } // end function

// دالة حذف مادة مسجلة لدى الطالب
 
 void dropCourse(Cours c) {
	int find =0 ;
	for(int i=0 ;i<numberOfCourse ;++i) {
		if(corse[i].getName().equals(c.getName())) {
			find=1;
		}}
		if(find==0) {
			JOptionPane.showMessageDialog(null, "The course [ " +c.getName() + " ] is Not registered");

		}
		else {
	for (int i = 0; i <numberOfCourse; i++) {
		// Delete Function
		if (c.getName().equals(corse[i].getName())) {
		for (int j = i + 1; i < numberOfCourse - 1; j++) {
		corse[i] = corse[j];
		i++;
		
                }
		}
	    }// end loop 
		}// end else 
	totalCreditHoursRegistration=totalCreditHoursRegistration-c.getCrediHourse() ;
	--numberOfCourse ;
	JOptionPane.showMessageDialog(null,"تم الحدف بنجاح","ملاحظة",1);
	}// end function

//=======================================================================================

}





