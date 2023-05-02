import java.util.Scanner;

public class Ex07다중ifelse문퀴즈 {

	public static void main(String[] args) {
//		알파벳 하나를 입력받은 후 A를 입력한 경우는 “A입력”, B를
//		입력한 경우는 “B입력”, C를 입력한 경우는 “C입력”을 출력하
//		고 그 외의 알파벳을 입력한 경우는 “A,B,C 외 입력＂을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A,B,C 중 하나 입력 : ");
		String alpha = sc.next();
		
		
		//== : 기본타입(primitive) 비교시에만 사용. 변수 자료형이 소문자로 시작하는것만 사용
		//reference 타입은 비교하는 기능이 따로 있음
		//String -> 비교할 떄는 .equals() 기능(메서드)을 사용해야함!
		//        -> 결과값(반환값)이 true / false(boolean)으로 반환해줌
		//        -> if절의 조건으로 사용 가능!
		
		if(alpha.equals("A")) {
			System.out.println("A입력");
		}else if(alpha.equals("B")) {
			System.out.println("B입력");
		}else if(alpha.equals("C")) {
			System.out.println("C입력");
		}else {
			System.out.println("A,B,C중에 입력해주세요");
		}

	}

}
