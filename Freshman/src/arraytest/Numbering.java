package arraytest;

public class Numbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 100��¥�� �迭�� ���� �ȿ� 1~100���� ����
		 * �հ�
		 * ���
		 * �ִ�
		 * �ּ�
		 */
		int a[] = new int[100];
		int sum = 0;
		int max;
		int min = 0;
		
		//����
		for(int i = 0; i < a.length; i++) { 
			a[i] = (int)(Math.random() * 100) + 1;
		}
		//�հ�
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		//���
		double avg = (double)sum / a.length;
		
		//�ִ�
		max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		
		//�ּ�
		min = a[0];
		for(int i = 0; i < a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		
		//���
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
