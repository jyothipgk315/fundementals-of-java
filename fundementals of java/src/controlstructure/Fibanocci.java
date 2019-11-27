package controlstructure;
import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=0,b=1;
		System.out.printf("%d %d",a,b);
		for(int i=0;i<10;i++ ) {
			int c=a+b;
			System.out.printf("  %d  ", c);
			a=b;
			b=c;
		}
			

	}

}
