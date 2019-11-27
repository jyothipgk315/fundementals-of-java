package strings;

import java.util.Scanner;

public class Polymorphism {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		Car ca=new Car();
		bike bi=new bike();
		System.out.println("1.car\n2.bike");
		
		switch(s.nextInt())
		{
		case 1:ca.display();
		break;
		case 2:bi.display();
		break;
		default:System.out.println("Invalid input");
		}
	}
}
		class bike
		{
		Scanner sc=new Scanner(System.in);
		StringBuffer b1=new StringBuffer();
		void display()
		{
			System.out.println("Enter the details of bike\nEnter the color ");
			b1.append("color :"+sc.next()+"\n");
		System.out.println("Enter the maximum speed");
		b1.append("speed :"+sc.next()+"\n");
		System.out.println("Enter the number of seats");
		b1.append("no of seats :"+sc.next()+"\n");
		System.out.println("Enter the number of wheels");
		b1.append("weels :"+sc.next()+"\n");
		System.out.println("Enter the status of diskbreak(true/false)");
		b1.append("status of break :"+sc.next()+"\n");
		System.out.println(b1);	
		}
		}
		class Car
		{
			Scanner sc=new Scanner(System.in);
			StringBuffer b=new StringBuffer();
			void display()
			{
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
			}	
		}
			