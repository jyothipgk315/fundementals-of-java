package basic;

import java.util.Scanner;

public class Lengthstring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		int i = 0;
		
		for(char c:st.toCharArray())
		{
			i++;
		}
System.out.println(i);
	}

}
