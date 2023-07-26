public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("title 1", "ashwini", "123456");
        Book book2 = new Book("title 1", "ashwini", "123456");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        
        library.findbyIsbn("123456");
        library.displayAllBooks();
        System.out.print(book1.getAuthor());
    }

}