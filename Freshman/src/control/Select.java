package control;

import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("성적은 A");
		}
		if(score < 90 && score >= 80) {
			System.out.println("성적은 B");
		}
		if(score < 80 && score >= 70) {
			System.out.println("성적은 C");
		} 
		if(score < 70) {
			System.out.println("성적은 F");
		}
	}
}
