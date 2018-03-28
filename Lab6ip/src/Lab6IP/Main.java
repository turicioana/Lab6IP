
package Lab6IP;


public class Main {
     public static void main(String args[]){
        
        Book b1 = new Book("Abecedar","Gheorghe Pana","Rocarta",1989);
        Articol a1 = new Articol ("Incalzirea globala","Cristian Tudor Popescu",2012);
        Articol a2 = new Articol ("Racirea globala","George Buhnici",2010);
        Catalog c1 = new Catalog();
        c1.add(b1);
        c1.add(a1);
        c1.add(a2);
        c1.list();
        
     }
}
