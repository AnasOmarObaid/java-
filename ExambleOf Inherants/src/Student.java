
public class Student extends Person{ 
// Person is the super class , Student is the subclass

		private float average;
		
		//Costructor
		public Student( String name,int id,float average){
			super(name,id);
			this.average= average;
		}
					
		//Getters//		
		public float getAvg(){
			return average;
		}
	
		//Other methods//
		
		//protected void print(){ //error: attempting to assign weaker access privileges; was public
		//void print(){ //error: attempting to assign weaker access privileges; was public
		public void print(){ //overridden method
			super.print(); //to keep the implementation of the Superclass print() method
			System.out.println ("\nAverage: "+average);	
		}
		
		public void print(int x){//overloaded method
			print(); //or super.print() 
			System.out.println ("\nAverage: "+average+" ,x= "+x);		
		}
}