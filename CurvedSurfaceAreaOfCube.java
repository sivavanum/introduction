package project;
import java.io.*;
public class CurvedSurfaceAreaOfCube {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream a= new DataInputStream(System.in);
		 System.out.println("Enter the side of cube:");
         
		 double side=Double.parseDouble(a.readLine());
	       
	         double  v=4*side*side;
	 
	         System.out.println("CurvedSurfaceArea Of Cube is:" +v);
	       
		
		
		
	}

}

