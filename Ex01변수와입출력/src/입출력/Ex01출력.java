package 입출력;

public class Ex01출력 {

	public static void main(String[] args) {
		
		//ctrl + s : 코드 저장
		//ctrl + f11 : 코드 실행
		
		
		//System : 표준 입출력 클래스
		//System.out : 출력 기능을 사용하겠다
		
		int a = 10;
		// a -> 변수 또는 상수 (값을 저장) a뒤에 () 소괄호가 안붙으면
		
		//print() -> 뒤에 소괄호()가 붙은 것들은 메서드이다. 메서드=기능
		//~~를 출력하겠다는 기능
		System.out.print(123);
		System.out.print("Hello World!\n");// \n 을 붙이면 개행을 해줌
		
		//println() : 출력후 개행(행을 바꿔줌)
		System.out.println("출력구문1");
		//syso + ctrl + space -> 프린트ln 자동적으로 생성
		System.out.println("출력구문2");
		//해당구문에 커서 놓고 ctrl + alt + 위/아래 방향키 : 해당구문 복사후 붙여넣기
		System.out.println("출력구문3");
		
		//printf() : 특정한 형식으로 출력하고 싶을때 사용
		//1. pi = 3.14 를 출력하고 싶을때
		int a1 = 1;
		String b = "pi";
		double c = 3.14;
		
		//%d : 정수자리   %s : 문자열 자리    %f : 실수자리
		//System.out.printf("%d. %s = %f"); // -> 형식만 지정한것.
		System.out.printf("%d. %s = %f\n",a1,b,c);
		System.out.printf("%d. %s = %f",2,"pi",3.14); //변수로 넣어도 가능, 값으로 바로 넣어도 가능
		
		String s1 = "제 이름은";
		String s2 = "정다운 입니다.";
		
		System.out.print(s1);
		System.out.print(s2);
		
		System.out.print(s1+s2+1); //문자열은 더하기 연산(+) 사용 가능

	}

}
