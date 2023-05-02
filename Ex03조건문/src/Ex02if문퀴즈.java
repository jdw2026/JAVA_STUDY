import java.util.Scanner;

public class Ex02if문퀴즈 {

	public static void main(String[] args) {
		
//		nt 타입의 변수 num을 선언하고 키보드로 값을 입력받으시오. 만약
//		입력받은 값이 3의 배수이거나 5의 배수이면 “3 또는 5의 배수입니다”
//		를 출력하는 프로그램을 작성하시오
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		//입력한 값이 3의 배수 또는 5의 배수이니?
		if(num%3==0||num%5==0) {
			System.out.println("3 또는 5의 배수 입니다");
		}
		
	}

}
