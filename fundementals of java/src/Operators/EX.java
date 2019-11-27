package Operators;
import java.util.Scanner;
public class EX {

	
		    public static void main(String args[])
		    {
		        //fill your code;
		    	 Scanner s=new Scanner(System.in);
		         String str=s.nextLine();
		         int l =str.length();
		         int c=0;
		         for(int i=0;i<l;i++)
		         {
		        	char ch=str.charAt(i);
		         
		         if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		         {
		        	c=c+1; 
		         for(int j=0;j<c;j++)
		         {
		          System.out.print("*");		         
		         }
		         System.out.print(ch);
		         for(int j=0;j<c;j++)
		         {
		          System.out.print("*");		        	 
		         }
		         }
		         else
		         {
		        	 System.out.print(ch);
		         }
		         }
  }
}
		 
		     
			
								  
					
					
