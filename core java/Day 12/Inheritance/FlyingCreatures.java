class Aves
{
   public void fly()
   {
      System.out.println("Generally, aves fly");
   }
}
class Parrot extends Aves
{
   public void eat()
   {
      System.out.println("Parrot eats fruits and seeds");
   }
}
class Vulture extends Aves
{
   public void vision()
   {
      System.out.println("Vulture can see from high altitudes");
   }
}
public class FlyingCreatures
{
   public static void main(String args[])
   {	                                                // all the following code is composition for FlyingCreatures			
      Parrot p1 = new Parrot();
      p1.eat();                                         // calling its own member
      p1.fly();                 
                                                        // calling super class member by inheritance
      Vulture v1 = new Vulture();
      v1.vision();                                    // calling its own member
      v1.fly();	                // calling super class member by inheritance
   }
}