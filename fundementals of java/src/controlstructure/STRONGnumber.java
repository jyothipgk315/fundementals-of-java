package controlstructure;
import java.util.Scanner;
public class STRONGnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int y=a;
		int s=0;
		while(a!=0)
		{
			int f=1;
			int k=a%10;
			for(int i=1;i<=k;i++) 
			{
			f=f*i;	
			}
		 s=s+f;
		 a/=10;
		}
		if(y==s)
		{
			System.out.println("STRONG NUMBER");
		}
		else 
		{
		System.out.println("NOT A STRONG NUMBER");
		}

	}

}
