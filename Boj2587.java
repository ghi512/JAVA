/**
 * 백준 2587번
 * @author : Minji Kim
 * @email : ghi512@naver.com
 * @date : 2022.11.11
 */
import java.util.Scanner;

public class Boj2587 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 5개의 자연수 입력
    int[] arr = new int[5];
    for(int i=0; i<5; i++) {
      arr[i] = scanner.nextInt();
    }

    // 평균 구하기
    int sum = 0;
    for(int i=0; i<5; i++) {
      sum += arr[i];
    }
    int avg = sum / 5;

    // 중앙값 구하기
    for(int i=0; i<5; i++) {
      int min = arr[i];
      for(int j=i+1; j<5; j++) {
        if(arr[j]<=min) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          min  = arr[i];
        }
      }
    }
    int mid = arr[2];

    // 평균, 중앙값 출력
    System.out.println(avg);
    System.out.println(mid);

    scanner.close();
  }
}
