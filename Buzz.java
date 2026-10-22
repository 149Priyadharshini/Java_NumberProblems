package NumberProblems;
import java.util.Scanner;
public class Buzz {
	public static void buzz(int num) {
		if (num%10==7 || num/7==0)
			System.out.println("yes,it is a buzz number");
		else
			System.out.println("No,it is not a buzz number");
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		buzz(num);
		sc.close();
	}
}
