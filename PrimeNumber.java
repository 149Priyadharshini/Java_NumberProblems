package NumberProblems;
import java.util.Scanner;
public class PrimeNumber {
	public static void prime(int num) {
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				System.out.println("Not a prime");
				return;		
		}
		}
		System.out.println("Prime");
}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		prime(num);
		sc.close();
	}
}