package prepration;

import java.util.Scanner;

public class Fibanocci2 {

	public static void main(String[] args) {
		//check the given number is fibannoci or not
Scanner s= new Scanner(System.in);
int a=0;
int b=1;
int f=0;
System.out.println("enter the number:");
int n=s.nextInt();
for(int i=2;i<2*n;i++)
{
	int d=a+b;
	a=b;
	b=d;
	if(d==n)
	{
	f=1;
	break;
	}
	
}
if(f==1||n==0||n==1)
{
	System.out.println("ys");
}
else
{
	System.out.println("no");
}
	}

}
