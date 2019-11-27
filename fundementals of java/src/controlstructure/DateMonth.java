package controlstructure;
import java.util.Scanner;
public class DateMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the date");
		String a=s.next();
		String n=""+a.charAt(3)+a.charAt(4);
		switch(n)
		{
		case"01":
			System.out.println("januvary");
		break;
		case"02":
			System.out.println("februvary");
		break;
		case"03":
			System.out.println("march");
		break;
		case"04":
			System.out.println("april");
		break;
		case"05":
			System.out.println("may");
		break;
		case"06":
			System.out.println("june");
		break;
		case"07":
			System.out.println("julay");
		break;
		case"08":
			System.out.println("august");
		break;
		case"09":
			System.out.println("septemper");
		break;
		case"10":
			System.out.println("october");
		break;
		case"11":
			System.out.println("november");
		break;
		case"12":
			System.out.println("december");
		break;
		
		}
	}

}
