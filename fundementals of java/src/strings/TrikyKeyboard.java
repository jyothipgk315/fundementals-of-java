package strings;

import java.util.Scanner;

public class TrikyKeyboard {

	public static void main(String[] args) {
		// Enter a character
		//R
		//Enter the string
		//s;;upimrrfod;pbr
		//The original message
		//allyouneedislove	
		Scanner s=new Scanner(System.in);
		char c[]= {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};
		System.out.println("enter the character : (l/r)");
		char ch=s.next().charAt(0);
		System.out.println("Enter the String");
		String str=s.next();
		int len=str.length();
		int len2=c.length;
		for(int i=0;i<len;i++)
		{
			char str1=str.charAt(i);
			
			for(int j=0;j<len2-1;j++)
			{
				if(str1==c[j]&&ch=='r')
				{
					
					System.out.print(c[j-1]);
				}
				else if(str1==c[j]&&ch=='l')
				{
					System.out.print(c[j+1]);	
				}
			}
		}
		
		
		}

}
