import java.util.ArrayList;


public class Library {
    ArrayList<Book> Books;
    public Library(){
        this.Books=new ArrayList<>();
    }
    public String addBook(Book book)
    {
        Books.add(book);
        System.out.println("ADDED");
        return "book added";
    }
    public void removeBook(Book book){
        Books.remove(book);
    }
    public Book findbyIsbn(String Isbn)
    {
        for(Book book: Books)
        {
            if(book.getIsbn()==Isbn)
            {
                return  book;

            }
        }
        return null;

    }
    public void displayAllBooks() {
        if (Books.isEmpty()) {
            System.out.println("The library has no books.");
        } else {
            System.out.println("List of books in the library:");
            for (Book book : Books) {
                System.out.println("Title: " + book.getName());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("ISBN: " + book.getIsbn());


            }
        }
    }
}
