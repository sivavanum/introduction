package project;
import java.util.Scanner;
public class DistanceBetweenPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          double x1,x2,y1,y2,dis;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter x1");
          x1=s.nextDouble();
          System.out.println("Enter x2");
          x2=s.nextDouble();
          System.out.println("Enter y1");
          y1=s.nextDouble();
          System.out.println("Enter y2");
          y2=s.nextDouble();
          s.close();
          dis=Math.sqrt( (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) );
          System.out.println("Distance between"+"("+x1+","+x2+")"+","+"("+y1+","+y2+")"+"----------->"+dis);
          
	}

}


