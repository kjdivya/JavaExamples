package src.leetcode;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger romanToInt = new RomanToInteger();
		int val = romanToInt.romanToInt("LVIII");
		System.out.println("Num = " + val);

	}

	public int romanToInt(String s) {
		int a_pointer = 0;
		int num = 0;
		int nextVal = 0;
		int val = 0;
		int subval = 0;
		while (a_pointer < s.length()) {
			nextVal = 0;
			val = 0;

			val = getValue(s.charAt(a_pointer));
			if (a_pointer + 1 < s.length()) {
				nextVal = getValue(s.charAt(a_pointer + 1));
				if (nextVal > val) {
					subval = nextVal - val;
					a_pointer++;
					num = num + subval;
				}
				else
					num = num + val;
			} else
			{
				num = num + val;
			}
			a_pointer++;
		}

		return num;
	}
	
	
	public int getValue(char ch) {
		switch (ch) {
		case 'I': {
			return 1;
		}
		case 'V': {
			return 5;
		}
		case 'X': {
			return 10;
		}
		case 'L': {
			return 50;
		}
		case 'C': {
			return 100;
		}
		case 'D': {
			return 500;
		}
		case 'M': {
			return 1000;
		}
		default: return 0;
		}

	}

}
