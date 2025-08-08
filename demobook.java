package josh;
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,Double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displaydetails() {
		System.out.println("Title :"+title);
		System.out.println("Author :"+author);
		System.out.println("Price :"+price);
	}
}
class Ebook extends Book{
		double filesizeMB;
		Ebook(String title,String author,Double price,double filesizeMB){
			super(title,author,price);
			this.filesizeMB=filesizeMB;
		}
		public void displaydetails() {
			super.displaydetails();
			System.out.println("Filesize :"+filesizeMB);
		}
	
}
class Printedbook extends Book{
	int noofpages;
	Printedbook(String title,String author,Double price,int noofpages){
		super(title,author,price);
		this.noofpages=noofpages;
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("Number of Pages:"+noofpages);
	}

}
public class demobook {
	public static void main(String[]args) {
		Ebook book1 =new Ebook("Twin Towers","Osama",91.1,9.11);
		book1.displaydetails();
		System.out.println();
		Printedbook book2 =new Printedbook("Invade Poland","Hitler",19.47,194);
		book2.displaydetails();
	}

}
