package NumberProblems;
import java.util.Scanner;
public class SumOfNaturalNumber {
	public static void Sum(int num) {
		int sum=1;
		for(int i=1;i<=num;i++) {
			sum=sum*i;
		}
		System.out.println(sum);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Sum(num);	
		sc.close();
	}

}
