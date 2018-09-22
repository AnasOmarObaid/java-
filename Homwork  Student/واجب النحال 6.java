class Student {
private int Number ;
private String FirstName ;
private String LastName ;
private  double avg ;

public Student(int n , String F , String L , double a ) { 
Number = n ;
FirstName = F ;
LastName = L ;
avg = a ; }

public int getNumber() {
return Number ;}

public String getFirstName() {
return FirstName ; }

public String getLastName() {
return LastName ; }

public double getAvg() {
return avg ; } 

public void print() {
System.out.println();
System.out.println();
System.out.println("the number of the student is : " +Number);
System.out.println("the First name of the student is : " +FirstName);
System.out.println("the Last name of the student is : " +LastName);
System.out.println("the avg of the student is : " +avg); 
System.out.println();
System.out.println();
System.out.println();
System.out.println("***************************");
System.out.println();}

public static void main (String[] args) {
Student s1 = new Student(1,"Anas","omar",88);
Student s2 = new Student(2,"mohamed","eman",67);
Student s3 = new Student(3,"omar","aeman",87);
Student s4 = new Student(4,"yosef","bessan",78);
Student s5 = new Student(5,"mosuab","enas",87);
Student s6 = new Student(6,"amjad","reem",56);
s1.print();
s2.print();
s3.print();
s4.print();
s5.print();
s6.print();
}
}