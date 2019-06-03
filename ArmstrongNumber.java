package project;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=s.nextInt();
     s.close();
     int a,arm=0,temp;
     	temp=n;
     	while(n!=0)
     	{
     		a=n%10;
     		arm=arm+(a*a*a);
     		n=n/10;
     	}
     	if(arm==temp)
     	System.out.println(temp+" is a armstrong number ");
     	else
     	System.out.println(temp+" is not a armstrong number ");
     }
  
 }


