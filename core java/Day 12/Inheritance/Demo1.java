class Box {
 double width;
 double height;
 double depth;
  
 }
  class Demo1{{
   public static void main(String args[]){
    Box demo = new Box();
	double vol;
	
   demo.width();
   demo.height();
    demo.depth();

 vol= demo.width * demo.height * demo.depth;
 System.out.println("Volume is"+vol ); 
   } 
   }