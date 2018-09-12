/**
*  CS 391 Final
*  Shanel Fowler
*  December 12, 2016
*/
import java.util.Scanner;
class Run
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String input;
      int select;
      
      //date is a form of logical compression instead of having January 1, 2016 => 1/1/16
      System.out.print("Welcome!\n"+"Please make a selection based on"+
                      "your desired compression method!");
      System.out.print("\n1)Date\n2)String\n3)Huffman\nEnter selection: ");
      select = keyboard.nextInt();
      
      switch(select)
      {
         case 1: System.out.println("You have selected date compression.");
                  break;
         case 2: System.out.println("You have selected string compression.");
                  break;
         case 3: System.out.println("You have selected huffman.");
                  break;
         default:
                  System.out.println("Incorrect selection. Good-bye!");
                  break;            
      }  
      keyboard.nextLine();
      
      System.out.println("----------------------------------------------------\n");
      if(select == 1)
      {
         ConvertDate d = new ConvertDate();
         
         System.out.print("Enter a date: ");                       
         input = keyboard.nextLine();
         input = input.replace(",","");
         
         System.out.println("Date: "+input);
         d.setDate(input);
         
         String temp = d.convDate();
         System.out.print("Compressed date: "+temp);
      }
      if(select == 2)
      {
         
      }
      if(select == 3)
      {
         
      }     
   }
}