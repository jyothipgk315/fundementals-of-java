package controlstructure;
import java.util.Scanner;
public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int [] a=new int[size];
		int i;
		int m=0,k=0;
		for( i=0;i<size;i++) 
		{
			System.out.println("index["+i+"]");
			a[i]=s.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(a[i]>=m)
			{
				m=a[i];
			}

		}
		
			for(i=0;i<size;i++)
			{
				if((a[i]<m)&&(a[i]>=k)) 
				{
					k=a[i];
				}
			}
		
			System.out.println("second large number is  :"+k);
		
	
		
	}
}
		

	


