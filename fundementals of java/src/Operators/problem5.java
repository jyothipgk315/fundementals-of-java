package Operators;
import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=a/100;
		int c=a/10;
		int d=c%10;
		int e=a%10;
		int r=b*e;
		int k=e*e;
		System.out.printf("%d%d",k,r);
		int y=k*r;
		System.out.printf("\n%d",y);

	}

}
