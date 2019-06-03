package project;
public class Deprecation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long amount,deppercent,year,temp;
		 amount=100000;
		 deppercent=10;
		 year=3;
		 temp=amount;
		 for(int i=0;i<year;i++)
		 temp=((100-deppercent)*temp)/100;
		 System.out.println("after depreciation = "+temp);

	}

}