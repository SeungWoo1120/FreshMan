package variable;

import java.util.Scanner;

public class Calcurator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��Ͻÿ�");
		int b = sc.nextInt();
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (double)a / b); 
	}

}
 