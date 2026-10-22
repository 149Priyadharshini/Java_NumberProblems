package NumberProblems;
import java.util.Scanner;
public class StrictlyIncreasing {
	public static void increasing(int num){
		int res=0;
		while(num>0) {
			int ld=num%10;
			if(res>ld || res==0)
				res=ld;
			else {
				System.out.println("No");
				return;	
			}
			num=num/10;
		}
		System.out.print("yes");
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		increasing(num);
		sc.close();
	}
}
