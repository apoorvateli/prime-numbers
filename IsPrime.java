import java.util.*;

public class IsPrime {
  public static boolean isPrime(int n) {
    // A number n is a prime number if it is divisible only by 1 and itself(n) 
    // and not any other number between 1 to n
    // i.e. If 1 and n are the only two factors of n, then n is prime.
    int count = 0; // count the numbers that n is divisibly by

    // There cannot be a factor of n, other than n itself, that is greater than n/2
    // e.g. n=8, factors of 8 are 1, 2, 4, 8
    // So the greatest factor of n, other than n itself, is n/2 i.e. 4
    // So we will check for factors from 2 to n/2, and if there aren't any(i.e. count=0), then the no. is prime
    // i.e. it has only 1 and n as factors
    for (int i = 2; i <= n/2; i++) {
      if (n%i == 0)
        count++;
    }

    return (count == 0); // returns true if count is 0 i.e. n is not divisible by any no. from 2 to n-1
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    if (isPrime(n)) {
      System.out.println(n + " is a prime number");
    }
    else System.out.println(n + " is not a prime number");
  }
}