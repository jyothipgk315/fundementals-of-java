package controlstructure;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=0;
		int lcm=0;
		System.out.println("enter the numberS:");
		int a=s.nextInt();
		int B=s.nextInt();
		max=(a>B)?a:B;	
		for(int i=max; ;i++)
		{
			if(i%a==0&&i%B==0)
			{
				lcm=i;
				break;
					}
				
				}

		System.out.println(lcm);
		s.close();
		

	}
  
}
