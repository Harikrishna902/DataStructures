package datastructures;

public class linkedString 
{
Node head;
int data;

public void insert(int data)
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
	public void insertAtstart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		node.next=head;
		head=node;
	}
	public void insertAt(int index,int data)
	{

		Node node=new Node();
		node.data=data;
		node.next=null;
		
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
		public void  delete(int index1)
		{
			if(index1==0)
			{
				head=head.next;
	
			}
			else
			{
				Node n=head;
				Node n1=null;
				for(int i=0;i<index1-1;i++)
				{
					n=n.next;
					n1=n.next;
					n.next=n1.next;
					
				}
				
			}
		}
			public void show()
			{
				Node node1 = head;
				
				while(node1.next!=null)
				{
					System.out.println(node1.data);
					node1 = node1.next;
				}
				//System.out.println(node1.data);
			}
			
		
			
	}
	






		
