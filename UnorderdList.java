package datastructures;

import bridgelabz.utility.utility;

public class UnorderdList
{
public static void main(String[] args) 
{
LinkedList ls=new LinkedList();
String directory="hari.text11";
String wordFile[]=utility.readStringFile("hari.text11","");
for(int i=0;i<wordFile.length;i++)
{
	ls.insert(wordFile[i]); 
}
	System.out.println("unorderd list");
	ls.printList();
	System.out.println();
	System.out.println("enter the string to search");
	String strSearch=utility.getString();
	if(ls.Search(strSearch)==true)
	{
		ls.remove(strSearch);
		}
	else
	{
		ls.insert(strSearch);
		ls.printList();
		
	}
	ls.printList();
	String output=ls.toString();
	System.out.println();
	System.out.println(output);
	utility.writeStringFile(directory, output);
}
}
