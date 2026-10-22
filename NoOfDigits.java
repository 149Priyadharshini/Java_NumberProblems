package NumberProblems;
import java.util.Scanner;
public class NoOfDigits {
	public static void Number(int num) {
		int count=0;
		while(num>0) {
			num=num/10;
		    count++;
		}
		System.out.println(count);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Number(num);
		sc.close();
	}
}
