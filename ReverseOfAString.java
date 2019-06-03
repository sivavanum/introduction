package project;
import java.util.Scanner;
public class ReverseOfAString {
	public static void main(String args[])
	{
		String str,rev;
		System.out.println("Enter a string:");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		s.close();
	    rev=reverse(str);
	    System.out.println("reverse of a string:"+rev);
	    
	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		String rev = "";
		for(int j=str.length();j>0;--j)
		{
			rev=rev+str.charAt(j-1);
		}
		
		return rev;
	}

}
