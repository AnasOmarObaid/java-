
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

 class test {	
public static void main(String args []) {
	MainMenu() ;
	
        } // end main methed
//=============================================================================================


public static  void MainMenu() {
	Registration  reg =new Registration() ;

	String Menu ="1. Add a new Student.\r\n" + 
			"2. Add a new Course.\r\n" + 
			"3. Register a Course for a Student.\r\n" + 
			"4. Modify a Student Registration.\r\n" + 
			"5. Print a Student Schedule.\r\n" + 
			"6. Exit The System.\r\n"+
			" Enter Your choice:";
	while(true) {
		String NumberChoice =JOptionPane.showInputDialog(null , Menu) ;
		int numberChoice =Integer.parseInt(NumberChoice ); 
		switch(numberChoice) {
		case 1 :reg.addStudent() ;break ;
		case 2:reg.addCourse();break ;
		case 3: reg.registerCourse() ;break ;
		case 4: reg.modifyStudentRegistration() ;break ;
		case 5:reg.printStudentSchedule() ;break ;
		case 6:System.exit(1);break;
		default :JOptionPane.showMessageDialog(null, "Plasse Enter number betwwen 1 & 6");
		}// ens switch
	    }// end while	
	
}// end methed mainMenu




      }// end class
