package strings;

import java.util.Scanner;

public class FrequnencyOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine().toUpperCase();
        for(char c='A';c<='Z';c++)
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                char x=str.charAt(i);
                if(x==c)
                    count++;
            }
            if(count>0)
                System.out.println(c+"\t"+count);
        }
	}

}
