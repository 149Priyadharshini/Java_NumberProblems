package NumberProblems;
import java.util.Scanner;
public class LastDigit {
	public static void last(int num) {
		System.out.println(num%10);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		last(num);
		sc.close();	
	}
}
