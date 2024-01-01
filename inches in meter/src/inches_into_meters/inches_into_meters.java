package inches_into_meters;
import java.util.Scanner;

public class inches_into_meters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Input The Value Of Inch : ");
        double  i=sc.nextFloat();
        double m=i*0.0254;
        System.out.println(" "+i+" Inch is "+m+" Meters ");
    }
}
