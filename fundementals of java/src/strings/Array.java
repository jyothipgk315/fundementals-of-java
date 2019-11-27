package strings;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new Scanner (System.in);
		 int n=s.nextInt();
		 
		 int a[]=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 a[i]=s.nextInt();
		 }
		 System.out.print("[");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+",");
			for(int j=0;j<i;j++)
			{
				System.out.print(a[j]+",");
				
			}
			break;
		}
System.out.print("]");
	}

}
