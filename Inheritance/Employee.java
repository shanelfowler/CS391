class Employee
{
   protected String firstName;
   protected String lastName;
   protected String address;
   protected String ssn;
   protected String doa;
   
   Employee()
   {
      firstName = "John";
      lastName = "Smith";
      address = "123 Lane Street";
      ssn = "000-00-0000";
      doa = "August 18, 1981";
   }
   void setFName(String s)
   {
      firstName = s;
   }
   void setLName(String s)
   {
      lastName = s;
   }
   void setAddress(String s)
   {
      address = s;
   }
   String getFName()
   {
      return firstName;
   }
   String getLName()
   {
      return lastName;
   }
   String getAddress()
   {
      return address;
   }
   String getSSN()
   {
      return ssn;
   }
   void displayInfo()
   {
      System.out.print("First Name: "+getFName()
      +"\nLast Name: "+getLName()+"\nAddress: "
      +getAddress()+"\nSSN: "+getSSN()+"\n");
   }  
}