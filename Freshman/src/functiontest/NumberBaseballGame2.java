package functiontest;

import java.util.Scanner;

public class NumberBaseballGame2 {

	static int[] question() {
		int temp[] = new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = (int)(Math.random() * 10);
			if(temp[0] == 0) {
				i--;	
			}
			for (int j = 0; j < i; j++) {
				if(temp[i] == temp[j]) {
					i--;
				}
			}
		}	
			return temp;
	}	
	
	static int[] insert() {
		int temp[] = new int[4];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("4자리 정수를 입력하세요(첫번째 자리는 0이 될 수 없음)");
			int temp4 = sc.nextInt();

			for(int i = 0; i < temp.length; i++) {
				temp[i] = (int)((temp4 % Math.pow(10, temp.length - i)) / Math.pow(10, (temp.length - 1) - i));				
			}
			return temp;
		}	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int strike = 0;
		int ball = 0;
		
		
		//문제내기
		int comNum[] = question();

		System.out.println("[Computer Number]");
		System.out.print("{ ");
		for (int i = 0; i < comNum.length; i++) {
			System.out.print(comNum[i] + " ");
		}
		System.out.println("}");
		
		//입력하기
		while(true) {
		int userNum[] = insert();
		System.out.println("[User Number]");
		System.out.print("{ ");
		for (int i = 0; i < userNum.length; i++) {
			System.out.print(userNum[i] + " ");
		}
		System.out.println("}");
		
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
		

