package NumberProblems;
import java.util.Scanner;
public class OddDigits {
	public static void odd(int num) {
		while(num>0) {
			int ld=num%10;
			if(ld%2==0) {
				System.out.println("No");
				return;
			}
			num=num/10;
		}
		System.out.println("yes");
	}

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		odd(num);
		sc.close();
}
}