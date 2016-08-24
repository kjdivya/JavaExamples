package mycollections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 *  Java LinkedList class uses doubly linked list to store the elements. It extends the AbstractList class and implements List and Deque interfaces.
	Java LinkedList class can contain duplicate elements.
	Java LinkedList class maintains insertion order.
	Java LinkedList class is non synchronized.
	In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
	Java LinkedList class can be used as list, stack or queue.
 * @author divya.j
 *
 */
public class MyLinkedList {
	LinkedList<String> llist;

	public static void main(String[] args) {

		MyLinkedList myList = new MyLinkedList();
		myList.createNewList();
	}
	
	public void createNewList()
	{
		llist = new LinkedList<>();
		llist.add("Divya");
		llist.add("Santhosh");
		llist.add("Darshan");
		llist.add("Rashmi");
		llist.add("Nandhini");
	
		printList(llist);
		
		System.out.println("************");
		System.out.println("Peek: "+llist.peek());
		System.out.println("Element: "+llist.element());
		System.out.println("Poll: "+llist.poll());
		printList(llist);
		System.out.println("Poll Last: "+llist.pollLast());
		
		System.out.println("************");
		
		printList(llist);
	}
	
	public <T> void printList(LinkedList<T> llist)
	{
		Iterator<T> itr = llist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
