package starProgram;

public class Simple {
	public static void main(String[] args) {
		int a[]= {5,2,3,8};
		for(int j=0;j<a.length;j++) {
			int fact=1;
		for (int i = 1; i <=a[j]; i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+a[j]+""+fact);

		}
		}

	}
