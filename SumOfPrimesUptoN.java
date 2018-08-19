// Find the sum of all prime numbers up to N using Sieve of Eratosthenes algorithm  

import java.util.Scanner;
import java.util.Arrays;

public class SumOfPrimesUptoN {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("To find the sum of Prime no.s up to N, enter the value of N: ");
    int n = sc.nextInt();

    boolean[] isPrime = new boolean[n+1];
    Arrays.fill(isPrime, 2, n, true);
    // isPrime[i] is true if i is a prime no.

    // Make all composites in isPrime[] false using Sieve of Eratosthenes
    for(int p=2; p<=Math.sqrt(n); p++) {
      if (isPrime[p]) {
        // make all multiples of p false
        for(int i=p*2; i<=n; i = i+p)
          isPrime[i] = false;
      }
    }

    // Add all primes in isPrime[]
    int sum=0;
    for(int i=2; i<=n; i++)
      if(isPrime[i])
        sum += i;

    System.out.println("Sum: "+sum);
  }
}