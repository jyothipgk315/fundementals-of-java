package strings;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		
		//the 3 strings are
String a=new String("now is");
String b=new String("the time");
String c=new String("the");

//find the length of first string

System.out.println(a.length());

//find the character in index 4  of first String

System.out.println(a.charAt(4));

//find the characters from index 2 to 5

System.out.println(a.substring(2, 5));

//check  second String Start with "the"  (true/false)

System.out.println(b.startsWith("the"));

//get the Starting index of "is" from the first String

System.out.println(a.indexOf("is"));

//concat 2 Strings

System.out.println(a.concat(" "+c));

//Replace the letter in the String

System.out.println(b.replace("t","T"));

//Split the words into Array.And print them

String word[]=a.split(" ");
for(int i=0;i<word.length;i++)
{
	System.out.print("{"+word[i]+"}");
}

//check both Strings are equal (true/false)

System.out.println("\n"+b.equals(c));

	}

}
