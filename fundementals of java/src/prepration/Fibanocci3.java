package prepration;

import java.util.Scanner;

public class Fibanocci3 {

	public static void main(String[] args) {
		// print the n'th fibanocci number
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int a=0;
int b=1;
int d = 0;
 
for(int i=1;i<n-1;i++)
{
	 d=a+b;
	a=b;
	b=d;
	
}

System.out.println(d);


	}

}
