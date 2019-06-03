package project;
import java.io.DataInputStream;
import java.io.IOException;
public class VolumeOfCylinder {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream a= new DataInputStream(System.in);
		System.out.println("Enter the radius:");
        double r=Double.parseDouble(a.readLine());
        System.out.println("Enter the height:");
        double h=Double.parseDouble(a.readLine());

           double  volume=3.14*r*r*h;

           System.out.println("volume of Cylinder is: " +volume);
      
	}

}

