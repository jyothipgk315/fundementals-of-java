package controlstructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrray {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		int g=0;
		int a=0;
		do {
		
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("enter the number:");
		 a=Integer.parseInt(br.readLine());
		if(a>0) {
			 g=a+g;
		}
		}
		while(a>0);
			System.out.println(g);	
			
		
	
		
		
	}
}
