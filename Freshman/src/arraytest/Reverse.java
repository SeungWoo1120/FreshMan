package arraytest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 랜덤으로 7개짜리 배열을 만들고, 
		 * 1. 저장된 7개 수를 뒤집기
		 * 2. 오름차순
		 * 3. 내림차순
		 * 4. 중복제거
		 */
		int a[] = new int[7];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 48 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for(int i = 1; i <= a.length; i++) {
			System.out.print(a[7-i] + " ");
		}
		
		
	} 

}
