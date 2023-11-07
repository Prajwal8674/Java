package converter;
import java.util.Scanner ;

public class fahrenheit_to_celcius {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input The Degree In Fahrenheit :  ");
        float f=sc.nextFloat();
        sc.close();
        float c=(f-32)*5/9;
        System.out.println(" "+f+" Degree fahrenheit is equal to"+"  "+c+" celcius ");



    }
}
