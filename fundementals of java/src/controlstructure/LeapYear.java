package controlstructure;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int j=a;
		int r=a%100;
		if(r==0) {
			System.out.println("its a century year");
			int e=j%400;
			if(e==0) {
				System.out.println("its a leap year also");
				}
		}
		else {
			System.out.println("its a normal year");
			int y=j%4;
			if(y==0) {
				System.out.println("its a leap year also");
			}
		}

	}

}
