package NumberProblems;
import java.util.Scanner;
public class Factorial {
	public static void fact(int num) {
		int res=1;
		for(int i=1;i<=num;i++) {
			res=res*i;
		}
		System.out.println(res);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		fact(num);
		sc.close();
	}
}
