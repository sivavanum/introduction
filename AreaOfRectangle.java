package project;
import java.util.Scanner;
public class AreaOfRectangle 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double l,b,area;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Length of rectangle:");
		l=a.nextDouble();
		System.out.println("Enter Breadth of rectangle:");
		b=a.nextDouble();
		a.close();
        area=l*b;
        System.out.println("Area of Rectangle:"+area);
	}
}
        

