package controlstructure;
import java.util.Scanner;
public class HCF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int min =0;
		int gcd=0;
		System.out.println("enter the numberS:");
		int a=s.nextInt();
		int B=s.nextInt();
		min=(a<B)?a:B;	
		for(int i=min;i>0;i--)
		{
			if(a%i==0&&B%i==0)
			{
		gcd=i;
		break;
			}
		
		}
		
		System.out.println(gcd);
		s.close();
	}

}
