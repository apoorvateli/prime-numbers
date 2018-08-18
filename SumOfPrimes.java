// Find the sum of all prime numbers within a given range

/* Write a program that will find the sum of all prime numbers in a given range.
The first parameter, N1 which is a positive integer, will contain the lower bound of the range. 
The second parameter N2, which is also a positive integer will the upper bound of the range. 
The program should consider all the prime numbers within the range, excluding the upper and lower bound. 
Print the output in integer format to stdout. 
Other than the integer number(sum), no other extra information should be printed to stdout.
*/

import java.util.Scanner;

public class SumOfPrimes {

  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    int count = 0;
    for(int i=2; i <= Math.sqrt(n); i++) {
      if (n%i == 0)
        count++;
    }
    return (count == 0);
  }

  public static int sumOfPrimesInRange(int start, int end) {
    // start: lower bound of the range, end: upper bound of the range.
    int sum = 0;
    for (int i = start + 1; i < end; i++) {
      if (isPrime(i)) 
        sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter lower bound of the range: ");
    int start = sc.nextInt();
    System.out.print("Enter upper bound of the range: ");
    int end = sc.nextInt();
    System.out.println(sumOfPrimesInRange(start, end));
  }
}