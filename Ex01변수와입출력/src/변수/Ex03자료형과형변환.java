package 변수;

public class Ex03자료형과형변환 {

	public static void main(String[] args) {
		
		//1. 논리형(참/거짓, 1/0, ture/false)
		boolean sw = true; //참
		boolean sw1 = false; //거짓
		
		//2.문자형 : 문자 1개만 저장가능 , '' 작은 따옴표 안에 작성
		char c = 'a';
		//char c2 = 'abc'; 불가능
		char c2 = 75; //캐릭터는 정수도 가능하다. 아스피코드상으로 대문자K 임.
		
		//3.정수형 : 정수만 저장가능
		//1) byte (1byte)
		//byte num = 120; // int 120 을 byte에 저장하겠다는 뜻.(자료형을 바꾸겠다=>형변환)
		byte num = (byte)120; // 강제 형변환시에는 명시.
		
		//2) short (2byte)
		short num2 = 200; // 원래는 강제 형변환 해줘야 하지만 short로 표현가능한 범위라서 자동으로됨.
		
		//3) int (4byte) : 기본 정수형 자료형
		int num3 = 200;
		
		//4) long (8byte)
		long num4 = 300;  //작은걸 큰거에 넣기때문에 자동형변환
		
		//4. 실수형 (부동소수점 -> 사용이유는 오차 줄이기위해, 고정소수점 -> 범위가 제한적)
		//1) float (4byte)
		float num5 = (float)3.14;  //자동형변환은 2가지 방법
		float num6 = 3.14f;
		
		//2) double (8byte) : 기본 실수형 자료형
		double num7 = 3.14;
		

	}

}
