import java.util.Scanner;

public class Boj2839 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(solution(n));
    scanner.close();
  }

  public static int solution(int num) {
    int[] arr = new int[5001];
    for(int i=0; i<=5000; i++) {
      arr[i] = 5001;
    }

    for(int n = 0; n<=1666; n++) {
      for(int m=0; m<=1000; m++) {
        int result = 0;
        if(n==0 && m==0)
          continue;
        else if(n==0 && m>0)
          result = 5*m;
        else if(m==0 && n>0)
          result = 3*n;
        else
          result = 3*n + 5*m;

        if(result>=3 && result<=5000){
          if(arr[result] > (n+m)) {
            arr[result] = n+m;
          }
        }
      }
    }

    for(int k=0; k<=5000; k++) {
      if(arr[k] == 5001)
        arr[k] = -1;
    }

    int answer = arr[num];
    return answer;
  }
}
