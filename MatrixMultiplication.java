package project;
import java.util.Scanner;
public class MatrixMultiplication {

	
		public static void main(String args[])
		{
		int r1,r2,c1,c2,i,j,k;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows of matrix1");
		r1 = in.nextInt();
		System.out.println("Enter the number columns of matrix 1");
		c1 = in.nextInt();
		System.out.println("Enter the number of rows of matrix2");
		r2 = in.nextInt();
		System.out.println("Enter the number of columns of matrix 2");
		c2 = in.nextInt();
		if(c1==r2)
		{
		 
		int a[][] = new int[r1][c1]; 
		int b[][] = new int[r2][c2]; 
		int c[][] = new int[r1][c2];
		 
		System.out.println("Enter the elements of matrix1");
		 
		for ( i= 0 ; i < r1 ; i++ )
		{ 
		 
		  for ( j= 0 ; j < c1 ;j++ )
		      
			a[i][j] = in.nextInt();
		 
		}
		System.out.println("Enter the elements of matrix2");
		 
		for ( i= 0 ; i < r2 ; i++ )
		{ 
		 
		 for ( j= 0 ; j < c2 ;j++ )
		   
			 b[i][j] = in.nextInt();
		    
		}
		 in.close();
		System.out.println("\n\noutput matrix:-");
		for ( i= 0 ; i < r1 ; i++ )
		 
		for ( j= 0 ; j <c2;j++)
		{
		
		   for ( k= 0 ; k <r2;k++ )
		  {
		
			   c[i][j]=c[i][j]+a[i][k]*b[k][j] ;
		 
		  }
		
		}
		for ( i= 0 ; i < r1; i++ )
		{
		for ( j=0 ; j < c2;j++ )
		System.out.print(c[i][j]+" ");
		 
		System.out.println();
		}
		}
		else
		System.out.print("multipication does not exist ");
		}
		 
}
	


