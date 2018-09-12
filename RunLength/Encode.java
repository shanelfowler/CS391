class Encode extends Project2
{
   private int charCounter;
   private String newStr;
   private boolean same = false;
   Project2 obj;
   
   Encode()
   {
      super("AAAAABBBB");
   }
   boolean charSame(Project2 obj)
   {
      for(int i = 0; i < obj.getInput().length(); i++)
      {
         if(obj.getInput().charAt(i) == obj.getInput().charAt(i+1))
            same = true;
      }
      return same;
   }
   int charCount(Project2 obj)
   {
     int iterator = 0;
     
     while(iterator < obj.getInput().length())
     {
         if(obj.getInput().charAt(iterator) == obj.getInput().charAt(iterator+1))
            charCounter++;
         else
            break;
     }
     return charCounter;
   }
   void encString()
   {
      int counter = 0;
      
      while(counter < obj.getInput().length())
      {
         if(charSame(obj))
         {
            System.out.print(obj.getInput().charAt(counter)+charCount(obj));
            counter++;
         }
      }
   }
}