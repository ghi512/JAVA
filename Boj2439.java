/*
Boj2439.java : 백준 2439번 - 별찍기(2)
@author : Minji Kim
@email : ghi512@naver.com
@Date : 2023.01.01
 */
import java.util.Scanner;

public class Boj2439 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    n = scanner.nextInt();

    for(int i=1; i<=n; i++) {
      for(int j=n-i; j>0; j--) {
        System.out.print(" ");
      }
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
    scanner.close();
  }
}
