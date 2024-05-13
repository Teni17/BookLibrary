public class Book{
String title;
String author;
String isbn;
boolean isAvailable;

 public Book(String t, String a,String isb, boolean isA){
this.title = t;
this.author = a;
this.isbn = isb;
this.isAvailable = isA;
}

public void checkout(){
isAvailable = false;
}

public void returnBook(){
isAvailable = true;
}

public String toString(){
    System.out.println("title is " + this.title);
    System.out.println("Book author is " + this.author) ;
    if(isAvailable == false){
        System.out.print("Book is not available");
    }
    else{
        System.out.print("Book is available");
    }
    return toString;
}
}