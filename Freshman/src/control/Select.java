package control;

import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("������ A");
		}
		if(score < 90 && score >= 80) {
			System.out.println("������ B");
		}
		if(score < 80 && score >= 70) {
			System.out.println("������ C");
		} 
		if(score < 70) {
			System.out.println("������ F");
		}
	}
}
