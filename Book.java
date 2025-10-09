class Book {
    public String title;
    public String author;
    public int year;

    
    public Book(String title, String author, int year) {
        this.title = title;   
        this.author = author; 
        this.year = year;         }

    // display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title : " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year  : " + this.year);
    }

    // Main method to test the Book class
    public static void main(String[] args) {
      
        Book book1 = new Book("Malgudi days", "R.K Narayan", 1943);
        
  	// Display details of each book
        book1.displayDetails();
        System.out.println();
        
      }
}
