package stringprgram;

public class LargestWOrd {
public static void main(String[] args) {
	String s="barsha rani maharana";
	String s1[]=s.split(" ");
	String largest=s1[0];
	for (int i = 0; i < s1.length; i++) {
		if(largest.length()<s1[i].length()) {
			largest=s1[i];
		}
	}
	System.out.println(largest+":"+largest.length()+":"+"is the largest word");
}
}
