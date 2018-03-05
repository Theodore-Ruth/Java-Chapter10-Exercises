//Theodore Ruth - Java Chapter 10 - Exercise 4
//7. It is correct and I can make it go as high as I want
//8. I believe that BigIntegers are mutable because I can change them using their methods
import java.math.BigInteger;
public class Exercise_4 {
	

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++)
		{
			System.out.println(i);
			System.out.println(factorial(i));
			System.out.println("");
		}
		
		
	}
	
	public static BigInteger factorial(int n)
	{
		if (n == 0)
		{
			int y = 1;
			BigInteger badResult = BigInteger.valueOf(y);
			return badResult;
		}
		else
		{
			int x = n;
			BigInteger result = BigInteger.valueOf(n);
			int i = 1;
			
			while (i < x)
			{
				BigInteger temp = BigInteger.valueOf(i);
				result = result.multiply(temp);
				i++;
			}
			return result;
		}
	}
	

}
