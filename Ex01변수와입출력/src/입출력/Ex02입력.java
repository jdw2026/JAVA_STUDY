package 입출력;

import java.util.InputMismatchException;
//외부(패키지)에 존재하는 클래스를 가져다가 쓸때는 import 필수로 해줘야함!
import java.util.Scanner;

public class Ex02입력 {

	public static void main(String[] args) {
		
		//new Scanner() : Scanner 라는 도구를 생성하겠다는 의미
		//System.in 입력도구를 활용해서 Scanner 도구를 생성하겠다.
		//Scanner sc => Scanner : 스캐너 형태의 도구의 주소를 저장할 수 있는 자료형
		//sc 라는 변수를 생성해야 사용할수있다.
		
		//스캐너를 사용할때는 컴퓨터의 자원이 많이 사용된다.
		Scanner sc = new Scanner(System.in);
		//주석에 주황줄은 맞춤법 틀렸다는 느낌..이라서 무시하면 됨. 노란줄은 경고
		
		
		//sc.next();  //스캐너로 입력된 값을 받아들임
		/*
		 * String s = sc.next(); // 스캐너가 입력된 값을 돌려줌(반환) -> String 타입으로 돌려줌 -> 값을 변수에 저장
		 * 
		 * System.out.println(s); // s변수가 가지고 있는 값을 콘솔에 출력하겠다는 의미
		 * 
		 * //Scanner : 입력한 값을 공백문자(' ', '\t', '\n')를 기준으로 분리를 시킴
		 * 
		 * sc.nextLine(); // 녕 처리해버림 String s2 = sc.nextLine(); //nextline 은 버퍼에 저장된
		 * 데이터먼저 처리해버림. 띄어쓰기도 출력하고싶으면 앞에 sc.nextLine(); 를 불러준다. System.out.println(s2);
		 */
		
		int num=0; // 정수형 값을 저장할수 있는 공간 생성
		try {//무조건 실행하는 
		  num = sc.nextInt();
		   
		}catch(InputMismatchException e) {//(발생한 오류(예외상황)의 종류) e는 발생한오류의 이름을 붙여줌
			//try 안에서 예외상황이 발생했을때만 실행
			System.out.println("숫자로 입력해주세요!");
		}
		//런타임(실행) 오류 : 컴파일은 됨(해석은가능) 런타임은 실행할때 오류가 나기때문에
		//예외 처리를 해줘야함 : 예외처리 방법 -> try~catch
		
		System.out.println(num);
		
		
		
		sc.close(); //스캐너를 다쓴후에 이제 쓸일이 없을때 써줌. 스캐너가 사용하던 자원을 반환
		//스캐너를 닫은후에는 다시 쓸수 없다.
		
		
		//지역변수 : 특정 구역에서만 사용가능한 변수
		//전역변수 : 어디에서든 사용가능한 변수
		//우리가 대부분 작성하는 변수는 지역변수이다.
		//중괄호 사이에서 변수가 있으면 거기에서만 사용가능.
		//System.out.println(num); 를 트라이 문구안에 넣는 방법.
		//프린트엘엔을 

	}

}


