class Rectangle extends Shape
{
   private double length;
   private double width;
   
   double calcArea()
   {
      return length * width;
   }
   double getLength()
   {
      return length;
   }
   double getWidth()
   {
      return width;
   }
   void setLength(double l)
   {
      length = l;
   }
   void setWidth(double w)
   {
      width = w;
   }
   void display()
   {
      System.out.println("I am a rectangle.");
   }
}