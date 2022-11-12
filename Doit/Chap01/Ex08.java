/**
 * <do it 자료구조와 함께 배우는 알고리즘 입문> 연습문제 풀이 - 1장 8번
 * 정수 a, b를 포함하여 그 사이의 모든 정수 합을 구하는 프로그램
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.12
 */
import java.util.Scanner;

public class Ex08 {
  static int sumof(int a, int b){
    int sum = 0;
    if(a <= b) {
      for(int i=a; i<=b; i++) {
        sum += i;
      }
    }
    else {
      for(int i=b; i<=a; i++) {
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("두 정수 사이의 모든 정수 합을 구합니다.");
    System.out.print("두 정수 a, b를 입력하세요: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    int sum = sumof(a, b);
    System.out.printf("%d와 %d 사이의 정수 합: %d", a, b, sum);

    scanner.close();
  }
}
