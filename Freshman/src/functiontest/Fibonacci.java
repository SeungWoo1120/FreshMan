package functiontest;

public class Fibonacci {

	// 피보나치수열, 갯수 지정해주고, 프린트 메소드를 사용하여 출력까지 가능하게
	static int function(int number) {
		int temp;
		
		if(number == 1 || number == 2) {
			temp = 1;
		} else {
			temp = function(number - 2) + function(number - 1);
		}
		return temp;
	}
	
	static void print(int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(function(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(function(10));
		print(10);
	}

}
// 재귀말고 다른 방법으로 피보나치수열 만들어보기 : 과제