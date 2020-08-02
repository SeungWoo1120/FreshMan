package arraytest;

public class Cresendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[7];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 48 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		for(int j = 0; j < a.length; j++) {
			for(int k = 0; k < j; k++) {
				if(a[j] > a[k]) {
					int temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
