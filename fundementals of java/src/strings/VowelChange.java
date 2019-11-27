package strings;

import java.util.Scanner;

public class VowelChange {

	public static void main(String[] args) {
		/*
input
		
face
focus
academy

output

f$c$#o#u#ACADEMY 
		 */
		Scanner s=new Scanner (System.in);
		String s1=s.next();
		String s2=s.next();
		String s3=s.next();
		for( int i=0;i<s1.length();i++) //convert all vowel into $
		{
			Character c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.print("$");
			}
			else
			{
				System.out.print(c);
			}
		}
		for( int i=0;i<s2.length();i++)  //convert all cosonent into #
		{
			Character c=s2.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.print(c);
			}
			else
			{
				System.out.print("#");
			}
		}
		
		System.out.print(s3.toUpperCase());  //convert it into upper case
	}

}
