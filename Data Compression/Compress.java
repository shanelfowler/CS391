class Compress
{
   private String str;
   private int counter;
   
   Compress()
   {
      str = "bbaabbaabbaa";
      counter = 0;
   }
   void isRepeat()
   {
      for(int i = 0; i < str.length(); i++)
      {
         if(str.charAt(i) == str.charAt(i+1))
            counter++;
         if( i > 0 && str.charAt(i) == str.charAt(i-1) && str.charAt(i) != str.charAt(i+1))
            counter++;
         else
            break;
      }
   }
   int giveNum()
   {
      return counter;
   }
}