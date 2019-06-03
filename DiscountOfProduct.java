package project;

public class DiscountOfProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double markedprice=1000,dis=25,s,amount;
		System.out.println( "Markedprice is"+markedprice);
		System.out.println( "Discount price is"+dis);
		s=100-dis;
		amount=(s*markedprice)/100;
		System.out.println( "amount for discount:"+amount);
		

	}

}

