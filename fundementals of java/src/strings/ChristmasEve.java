package strings;

import java.util.Arrays;
import java.util.Scanner;

public class ChristmasEve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("gust");
        String s1=s.next();
         

System.out.println("place");
String s2=s.next();         

String s3=s1+s2;   //concat 2 strings
int len1=s3.length();
char c1[]=s3.toCharArray();
Arrays.sort(c1);

System.out.println("third string");
String str=s.next();
int len2=str.length();
char c2[]=str.toCharArray();
Arrays.sort(c2);


String sor1=new String(c1);
String sor2=new String (c2);
if(sor1.equals(sor2))
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}

}
