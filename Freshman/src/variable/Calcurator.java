package variable;

import java.util.Scanner;

public class Calcurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하시오");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하시오");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (double)a / b); 
	}

}
 