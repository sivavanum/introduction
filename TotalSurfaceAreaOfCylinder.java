package project;
import java.io.DataInputStream;
import java.io.IOException;
public class TotalSurfaceAreaOfCylinder {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
          DataInputStream a=new DataInputStream(System.in);
       	System.out.println("Enter the radius:");
     	
    		double r=Double.parseDouble(a.readLine());
       	
		System.out.println("Enter the height:");
       	
		double h=Double.parseDouble(a.readLine());

          	double  tsa=((2*22*r)/7)*(r+h);

          	System.out.println("TotalSurfaceArea Of Cylinder is:  " + tsa);
     
          
          
          
	}

}
