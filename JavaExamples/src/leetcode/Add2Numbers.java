package src.leetcode;

public class Add2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode1 l1 = new ListNode1(2);
		/*l1.next = new ListNode1(8);
		l1.next.next = new ListNode1(3);*/

		ListNode1 l2 = new ListNode1(8);
		l2.next = new ListNode1(9);
		l2.next.next = new ListNode1(9);
		Add2Numbers add = new Add2Numbers();
		ListNode1 resNode = add.addTwoNumbers(l1, l2);
		resNode.display();
	}

	public ListNode1 addTwoNumbers(ListNode1 l1, ListNode1 l2) {
		int val = 0;
		ListNode1 head = new ListNode1(-1);
		ListNode1 newNode, resNode = null;
		int count = 0;
		int carry = 0;

		while (l1 != null && l2 != null) {
			if (count == 0) {
				resNode = new ListNode1(-1);
				head = resNode;
				count++;
			} else {
				newNode = new ListNode1(-1);
				val = l1.val + l2.val + carry;
				if (val > 9) {
					val = val % 10;
					carry = 1;
					newNode.val = val;
				} else if (count == 1) {
					newNode.val = val;
				} else {
					newNode.val = val;
					carry = 0;
				}
				l1 = l1.next;
				l2 = l2.next;

				resNode.next = newNode;
				resNode = resNode.next;

				count++;
			}
		}
		
		l1 = (l1 == null ? (l2 == null?null:l2):(l1));
		while(l1 != null)
		{
			val = l1.val + carry;
			if(val > 9)
			{
				val = val%10;
				carry = 1;
			}
			else
				carry = 0;
			newNode = new ListNode1(val);
			resNode.next = newNode;
			resNode = resNode.next;
			
			l1 = l1.next;
			/*if (l1 != null)
				carry = 0;*/
		}
		
		if(carry == 1)
		{
			newNode = new ListNode1(1);
			resNode.next = newNode;
		}

		return head.next;
	}
}
