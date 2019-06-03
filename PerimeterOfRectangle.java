package project;
import java.io.DataInputStream;
import java.io.IOException;
public class PerimeterOfRectangle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		double l,b,p;
		DataInputStream a=new DataInputStream(System.in);
		System.out.println("Enter Length of rectangle:");
		l=Double.parseDouble(a.readLine());
		System.out.println("Enter width of rectangle:");
		b=Double.parseDouble(a.readLine());
        p=2*(l+b);
        System.out.println("Perimeter of Rectangle:"+p);
	}

}
