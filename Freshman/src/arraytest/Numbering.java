package arraytest;

public class Numbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 100개짜리 배열을 만들어서 안에 1~100까지 저장
		 * 합계
		 * 평균
		 * 최대
		 * 최소
		 */
		int a[] = new int[100];
		int sum = 0;
		int max;
		int min = 0;
		
		//저장
		for(int i = 0; i < a.length; i++) { 
			a[i] = (int)(Math.random() * 100) + 1;
		}
		//합계
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		//평균
		double avg = (double)sum / a.length;
		
		//최대
		max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		//최소
		min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		//출력
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
		
		
	}

}
