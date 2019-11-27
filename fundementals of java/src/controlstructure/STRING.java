package controlstructure;
import java.util.Scanner;
public class STRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter the size:");
		int size= s.nextInt();
		String f[]=new String[size];
		int i;
		char c = 0;
		for(i=0;i<size;i++)
		{
		
			f[i]=s.next();
			 
		}
		for(i=0;i<size;i++)
		{
			c =f[i].charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println(f[i]);
		}
		s.close();
	}
		

	}

}
