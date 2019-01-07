package datastructures;

import bridgelabz.utility.utility;

public class CashCounter 
{
public static void main(String[] args) 
{
System.out.println("enter 1.deposit 2.withdrawal 3.display amount 4.quit");
int choice=utility.getint();
CashCounter.choice(choice);
}
public static void choice(int ch)
{
switch(ch)
{
case 1:
	deposit();
	break;
	
case 2:
	withdrawl();
	break;
	  
	
case 3:
	displayBal();
	break;
	
case 4:
	Queue.printlist();
	break;
	
	default:
		System.out.println("invalid ");
		break;
}
	}

public static void deposit()
{
	System.out.println("enter the amount to deposit");
	int amount=0;
	int deposit=utility.getint();
	amount=amount+deposit;
	Queue.enqueue(deposit);
	System.out.println("balance " + Queue.totalAmount());
	System.out.println("1.depost 2.withdrawl 3.dispaly balance 4.quit");
	int choice1 =utility.getint();
	choice(choice1);
	
}
public static void withdrawl()
{
System.out.println("enter the amount  to withdrawl");
int amount=utility.getint();
int bal=Queue.totalAmount();
if(bal>amount)
{
	Queue.dequeue();
	int bal1=Queue.totalAmount();
	System.out.println("remaining bal " + bal1);
	System.out.println("enter 1.deposit 2.withdrwal 3.display 4.quit");
}
else
{
	System.out.println("insuff balance");
		
}
}
public static void displayBal()
{
	int bal=Queue.totalAmount();
	System.out.println("remaing balance " +bal);
}
}


	





