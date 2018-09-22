import java.util.*;
class Student {

    private static void breack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    private String name ;
    private int id ;
    private int avg;
    
    public Student(String name, int id, int avg) {
        this.name = name;
        this.id = id;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }
public void print(){
    
    System.out.println("The name is <: "+name);
    System.out.println("The Id is <: "+id);
    System.out.println("The avg is <: "+avg);
    System.out.println("===============================   ");}


    public static  void main (String []args){
Student ob[] = new Student[3];
   Scanner input = new Scanner(System.in);
   for(int i = 0 ; i <ob.length ; ++i){
System.out.print("The Name of Student" + "["+(i+1)+"]"+" <: ");
String n = input.next();
System.out.print("The Number of Student" + "["+(i+1)+"]"+" <: ");
int a = input.nextInt();
System.out.print("The Id of Student" + "["+(i+1)+"]"+" <: ");
int z = input.nextInt();
ob[i]= new Student( n , a , z);
   System.out.println("=====================");
   }
   for(int i = 0 ; i <ob.length ; ++i){
   while(ob[i].id == ob[i+1].getId()){
       System.out.println("This ID Is Aredy Exixt >:");
  System.out.print("Plese Enter another Id <:: ");
  int a = input.nextInt();
  ob[i].setId(a);
  if(ob[i].id != ob[i+1].getId()){
       breack();   }
         } }
   Student max = ob[0];
   for(int i = 0 ; i <ob.length ; ++i){
       if(max.getAvg() < ob [i].getAvg())
        max = ob[i];   
   }
   
max.print();
    }}