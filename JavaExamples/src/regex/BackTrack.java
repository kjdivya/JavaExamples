package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BackTrack 
{
	/*public static void main(String[] args) {
		
//		String input = "June 1995 – June 2003 (8 years 1 month)";
		String input = "09-08-2016 22:13:02 WARNING 73 Behavioral-DoS \"network flood IPv4 TCP-SYN\" TCP 30.1.1.10 49 40.1.1.10 69 9 Regular \"NetworkPolicy\" sampled 1 54 N/A 0 N/A high forward FFFFFFFF-FFFF-FFFF-6824-61C457AA845C09-08-2016 22:13:02 WARNING 73 Behavioral-DoS \"network flood IPv4 TCP-SYN\" TCP 30.1.1.10 49 40.1.1.10 69 9 Regular \"NetworkPolicy\" ongoing  617037 308488 N/A 0 N/A high forward FFFFFFFF-FFFF-FFFF-6824-61C457AA845C";
//		String input = "09-08-2016 22:13:02 WARNING 73 Behavioral-DoS \"network flood IPv4 TCP-SYN\" TCP 30.1.1.10 49 40.1.1.10 69 9 Regular \"NetworkPolicy\" ongoing  617037 308488 N/A 0 N/A high forward FFFFFFFF-FFFF-FFFF-6824-61C457AA845C";
//		Pattern pattern = Pattern.compile(".*(\\b\\d{4}\\b)");
		Pattern pattern = Pattern.compile(".*(WARNING\\s73\\sBehavioral-DoS.+TCP.+30.1.1.10\\s49\\s40.1.1.10\\s69\\s.+\"NetworkPolicy\".+ongoing)");
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
		    System.out.print(matcher.group(0));
		}
	}*/
	
	public static void main(String[] args) {
		String input = "June 1995 – June 2003 (8 years 1 month)";
		Pattern pattern = Pattern.compile("(\\d+)-(\\b\\d{4})");//(".*(\\b\\d{4}\\b)");
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			System.out.println(matcher.group(0));
		    System.out.println(matcher.group(1));
//		    System.out.print(matcher.group(2));
		}
	}

}
