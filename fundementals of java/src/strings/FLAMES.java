package strings;

import java.util.Scanner;

public class FLAMES {

	public static void main(String[] args) {
		// check the game FLAMES
		Scanner s= new Scanner (System.in);
		String s1=s.nextLine();
		int len=s1.length();
		String a[]=new String[len];
		String s2=s.nextLine();
		int len2=s2.length();
		String b[]=new String[len2];
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
		for(int j=0;j<s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				c++;
				a[i]="";
				b[i]="";
			}
			
		}
		}
		System.out.println(c);
		
			}

}
