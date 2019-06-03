package project;
import java.io.DataInputStream;
import java.io.IOException;
public class VolumeOfPrism {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		DataInputStream a= new DataInputStream(System.in);
		System.out.println("Enter the area of base:");
        double base=Double.parseDouble(a.readLine());
        System.out.println("Enter the height:");
        double height=Double.parseDouble(a.readLine());
        

         
         double  area=base*height ;
     System.out.println("Volume Of Prism is: " + area); 

	}

}

