package src.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("()"));
	}

	public boolean isValid(String s) {

		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
	    // Initialize a stack to be used in the algorithm.
	    Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // If the current character is a closing bracket.
	      if (map.containsKey(c)) {

	        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != map.get(c)) {
	          return false;
	        }else {
		        // If it was an opening bracket, push to the stack.
		        stack.push(c);
		      }
	      } 
	    }

	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
	public boolean isValid2(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(map.containsKey(ch))
			{
				char topElement = stack.isEmpty()?'#':stack.pop();
				
				if(topElement != map.get(ch))
				{
					return false;
				}
				
			}
			else
				stack.push(ch);
		}
		
		
		return stack.isEmpty();
	}
	public boolean isValid1(String s) {

		Stack<Character> stack = new Stack<>();
		int a_pointer = 0;
		int openRound = 0;
		int openSquare = 0;
		int openFlower = 0;

		while (a_pointer < s.length()) {
			switch (s.charAt(a_pointer)) {
			case '(': {
				openRound++;
				stack.push(s.charAt(a_pointer));
				break;
			}
			case '[': {
				openSquare++;
				stack.push(s.charAt(a_pointer));
				break;
			}
			case '{': {
				openFlower++;
				stack.push(s.charAt(a_pointer));
				break;
			}

			case ')': {
				openRound--;
				stack.pop();
				break;
			}
			case ']': {
				openSquare--;
				stack.pop();
				break;
			}
			case '}': {
				openFlower--;
				stack.pop();
				break;
			}

			default:
				break;

			}
			a_pointer++;
		}
		if (stack.size() == 0 && openRound == 0 && openSquare == 0 && openFlower == 0)
			return true;
		else
			return false;

	}
}
