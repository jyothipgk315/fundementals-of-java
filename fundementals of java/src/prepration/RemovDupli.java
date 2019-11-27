package prepration;

import java.util.Scanner;

public class RemovDupli {

	public static void main(String[] args) {
	//Remove duplicate number in the Array
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the size of the Array :");
		int n=s.nextInt();
		int a[]=new int[n];
		int temp[]=new int[n];
		int j;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			
				if(a[i]!=a[i+1])
				{
					System.out.println(a[i]);
				}
				
			}
			
		
		
		
	}

}
