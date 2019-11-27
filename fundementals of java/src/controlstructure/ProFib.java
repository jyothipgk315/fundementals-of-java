package controlstructure;
import java.util.Scanner;

public class ProFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=0,b=1;
		int m=0;
		int k=s.nextInt();
		for(int i=0;i<10;i++) {
			int c=a+b;
			if(c==k) {
				
				m++;
			}
			a=b;
			b=c;
		}
			if(m==0) {
				System.out.println("no");
			}
			else {
				System.out.println("yes");
			}
			
		
		}
	
}

