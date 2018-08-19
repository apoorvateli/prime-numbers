import java.util.Scanner;

public class IsPrimeUsingRecursion {
  static int i;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int n = sc.nextInt();

    i = n/2;
    // i will go from n/2 to 1
    // we will check if any number(i) from n/2 to 2 is a factor of n, then isPrime will return false
    // else when i reaches 1, no number up to 2 was a factor of n, therefore isPrime returns true

    if (isPrime(n)) 
      System.out.println(n+" is a prime number");
    else System.out.println(n+" is not a prime number");
  }

  public static boolean isPrime(int n) {
    if (n<=1) return false;

    if (i==1) return true;
    else if (n%i == 0) return false;
    else {
      i = i-1;
      return isPrime(n);
    }
  }
}