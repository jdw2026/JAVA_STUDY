package 변수;

public class Ex02변수선언규칙 {

	//main 쓰고 ctrl + space : 메인메서드 자동완성
	//ctrl + space : 자동완성 단축키
    public static void main(String[] args) {
    	
    	//예약어는 변수명으로 사용 불가
    	//int class = 3;
    	
    	//대소문자 구분됨
    	int a = 3;
    	int A = 3;
    	
    	//숫자로 시작할수 없음
    	//int 1a = 2;
    	
    	//특수문자는 _ $ 만 허용
    	int a_1; 
    	//int a#1; -> 불가능       ctrl + / : 해당 줄만 주석처리
    	
    	//변수명에 한글 사용가능(권장하지 않음)
    	int 변수;
    	
    	//변수명 네이밍 규칙
    	//1. 헝가리안 표기법 : 자료형을 접두어로 붙이는 방식
    	int intNum;
    	int iNum;
    	
    	//2. 카멜 표기법 : 일반적으로 변수명 규칙으로 많이 사용
    	int myNumber;
    	
    	//3. 파스칼 표기법 : 클래스명, 프로젝트명 규칙으로 많이 사용
    	int MyNumber;    //첫번째 문자부터 대문자로 표시
    	
    	//4. 언더바 표기법 : 상수명 규칙으로 많이 사용
    	final int MY_NUMBER;    
	


	}

}
