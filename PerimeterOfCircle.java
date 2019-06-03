package project;
import java.io.DataInputStream;
import java.io.IOException;
public class PerimeterOfCircle {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
              double r,perimeter;
              DataInputStream a=new DataInputStream(System.in);
              System.out.println("Enter radius of circle:");
              r=Double.parseDouble(a.readLine());
              perimeter=2*(22/7)*r;
              System.out.println("perimeter of the circle:"+perimeter);
              
              
	}

}

