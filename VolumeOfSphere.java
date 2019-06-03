package project;
import java.io.DataInputStream;
import java.io.IOException;
public class VolumeOfSphere {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream a= new DataInputStream(System.in);
		System.out.println("Enter the radius of sphere:");
     	double r=Double.parseDouble(a.readLine());
            

   
             double  volume= (4*22*r*r*r)/(3*7);

         System.out.println("Volume is:" +volume);
	}

}
