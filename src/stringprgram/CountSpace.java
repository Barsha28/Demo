package stringprgram;

public class CountSpace {
	public static void main(String[] args) {
		String s="barsha rani abc";
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
