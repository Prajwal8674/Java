class CalculateArea{ 
          static int area(int l, int b)
         {
           int area=l *b;
          return area;
          } 
         static double area(double s1 , double s2)
         {
         double area=s1 * s2;
         return area;
        }
       static double area(double r, int h)
      {
      double area=2 * 3.141 * r *(h+r);
      return area;
     }
}
public class Test{
     public static void main(String args[]) {
      System.out.println("Area of rectangle : "+ CalculateArea.area(12, 10));
     System.out.println("Area of square : "+ CalculateArea.area(5.3, 5.3));
     System.out.println("Area of cylinder :"+ CalculateArea.area(2.5, 10));
}
}
      