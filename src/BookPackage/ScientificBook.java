package BookPackage;

public class ScientificBook extends Book{
    public ScientificBook(String name, String author, int pages, String theme){
        super(name,author,pages);
        this.theme = theme;
    }
    public String theme;
}
