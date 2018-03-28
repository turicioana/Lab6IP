package Lab6IP;
public class Articol extends Item{
    private String author;
    public Articol(String name,String autor,int year) {
        super(name,year);
        this.author=autor;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Articol "+"name " + this.name + ",author " + author + ",year " + this.year;
    }
    
    
}
