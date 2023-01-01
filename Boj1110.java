/*
Boj1110.java : 백준 1110번 - 더하기 사이클
@author : Minji Kim
@email : ghi512@naver.com
@Date : 2023.01.01
 */
import java.util.Scanner;

public class Boj1110 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int origin_num = scanner.nextInt();
    int cycle = 0; // 사이클 길이
    int new_num = origin_num;
    do {
      cycle++;
      if(new_num<10) {
        new_num = new_num%10*10 + new_num%10;
      }
      else {
        int temp = new_num/10 + new_num%10;
        new_num = new_num%10*10 + temp%10;
      }
    } while (new_num != origin_num);
    System.out.println(cycle);
    scanner.close();
  }
}
