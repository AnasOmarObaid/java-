
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Registration {
	 student [] std =new student [1000] ;
	  Course course [] = new Course [1000];
	  int sizeStudents=0 ;
	  int sizeCourse =0 ;
	// ==============================================================================
	//دالة اضافة الطلاب 
	 public  void addStudent() {
	 	       String name =JOptionPane.showInputDialog(null,"Enter the name of Student");
	 	       int ID=CheekNumberOfStudet();
	 	       String StudentMajor =JOptionPane.showInputDialog(null,"Enter the major of Student");
	 	       Course[] listCoures = null;
	 	     	student s= new student (ID , name , StudentMajor ,listCoures ) ;
	 	       std [sizeStudents] =s; 
	 	       ++sizeStudents ;
	 			JOptionPane.showMessageDialog(null, "Student successfully added");
	 	       } // end function addStudent


	 //============================================================================================= 

	 //دالة لفحص الطالب قبل اضافته اذا كان موجود مسبقا ام لا 
	 public  int CheekNumberOfStudet() {
	 	boolean chcek =true ;
	 	 int ID =0 ;
	 	while(chcek) {
	     String NumberOfStudent =JOptionPane.showInputDialog(null,"Enter the number of Student");
	     ID=Integer.parseInt(NumberOfStudent);
	     int find =0 ;
	 	for(int i=0 ; i<sizeStudents; ++i) {
	 		if(std[i].getStudentNumber()==ID) {
	 			find=1;}}
	 	
	 	if(find==1) {
	 		JOptionPane.showMessageDialog(null, "not add two students the same Id");	}
	 	else {
	 		chcek=false ; ;
	 	}  }
	 	return ID;

	                       }// end function CheekNumberOfStudet


	 //=============================================================================================


	 //دالة اضافة دورة أو مادة جديدة
	 public  void addCourse() {
	   String name =JOptionPane.showInputDialog(null,"Enter the name of course");
	   String NumberOfCourse =CheekNumberOfCourse();
	   String courseCreditHours =JOptionPane.showInputDialog(null,"Enter the course Credit Hours");
	   String major =JOptionPane.showInputDialog(null,"Enter the major of course");
	   int CourseCreditHours=Integer.parseInt(courseCreditHours);
	   boolean[][] t =new boolean [7][7] ;
	   for (int i=0 ;i<t.length ; ++i) {
	 		for(int j=0 ;j<t[i].length ;++j) {
	 			t[i][j]=false ;  }}
	 		
	   Course c =new Course(NumberOfCourse, name,CourseCreditHours ,
	   		major , t );
	   // استدعاء دالة لفحص وقت الدورة مناسب ام يوجد تعارض 

	 	cheekTimeOfCourse(c) ;
	 	course [sizeCourse] =c; 
	       ++sizeCourse ;
			JOptionPane.showMessageDialog(null, "Course successfully added");	      
			}// ens function addCourse

	 //=============================================================================================


	 //دالة لفحص المادة قبل اضافته اذا كان موجود مسبقا ام لا 
	 public  String CheekNumberOfCourse( ) {
		 String NumberOfCourse="";
		 boolean cheak =true ;
		 while(cheak) {
	  NumberOfCourse =JOptionPane.showInputDialog(null,"Enter the number of course");

	 	int find =0 ;
	 	for(int i=0 ; i<sizeCourse; ++i) {
	 		if(course[i].getCourseNumber().equals(NumberOfCourse)) {
	 			find=1;}}
	 	
	 	if(find==1) {
	 		JOptionPane.showMessageDialog(null, "not add two course the same number");	}
	 	else {
	 		cheak=false;
	 			}
		                   }// end  while loop 
		
		return NumberOfCourse;
	                       }// end function CheekAddCourse

	 //=============================================================================================


	 //دالة لفحص وقت الدورة مناسب ام لا
	 public   void cheekTimeOfCourse(Course c) {
	 	 boolean TimeCourse [] [] = new boolean [7][7];
	 	for (int i=0 ;i<TimeCourse.length ; ++i) {
	 		for(int j=0 ;j<TimeCourse[i].length ;++j) {
	 			TimeCourse[i][j]=false ;
	 		}
	 	}
	 	int findTwoCourseTheSameTime=0 ;
	 	   boolean choiceTimeOfCourse =true ;
	 	    int i =1  ;
	 	    while(choiceTimeOfCourse || i<=c.getCourseCreditHours()) {
	 	    	int numberOfDay = 0;
	 	    String timeDay="Select Lecturer Time [day]:\r\n" + 
	 	    		"1. Sat.\r\n" + 
	 	    		"2. Sun.\r\n" + 
	 	    		"3. Mon.\r\n" + 
	 	    		"4. Tue.\r\n" + 
	 	    		"5. Wed.\r\n" + 
	 	    		"6. Thu.\r\n" + 
	 	    		"7. Fri.\r\n" +
	 	    		"Enter Your choice:";
	 	    String day =JOptionPane.showInputDialog(null,timeDay);
	 	     numberOfDay = Integer.parseInt(day);
	 	    String dayChoice =null ;
	 	    //  ااختيار اليوم 
	 	    switch(numberOfDay) {
	 	    case 1 :dayChoice="Sat" ; break ;
	 	    case 2 :dayChoice="Sun" ; break ;
	 	    case 3 :dayChoice="Mon" ; break ;
	 	    case 4 :dayChoice="Tue" ; break ;
	 	    case 5 :dayChoice="Wed" ; break ;
	 	    case 6 :dayChoice="Thu" ; break ;
	 	    case 7 :dayChoice="Fri" ; break ; }
	 	    // اختار الوقت 
	 	    String timeMenu ="Select Lecture Time [hour] for "+ dayChoice + ". day\r\n" + 
	 	    		"1. 8-9\r\n" + 
	 	    		"2. 9-10\r\n" + 
	 	    		"3. 10-11\r\n" + 
	 	    		"4. 11-12\r\n" + 
	 	    		"5. 12-1\r\n" + 
	 	    		"6. 1-2\r\n" + 
	 	    		"7. 2-3\r\n" + 
	 	    		"Enter Your choice:" ;
	 	    String time =JOptionPane.showInputDialog(null,timeMenu);
	 	    int timeChoice = Integer.parseInt(time);
	 	    // اذا اختار المستخدم يوم الجمعة 
	 	    if(numberOfDay==7) {
	 	    	 JOptionPane.showMessageDialog(null, "not work at AL-Azhar University at fri day");
	 	     } //end else 
	 	    // اذا اختار المستخدم اى يوم عدا الجمعة
	 	     else {
	 	    	 // للفحص اذا كان هنالك تعارض بالمواعيد ا
	 	    	 for(int k=0 ;k<sizeCourse ;++k) {
	 	    		 if(course[k].getCourseMajor().equals(c.getCourseMajor()) && 
	 	    				 course[k].getTimeOfCourse()[numberOfDay-1][timeChoice-1]==true) {
	 	    			 findTwoCourseTheSameTime=1; 
	 	    		 }// end if 		 
	 	    	     }// end for loop
	 	    	 //  يوجد تعارض بالمواعيد 
	 	    	 if( findTwoCourseTheSameTime==1) {
	 	    		// System.out.println( TimeCourse [numberOfDay][timeChoice] +"1");
	 		    	 JOptionPane.showMessageDialog
	 		    	 (null, "Time is not appropriate, there is a lecture at the same time");
	 	    	 }// end else
	 	    	 // لا يوجد تعارض بالمواعيد 
	 	    	 else {
	 	    		// System.out.println( TimeCourse [numberOfDay][timeChoice] +"2");
	               if( c.getTimeOfCourse() [numberOfDay-1][timeChoice-1] ==false) {
	             	  TimeCourse [numberOfDay-1][timeChoice-1] =true ;   
	           	      c.setTimeOfCourse(TimeCourse);
	 	                   ++i ;
	 		              choiceTimeOfCourse=false ; }
	               else {
	             	  JOptionPane.showMessageDialog
	  		    	 (null, "Time is not appropriate, there is a lecture at the same time"); }  // end else
	          
	 	    }// end else
	 	    }// end else 
	 	    findTwoCourseTheSameTime=0 ;
	 	    } //end while loop
	     }//end function cheekTimeOfCourse


	

	 //=============================================================================================


	 //دالة تسجيل دورات 
	 public  void registerCourse() {
	int findStudent= SearchForStudent() ;
	 //delete for all elements of array i
	 Course courseOFMajorStudents []= new Course [21] ;
	 for(int i=0 ; i<courseOFMajorStudents.length ;++i) {
	 	courseOFMajorStudents[i]=null ;
	 }
	 int sizecourseOFMajorStudents=0  ;
	 //تحزين دروات التى بنفس مجال الطالب 
	 
         for(int i=0 ;i<sizeCourse ; ++i) {
	 	if(course[i].getCourseMajor().equals(std[findStudent].getStudentMajor())) {
	 		courseOFMajorStudents[sizecourseOFMajorStudents]=course[i];
	 		++sizecourseOFMajorStudents ;
	 	}} // end for loop
// جعل دورات الطالب بنص 
	 String courseOFMajorStudentsExits ="" ;
	 for(int i=0 ;i<sizecourseOFMajorStudents ; ++i) {
	 	courseOFMajorStudentsExits += i+1 + "- "+ courseOFMajorStudents[i].getCourseNumber()
	 		+" "	+ courseOFMajorStudents[i].getCourseName() + " [" +
	 		courseOFMajorStudents[i].getCourseCreditHours() +"credit]" +"\n" ;
	    }
// جمل الادخال 
	 String courseChoice=JOptionPane.showInputDialog(null,std[findStudent].getStudentMajor()+" course" 
	 +"\n" + courseOFMajorStudentsExits +"0. Return to a main menu\r\n" + 
	 		"Enter your choice") ;
	 int numberCourseChoice =Integer.parseInt(courseChoice);
	 numberCourseChoice=numberCourseChoice-1;
	 //فحص ماذا اختار المسنخدم
	 if(numberCourseChoice==-1) {
	 	return ;
	 }
	 for(int i=0 ;i<sizecourseOFMajorStudents;++i) {
	 	if(numberCourseChoice==i) {
	 		//System.out.println(courseOFMajorStudents[i].getCourseName());
	 			std[findStudent].addCourse(courseOFMajorStudents[i]);
	 	}}
	 	}     // end function registerCourse


	

	//=============================================================================================

	 //دالة تعديل تسجيل الطالب 
	 public  void modifyStudentRegistration() {
	 int findStudent=SearchForStudent() ;
	 	
	 	Course courseOFMajorStudents []= new Course [21] ;
	 	int sizecourseOFMajorStudents=0  ;

	 	//delete for all elements of array 
	 	for(int i=0 ; i<courseOFMajorStudents.length ;++i) {
	 		courseOFMajorStudents[i]=null ;
	 	} 
	 	// find the course the same major of stdents 
	 	for(int i=0 ;i<sizeCourse ; ++i) {
	 		if(course[i].getCourseMajor().equals(std[findStudent].getStudentMajor())) {
	 			courseOFMajorStudents[sizecourseOFMajorStudents]=course[i];
	 			++sizecourseOFMajorStudents ;	}}  // ens lopp
	 	
	 	String courseOFMajorStudentsExits ="" ;
	 	String RegisteredOrNotRegistered =null ;
	 	for(int i=0 ;i<sizecourseOFMajorStudents ; ++i) {
	 		courseOFMajorStudentsExits += i+1 + "- "+ courseOFMajorStudents[i].getCourseNumber()
	 			+" "	+ courseOFMajorStudents[i].getCourseName() + " [" +
	 			courseOFMajorStudents[i].getCourseCreditHours() +"credit]"  ;
	 		
	 		int find =0 ;
	 		for(int j=0 ;j<std[findStudent].getNumberOfCourse(); ++j) {
	 			if(std[findStudent].getCourse()[j].getCourseName().
	 					equals(courseOFMajorStudents[i].getCourseName())) {
	              find=1;			}}
	 		if(find==1) {
	 			courseOFMajorStudentsExits +="(Registered )"+"\n";
	 		}
	 		else {
	 			courseOFMajorStudentsExits +="(Not Registered )"+ "\n";}
	 	}
	 	String  processAddORDropChoice=JOptionPane.showInputDialog(null,
	 			 "What you want to modify ?" +"\n"+
	 					"A. Add course for Student." +"\n"+
	 					"D. Drop course for Student." + "\n" +
	 					"R. Return to the main menu." + "\n" +
	 					"Enter your choice [A Add, D Drop, R Return]:" 	);
	 	
	 	  if(processAddORDropChoice.equals("r")) {
	 			return ;
	 		    }

	String  optionNumberChoice=JOptionPane.showInputDialog
	   (null,"The current registered and not registered Course list of " 
	     +std[findStudent].getStudentMajor()+" major" 
		+"\n" + courseOFMajorStudentsExits +"0. Return to a main menu\r\n" + 
	 	"The total registered credit hours is ["+ std[findStudent].getTotalCreditHoursRegistration() +"]."+"\n" + 
	 	"plasee choice the number of course to " + (processAddORDropChoice.equals("a") ?"Add" :"Drop") ) ;
	 	
	 	int numberOptionNumberChoice =Integer.parseInt(optionNumberChoice) ;
	 	numberOptionNumberChoice=numberOptionNumberChoice-1 ;
	 	if(processAddORDropChoice.equals("a")) {
	 	std[findStudent].addCourse(courseOFMajorStudents[numberOptionNumberChoice]);	
	 	}
	  if(processAddORDropChoice.equals("d")) {
	  	std[findStudent].dropCourse(courseOFMajorStudents[numberOptionNumberChoice]);	
	 	
	 	}

	 } // end function

	 //======================================================================================================


	 // دالة طباعة جدول محاضرات التابع لطالب الذي تم اختياره
	 public  void printStudentSchedule() {
	 int findStudent=SearchForStudent() ;
	 	
	 Course	CourseOfStudent [] =std[findStudent].getCourse() ;
	 String StudentSchedule [][]= new String [7][7];
	 for(int i=0 ;i<7 ;++i) {
	 	for(int j=0 ;j<7; ++j) {
	 		StudentSchedule [i][j]="-";
	 	}
	 }
	
	 for(int f=0 ;f<std[findStudent].getNumberOfCourse();++f) {
	 for(int i=0 ; i<StudentSchedule.length ;++i) {
	 	for(int j=0 ;j<StudentSchedule[i].length; ++j) {
	 		if(std[findStudent].getCourse()[f].getTimeOfCourse()[i][j]==true) {
	 			StudentSchedule[i][j]=std[findStudent].getCourse()[f].getCourseName() ;
	 		}
	 	}
	 }}
	 String [] day ={"Sat" ,
	 "Sun" ,
	 "Mon",
	 "Tue",
	 "Wed",
	 "Thu",
	 "Fri"};
	
	 JTextArea t =new JTextArea ( ) ;
	 String output="Day"+"\t"+"8-9"+"\t"+"9-10"+"\t"+"10-11"+"\t"+"11-12"+"\t"
	 +"12-1"+"\t"+"1-2"+"\t"+"2-3"+"\n";
	 for(int i=0 ; i<StudentSchedule.length ;++i) {
	 	output+= day[i] +"\t" ;
	 	for(int j=0 ;j<StudentSchedule[i].length; ++j) {
	 		output+=StudentSchedule[i][j] +"\t";
	 	}
	 output+="\n";
	 	}
	 t.setText(output);
	 JOptionPane.showMessageDialog(null, t);
	 }

	 //=============================================================================================
	 
	 public int SearchForStudent() {
			int find =0 ;
			 String NumberOfStudent =JOptionPane.showInputDialog(null,"Enter student number:");
			 int idStudent =Integer.parseInt(NumberOfStudent);
			 int findStudent= -1 ;
			 //lopp to find index of students 
			 for(int i=0 ;i<sizeStudents ; ++i ) {
			 	if(idStudent==std[i].getStudentNumber()) {
			 		findStudent=i ;
			 		break ;     }}      // end for loop

			 if(findStudent>=0) {
			 	JOptionPane.showMessageDialog(null, "  The student no: " +std[findStudent].getStudentNumber() +
			 			",The student name: " + std[findStudent].getStudentName()
			 			+",Major: "+std[findStudent].getStudentMajor());  }

			 else {
			 	//  students not find 
			 	String againSearch =JOptionPane.showInputDialog(null, "The student is not exits, Do you want try again(yes/no)?");
			 	if(againSearch.equals("yes")) {
			 		SearchForStudent();
			 	}
			 	else {
		         test.MainMenu() ;  }}  
			// end else
			 return findStudent ;
	            }// end function

   

}
