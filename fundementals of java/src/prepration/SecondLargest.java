package prepration;

import java.util.Scanner;

public class SecondLargest {
//find the second largest number in an array
	public static void main(String[] args) {
	Scanner s= new Scanner (System.in);	
	System.out.println("Enter the Size of The Array :");
	int size= s.nextInt();
	int m=0,k=0,i;
	int a[]=new int[size];
	for(i=0;i<size;i++)
	{
		a[i]=s.nextInt();
	}
for( i=0;i<size;i++)
{
	if(a[i]>=m)
	{
	m=a[i]	;
	}
}
	for( i=0;i<size;i++)
	{
		if(a[i]<m&&a[i]>=k)
		{
			k=a[i];
		}
	
}
System.out.println("Second Largest NUmber is "+k);
	}

}
