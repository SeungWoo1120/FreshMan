package functiontest;

public class Max {

	// ���ڸ� 3�� �Է¹޾Ƽ�, �ִ񰪸� �����ϴ� �޼ҵ�
	static int max(int num1, int num2, int num3) { 
		int temp = 0;
		if(num1 < num2) {
			temp = num2;
		} else {
			temp = num1;
		} 
		if(temp < num3) {
			temp = num3;
		} 
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max(5, 3, 3));
	}

}
