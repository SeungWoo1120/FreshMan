package variable;

public class Half {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2.7;
		double b = 3.4;
		int num = 0;
		
		if(a%1 >= 0.5) {
			num = (int)(a+1);
		} else {
			num = (int)(a);
		}
		System.out.println(num);
		
		//int num = (int)(a + 0.5);
	}

}
