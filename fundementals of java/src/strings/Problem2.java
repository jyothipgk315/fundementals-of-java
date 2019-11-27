package strings;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		String str=s.nextLine();
		int lower=0,upper=0,digits=0,space=0,vowel=0,symbol=0;
		for(int i=0;i<str.length();i++)
		{
		Character c=str.charAt(i); //read the String by Character
		
		//check lower case
		if(Character.isLowerCase(c))
		{
			lower++;
		}
		//check upper case
		if(Character.isUpperCase(c))
		{
			upper++;
		}
		//check the digits
		if(Character.isDigit(str.charAt(i))){
			digits++;
		}
		//check the space
		 if (c == ' ') 
		 {
		         space++;
		   }
		 //check the vowel
		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		 {
			 vowel++;
		 }
		 //check the special character
		if((c>=37&&c<=47)||(c>=58&&c<=64)||(c>=92&&c<=96)||(c>=123&&c<=126))
		{
			symbol++;
		}
		}
		//print all the count
		System.out.println("lower :"+lower);
		System.out.println("upper :"+upper);
		System.out.println("space :"+space);
		System.out.println("digit :"+digits);
		System.out.println("vowel :"+vowel);
		System.out.println("Sysmbol :"+symbol);
	}

}
