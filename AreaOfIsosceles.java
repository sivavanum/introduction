package project;
import java.util.Scanner;
public class AreaOfIsosceles {
	public static void main(String[] args) {
		double a,b,area;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter side one of isosceles:");
		a=s.nextDouble();
		System.out.println("Enter side two of isosceles:");
		b=s.nextDouble();
		s.close();
        area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("Area of Isosceles is "+area);
        
	}

}
