//Theodore Ruth - Java Chapter 10 - Exercise 5
import java.math.BigInteger;
public class Exercise_5 {

	public static void main(String[] args) {
		System.out.println(pow(2, 3));
		System.out.println(pow(10, 30));

	}
	
	public static BigInteger pow(int x, int n) {
	    if (n == 0)
	    {
	    	int place = 1;
	    	BigInteger baseResult = BigInteger.valueOf(place);
	    	return baseResult;
	    }

	    // find x to the n/2 recursively
	    BigInteger t = pow(x, n / 2);

	    // if n is even, the result is t squared
	    // if n is odd, the result is t squared times x
	    if (n % 2 == 0) 
	    {
	    	BigInteger result = t.multiply(t);
	        return result;
	    }else 
	    {
	    	BigInteger numberIGuess = BigInteger.valueOf(x);
	    	BigInteger result2 = t.multiply(t);
	    	result2 = result2.multiply(numberIGuess);
	        return result2;
	    }
	}

}

