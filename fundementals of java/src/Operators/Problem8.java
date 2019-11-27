package Operators;
import java.util.Scanner;  
public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner s=new Scanner(System.in);

int a=s.nextInt();
int c=a%10;
int d=a/10;
int e=c*d;
int f=c-d;
System.out.printf("%d%d",f,e);
int g=e%10;
int h=e/10;
int i=g*h;
int j=g+h;
System.out.printf("%d%d\n",i,j);
	}

}
