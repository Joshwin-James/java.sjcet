

class Book {
    String title;
    String author;
    final int bookID;
    static int bookCounter = 1000;
    static final String LIBRARY_NAME = "Central Library";
    
    Book() {
        this.title = "No title";
        this.author = "Unknown";
        this.bookID = bookCounter++;
    }
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.bookID = bookCounter++;
    }
    
    public void displayInfo() {
        System.out.println("Title: " + title );
        System.out.println("Author: " + author);
        System.out.println("ID: " + bookID);
    }
    
    public void displayInfo(boolean showLibrary) {
    	 System.out.println("Title: " + title );
         System.out.println("Author: " + author);
         System.out.println("ID: " + bookID);
        if (showLibrary) {
            System.out.println("Library: " + LIBRARY_NAME);
        }
    }
    
    public static void displayTotalBooks() {
        System.out.println("Total books: " + (bookCounter - 1000));
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "Sarju S");
        Book book3 = new Book("Data Structures", "Chintu Maria");
        
        book1.displayInfo();
        book2.displayInfo(true);
        book3.displayInfo(false);
        
        Book.displayTotalBooks();
    }
}