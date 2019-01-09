package datastructures;

import java.util.Arrays;  

import bridgelabz.utility.utility;

public class OrderedList 
{
	public static void main(String[] args)
	{
		
		String directory = "hari.text11";
		int wordsInt[] = utility.readIntFile(directory, " ");
		Arrays.sort(wordsInt);
		OrderedList rl = new OrderedList();
	
		for(int i=0;i<wordsInt.length;i++) {
		rl.insert(wordsInt[i]);
		}
		rl.printList();
		System.out.println();
		System.out.println("enter item to search");
		int key = utility.getint();
		System.out.println(rl.search(key));
		if(rl.search(key)==true)
		{
			rl.delete(key);
		}
		else 
		{
			rl.insert(key);
		}
		System.out.println();
//		ol.printList();
		String output = rl.toString();
		
		System.out.println(output);
		
		utility.writeStringFile(directory, output);
		System.out.println();
		rl.printList();
	}


	private void delete(int key) {
		// TODO Auto-generated method stub
		
	}

	private void insert(int key) {
		// TODO Auto-generated method stub
		
	}

	private char[] search(int key) {
		// TODO Auto-generated method stub
		return null;
	}

	private void printList() {
		// TODO Auto-generated method stub
		
	}


	

	