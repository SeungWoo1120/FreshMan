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
		
		for(int i = 0; i < comNum.length; i++) {
			System.out.print(comNum[i] + " ");
		}	

		// 입력하기
		while(true) {
		int userNum4 = sc.nextInt();

		for(int i = 0; i < userNum.length; i++) {
			userNum[i] = (int)((userNum4 % Math.pow(10, userNum.length - i)) / Math.pow(10, (userNum.length - 1) - i));
		}
		
		for (int i = 0; i < userNum.length; i++) {
			System.out.print(userNum[i] + " ");
		}
		
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
		
		System.out.println();
		
		// 출력하기
		if(strike == 0 && ball == 0) {
			System.out.println("out");
		}
		System.out.println(strike);
		System.out.println(ball);
		
		if(strike == 4) {
			break;
		}
		
		strike = 0;
		ball = 0;

		}
	}

}
