package project;
import java.io.DataInputStream;
import java.io.IOException;
public class FibonacciSeries {

	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
          DataInputStream a=new DataInputStream(System.in);
          System.out.println("Enter no.of terms");
          int n=Integer.parseInt(a.readLine());
          System.out.println("Fibonacci series.....");
          int nextTerm,i=0,j=1;
      	for(int c=0;c<n;c++)
    	{
    	if(c<=1)
    	nextTerm=c;
    	else
    	{
    	nextTerm=i+j;
    	i=j;
    	j=nextTerm;
    	}
    	System.out.println(nextTerm);
	}

}
}

