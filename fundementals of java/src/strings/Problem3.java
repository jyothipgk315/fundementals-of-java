package strings;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// find the largest character in the String
		Scanner s=new Scanner (System.in);
		int m=1,r,j;
		String input=s.nextLine();  //input the String
	    String word[]=input.split(" ");   //Store the String into Array
	    for(int i=0;i<word.length;i++)  // taking the first word
	    {
	     r=word[i].length();  //find the length of word
	    if(r>m)
	    {
	    m=r; //for finding the largest word length
	    
	    }
	    }
	    for(int i=0;i<word.length;i++)
	    {
	    	j=word[i].length();
	    	if(j==m)
	    		
	    	{
	    	System.out.println(word[i]); // print the largest word
	    	break;
	    	}
	    }
	    System.out.println(m);
	}

}
