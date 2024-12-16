package stringprgram;

public class PalindromeAString {
	public static void main(String[] args) {
		String s="Madam";
		String s1="";
		for (int i = s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);	
		}
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("palindrome");
		}
	}
}
