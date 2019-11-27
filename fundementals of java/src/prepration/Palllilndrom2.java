package prepration;

import java.util.Scanner;

public class Palllilndrom2 {
                        //find the given String is pallindrom or not
	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter the String :");
		String st= s.next();
		String rev="";
		for(int i=st.length()-1;i>=0;i--)
		{
		rev=rev+st.charAt(i);
		
		}
		if(rev.equals(st))
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not a pallindrom");
		}
		}

}
