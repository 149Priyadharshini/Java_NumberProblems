package NumberProblems;
import java.util.Scanner;
public class SquareCube {
	public static void Square(int num) {
		System.out.println("Square: "+(num*num));
	}
	public static void Cube(int num) {
		System.out.println("Cube: "+(num*num*num));
	}
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Square(num);
		Cube(num);
		sc.close();
	}
}
