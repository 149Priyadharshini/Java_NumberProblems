package NumberProblems;
import java.util.Scanner;
public class ReverseNumber {
	public static void Reverse(int num) {
		int res=0;
		while(num!=0) {
			int ld=num%10;
			res=res*10+ld;
			num=num/10;
	}
		System.out.println(res);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Reverse(num);
		sc.close();
	}
}