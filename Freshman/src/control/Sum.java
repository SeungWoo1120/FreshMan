package control;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			 sum += i;
		}
		System.out.println(sum);
	
		int sum2 = 0;
		int j = 1;
		while(j <= 10) {
			sum2 += j;
			j++;
		}
		System.out.println(sum2);
	}

}
