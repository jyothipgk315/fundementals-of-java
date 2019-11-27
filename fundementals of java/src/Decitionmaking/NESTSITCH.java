package Decitionmaking;
import java.util.Scanner;
public class NESTSITCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//String rating="three";
		//String place ="thamilnadu";
		System.out.println("enter the state");
		String place=s.nextLine();
		switch (place){
		case "kerala":
			System.out.println("enter the rating for hotel");
			String rating=s.nextLine();
			
			switch (rating) {
		case "five":
			System.out.println("joys palace");
			break;
		case "three":
			System.out.println("queen");
			break;
			}
			break;
			
			
		case "thamilnadu":
			System.out.println("enter the rating for hotel");
			String ratin=s.nextLine();
			
			switch (ratin){
				case "five":
					System.out.println("murukka");
					break;
				case "three":
					System.out.println("palani");
		break;
		
		}
			break;

	}

}
}