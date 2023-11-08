package CloneAnArray;

import java.util.ArrayList;

public class Clone {
    public static void main(String[] args)
    {
        ArrayList obj= new ArrayList<>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Black");
        obj.add("White");
        obj.add("Pink");
        System.out.println(" Original Array : "+obj);
        ArrayList obj2=new ArrayList<>();
     /*   obj2=obj;
        System.out.println(" Cloned Array : "+obj2);*/
        obj2= (ArrayList) obj.clone();
        System.out.println(" Cloned Array : "+obj2);

    }
}
