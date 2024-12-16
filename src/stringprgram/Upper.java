package stringprgram;

public class Upper {
public static void main(String[] args) {
	String s="i am good",str="";
	String s1[]=s.split(" ");
	for (int i = 0; i < s1.length; i++) {
		for (int j = 0; j < s1[i].length(); j++) {
			if(j==0) {
			int uc=s1[i].charAt(j)-32;
			str=str+(char)uc;
			}
			else {
				str=str+s1[i].charAt(j);
			}
		}
	}
	System.out.println(str);
}
}
