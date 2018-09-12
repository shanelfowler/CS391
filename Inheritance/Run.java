/**
Determines whether the default employee is an hourly or salaried
employee then displays the default's info along with their earned
wages.
*/
import java.util.Scanner;
class Run
{
   static boolean isSalary(char c)
   {
      if(c == 'Y' || c == 'y')
         return true;
      else
         return false;
   }
   public static void main(String[] args)
   {
      Employee obj = new Employee();
      SalaryEmployee sal1 = new SalaryEmployee();
      HourlyEmployee hr1 = new HourlyEmployee();
      
      Scanner keyboard = new Scanner(System.in);
      char input;
      
      System.out.print("Are you a salary employee?(Y/N): ");
      input = keyboard.nextLine().charAt(0);
      
      obj.displayInfo();
      if(isSalary(input))
         System.out.printf("Annual Salary: $%.2f",sal1.calcSalary());
      else
         System.out.printf("Bi-weekly earned wages: $%.2f",hr1.calTotal());    
   }
}