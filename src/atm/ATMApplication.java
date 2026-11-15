package atm;

import java.util.Scanner;

public class ATMApplication {
	
	public static void checkBalance(double balance) {
	    System.out.println("Your Current Balance: " + balance);
	}
	
	public static double depositMoney(double balance,Scanner sc) {
//		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit:");
		double amount = sc.nextDouble();
		if(amount>0)  {
			System.out.println("The amount is greater than zero");
			balance=balance+amount;
			System.out.println("Amount Deposited Successfully!");
			System.out.println("Updated balance is:"+balance);
		} else{
			System.out.println("Invalid Amount!");
			System.out.println("Deposite must be greater than 0");
			
	}
		return balance;
		
	}
	
	public static double withdrawMoney(double balance, Scanner sc) {
		System.out.println("Enter amount to withdraw:");
		double	amount1=sc.nextDouble();
		
		
		if(amount1<=0){
			
					System.out.println("Invalid Amount!");
		          
		}
		else if(amount1 > balance) {
			
			System.out.println("Insufficient balance");
		}
		else
		{
			System.out.println("Withdrawl Successful");
	        balance=balance-amount1;
		System.out.println("Remaining balance is:"+balance);
		}
		return balance;
				
	}
	

	public static void main(String[] args) {
		
System.out.println("WELCOME TO ATM");

Scanner sc = new Scanner(System.in);
int choice=0;

double balance=10000;

int pin = 1234;
System.out.println("Enter Pin");
 int enteredPin=sc.nextInt();
System.out.println("Pin is: "+enteredPin);


if(enteredPin==pin)
{
	System.out.println("PIN verified.Access granted");
	
	while(choice!=4)
	{
		
		

	System.out.println("1.Check Balance");
	System.out.println("2.Deposite Money");
	System.out.println("3.Withdraw Money");
	System.out.println("4.Exit");

	System.out.print("Enter Your Choice:");
	choice=sc.nextInt();


	switch(choice){
	case 1:
		checkBalance(balance);
	break;
		case 2:
			
			balance=depositMoney(balance,sc);
			
			
		break;
	case 3:
		  balance = withdrawMoney(balance, sc);
		    break;
	case 4:
		System.out.println("Thankyou for using ATM");
        break;
        
        default:
        	System.out.println("Invalid Choice");
		}
		}

}else
{
	System.out.println("Incorrect Pin ");
	System.out.println("Access Denied ");
}

}

}