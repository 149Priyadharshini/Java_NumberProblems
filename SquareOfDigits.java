package NumberProblems;
import java.util.Scanner;
public class SquareOfDigits {
	public static void square(int num) {
		int sum=0;
		while(num>0) {
			int ld=num%10;
			sum=sum+(ld*ld);
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		square(num);
		sc.close();
	}
}
