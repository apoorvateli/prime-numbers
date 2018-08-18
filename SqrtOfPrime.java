// Find the square root of a number if the number is prime

// Write a program which will check whether a given number N is a Prime or Not. 
// If the Number N is a Prime, then find it’s square root and print that value to the STDOUT as floating point number with exactly 2 decimal precision.
// If the number is not Prime, then print the value 0.00 to STDOUT.
// The given number will be positive non zero integer.
// Other than floating point No other information should be printed to STDOUT.

import java.util.Scanner;

public class SqrtOfPrime {

  public static double sqrtOfPrime(int n) {
    if(isPrime(n))
      return Math.sqrt(n); // Math.sqrt() returns a double value
    else return 0;
  }

  public static boolean isPrime(int n) {
    int count = 0;
    for(int i=2; i <= Math.sqrt(n); i++) {
      if (n%i == 0)
        count++;
    }
    if (n <= 1) return false;
    return (count == 0);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    // sqrtOfPrime(n) returns a double value
    // print that value with exactly 2 decimal precision.
    System.out.printf("%.2f", sqrtOfPrime(n)); 
  }
}

/* Output:
Enter a number:
51
0.00
------------------------------------------------------------
Enter a number:
53
7.28
*/