import java.util.Scanner;

public class IsPrimeUsingRecursion {
  static int i;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    i = 2;
    // i will go from 2 to sqrt(n)
    // we will check if any number(i) from 2 to sqrt(n) is a factor of n. If yes, then isPrime will return false
    // else when i reaches sqrt(n), if no number was a factor of n, isPrime will true

    if (isPrime(n)) 
      System.out.println(n+" is a prime number");
    else System.out.println(n+" is not a prime number");
  }

  public static boolean isPrime(int n) {
    // Base cases
    if (n<=1) 
      return false;

    if (i > Math.sqrt(n)) return true; // stop when i is just greater than sqrt(n). No factor was found
    
    if (n%i == 0) return false; // if n is divisible by any no. from 2 to sqrt(n), n is not prime

    // check for next divisor
    else {
      i = i+1;
      return isPrime(n);
    }
  }
}