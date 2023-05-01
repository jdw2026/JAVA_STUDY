
public class Ex01산술연산 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;
		
		
		//정수와 정수 연산시에는 무조건 결과는 정수로 나옴
		System.out.println(num1/num2);
		
		//실수와 실수 연산시에는 무조건 결과는 실수로 나옴
		//실수연산시에는 부동소수점으로 오차가 있을 수 있음
		System.out.println(num3/num4);
		
		//정수와 실수 연산시에는 무조건 결과는 실수로 나옴
		System.out.println(num1/num4);
		
		//실수와 실수 연산시에 무조건 결과는 실수로 나옴
		System.out.println(num3%num4);

		
		int num5 = 7;
		int num6 = 3;
		
		//더하기
		System.out.println("더한 결과 : " + (num5+num6));
		//빼기
		System.out.println("빼기 결과 : " + (num5-num6));
		//곱하기
		System.out.println("곱한 결과 : " + (num5*num6));
		//나누기  결과가 실수로 나와야하면 연산자중 하나에 실수형을 넣어준다.
		System.out.println("나눈 결과 : " + ((double)num5/num6));
		
		
		
		
		
		
	}

}
