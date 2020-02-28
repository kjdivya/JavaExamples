package src.leetcode;

public class ListNode1 {
	      int val;
	      ListNode1 next;
	      ListNode1(int x) { val = x; }
	      
	      public void display()
	      {
	    	  ListNode1 node = this;
	    	  while(node !=null)
	    	  {
	    		  System.out.print(node.val);
	    		  
	    		  node = node.next;
	    		  if(node != null)
	    			  System.out.print("->");
	    		  
	    	  }
	      }
	      
}
