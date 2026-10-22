package NumberProblems;
import java.util.Scanner;
public class SumAlternate {
	public static void Sum(int num){
		int sum=0;
		int count=1;
		while(num>0) {
			int ld=num%10;
			if(count%2!=0)
				sum=sum+ld;
			num=num/10;
			count++;
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
