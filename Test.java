
import java.util.regex.*;
import java.util.Scanner;
public class Test{
	public static void main(String[] args) throws Exception {
		// Create a pattern to match breaks
		//String teststring = "This is a coding test. I like java so much. This is my day";
		System.out.println("Enter Paragraph");
		Scanner sc = new Scanner(System.in);
		String teststring = sc.nextLine();
		Pattern p = Pattern.compile("(?<=\\w[\\w\\)\\]][\\.\\?\\!]\\s)");  
		String[] result = p.split(teststring);
		System.out.println("Reversed String:--");
		for (int i=0; i<result.length; i++)
		{
			String s[] = result[i].split(" ");
			String ans = "";
			for (int j=s.length - 3; j>=0;j--){
				ans += s[j] + " ";
			}	
			
			System.out.println(ans.substring(0, ans.length() - 1)+ " "+ s[(s.length-2)]+" "+ s[(s.length-1)]);
		}
	}
	
}

