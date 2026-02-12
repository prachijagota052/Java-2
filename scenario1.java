// SCENARIO 1

import java.util.ArrayList;

class book{
    public String title;
    public String author;
    public String isbn;
    book(String title, String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
}

class library extends book{
    //doubt
    public library() {                                 
        super(null, null, null);
    }
    private ArrayList<book> books = new ArrayList<>();
    public void addbook(book b)
    {
        books.add(b);
    }
    public book searchbook(String title) 
    {
        //if(books.contains(title))
        //{
            for(book b:books)
            {
                if(b.title.equals(title))
                {
                    System.out.println("Book found: " + b.title);
                    return b;
                }
            }
            //int x= books.indexOf(title);
            //return books.get(x);
        //}
        System.out.println("Book not found");
        return null;
    }
    public void displayAllBooks() {
        for(book b:books)
        {
            System.out.println("Title: " + b.title); System.out.println("Author: " + b.author); System.out.println("ISBN: " + b.isbn); System.out.println(); }
        }
    }


public class scenario1 { 
    public static void main(String[] args) {
        book b1=new book("The Great Gatsby", "Fcott Fitzgerald", "0743273565");
        library lib =new library();
        lib.addbook(b1); 
        //lib.displayAllBooks(); 
        book b2=new book("To Kill a Mockingbird", "Harper Lee", "0061120081");
        lib.addbook(b2);
        lib.searchbook("The Great Gatsby");
        //lib.displayAllBooks();

     }
 }