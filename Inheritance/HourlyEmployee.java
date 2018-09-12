class HourlyEmployee extends Employee
{
   private double pay;
   private double hoursWorked;
   private double totalPay;
   
   HourlyEmployee()
   {
      pay = 9.50;
      hoursWorked = 40;
   }
   void setHours(double h)
   {
      hoursWorked = h;
   }
   double getHours()
   {
      return hoursWorked;
   }
   double calTotal()
   {
      return pay * hoursWorked;
   }
}