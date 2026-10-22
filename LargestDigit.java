package NumberProblems;
import java.util.Scanner;
public class LargestDigit {
	public static void Largest(int num) {
		int largest=0;
		while(num>0) {
			int ld=num%10;
			if(ld>largest)
				largest=ld;
			num=num/10;
		}
		System.out.println(largest);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Largest(num);
		sc.close();
	}
}
