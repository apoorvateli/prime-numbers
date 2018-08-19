// Find Prime numbers up to N using Sieve of Eratosthenes algorithm
// Write a program that prints all prime numbers between 1 to n.

import java.util.Scanner;
import java.util.Arrays;

public class PrintPrimesUptoN {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.println("To print prime no.s upto N, enter the value of N:");
    int n = sc.nextInt();
  
    boolean[] isPrime = new boolean[n+1]; // isPrime will be a boolean array from [0...n]
    // Therefore its size will be n+1
    // boolean value in isPrime[i] represents primality of number i
  
    // initialize all entries in isPrime as true.
    // A value in isPrime[i] will finally be false if i is Not a prime, else true.
  
    Arrays.fill(isPrime, 2, n, true); 
    // parameters => array_name, first_index, last_index, value
    // value => value to be filled in every element of the array from first index to last index
    // We keep isPrime[0] and isPrime[1] as false since 0 and 1 are not prime numbers
  
    for (int p = 2; p<= Math.sqrt(n); p++) { // we can stop the moment p^2 > n, becuse all the composites will be false
    // If prime[p] is a prime, update all multiples of p
      if (isPrime[p]) {
        for (int i = p*2; i <= n; i = i+p)
          isPrime[i] = false;
      }
    }
  
    // print all primes upto n
    for (int i = 2; i <= n; i++) {
      if (isPrime[i]) {
        System.out.print(i+" ");
      }
    }

  }
}

/* Output:
To print prime no.s upto N, enter the value of N:
100
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97

To print prime no.s upto N, enter the value of N:
97
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89
*/