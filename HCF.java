package project;
import java.util.Scanner;
class HCF
{
	public static void main(String arg[])	
	{
	Scanner s=new Scanner(System.in);
    System.out.println("Enter n1 value:");
   	int n1=s.nextInt();
    System.out.println("Enter n2 value:");
   	int n2=s.nextInt(); 
   	s.close();
	int temp;
   	while (n2 > 0)
   	{
   	     temp = n2;
   	     n2 = n1% n2; 
   	     n1 = temp;
   	}
	System.out.println("hcf="+n1);
	}	
}

