package BookPackage;

public class ForeignBook extends Book{
    public ForeignBook(String name, String author, int pages, String language){
        super(name,author,pages);
        this.language = language;
    }

    public ForeignBook(String name, String author, int pages){
        super(name,author,pages);
    }

    public String language;
}
