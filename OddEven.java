package NumberProblems;
import java.util.Scanner;
public class OddEven {
public static void oddeven(int num) {
	if(num%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	}
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	oddeven(num);
	sc.close();
}
}

