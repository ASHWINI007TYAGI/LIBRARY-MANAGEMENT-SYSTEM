public class Book
{
private String Name;
private String Author;
private String Isbn;
public Book(String Name , String Author, String Isbn)
{
    this.Author=Author;
    this.Name=Name;
    this.Isbn=Isbn;
}
public String getName(){
    return Name;
}
public String getAuthor(){
    return Author;
}
public String getIsbn(){
    return Isbn;
}
public void setName(String Name)
{
    this.Name=Name;
}
public void setAuthor(String Author)
{
    this.Author=Author;
}
public void setIsbn(String Isbn)
{
    this.Isbn=Isbn;
}
}
