
public class Student {
 int id , mark[];
 String name;
 int avg;
 int age;
 String grade;
public Student(int id , String name , int age , int mark[] ){
    this.id = id ; 
    this.mark  = mark ;
    this.name = name ;
    this.age = age ;  
}
public Student(){
    
}

public int getId(){
    return id ;
}

    public int[] getMark() {
        return mark;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

   

    public void setGrade(String grade) {
        this.grade = grade;
    }
public String greadAvg(){
  if(avg>=90){
      return "Exa";}
  else if(avg<90){
   return "vary Good";   
  }
  else if(avg<70){
     return " Good"; 
  }
return "Accept";
}

public double getAvg(){
  int sum = 0 ;
    for(int i = 0 ; i < mark.length ; i ++){
      sum+=mark[i];
  }  
return (sum/mark.length);


}

public void printInfo(){
  System.out.println("=====================");

    System.out.println("The Id Of The Student << "+id);
  System.out.println("The Name Of The Student << "+name); 
  System.out.println("The age Of The Student << "+age);  
   System.out.println("The Avg Of The Student Is << "+avg);  
    System.out.println("The Gread age Of The Student << "+grade);  
     
   System.out.println("=====================");
}
}
