import java.util.Scanner;

public class Ex10swich문퀴즈1 {

	public static void main(String[] args) {
		
//		String 형 변수 data를 선언하고 키보드로 값을 입력받으시오.
//		switch~case 문을 사용하여 입력받은 값이 “한국어” 이면 “안녕하세요”,
//		“영어”이면 “헬로”, “중국어”이면 “니하오”, “일본어”이면 “곤니찌와”를
//		출력하고 그 외 다른 단어를 입력할 경우에는 “다른 값 입력”을 출력하시오
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String a = sc.next();
		
		switch(a) {
		case "한국어" :
			System.out.println("안녕하세요");
			break;
		case "영어" :	
			System.out.println("헬로");
			break;
		case "중국어" :	
			System.out.println("니하오");
			break;
		case "일본어" :	
			System.out.println("곤니찌와");
			break;	
		default	:
			System.out.println("다른 값 입력");
			
		}
		
		

	}

}
