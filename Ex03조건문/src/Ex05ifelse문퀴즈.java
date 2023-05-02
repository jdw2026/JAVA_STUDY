import java.util.Scanner;

public class Ex05ifelse문퀴즈 {

	public static void main(String[] args) {
		
//		정수형 변수 5개를 선언한 후 정보처리기사의 각 과목의 정답 개수를
//		입력받아 변수에 할당하시오. 한 과목이라도 8개 미만인 경우 “불합
//		격입니다”를 출력하고 총 개수가 60개 이상이면 “합격입니다” 를 출
//		력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int num1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int num2 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int num3 = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int num4 = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int num5 = sc.nextInt();
		
		int sum = num1+num2+num3+num4+num5;
		
		if(num1>8 && num2>8 && num3>8 && num4>8 && num5>8){
			if(sum>=60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
	}

}
