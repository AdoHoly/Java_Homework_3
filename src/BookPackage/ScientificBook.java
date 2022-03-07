package BookPackage;

public class ScientificBook extends Book{
    public ScientificBook(String name, String author, int num_pages, String scientific_area){
        super(name,author,num_pages);
        this.scientific_area = scientific_area;
    }
    public String scientific_area;
}
