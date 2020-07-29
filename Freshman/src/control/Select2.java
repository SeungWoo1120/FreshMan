package control;

import java.util.Scanner;

public class Select2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하시오");
		int a = sc.nextInt();
		System.out.println("부호를 입력하시오");
		String buho = sc.next();
		System.out.println("두 번째 숫자를 입력하시오");
		int b = sc.nextInt();
		
		if(buho.equals("+")) {
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if(buho.equals("-")) {
			System.out.println(a + " - " + b + " = " + (a - b));
		} else if(buho.equals("*")) {
			System.out.println(a + " * " + b + " = " + (a * b));
		} else if (buho.equals("/")) {
			System.out.println(a + " / " + b + " = " + (double)a / b);
		} else {
			System.out.println("이상한 것을 입력했습니다.");
		}
		
					
	}
}
