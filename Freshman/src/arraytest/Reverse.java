package arraytest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �������� 7��¥�� �迭�� �����, 
		 * 1. ����� 7�� ���� ������
		 * 2. ��������
		 * 3. ��������
		 * 4. �ߺ�����
		 */
		int a[] = new int[7];
		// ���� ���� �� �迭�� ����
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 48 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// �迭�� �ִ� ���� ����� ���
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
