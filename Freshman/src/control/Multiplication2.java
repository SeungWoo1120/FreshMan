package control;

public class Multiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 2; j++) { 
				System.out.print(j + " x " + i + " = " + j * i);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 3; j <= 4; j++) { 
				System.out.print(j + " x " + i + " = " + j * i);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 5; j <= 6; j++) { 
				System.out.print(j + " x " + i + " = " + j * i);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 7; j <= 8; j++) { 
				System.out.print(j + " x " + i + " = " + j * i);
				System.out.print("\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			int j = 9;
			System.out.print(j + " x " + i + " = " + j * i);
			System.out.println();
		}
	}
}
/* 1  2
   3  4
   5  6
   7  8 
   9
*/