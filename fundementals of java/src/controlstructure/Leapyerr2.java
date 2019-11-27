package controlstructure;
import java.util.Scanner;
public class Leapyerr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int a=s.nextInt();
		if((a%4==0 && a%100!=0)||(a%400==0)) 
		{
		System.out.println("leap year");	
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
