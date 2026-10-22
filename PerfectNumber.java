package NumberProblems;
import java.util.Scanner;
public class PerfectNumber {
	public static void perfect(int num) {
		int res=0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				res=res+i;
		}
		if(num==res)
			System.out.println("perfect number");
		else
			System.out.println("Not a perfect number");
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		perfect(num);
		sc.close();
	}
}
