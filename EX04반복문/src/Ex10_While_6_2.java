import java.util.Scanner;

public class Ex10_While_6_2 {

	public static void main(String[] args) {
		
//		2. 연산 결과 출력 후 “다시 실행하시겠습
//		니까? (Y/N)” 문구를 출력 후 사용자가
//		“Y”를 입력하면 다시 입력받고 “N”을 입력
//		하면 프로그램을 종료하시오.
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
		//1.출력
		System.out.print("정수1 : ");
		//2.입력받기
		int num1=sc.nextInt();
		//3.출력
		System.out.print("정수2 : ");
		//4.입력받기
		int num2 = sc.nextInt();
		//5.출력 - 무슨연산으로 할건지
		System.out.print("연산자(+/-) : ");
		//6.연산자 입력받기
		String a = sc.next();
		//7.출력인데 조건 +면 +연산, -면 -연산 
		if(a.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		}else {
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
		}
		
		System.out.print("계속하시겠습니까? (N/Y)");
		String answer = sc.next();
		if(answer.equals("N")) {
			System.out.println("종료");
			break;
		}
		
		}
		
	}

}
