/**
 * <do it 자료구조와 함께 배우는 알고리즘 입문> 연습문제 풀이 - 1장 7번
 * '가우스의 덧셈'을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.12
 */
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("1부터 n까지의 정수 합을 구하는 프로그램입니다.");
    System.out.print("n의 값: ");
    int n = scanner.nextInt();
    int sum = 0;

    if(n%2 == 0) { // n이 짝수이면
      sum = (1 + n) * (n / 2);
    }
    else { // n이 홀수이면
      int mid = (n + 1) / 2;
      sum = (1 + n) * (n / 2) + mid;
    }

    System.out.printf("1~%d의 합은 %d입니다.", n, sum);
    scanner.close();
  }
}
