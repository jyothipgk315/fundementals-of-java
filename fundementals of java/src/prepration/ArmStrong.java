package prepration;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		int a=n;
		int re=n;
		int c=0;
		double arm=0;
		while(n!=0)
		{
			int d=n%10;
			c=c+1;
			n=n/10;
			
		}
		while(a!=0)
		{
		int d1=a%10;
		 arm=Math.pow(d1,c)+arm;
		 a=a/10;
		}
		if(arm==re)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}

}
