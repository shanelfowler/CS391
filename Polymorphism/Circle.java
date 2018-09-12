import java.lang.Math;

class Circle extends Shape
{
   private double radius;
   
   double calcArea()
   {
      return Math.PI * calcDiameter();
   }
   double getRadius()
   {
      return radius;
   }
   double calcDiameter()
   {
      return radius * radius;
   }
   void setRadius(double r)
   {
      radius = r;
   }
   void display()
   {
      System.out.println("I am a circle.");
   }
}