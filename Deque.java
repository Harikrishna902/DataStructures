package bridgelabz.utility;

public class Deque<E>
{
public E data;
public Deque<E>next;
public Deque<E>prev;

public Deque()
{
	this.next=null;
	this.prev=null;
	
}
public Deque(E val)
{
	this.data=val;
	this.next=null;
	this.prev=null;
	
}
}
