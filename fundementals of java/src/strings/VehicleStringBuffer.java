package strings;

import java.util.Scanner;



public class VehicleStringBuffer {

	public static void main(String[] args) {
		//
		Scanner sc=new Scanner (System.in);
		System.out.println("1.car\n2.bike");
		int n=sc.nextInt();
		StringBuffer b=new StringBuffer();
		switch(n)
		{
		case 1:
			System.out.println("Enter the details of bike\nEnter the color ");
			b.append("color :"+sc.next()+"\n");
		System.out.println("Enter the maximum speed");
		b.append("speed :"+sc.next()+"\n");
		System.out.println("Enter the number of seats");
		b.append("no of seats :"+sc.next()+"\n");
		System.out.println("Enter the number of wheels");
		b.append("weels :"+sc.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		b.append("status of break :"+sc.next()+"\n");
		System.out.println(b);
		break;
		case 2:
			System.out.println("Enter the details of car\nEnter the color ");
			b.append("color :"+sc.next()+"\n");
			System.out.println("Enter the maximum speed");
			b.append("speed :"+sc.next()+"\n");
			System.out.println("Enter the number of seats");
			b.append("no of seats :"+sc.next()+"\n");
			System.out.println("Enter the number of wheels");
			b.append("weels :"+sc.next()+"\n");
			System.out.println("Enter the number of doors");
			b.append("doors :"+sc.next()+"\n");
			System.out.println("Enter the status of diskbreak(true/false)");
			b.append("status of disbreak :"+sc.next()+"\n");
			System.out.println(b);
			break;
			
			default:System.out.println("Invalid Option");
				
		}
	}

}
