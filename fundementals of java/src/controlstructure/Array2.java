package controlstructure;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int [] a=new int[size];
		int i;
		int c=0;
		int y=0;int sum=0;int sum1=0;int avg=0;int avg2=0;
		for( i=0;i<size;i++) {
			System.out.println("index["+i+"]");
			a[i]=s.nextInt();
			
		}
		System.out.println("even");
		for( i=0;i<size;i++) 
		{
			
			if(a[i]%2==0) 
			{
				c++;
				System.out.println(a[i]);
				sum=a[i]+sum;
			}
		}
		 
		
		System.out.println("odd");
		for( i=0;i<size;i++) 
		{
	
			if(a[i]%2!=0) 
			{
				y++;
				System.out.println(a[i]);
				sum1=a[i]+sum1;
				
			}
		}
		avg=sum/c;
		avg2=sum1/y;

		System.out.println("odd"+avg2);

		System.out.println("even"+avg);

	}

	}
