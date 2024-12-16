package stringprgram;

public class VowelsAndConsonant {
public static void main(String[] args) {
	String s="Barsharani";
	s=s.toLowerCase();
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			System.out.println("vowel  --"+s.charAt(i));
		}
		else {
			System.out.println("consonant  --"+s.charAt(i));

		}
	}
}
}
