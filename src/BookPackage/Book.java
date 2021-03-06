package BookPackage;

public class Book {
    public Book (String name, String author, int num_pages){
        this.name= name;
        this.author = author;
        this.num_pages = num_pages;
    }
    public String author;
    public String name;
    public int num_pages;


    /*
    * https://www.javatpoint.com/understanding-toString()-method
    * */
    @Override
    public String toString() {
        return "Book: " + "Title: " + name + " ,Author: " + author + " ,number of pages: " + num_pages;
    }
}
