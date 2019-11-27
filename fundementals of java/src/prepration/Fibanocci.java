package prepration;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("enter the range:");
		int n=s.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++)
{
	int d=a+b;
	a=b;
	b=d;
	System.out.println(d);
	
}
	}

}
