/**
 * H0P.java
 * 
 * This class contains methods to: 
 * - find the largest of two numbers
 * - print and count perfect numbers in a given range 
 * - calculate the Fibonacci number at position n.
 * 
 * Author: Nour Elgohary
 * Version: 1.0
 */

public class H0P {
    /**
     * Returns the largest of two integers.
     * @param a first integer
     * @param b second integer
     * @return the largest integer
     */


    public int findLargestNumber(int a, int b) {
        return Math.max(a, b);
    }
    /**
     * Prints and counts perfect numbers in a given range [start, end]
     * and returns how many perfect numbers were found.
     * 
     * A perfect number equals the sum of its proper divisors.
     * 
     * @param start the beginning of the range (inclusive)
     * @param end end of the range (inclusive)
     * @return count of perfect numbers found
     */

    public int findPerfectNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            int sum = 0;

            // Add all proper divisors of i (numbers less than i)
            for (int j = 1; j < i; j++) {
                if (i % j == 0) sum += j;
            }

            // If divisor sum equals i, then i is a perfect number.
            if (sum == i) {
                count++;
                System.out.println(i + " is a perfect number");
            }
        }
        return count;
    }
    /**
     * Calculates the nth Fibonacci number using iteration.
     * Fibonacci sequence: 0, 1, 1, 2, 3, ...
     * 
     * @param n index in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public int findFibonacciNumber(int n) {
        int a = 0, b = 1, c;
        // Base case: the 0th Fibonacci number is 0.
        if (n == 0) return a;

        // Compute Fibonacci numbers from 2 up to n.
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	
    /**
     * messy
     * 
     * This class is included to practice reading and understanding messy code.
     * It contains example methods with mixed naming and formatting style.
     * 
     */
	
	
	public class fibonacci {

        /**
         * Calculates an amount owed by multiplying the input.
         *
         * @param word base amount
         * @return amount owed
         */
public static double MoneyOwed (double word)
{
return word*1.6;
}

/**
 * Checks whether the integer t converted to a string 
 * equals the text "35.5".
 * 
 * Note: This comparison will always be false because
 * t is an int and "35.5" is not an integer string.
 * 
 * @param t integer value
 * @return true if t as string equals "35.5", false otherwise
 */
public static boolean proceed(int t){
	return Integer.toString(t).equals("35.5") == true;
}

/**
 * Prints a pace value based on time and distance.
 *
 * @param args command-line arguments (not used)
 */
public static void main (String [] args)
{
double TimE;
double PACE;
System.out.println("This program calculates your pace given a time and miles traveled.");
// Time value in minutes (35 minutes and 30 seconds).
TimE= 35.5;	
// Pace is computed using time divided by distance.				
PACE= TimE / DISTANCE;
System.out.println("Your pace is "+PACE+" miles per hour.");
}
/**
 * Constant distance value used in pace calculation.
 */
public static final double DISTANCE = 6.21;
}

}





