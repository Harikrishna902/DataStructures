package datastructures;

import bridgelabz.utility.utility;

public class BalancedParanthesis 
{
	public static void main(String[] args)
	{
	System.out.println("enter the max size");
	int n=utility.getint();

	StackLogic stack =new StackLogic(n);
	System.out.println();

	
	String exp="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
	
	System.out.println("Matches and Mismatches");

	for(int i=0;i<exp.length();i++)
	{
		char ch=exp.charAt(i);
		if(ch=='(')
		{
			stack.push(i);
		}
		else if(ch==')')
		{
			try
			{
			long p=(stack.pop()+1);
					System.out.println(" ')' at index" +(i+1)+ "matched with '(' at index" +p);
		}
			catch(Exception e)
			{
				System.out.println(" ')' at index "+ (i+1) + "is un matched");
			}
		}
		while(stack.isEmpty())
		{
			System.out.println("'(' at index "+ (stack.pop()+1) +" is unmatched");
		}
	}

	}
	}