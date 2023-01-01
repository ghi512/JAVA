/*
Boj2739.java : 백준 2739번 - 구구단
@author : Minji Kim
@email : ghi512@naver.com
@Date : 2023.01.01
 */
import java.util.Scanner;

public class Boj2739 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n;
    n = scanner.nextInt();
    for(int i=1; i<=9; i++) {
      System.out.printf("%d * %d = %d\n", n, i, n*i);
    }
    scanner.close();
  }
}
