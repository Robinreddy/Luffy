package inherit;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		String n ="Madam";
		String rev ="";
	
		for(int i=(n.length()-1);i>=0;i--) {
			rev =rev +n.charAt(i);
		}
			
			if(rev.equalsIgnoreCase(n)) {
				System.out.println("palindrome");
				
			}
			else {
				System.out.println(" not palindrome");
			}
			
		}
		
}