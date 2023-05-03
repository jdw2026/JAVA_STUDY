package 메서드;

public class Ex09오버로딩 {

	public static void main(String[] args) {
		
		//sum2() 2개의 숫자를 만들수 있는 메서드
		
		sum(3, 5);
		sum(3,5,7);
		//같은 기능(더하기)==같은 이름
		//오버로딩(overloading) == 중복정의
		// : 같은 클래스 내에서 동일한 이름으로 메서드를 정의 할 수 있다.
		// 단, 매개변수의 형태가 달라야 한다.
		// 매개 변수의 형태라고 하면은 --> 개수 , 자료형이 달라야 한다.
		//ex)println -> 숫자로도 출력해주고, 문자로도출력해주고.
		
		//상속파트에서 오버라이딩이라는 단어가 나오는데 == 재정의 하고도 함.

	}
	
	//sum2()
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	//sum3()
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}

}
