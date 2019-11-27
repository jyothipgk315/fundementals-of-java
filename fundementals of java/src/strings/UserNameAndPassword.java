package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameAndPassword {

	public static void main(String[] args) {
		/*
		 Pattern p=Pattern.compile(".@");
		Matcher m=p.matcher("P@");
		boolean b=m.matches();
		System.out.println(b);                        

		 */
		Scanner s= new Scanner(System.in);
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		 Pattern pswNamePtrn = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
		 Pattern pattern = Pattern.compile(regex);
		 System.out.println("Enter the Email ID :");
		 String email=s.next();
		 Matcher em=pattern.matcher(email);
		 System.out.println("Enter the Password :");
		 String password=s.next();
		 Matcher mat =pswNamePtrn.matcher(password);
		 if(em.matches())
		 {
			 System.out.println("valid Email ID");
			 
		 }
		 else
		 {
			 System.out.println("invalid ID");
		 }
		 if(mat.matches())
		 {
			 System.out.println("Valid password ");
		 }
		 else
		 {
			 System.out.println("Invalid password");
		 }
	}

}
