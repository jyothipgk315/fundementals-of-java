package prepration;

import java.util.Scanner;

public class Pallindrom1 {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number :");
int n=s.nextInt();
int a=n;
int d=0;int  k=0;


while(n!=0)
{
	 d=n%10;
	 k=(k*10)+d;
	n=n/10;
	
}
if(a==k)
{
System.out.println("pallindrom");
}
else
{
	System.out.println("not pallindrom");
}
	}

}
