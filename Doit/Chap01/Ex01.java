/**
 * <do it 자료구조와 함께 배우는 알고리즘 입문> 연습문제 풀이 - 1장 1번
 * 네 값의 최대값 구하기
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.12
 */
import java.util.Scanner;

public class Ex01 {
  static int max(int a, int b, int c, int d) {
    int max = a;
    if(b > max)
      max = b;
    if(c > max)
      max = c;
    if(d > max)
      max = d;
    return max;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("4개의 숫자를 공백으로 구분해 입력하세요: ");
    int[] arr = new int[4];
    for(int i=0; i<4; i++) {
      arr[i] = scanner.nextInt();
    }

    int max = max(arr[0], arr[1], arr[2], arr[3]);
    System.out.printf("숫자 %d, %d, %d, %d 중 최대값은 %d입니다.", arr[0], arr[1], arr[2], arr[3], max);

    scanner.close();
  }
}