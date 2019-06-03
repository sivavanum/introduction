package project;
import java.util.Scanner;
public class AreaOfTriangle 
{

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
	           double b,h,area ;
	           Scanner s=new Scanner(System.in);
	           System.out.println("Enter Breadth of the triangle:");
	           b=s.nextDouble();
	           System.out.println("Enter Height of the triangle:");
	           h=s.nextDouble();
	           s.close();
	           area=(b*h)/2;
	           System.out.println("Area of Triangle is "+area);
	           
	        		 
	}

}


