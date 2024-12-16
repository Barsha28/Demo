package stringprgram;

public class ReplaceAllTheVowels {
public static void main(String[] args) {
	String s="barsha";
	s=s.replaceAll("[aeiouAEIOU]", " ");
	System.out.println(s);
}
}
