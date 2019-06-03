package project;
import java.io.DataInputStream;
import java.io.IOException;
public class PerimeterOfParalellogram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
     double b,h,p;
     DataInputStream a=new DataInputStream(System.in);
     System.out.println("Enter breadth of paralellogram: ");
	 b=Double.parseDouble(a.readLine());
	 System.out.println("Enter height of paralellogram: ");
	 h=Double.parseDouble(a.readLine());
     p=2*(h+b);
     System.out.println("perimeter of paralellogram:"+p);
     
	}

}
