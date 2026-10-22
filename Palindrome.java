package NumberProblems;
import java.util.Scanner;
public class Palindrome {
	public static void palin(int num) {
		int res=0;
		int original=num;
		while(num>0) {
			int ld=num%10;
			res=res*10+ld;
			num=num/10;
		}
		if(original==res)
			System.out.println("yes,palindrome");
		else
			System.out.println("No,not a palindrome");
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		palin(num);
		sc.close();
	}
}
