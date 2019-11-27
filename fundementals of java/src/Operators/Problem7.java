package Operators;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the principle amount:");
		int p=s.nextInt();
		System.out.println("enter the year:");
		int n=s.nextInt();
		System.out.println("enter the rate:");
		float r=s.nextFloat();
		float f=p*n*r;
		float k=f/100;
		System.out.printf("%.03f",k);
			
	}

}
