package NumberProblems;
import java.util.Scanner;
public class PositiveNegativeZero {
public static void Type(int num) {
	if(num>0)
		System.out.println("Positive");
	else if(num<0)
		System.out.println("Negative");
	else
		System.out.println("zero");
}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	Type(num);
	sc.close();
}
}
