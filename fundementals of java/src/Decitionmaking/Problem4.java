package Decitionmaking;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>=4&&b<=5) {
			int c=a+b;
			System.out.println(c);
		}
		else {
			if(a<4) {
				int c=a*b;
				System.out.println(c);
			}
			if(b>5) {
				int c=b-a;
				System.out.println(c);
			}
		
			}
		
			

	}

}
