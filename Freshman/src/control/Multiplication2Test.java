package control;

public class Multiplication2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i += 2) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " x " + j + " = " + i * j);
				if(i < 9) {
					System.out.print("\t" + (i + 1) + " x " + j + " = " + (i + 1) * j);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
