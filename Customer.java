public class Customer {
	
	String fname, lname;
	int balance, attempt, id, pin;
	
	public Customer (String fName, String lName, int Balance, int Pin)
	{
		fname= fName;
		lname= lName;
		balance= Balance;
		pin=Pin;
		id=1000;
		attempt=3;
		
		//System.out.println("Welcome " +fname+ " "+lname+"\n"+"U currently have "+balance+" in your account\n");
	}
	
	public void withdraw(int amount)
	{
		balance =balance-amount;	 
		System.out.println("\nAfter withdrawing " + amount + "your current balance is "+ balance );
	}
	public int pain ()
	{
		return pin;
	}
	public void present()
	{
		System.out.println("Welcome " +fname+ " "+lname+"\n"+"U currently have "+balance+" in your account\n");	
	}
	public String receiv()
	{
		return fname;
	}
		public void receive(int amount)
	{	
		int old=balance;
		balance =balance+amount;	 
		System.out.println("\nAfter receiving " + amount +" "+ fname+" your current balance went from "+old+ " to " + balance +"\n\n" );
	}
	/* 
		@Override
        public boolean equals(Object obj) {
           if (this == obj)
                return true;
            if (obj == null)
                return false;
			Customer other = (Customer) obj;
            if (getClass() != obj.getClass())
                return false;
            if (pin == obj.pin)
                return true;
						
			if(pin==3)
				return true;
			else
			return false;
}
  */
}