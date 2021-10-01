public class Customer {
	
	String fname, lname;
	int balance, attempt, id;
	
	public Customer (String fName, String lName, int Balance)
	{
		fname= "Moh";
		lname= "Prod";
		balance= 1000000;
		id=1000;
		attempt=3;
		System.out.println("Welcome " +fname+ " "+lname+"\n"+"U currently have "+balance+" in your account");
	}
}