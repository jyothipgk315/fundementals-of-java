package strings;

public class EmployDetailUsingStringBuffer {

	public static void main(String[] args) {
		// Employ Detail Using StringBuffer
		StringBuffer s=new StringBuffer("employ details");
		s.insert(6,"s"); //insert values
		StringBuffer s1=new StringBuffer("name : jyothi k");
		s1.deleteCharAt(14); //delete one character
		StringBuffer s2=new StringBuffer("ID : 13040347");
		s2.delete(11,13);  //delete more character 
		StringBuffer s3=new StringBuffer("Age : 21");
		s3.replace(6,8,"twenty one"); //replace sentence
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	
	}

}
