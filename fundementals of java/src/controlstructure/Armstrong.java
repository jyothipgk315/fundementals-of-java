package controlstructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Armstrong {

	public static void main(String[] args)throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
		System.out.println("enter the number:");
		int a=Integer.parseInt(br.readLine());
		int c=a;
		int d=a;
		int j=0;
			double m=0;
		while(a!=0) {
			
			j=j+1;
			a=a/10;
		}
while(d!=0) {
	int y=d%10;

	m=m+Math.pow(y,j);
	
	
	d=d/10;
}
 


if(m==c) {
	System.out.println("armstrong");
}
else {
	System.out.println("not armstrong");
}
	}

}
