package strings;

import java.util.Scanner;

public class DetailsUsingBuffer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		StringBuffer s=new StringBuffer();
		System.out.println("enter the name");
		s.append("Name :"+sc.next()+"\n");
		System.out.println("enter the ID Num");
		s.append("ID :"+sc.nextInt()+"\n");
		System.out.println(s);
	}

}
