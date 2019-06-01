/**
  Prime factorization of a number
  Print prime factors of a number
  24 = 2 x 2 x 2 x 3 = 2^3 x 3^1
  i/p = n
  o/p = factor, frequency

  e.g.
  i/p = 24
  o/p = (2,3) (3,1)
*/

import java.util.Scanner;

public class PrimeFactors {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    printPrimeFactors(n);
  }

  public static void printPrimeFactors(int n) {
    int count;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0) {
        count = 0;
        while(n%i == 0) {
          n = n/i;
          count++;
        }
        System.out.println(i+", "+count);
      }
    }

    if (n != 1) // now n is either 1 or prime, if it's not 1 then it's prime
      System.out.println(n+", 1");
  }
}

// --------
// 24
// 2, 3
// 3, 1