package control;

import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하시오");
		int a = sc.nextInt();
		System.out.println("부호를 입력하시오");
		String buho = sc.next();
		System.out.println("두 번째 숫자를 입력하시오");
		int b = sc.nextInt();
		
		switch(buho) {
		case "+" :
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case "-" :
			System.out.println(a + " - " + b + " = " + (a - b));
			break;
		case "*" :
			System.out.println(a + " * " + b + " = " + (a * b));
			break;
		case "/" :
			System.out.println(a + " / " + b + " = " + (double)a / b);
			break;
		}
	}
}
