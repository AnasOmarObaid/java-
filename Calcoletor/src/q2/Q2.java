
package q2;
import java.util.*;
public class Q2 {

    
    public static void main(String[] args) {
       StudentClass ob[] = new StudentClass[2];
  Scanner inp = new Scanner(System.in);  
    for (int i = 0;i<2;++i){
    System.out.print("Enter Name <: ");
String a = inp.nextLine();
    System.out.print("Enter Id <: ");
    int s = inp.nextInt();
    System.out.println("Enter Sub1 <: ");
  String b = inp.nextLine();  
    System.out.println("Enter Sub2 <: ");
   String z = inp.nextLine(); 
    ob[i]= new StudentClass(a,s,b,z);}
ob[0].getId();
   ob[1].getId(); }}