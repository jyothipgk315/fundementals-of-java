package controlstructure;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");

int b=s.nextInt();
int y=0;
for(int i=a;i<=b;i++) {
	 y=i+y;
}
System.out.println(y);
	}
	}


