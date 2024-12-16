package practiceJava;

import java.util.Arrays;

public class abc {
	public static void main(String[] args) {
		int a[]= {5,10,15};
		int b[]= {51,63,8,6};
		int c[]=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		System.out.println(Arrays.toString(c));
	}
}
