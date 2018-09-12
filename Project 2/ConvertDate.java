import java.io.*;
class ConvertDate
{
   private String date;
   
   void setDate(String d)
   {
      date = d;
   }
   String getDate()
   {
      return date;
   }
   String convDate()
   {
      String[] token = date.split(" ");
      String newDate = "";
      
      switch(token[0])
      {
         case "January":   newDate = "1"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "February":  newDate = "2"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "March":     newDate = "3"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "April":     newDate = "4"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "May":       newDate = "5"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "June":      newDate = "6"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "July":      newDate = "7"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "August":    newDate = "8"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "September": newDate = "9"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "October":   newDate = "10"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "November":  newDate = "11"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         case "December":  newDate = "12"+"/"+token[1]+"/"+token[2].charAt(2)+token[2].charAt(3);
                           break;
         default:
                           System.out.print("Invalid entry.");
                           break;                      
      }
      return newDate;
   }
}