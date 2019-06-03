package project;
import java.io.*;
public class ElectricityBill {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		int units;
		double billpay=0;

		 DataInputStream a=new DataInputStream(System.in);
		 System.out.println("Enter No.of units:");
		 units=Integer.parseInt(a.readLine());
	 
	        	if(units<100)
		 {
		      billpay=units*1.20;
		  }
		else if(units<300)
		 {
		   billpay=100*1.20+(units-100)*2;
		 }
		else if(units>300)
		{
		    billpay=100*1.20+200*2+(units-300)*3;
		}
	       
		System.out.println("Bill to pay : " + billpay); 
	      } 

	

}

