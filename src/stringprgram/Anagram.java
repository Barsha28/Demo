package stringprgram;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="siL ent",s2="listen";
	s1=s1.replaceAll("\\s","").toLowerCase();
	s2=s2.replaceAll("\\s","").toLowerCase();
	if(s1.length()!=s2.length()) {
		System.out.println("string is not anagram");
	}
	else {
		char ch1[]=s1.toCharArray();
		char ch2[]=s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)==true) {
			System.out.println("string is anagram");
		}
		else {
			System.out.println(s1+" "+s2+"string is not anagram");
		}

	}
}
}
