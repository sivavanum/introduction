package project;
import java.io.DataInputStream;
import java.io.IOException;

public class AreaOfEquilateral {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 double s,area;
		    DataInputStream a=new DataInputStream(System.in);
		    System.out.println("Enter side of a triangle:");
		    s=Double.parseDouble(a.readLine());
		   area= (Math.sqrt(3)/4)*(s*s);
		    System.out.println("Area of Equilateral:"+area);
		    

	}

}

