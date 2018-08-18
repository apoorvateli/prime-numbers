import java.util.Scanner;

public class IsPrime {
  public static boolean isPrime(int n) {
    // A number n is a prime number if it is divisible only by 1 and itself(n) 
    // and not any other number between 1 to n
    // i.e. If 1 and n are the only two factors of n, then n is prime.

    int count = 0; // count the numbers that n is divisible by i.e. count factors of n

    /* Original for loop
    Count the numbers that n is divisible by, form 1 to n
    Return true if count is 2 i.e. n is divisible only by 1 and n
    */

    /* Optimization No. 1
    Optimize the for loop so that it checks if a no. is a factor of n from 2 to n-1
    Return true if count is 0 i.e. n is not divisible by any no. from 2 to n-1
    */

    /* Optimization No. 2
    There cannot be a factor of n, other than n itself, that is greater than n/2
    e.g. n=8, factors of 8 are 1, 2, 4, 8
    So the greatest factor of n, other than n itself, is n/2 i.e. 4
    So we will check for factors from 2 to n/2, and if there aren't any(i.e. count=0), then the no. is prime
    i.e. it has only 1 and n as factors
    */

    /* Optimization No. 3
    If a divides n, then let the result be b  =>  i.e. n/a = b
    Now b should also divide n i.e. n/b = a
    Therefore, we have a relation a x b = n
    a and b are called co-factors. 
    So all the factors of n always exist in pairs.
    e.g. n=36 => {1, 2, 3, 4, 6, 9, 12, 18, 36}
    (a,b) => (1,36), (2, 18), (3, 12), (4,9), (6,6), (9,4), (12,3), (18,2), (36,1)
    For a and b, there can be a case where a=b. This happens only when n is a perfect square. (36 = 6x6)
    The factors repeat after a or b reaches sqrt(n)

    if a=b   =>   a^2 = n  =>   a = sqrt(n)
    if a<b   =>                 a < sqrt(n) , b > sqrt(n)
    if b<a   =>                 b < sqrt(n) , a > sqrt(n)

    While going from 2 to n on the number line, 
    if we do not get a factor of n all the way till sqrt(n) i.e. 6
    then we will not get a factor after sqrt(n) as well.

    Because one of the cofactors of n is either less than sqrt(n) or equal to sqrt(n).
    */
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0)
        count++;
    }

    if (n <= 1) return false;

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