package prepration;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the no");
		int a=s.nextInt();
		int f=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				f=1;
				break; 
			}
		}
		if(f==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println(" not prime number");	
		}

	}

}
