package datastructures;

import bridgelabz.utility.NodeUtil;

public class HashFunction 
{
linkedString[] list=new linkedString[11];
NodeUtil n=new NodeUtil();

 public void HashingFunction()
 {
	 int[]retArray=n.integerFileReader();
	 for(int i=0;i<retArray.length;i++)
	 {
		 int ren=retArray[i]%11;
		 int rem = 0;
		if(list[rem]==null)
		 {
			 list[rem]=new linkedString();
			 list[rem].insert(retArray[i]);
			 
		 }
		 else
		 {
			 list[rem].insert(retArray[i]);
		 }
	 }
	 for(int i=0;i<11;i++)
	 {
		 System.out.println(i);
		 if(list[i]!=null)
		 {
			 list[i].show();
		 }
	 }
 }
 public static void main(String[] args) 
 {
HashFunction hs =new HashFunction();
}
}
