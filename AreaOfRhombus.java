package project;
import java.io.*;
import java.io.DataInputStream;

public class AreaOfRhombus {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 double d1,d2,area;
		    DataInputStream a=new DataInputStream(System.in);
		    System.out.println("Enter diagonal one:");
		    d1=Double.parseDouble(a.readLine());
		    System.out.println("Enter diagonal two:");
		    d2=Double.parseDouble(a.readLine());
		    area=(d1*d2)/2;
		    System.out.println("Area of Rhombus:"+area);
		    
	}

}


