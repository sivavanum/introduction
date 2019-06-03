package project;
import java.util.Scanner;


public class AreaOfCircle {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of the circle:");
		double r=s.nextDouble();
		s.close();
		double area=3.14*r*r;
		System.out.println("Area of circle is "+area);
		

	}
}
