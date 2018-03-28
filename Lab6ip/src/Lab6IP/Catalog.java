package Lab6IP;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Object> items;
    Catalog()
    {
      items = new ArrayList<>();  
    } 
    public void add(Item... maxIndex)
    {
        for (Item i : maxIndex)
             items.add(i);
    }
    public void list()
    {
       for (int i=0;i<items.size();i++)
         System.out.println(items.get(i));
    }
}
