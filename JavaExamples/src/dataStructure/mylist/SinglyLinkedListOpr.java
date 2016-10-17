package dataStructure.mylist;

public class SinglyLinkedListOpr {

	static Node<Integer> head = null;
	
	
	public static void main(String[] args) {

		// Create Singly Linked List

		SinglyLinkedListOpr singleList = new SinglyLinkedListOpr();
		
		singleList.createLinkedList();
		singleList.addBeforeHead(-1);
		singleList.addAtEnd(6);
		System.out.println("Length of SinglyLinked List = "+ singleList.length(head));
		singleList.nodeFromLast(8);
		
	}
	
	public Node<Integer> createNewNode(int value)
	{
		Node<Integer> node = new Node<Integer>();
		node.next = null;
		node.val = value;
		
		return node;
	}

	public void createLinkedList()
	{
		Node<Integer> n = null; 
		Node<Integer> node = null;
		int[] myArray = new int[] {1,2,3,4,5};
		int size = myArray.length;
		for(int i=0; i< size; i++ )
		{
			n = createNewNode(myArray[i]);
			
			if(i == 0)
			{
				node = n;
				head = node;
			}
			else
			{
				node.next = n;
				node = node.next;
			}
		}
		
		head.printList(head);
	}
	
	public void addBeforeHead(int n)
	{
		Node<Integer> node = createNewNode(n);
		
		node.next = head;
		head = node;
		
		head.printList(head);
	}
	
	public void addAtEnd(int n)
	{
		Node<Integer> currNode = head;
		Node<Integer> newNode = createNewNode(n);
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		currNode.next = newNode;
		
		head.printList(head);
	}
	
	public int length(Node<Integer> node)
	{
		if(node == null)
			return 0;
		
		return 1 + length(node.next);
	}
	
	/**
	 * Prints the data in present in last nth node
	 * @param n - represents position
	 */
	public void nodeFromLast(int n)
	{
		Node fast = head;
		Node slow = head;
		int start = 1;
		
		while(fast.next != null)
		{
			fast = fast.next;
			start++;
			
			if(start > n)
			{
				slow = slow.next;
			}
		}
		
		System.out.println(slow.val);
	}
}
