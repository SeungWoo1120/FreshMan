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
		// 난수 생성 후 배열에 저장
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 48 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 배열에 있는 것을 뒤집어서 출력
		for(int i = 0; i < (a.length / 2); i++) {
			int temp = a[i];
			a[i] = a[(a.length-1)-i];
			a[(a.length-1)-i] = temp;
		}
		System.out.println();
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	} 

}
