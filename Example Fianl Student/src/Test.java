
import java.util.Scanner;

public class Test {
public static String Ask ;
    public static void main(String []args){

      do {
    
       int marks [] = new int [5];
  Student student[] = new Student[100];
  
  Scanner Input = new Scanner(System.in);
  int size = 0 ;
  System.out.println("Enter Id Of The Student");
  int I = Input.nextInt();
  System.out.println("Enter Name Of The Student");
  String na = Input.next();
  System.out.println("Enter age Of The Student");
  int a = Input.nextInt();
  for(int i = 0 ; i < marks.length ; i ++)
  {
      System.out.println("Enter Mark Of The Student"+"The Mark"+(i+1));
  marks[i] = Input.nextInt();
  
  }
  student[size]= new Student(I,na,a,marks);
for(int i = 0 ; i < size ; i ++){
     System.out.print(student[i].getAvg());  
  System.out.print(student[i].greadAvg());
   }
  student[size].printInfo();
 
  size++;
  System.out.println("If  you To Add Anew Student Enter [Yes Or Y ]  ");
  Ask = Input.next();
  }while(Ask.equalsIgnoreCase("Yes"));
}
}