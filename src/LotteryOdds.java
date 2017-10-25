import java.math.BigInteger;

public class LotteryOdds {

	public static void main(String[] args) {

		int r;
		int w = 10; // 69
		int s = 2; // 5
		int pb = 26;
	    r = factorial(w) / (factorial(s) * (factorial(w-s)));  // Superduper magic equation!!
	    r = r * pb;
	    
	    System.out.println("The odds of winning the PowerBall are 1:" + r);
	    System.out.println("The PowerBall website says that it's 1:292201338");
	    
    }

	private static Integer factorial(int n) {
	    int i = 1;
	    int f = 1;
	 
	    for (int c = 1; c <= n; c++) {
	      f = f * i++;
	    }

		return f;
	}
}
