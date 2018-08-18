import java.util.*;

public class IsPrime {
  public static boolean isPrime(int n) {
    // A number n is a prime number if it is divisible only by 1 and itself(n) 
    // and not any other number between 1 to n
    int count = 0; // count the numbers that n is divisibly by, form 1 to n

    for (int i = 1; i <= n; i++) {
      if (n%i == 0)
        count++;
    }

    if (count == 2)  // n is divisible only by 1 and n
      return true;
    else return false;
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