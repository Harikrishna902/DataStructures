package datastructures;

import java.util.Scanner;

import bridgelabz.utility.Deque;

public class DequeUtil<E>
{
	static Scanner sc=new Scanner(System.in);

	

Deque<E>front;
Deque<E>Rear;
int size=0;
  

@SuppressWarnings("null")
public void addFront(E c)//to insert c in the begining
{
	if(front==null)  //if no elements in list
	{
		front.data=c;
		Rear=front;
		
	}
	else
	{
		Deque<E>tNode=null;
		tNode.data=c;
		tNode.next=front;
		tNode.prev=tNode;
		front=tNode;
		
	}
	size++;
	
}
public void addRear(E c)
{
	if(front==null)
	{
		Deque<E>tNode=new Deque<E>(c);
		front=tNode;
		Rear=tNode;
		
	}
	else
	{
		Deque<E>tNode=new Deque<E>(c);
		Rear.next=tNode;
		tNode.prev=Rear;
		Rear=tNode;
		
	}
	size++;
	
}
public E removeFront()
{
	E val=null;
	if(front==null)
	{
		System.out.println("No elements to delete");
		
	}
	else
	{
		val=front.data;
		front=front.next;
		
	}
	size++;
	return val;
}
public E removeRear()
{
	E val=null;
	if(front==null)
	{
		System.out.println("No elements to delete");
		
	}
	else
	{
		val=Rear.data;
		front=front.prev;
		Rear.next=null;
		
	}
	size--;
	return val;
}

public String getstring()
{
	return sc.next();
	
}
}
