package introductory_problems;

import java.util.Scanner;

/**
 * You are given all numbers between 1,2,...,n except one. Your task is to find the missing number.
 * Input
 * The first input line contains an integer n.
 * The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).
 * Output
 * Print the missing number.
 * Constraints
 * 2 <=n<=2*10^5
 * Example
 * Input:
 * 5
 * 2 3 1 5
 * Output:
 * 4
 */
public class Missing_Number {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(findMissingNumber(arr, n));
  }

  public static int findMissingNumber(int[] arr, int n) {
    // remember the property 1^1=0 , 0^n=n
    int xor = 0, cnt = 1;
    for (int i = 0; i < n; i++, cnt++) {
      xor ^= arr[i] ^ cnt;
    }
    return xor ^ cnt;
  }
}
