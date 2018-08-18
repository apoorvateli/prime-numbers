import java.util.*;

public class IsPrime {
  public static boolean isPrime(int n) {
    // A number n is a prime number if it is divisible only by 1 and itself(n) 
    // and not any other number between 1 to n
    // i.e. If 1 and n are the only two factors of n, then n is prime.
    int count = 0; // count the numbers that n is divisibly by, form 2 to n-1
    // If there are no factors of n between 2 and n-1, then n is prime

    for (int i = 2; i < n; i++) {
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