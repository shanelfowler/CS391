class Second
{
   private First.Methods key;
   
   void receivekey(First.Methods key)
   {
      this.key = key;
   }
   void use()
   {
      First obj1 = new First();
      obj1.givekey(this);
      
      obj1.add(34);
      System.out.println(obj1.num());
     
      obj1.add(71);
      System.out.println(obj1.num());
   }
}