import java.math.BigInteger;

public class LotteryOdds {
	
	public static void main(String[] args) {

		int r;
		int w = 10; // 69
		int s = 2; // 5
		BigInteger pb = new BigInteger = ("26");
	    r = factorial(w).divide (factorial(s).multiply (factorial(w-s)));  // Superduper magic equation!!
	    r = r.multiply (pb);
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + r);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static BigInteger factorial(int n) {
	    long i = 1;
	    BigInteger f = new BigInteger("1");
	 
	    for (int i1 = 1; i1 <= n; i1++) {
	      f = f.multiply(BigInteger.valueOf(i1));
	    }

		return f;
	}
}