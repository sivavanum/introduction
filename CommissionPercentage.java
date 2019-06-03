package project;
import java.util.Scanner;
public class CommissionPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            double amount,commissionpercent,commission;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter amount:");
            amount=s.nextDouble();
            System.out.println("Enter commissionpercent");
            commissionpercent=s.nextDouble();
            s.close();
            commission=(commissionpercent/100)*amount;
            System.out.println("commission amount"+commission);
	}

}
