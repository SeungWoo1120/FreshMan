package control;

import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.println("��ȣ�� �Է��Ͻÿ�");
		String buho = sc.next();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�");
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
