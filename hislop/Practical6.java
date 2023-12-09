//Sorting alphabetically array of string
import java.util.*;
public class Names{
public static void main(String args[]){
String starr[]=new String[]{"Shah", "Jennie", " Basuri", "Harshita", "Tanushree", "Sayli",} ;
System.out.println("Sort array in Alphabetical order");
Arrays.sort(starr, String.CASE_INSENSITIVE_ORDER);
for(int a=0; a<starr.length;a++)
{
System.out.println(strarr[a]);
}
}
}