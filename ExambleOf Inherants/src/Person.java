public class Person{
		String name ;
		int id;
	
		//Costructor
		public Person( String name,int id){
			this.name = name;
			this.id= id;
		}
			
		public Person( ){
		
		}			
			
		//Setters//	
		public void setName(String name){
			this.name = name;
		}
		
		public void setID(int id){
			this.id = id;
		}
					
		//Getters//		
		public String geName(){
			return name;
		}
		public int getID(){
			return id;
		}
			
		public void print(){
			System.out.println("\n***** Information*****");
			System.out.print ("Name : "+name+"\nID : "+id);	
		}
	
}