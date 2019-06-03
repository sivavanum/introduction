package project;
import java.io.DataInputStream;
import java.io.IOException;
public class AreaOfParalellogram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
    double d1,d2,area;
    DataInputStream a=new DataInputStream(System.in);
    System.out.println("Enter side one:");
    d1=Double.parseDouble(a.readLine());
    System.out.println("Enter side two:");
    d2=Double.parseDouble(a.readLine());
    area=(d1*d2);
    System.out.println("Area of paralellogram:"+area);
    
	}
}


