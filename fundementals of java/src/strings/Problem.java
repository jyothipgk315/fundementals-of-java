package strings;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// input: my name is new
		//output: my eman is wen
		Scanner s= new Scanner (System.in);
		String input =s.nextLine();    //my name is new
		String word[]=input.split(" "); //word[]={ my name is new }
		
		for(int i=0;i<word.length;i++) //loop runs up to 4 times
		{
			if(i%2==0)   			//even positions  of array are printed 
				                   //ie, my is
			{
				System.out.print(word[i]+" ");
			}
			else        //odd position of array 
			{
			String str=word[i];
			int len=str.length();
			for(int j=len-1;j>=0;j--)  //reverse the odd position
			{
				System.out.print(str.charAt(j)); // print each character one by one
			}
			System.out.print(" ");
			}
		}
s.close();
	}

}
