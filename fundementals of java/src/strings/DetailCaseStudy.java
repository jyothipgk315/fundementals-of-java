package strings;

import java.util.Scanner;

public class DetailCaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner sc=new Scanner (System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("enter the name");
		s.append("Name :"+sc.next()+"\n");
		System.out.println("Contact Numer");
		s.append("ID :"+sc.nextInt()+"\n");
		System.out.println("Email ID :");
		s.append("Email ID :"+sc.next()+"\n");
		System.out.println("Enter the Proof Type");
		s.append("Proof Type :"+sc.next()+"\n");
		System.out.println("Enter Proof ID ");
		s.append("Proof ID"+sc.next()+"\n");
		System.out.println("Thank you for registering. Your id is "+i);
		i=i+1;
		System.out.println("Do you want to continue registration (y/n)?");
	
		if(sc.next().contentEquals("yes"))
		{
			System.out.println("Do u want to update");
			if(sc.next().equals("yes"))
			{
				System.out.println("new email");
				s.append(sc.next());
				System.out.println("updated");
			}
			System.out.println(s);
			
		}
		else
		{
			System.out.println(s);
		}
	}

}

