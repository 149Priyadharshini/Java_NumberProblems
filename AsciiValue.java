package NumberProblems;
import java.util.Scanner;
public class AsciiValue {
	public static void asc(char a) {
		int value=a;
		System.out.println(value);
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		asc(a);
		sc.close();
		}

}
