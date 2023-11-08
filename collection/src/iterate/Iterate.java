package iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList<>();
        al.add("red");
        al.add("green");
        al.add("orange");
        al.add("white");
        al.add("black");

/*for(Object data : al)
{
    System.out.println(data);
}*/
for(Iterator<String> data = al.iterator() ; data.hasNext();)
        {
            System.out.println(data.next());
        }
    }
}
