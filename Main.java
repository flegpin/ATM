import java.util.Scanner;

class Main{
 public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);
    System.out.println("enter a number");
	int res= myObj.nextInt();
	for(int i=0; i<10; i++)
	{System.out.println(res+"*"+i+"="+i*res);}

	Customer prod= new Customer ("a","b",0);
 }
}
/*
ok so there are customers, each as a name, id, balance, password, 3 attempts
they can withdraw, or send the cash to another member if they have the id or name 

should i make a hashlist to store those, how can i combine that with an object person.
ok so i have an arrow with these persons and i will create a method that will add create objects for those guys
*/