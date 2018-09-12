class SalaryEmployee extends Employee
{
   private double salary;
   private double hoursWorked;
   
   SalaryEmployee()
   {
      salary = 25;
      hoursWorked = 40;
   }
   void setSalary(double s)
   {
      salary = s;
   }
   void setHours(double h)
   {
      hoursWorked = h;
   }
   double calcSalary()
   {
      return salary * hoursWorked * 52;
   }
}