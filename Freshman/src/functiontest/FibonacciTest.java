package functiontest;

import java.util.Scanner;

public class FibonacciTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ���� ������ �Է��Ͻÿ�.");
		int num = sc.nextInt();
		
		int array[] = new int[num];

		array[0] = 1;
		//array[1] = 1; ��
		
		if(num == 1){
			System.out.println(array[0]);
		} else if(num == 2) {
			System.out.println(array[0] + " " + array[1]);
		} else {
			for (int i = 2; i < num; i++) {
				array[i] = array[i-2] + array[i-1];
			}
			System.out.print(array[0] + " " + array[1] + " ");
			for (int i = 2; i < num; i++) {
				System.out.print(array[i] + " ");
			}
		}
	
	}
}