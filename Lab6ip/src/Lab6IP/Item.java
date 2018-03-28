package Lab6IP;
public class Item {
    public String name;
    public int year;

    public Item(String nume,int an) {
        this.name=nume;
        this.year=an;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Item " + "name=" + name + ", year=" + year ;
    }
    
    
    
   
}
