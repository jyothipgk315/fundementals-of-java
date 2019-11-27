package prepration;
import java.util.Scanner;
public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int n1=s.nextInt();
System.out.println("enter the second number");
int n2=s.nextInt();
int f=0;
for(int j=n1;j<=n2;j++)
{
for(int i=2;i<n1/2;i++ )
{ 
	if(n1%i==0)
	{
		// f=1;
		System.out.println(n1);
	}
}
}
/*if(f==0)
{
	System.out.println("prime");
}
else
{
	System.out.println("not a prime");
}*/
	}

}
