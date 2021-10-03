import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

class Main{

 public static void main(String[] args) {

	LocalDate date =  LocalDate.now();
	LocalTime time =  LocalTime.now();
	
	System.out.println("\n\n" + date + "    " + time + "\n\n");
	
	//Main Method initializes the Customer object with the firs customers
	Object [][]firstCustomers = {{"franky","vincent",45000,1234},{"prodi","prodac",65000,2345},
	{"kini","chef",73000,3}};
	
	ArrayList<Customer> customers = new ArrayList <Customer>();
	
	for (int i=0;i<=2;i++)
		{	//Semi automatic initialisation with data cast to make sure the data fits
			Customer temp= new Customer((String) firstCustomers[i][0],(String) firstCustomers[i][1],(Integer)firstCustomers[i][2],(Integer)firstCustomers[i][3]);
			customers.add(temp);
		}
	System.out.println("Welcome to our Automatic Cash distributor \n");
	
	Scanner command = new Scanner(System.in);
	int pursue = 1;
	while (pursue != 0 )
	{
		
		System.out.println("\nPlease Enter your PIN\n");
		int select = command.nextInt();
		//now we have to find the correct object

		//for loop until we reach the end of the Array while comparing each pin
		int match=-1;
		for (int i=0;i<=2;i++)
		{	//Semi automatic initialisation with data cast to make sure the data fits
						
			//found  match with the pin
		if (customers.get(i).pain() == select )
			do
			{
				match=i;
				customers.get(i).present();
				System.out.println("What operation would you like to do today ?\n");
				System.out.println("1- Withdraw Cash\n");
				System.out.println("2- Send Interac ( requires receivers ID)\n");
				System.out.println("3- Log out \n");
				
				select = command.nextInt();
				switch (select){
					case 1:
					System.out.println("\nHow much would you like to withdraw today?\n");
					int amount = command.nextInt();
					customers.get(i).withdraw(amount);
					
					break;
					case 2:
					System.out.println("\nPlease enter the receivers ID\n");
				    amount = command.nextInt();
					//does the receiver exist 
					//check if the receiver exists then proceed to withdrawal
							int match2=-1;
							for (int j=0;j<=2;j++)
								if (customers.get(j).pain() == amount )
								{
									// position of the receiver in j
									match2=j;
									
								}
								if (match2 ==(-1) )// no receiver found, we can retry the pin or retry another action
								{
									System.out.println("\nError no receiver account matching , please retry PIN or press 0 to quit");
										select = command.nextInt();
										if (select ==0 )
											break;
										else 
											continue;
								}
								else	//there was a match 
								{
									//sending cash between the 2 parties
									String receiver = customers.get(match2).receiv(); // name of the receiver 
									System.out.println("\nHow much do you want to send to "+ receiver );
									amount = command.nextInt();
									customers.get(i).withdraw(amount);
									customers.get(match2).receive(amount);
								}
								
								
							//customers.get(i).withdraw(); 
					
					break;
					case 3:
					System.out.println("\nYou've successfully logged out\n");
					break;
					default:
					System.out.println("\nWrong input\n");
				}
			}
		while(select != 3 );			
		}
		//comparison done, if match is still negative, no user was found, error message and please retry the pin;
		if (match==(-1))
		{System.out.println("\nError no account found, please retry or press 0 to quit");
		select = command.nextInt();}
		if (select ==0 )
			break;
		else 
			continue;
	}
	
	
    System.out.println("Thanks for using the service");
 }
}
/*z

*/