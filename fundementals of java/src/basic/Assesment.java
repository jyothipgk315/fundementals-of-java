package basic;
import java.util.Scanner;
public class Assesment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		String word=s.next();
	     StringBuilder res=new StringBuilder();
	    char first=word.charAt(0);
	    res.append(first);
	    for (int i = 1; i < word.length(); i++) {
	        char ch=word.charAt(i);
	        if(ch!=first){
	           res.append(ch);
	        }
	       first=ch;
	    }
	    System.out.println(res);

	}

}
