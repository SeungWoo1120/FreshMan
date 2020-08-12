package arraytest;

import java.util.Scanner;

public class NumberBaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int comNum[] = new int[4];
		int userNum[] = new int[4];
		int strike = 0;
		int ball = 0;
		
		// 문제내기
		for(int i = 0; i < comNum.length; i++) {
			comNum[i] = (int)(Math.random() * 10);
			if(comNum[0] == 0) {
				i--;
			}
			for (int j = 0; j < i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
				}
			}
		}
		System.out.println("[Computer Number]");
		System.out.print("{ ");
		for(int i = 0; i < comNum.length; i++) {
			System.out.print(comNum[i] + " ");
		}
		System.out.println("}");
		System.out.println();
		
		// 입력하기
		while(true) {
		System.out.println("4자리 정수를 입력하세요(첫번째 자리는 0이 될 수 없음)");
		int userNum4 = sc.nextInt();

		for(int i = 0; i < userNum.length; i++) {
			userNum[i] = (int)((userNum4 % Math.pow(10, userNum.length - i)) / Math.pow(10, (userNum.length - 1) - i));
			
		}
		
		System.out.println("[User Number]");
		System.out.print("{ ");
		for (int i = 0; i < userNum.length; i++) {
			System.out.print(userNum[i] + " ");
		}
		System.out.println("}");
		
		// 비교하기
		for (int i = 0; i < userNum.length; i++) {
			if(comNum[i] == userNum[i]) {
				strike++;
			} 
			for (int j = 0; j < userNum.length; j++) {
				if((comNum[i] != userNum[i]) && (comNum[i] == userNum[j])) {
					ball++;
				}
				
			}
		}
		
		// 출력하기
		if(strike == 0 && ball == 0) {
			System.out.println("out!!!!");
		} 
		System.out.println("strike : " + strike);
		System.out.println("ball : " + ball);
		
		if(strike == 4) {
			break;
		}
		
		strike = 0;
		ball = 0;

		}
	}

}
// 첫 번쨰 자리가 0일 떄 방법 추가