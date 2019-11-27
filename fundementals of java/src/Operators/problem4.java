package Operators;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=a/10;
		int d=a%10;
		 d=d*c;
		 c=c*c;
		System.out.printf("%d%d",d,c);

	}

}
