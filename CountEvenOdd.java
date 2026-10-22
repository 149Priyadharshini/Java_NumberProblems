package NumberProblems;
import java.util.Scanner;
public class CountEvenOdd {
	public static void Count(int num) {
		int odd=0;
		int even=0;
		while(num>0) {
			int ld=num%10;
			if(ld%2==0)
				even+=1;
			else
				odd+=1;
			num=num/10;
		}
		System.out.println(even);
		System.out.println(odd);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Count(num);
		sc.close();
	}
}
