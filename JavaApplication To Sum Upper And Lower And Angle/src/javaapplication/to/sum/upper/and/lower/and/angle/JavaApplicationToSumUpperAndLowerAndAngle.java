package javaapplication.to.sum.upper.and.lower.and.angle;

import java.util.*;

 class JavaApplicationToSumUpperAndLowerAndAngle {

    public static void main(String[] args) {
    
        int Array [][] = new int[2][2];
      int sumApper = 0 ;
      int sumLower = 0 ;
      int sumAngle = 0 ;
      Scanner Input = new Scanner(System.in);
      for(int i = 0 ; i < Array.length ; i ++)
          for(int j = 0 ; j < Array[i].length ; j ++) {
         
              System.out.print("Enter Your Nummber  "  );   
           
           Array[i][j] = Input.nextInt();    }
   
      for(int i = 0 ; i < Array.length ; i ++)
          for(int j = 0 ; j < Array[i].length ; j ++) {
    if(i==j)
       sumAngle +=  Array[i][j];
    else if(i<j)
        sumApper += Array[i][j];
    else 
        sumLower +=Array[i][j];
          }
   System.out.println("The Apper Is "+sumApper); 
    System.out.println("The Angle Is "+sumApper);
    System.out.println("The Lower Is "+sumLower);}
 }