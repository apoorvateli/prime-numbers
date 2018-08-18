// Write a program which takes two numbers as input from the user 
// and prints all the prime numbers that lie between these two numbers. 

/* Write a program that will find all the prime numbers in a given range.
The first parameter, N1 which is a positive integer, will contain the lower bound of the range. 
The second parameter N2, which is also a positive integer will the upper bound of the range. 
The program should print all the prime numbers within the range, excluding the upper and lower bound. 
*/

import java.util.Scanner;

public class PrintPrimesInRange {

  public static boolean isPrime(int n) {
    
    if (n <=1) return false;
    int count=0;  // count the numbers that n is divisible by i.e. count factors of n
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0)
        count++;
    }

    return (count == 0); // returns true if there are no factors of n, from 2 to sqrt(n)
    // which means 1 and n are the only factors of n, so n is prime
  }

  public static void printPrimesInRange(int start, int end) {
    // start: lower bound of the range, end: upper bound of the range.
    for (int i = start + 1; i < end; i++) {
      if (isPrime(i))
        System.out.println(i);
    }    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter lower bound of the range: ");
    int start = sc.nextInt();
    System.out.print("Enter upper bound of the range: ");
    int end = sc.nextInt();
    printPrimesInRange(start, end);
  }
}

