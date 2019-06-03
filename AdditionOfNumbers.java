package project;
import java.util.Scanner;
public class AdditionOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=s.nextInt();
        System.out.println("Enter b value:");
        int b=s.nextInt();
        s.close();
        int sum=a+b;
        System.out.println("sum of two numbers is"+sum);
	}

}
