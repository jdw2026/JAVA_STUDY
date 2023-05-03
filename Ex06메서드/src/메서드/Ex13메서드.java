package 메서드;

public class Ex13메서드 {

	public static void main(String[] args) {
		
		int base = 2;
		int n = 3;
		int result = power(base, n);
		System.out.println("결과확인: " + result);
		
		//매개변수 : 2개 int
		//리턴타입 : int
		//base의 n승
		//base를 n번 곱한 결과값
		
		//double result2 = Math.puw(5, 2); --> 제곱을 해주는 메서드
		//System.out.println(result2);

	}
	
	public static int power(int base, int n) {
		
		int sum = 1; //1로 초기화 하는 이유는 0으로 곱하면 모두 0이니까. 곱하기를 누적하고 싶으면 1로.
		
		//base를 n번 곱하는 걸 반복
		for(int i=1; i<=n; i++) {
			
			sum *= base;
		}
		return sum;
	}

}
