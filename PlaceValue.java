package NumberProblems;
import java.util.Scanner;
public class PlaceValue {
	public static void value(int num) {
		int s=1;
		while(num>0) {
			int ld=num%10;
			System.out.println((num%10)+":"+(ld*s));
			num=num/10;
			s=s*10;
		}
	}
	public static void main(String [] args) {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			value(num);
			sc.close();
		}
	}
