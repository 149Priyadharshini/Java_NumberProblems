package NumberProblems;
import java.util.Scanner;
public class NoOfTimesDigit {
	public static void Times(int num,int n) {
		int count=0;
		while(num>0) {
			int ld=num%10;
			if(ld==n)
				count+=1;
			num=num/10;
		}
		System.out.println(count);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=sc.nextInt();
		Times(num,n);
		sc.close();
	}
}
