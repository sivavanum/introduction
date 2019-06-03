package project;
import java.io.DataInputStream;
import java.io.IOException;
public class PerimeterOfEquilateral {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
        double s,peri;
        DataInputStream a=new DataInputStream(System.in);
        System.out.println("Enter side of the triangle:");
        s=Double.parseDouble(a.readLine());
        peri=3*s;
        System.out.println("Perimeter of the equilateral triangle:"+peri);

}

}

