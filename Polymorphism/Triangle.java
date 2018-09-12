class Triangle extends Shape
{
   private double base;
   private double height;
   
   double calcArea()
   {
      return (1/2 * base) * height;
   }
   double getBase()
   {
      return base;
   }
   double getHeight()
   {
      return height;
   }
   void setBase(double b)
   {
      base = b;
   }
   void setHeight(double h)
   {
      height = h;
   }
   void display()
   {
      System.out.println("I am a triangle.");
   }
}