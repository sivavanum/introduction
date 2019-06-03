package project;
import java.io.DataInputStream;
import java.io.IOException;
public class PerimeterOfRhombus {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
        double s,p;
        DataInputStream a=new DataInputStream(System.in);
		System.out.println("Enter side of square:");
	    s=Double.parseDouble(a.readLine());
	    p=4*s;
	    System.out.println("perimeter of square is:"+p);
	}

}


