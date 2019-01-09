package datastructures;

public class PalindromeChecker 
{
public static void main(String[] args)
{
	DequeUtil<Character> utility=new DequeUtil<Character>();
	System.out.println("enter String ");
	String s=utility.getstring();
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		utility.addRear(c);
	}
	int count=0;
	while(utility.size>1)
	{
	if(utility.removeFront()!=utility.removeRear())
	{
		count=1;
		break;
		
	}
	}
	if(count==0)
	{
		System.out.println("String is  palindrome");
	
	}
	else
	{
		System.out.println("String is not palindrome");
	}
}
}
