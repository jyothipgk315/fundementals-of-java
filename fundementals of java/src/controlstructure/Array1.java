package controlstructure;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int [] a=new int[size];
		int [] b=new int[size];
		int i;
		for( i=0;i<size;i++) {
			System.out.println("index["+i+"]");
			a[i]=s.nextInt();
		}
		
		for( i=0;i<size;i++) {
			System.out.println("index["+i+"]");
			b[i]=s.nextInt();
		
	}
		for( i=0;i<size;i++) {
			int c=a[i]+b[i];
			System.out.println(c);
		}
	}

}
