package control;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�簢��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//�ﰢ��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		//�Ųٷ� �ﰢ��
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//�¿���� �ﰢ��
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) { 
				if(5 - j + 1 > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//��
		
	}
}

