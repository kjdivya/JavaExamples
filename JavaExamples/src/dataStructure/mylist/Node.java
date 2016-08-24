package mylist;

public class Node <T>
{
	Node<T> next = null;
	T val;
	
	public void printList(Node<T> node)
	{
		while(node.next != null)
		{
			System.out.print(node.val+" -> ");
			node = node.next;
		}
		System.out.print(node.val);
		System.out.println();
	}

}
