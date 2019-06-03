package project;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.print("Enter the number:");
         int n=s.nextInt();
         System.out.print("Enter the power:");
         int p=s.nextInt();
         s.close();
         int result=1;
         if(n>=1&&p==0)
        	 result=1;
         else if(n==0&&p>=1)
        	 result=0;
         else
        	 for(int i=1;i<=p;i++)
        		 result=result*n;
         System.out.println(n+"^"+p+":"+result);
        		 
	}

}

