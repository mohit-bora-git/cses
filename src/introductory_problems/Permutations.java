package introductory_problems;

import java.util.Scanner;

/**
 * A permutation of integers 1,2,...,n is called beautiful if there are no adjacent elements whose difference is 1.
 * Given n, construct a beautiful permutation if such a permutation exists.
 * Input
 * The only input line contains an integer n.
 * Output
 * Print a beautiful permutation of integers 1,2,....,n.
 * If there are several solutions, you may print any of them. If there are no solutions, print "NO SOLUTION".
 * Constraints
 * 1 <=n <= 10^6
 * Example 1
 * Input:
 * 5
 * Output:
 * 4 2 5 3 1
 * Example 2
 * Input:
 * 3
 * Output:
 * NO SOLUTION
 */
public class Permutations {

  public static void main(String[] args) {
    //keep even and odd group and keep it together
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //solution
    if (n == 2 || n == 3) {
      System.out.println("NO SOLUTION");
      return;
    }
    for (int i = 2; i <= n; i += 2) {
      System.out.print(i + " ");
    }
    for (int i = 1; i <= n; i += 2) {
      System.out.print(i + " ");
    }
  }
}
