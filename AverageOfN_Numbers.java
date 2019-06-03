package project;
import java.util.Scanner;
public class AverageOfN_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,n,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of elements:");
		n=s.nextInt();
		
		int a[]=new int[n];
        System.out.println( "Enter the elements:");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		    s.close();
		for(i=0;i<n;i++)
			result=result+a[i];
			
		System.out.println( "Average of elements ="+result/n);
		
	}

}

