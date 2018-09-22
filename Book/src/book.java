import java.util.Scanner;

public class book {
private int id ;
private String titel ;
private String author ;

public book() {
}

public book(int id, String titel, String author) {
	this.id = id;
	this.titel = titel;
	this.author = author;
}

public boolean equals (book b) {
	return this.titel.equals(b.titel)  && this.author.equals(b.author) ;
}

public void print () {
	System.out.println("the title " +this.titel  
			+"/n"+ "the author " +this.author + "/n"+"the id " +this.id);
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitel() {
	return titel;
}

public void setTitel(String titel) {
	this.titel = titel;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}




}
class tset{
	public static void main (String args []) {
		Scanner input=new Scanner (System.in);
		book b [] =new book [100];
		int sizeBook =0 ;
		String a ="yes" ;
		do {
			System.out.println("Enter The id of book");
			int id =input.nextInt();
			System.out.println("Enter The title of book");
			String title =input.next();
			System.out.println("Enter The author of book");
			String author =input.next();
			b[sizeBook]=new book(id,title,author);
			++sizeBook ;
			System.out.println("ُEnter another  book?yes/no");
			 a =input.next();}while(a.equals("yes"));
			 				
		
		for(int i=0 ;i<sizeBook ;++i) {
			b[i].print();}
		
	if(	b[0].equals(b[sizeBook-1])) {
		System.out.println("Two similar books" );
	}
		
	}
}