package controlstructure;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		int j=1;
System.out.println("enter the number:");
int n=s.nextInt();
for( i=1;i<=n;i++) {
	 j=i*j;
}
System.out.println(j);
	}

}
