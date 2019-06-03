package project;

public class AverageMarks
{
	public static void main(String arg[])
	  {
	    int n=5,avg=0;
	 
	    int a[]=new int[n];
	 
	    a[0]=70;
	 
	    a[1]=70;
	 
	    a[2]=83;
	 
	    a[3]=66;
	 
	    a[4]=50;
	 
	    for(int i=0;i<n;i++)
	 
	    avg=avg+a[i];
	 
	    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+ avg/n);
	 
	  }
}



