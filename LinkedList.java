package datastructures;

public class LinkedList 
{
Node head;
public void insert(String data)
{
	Node node=new Node();
	
	node.data=data;
	node.next=null;

	if(head==null)
	{
		head=node;
		
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;   //jumping between nodes
			
		}
		n.next=node;
	}
	
}
public void printList()
{
	Node n = head;
	while(n!=null) 
	{
		System.out.print(n.data+" ");
		n = n.next;
	}
}
	public void insertAtstart(String data)
	{
		Node node=new Node();
		node.data=(String) data;
		
		node.next=head;
		head=node;
	}
	public void insertAt(int index,String data)
	{

		Node node=new Node();
		node.data=(String) data;
	
		
		if(index==0)
		{
			insertAtstart(data);
			
		}
		
		else
		{
			Node n=head;
		
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
				}
			node.next=n.next;
			
		}
	}

		public boolean Search(String s)
		{
			Node node=head;
			while(node!=null)
			{
				if(node.data.equals(s))
				{
					return true;
					}
				node=node.next;
			}
			return false;
			
			}
		public String getString()
		{
			String output=" ";
			Node n=head;
			while(n.next!=null)
			{
				output=output+n.data+"";
				n=n.next;
			}
			output=output+n.data;
			return output;
			
			}

		public   void remove(String ss)
		{

			Node current = head;
			Node temp = null;
			if(current!=null&&current.data==ss) 
			{
				head = current.next;
				return;
			}
			while(current!=null&&!(current.data equals(ss)))
			{
				temp= current; 
				current = current.next;
			}
			if(current==null)
			{
				return;
			}
			temp.next = current.next;
		}
		
		public static void main(String[] args)
		{
			LinkedList list=new LinkedList();
			System.out.println("linkedString");
			list.insert("rowdybaby");
			list.insert("loves");
			list.insert("you");
			list.printList();
			System.out.println();
			list.insert("but");
			list.printList();
			System.out.println();
			list.insertAt(1,"hates");
			list.printList();
			System.out.println();
			list.remove("you");
			list.printList();
			System.out.println();
			System.out.println(list.Search("you"));
			}
}
	