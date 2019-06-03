package project;
import java.io.DataInputStream;
import java.io.IOException;
public class VolumeOfCone {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream a= new DataInputStream(System.in);
     	System.out.println("Enter the radius of cone:");
		double r=Double.parseDouble(a.readLine());
            System.out.println("Enter the height of cone:");
     	double h=Double.parseDouble(a.readLine());

   
             double  volume=(22*r*r*h)/(3*7);

         System.out.println("Volume Of Cone is:" +volume);


	}

}


