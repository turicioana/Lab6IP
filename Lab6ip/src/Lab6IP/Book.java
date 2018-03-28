package Lab6IP;
public class Book extends Item{
    public String author;
    public String editura;
    
    
    Book(String name, String autor,String editura,int an)
    {
        super(name,an);
        this.author = autor;
        this.editura = editura;
        
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    @Override
    public String toString() {
        return "Book " + "author " + author + ", editur " + editura + ",year " + this.year ;
    }
    
     
}
