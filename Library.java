import java.util.ArrayList;

public class Library{
public ArrayList<Book> books;
public Library(){
    books = new ArrayList<Book>();
}
 public void addBook(Book book){
  books.add(book);
 }
 public  void checkoutBook(String isbn){
for(Book book : books){
    if (book.getIsbn().equals(isbn)) {
        if (book.isAvailable()) {
            book.checkout();
            System.out.println(book.getTitle() + " has been checked out.");
            return;
        } else {
            System.out.println(book.getTitle() + " is not available.");
            return;
        }
    }
}
System.out.println("No book found with ISBN: " + isbn);
}
 
 public  void returnBook(String isbn){
    for (Book book : books) {
        if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
            book.returnBook();
            System.out.println(book.getTitle() + " has been returned.");
            return;
        }
    }
    System.out.println("No book found with ISBN: " + isbn + " or book was not checked out.");
 }
 public void displayAvailableBooks(){
    System.out.println("Available books");
    for( Book book : books){
     if(book.isAvailable()){
      System.out.println(book);
}
    }
  }
}