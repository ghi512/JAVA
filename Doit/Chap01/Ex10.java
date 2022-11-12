/**
 * <do it 자료구조와 함께 배우는 알고리즘 입문> 연습문제 풀이 - 1장 10번
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.12
 */
import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("양의 정수 n을 입력하세요: ");
    int n = scanner.nextInt();
    int origin = n;
    int digit = 1; // 자릿수

    while (n >= 10) {
      n = n/10;
      digit++;
    }
    System.out.printf("%d는 %d자리입니다.", origin, digit);

    scanner.close();
  }
}
