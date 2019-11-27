package Decitionmaking;
import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your id");
		String name=s.nextLine();
		
		System.out.println("enter the password");
		String password=s.nextLine();
		
		
		if (name.equals("LTJE")&& password.equals("QWERTY"))
		{
			System.out.println("processing");
		}
			
		else {
				System.out.println("not matching");
			}
		}
		
		

	}


