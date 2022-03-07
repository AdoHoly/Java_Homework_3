package BookPackage;

public class ForeignBook extends Book{
    public ForeignBook(String name, String author, int num_pages, String language){
        super(name,author,num_pages);
        this.language = language;
    }

    public ForeignBook(String name, String author, int num_pages){
        super(name,author,num_pages);
        this.language = "English";
    }

    public String language;
}
