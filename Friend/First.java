class First
{
   private int x;
   
   First()
   {
      x = 0;
   }
   void add(int val)
   {
      x+= val;
   }
   int num()
   {
      return x;
   }
   public class Methods
   {
      Methods()
      {
      }
      int getPrivateData()
      {
         return x;
      }
   }
   void givekey(Second k)
   {
      k.receivekey(new Methods());
   }
}