package src.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("([]")); // "", "[", "([)]"
	}

	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		if(s.isEmpty())
			return true;
		
		Stack<Character> stack = new Stack<>();
		
		for (int i=0; i< s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(map.containsKey(ch)) {
				stack.push(ch);
			}else
				if( !stack.isEmpty() && (map.get(stack.pop()) == ch)) 
				{
					if(!stack.isEmpty())
					continue;
				}
				else
					return false;
		}
		return stack.isEmpty();
	}
	
}
