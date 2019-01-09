package datastructures;



public  class Queue 

{
	static Node front;
	static Node rear;
	public static class Node{
		int data;
		Node next;
		
	}
	
	public Queue() 
	{
		front = rear = null;
	}
	public static boolean isEmpty() 
	{
		return front == null;
	}
	public static void enqueue(int item) 
	{
		Node temp = new Node();
		temp.data = item;
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
		}
		rear = temp;
	}
	public static void dequeue() 
	{
		if(isEmpty()) 
		{
			System.out.println("queue is empty");
		}
		front = front.next;
		if(front==null) {
			rear =null;
		}
	}
	public static void printlist()
	{
		Node n = front;
		while(n!=null) {
			System.out.println(n.data+" ");
			n= n.next;
		}
	}
	
	public static int totalAmount() 
	{
		Node node = front;
		int total =0;
		while(node.next!=null) 
		{
			total+=node.data;
			node = node.next;
		}
		total+=node.data;
		return total;
	}
	public static void main(String[] args) 
	{
		Queue q = new Queue();
		Queue.enqueue(5);
		Queue.enqueue(6);
		Queue.enqueue(29);
		Queue.enqueue(39);
		Queue.printlist();
		Queue.dequeue();
		System.out.println();
		Queue.printlist();
		int amount =q.totalAmount();
		System.out.println();
		System.out.println(amount);
	}

}
