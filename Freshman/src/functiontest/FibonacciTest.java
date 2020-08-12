package functiontest;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 수열 개수를 입력하시오.");
		int num = sc.nextInt();

		int array[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			if(i == 0 || i == 1) {
				array[i] = 1;
			} else {
				array[i] = array[i - 2] + array[i - 1];				
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}