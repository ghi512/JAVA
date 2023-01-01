/**
 * <do it 자료구조와 함께 배우는 알고리즘 입문> 연습문제 풀이 - 1장 2번
 * 세 값의 최솟값을 구하는 프로그램
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.12
 */
import java.util.Scanner;

public class Ex02 {
  static int min3(int a, int b, int c) {
    int min = a;
    if(b < min)
      min = b;
    if(c < min)
      min = c;
    return min;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("세 값의 최솟값을 구하는 프로그램입니다.");
    System.out.print("a : ");
    int a = scanner.nextInt();
    System.out.print("b : ");
    int b = scanner.nextInt();
    System.out.print("c : ");
    int c = scanner.nextInt();

    int min = min3(a, b, c);
    System.out.println("세 값의 최솟값은 " + min + "입니다.");
    scanner.close();
  }
}
