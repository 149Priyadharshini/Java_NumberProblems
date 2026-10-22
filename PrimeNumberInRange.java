package NumberProblems;
import java.util.Scanner;
public class PrimeNumberInRange {
    public static void prime(int n, int m) {
        for (int i = n; i <= m; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i > 1) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     prime(n, m);
     sc.close();
    }
}