package stringOpr;

public class SplitTest {

	public static void main(String[] args) {

		String trapString = "WARNING 500008 SynFlood \"SYN Flood synProtAttack\" TCP 0.0.0.0 0 30.1.2.20 53 0 Regular \"dnsPolicy\" ongoing 2319 1087 N/A 0 N/A low challenge FFFFFFFF-FFFF-FFFF-0047-000055D9FB81";
		String[] trapTokens = trapString.split("\"");
		for (String string : trapTokens) {
			System.out.println(string);
		}
		
		System.out.println("******************");
		
		String trapTokensPart1[] = trapTokens[2].split(" ");
		System.out.println("Length = "+ trapTokensPart1.length);
		for (String string : trapTokensPart1) {
			System.out.println("\""+string+"\"");
		}
		
	}

}
